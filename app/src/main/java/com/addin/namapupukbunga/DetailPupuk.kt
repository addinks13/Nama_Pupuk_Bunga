package com.addin.namapupukbunga

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.addin.namapupukbunga.databinding.ActivityDetailPupukBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailPupuk : AppCompatActivity() {

    companion object {
        const val DETAIL_PUPUK = "detail_pupuk"
    }

    private lateinit var binding: ActivityDetailPupukBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPupukBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = resources.getString(R.string.detailheader)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val classPupuk = intent.getParcelableExtra<ClassPupuk>(DETAIL_PUPUK) as ClassPupuk
        Glide.with(this)
            .load(classPupuk.imgPupuk)
            .apply(RequestOptions().override(300,300))
            .error(R.drawable.ic_baseline_error_24)
            .into(binding.imgItemDetail)
            binding.txtTitleimgItemDetail.text = classPupuk.namePupuk
            binding.txtDescriptionimgItemDetail.text =classPupuk.descPupuk
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}