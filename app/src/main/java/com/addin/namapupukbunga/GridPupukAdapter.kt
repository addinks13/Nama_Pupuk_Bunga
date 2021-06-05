package com.addin.namapupukbunga

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.addin.namapupukbunga.databinding.ItemGridviewPupukBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridPupukAdapter(private val listPupuk: ArrayList<ClassPupuk>) :
    RecyclerView.Adapter<GridPupukAdapter.gridViewHolder>() {

    inner class gridViewHolder(val gridviewPupukBinding: ItemGridviewPupukBinding) :
        RecyclerView.ViewHolder(gridviewPupukBinding.root) {
        fun bind(classPupuk: ClassPupuk) {
            Glide.with(itemView.context)
                .load(classPupuk.imgPupuk)
                .apply(RequestOptions().override(600, 800))
                .error(R.drawable.ic_baseline_error_24)
                .into(gridviewPupukBinding.imgCardView)
                gridviewPupukBinding.txtTitleCard.text = classPupuk.namePupuk
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): gridViewHolder {
        val binding =ItemGridviewPupukBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return gridViewHolder(binding)
    }

    override fun onBindViewHolder(holder: gridViewHolder, position: Int) {
       holder.bind(listPupuk[position])
        val dataPupuk =listPupuk[position]
        holder.itemView.setOnClickListener {
            val classPupukIntent =ClassPupuk(
                dataPupuk.namePupuk,
                dataPupuk.descPupuk,
                dataPupuk.imgPupuk
            )
            val mIntent = Intent(it.context,DetailPupuk::class.java)
            mIntent.putExtra(DetailPupuk.DETAIL_PUPUK,classPupukIntent)
            it.context.startActivity(mIntent)

        }
    }

    override fun getItemCount(): Int {
      return listPupuk.size
    }
}