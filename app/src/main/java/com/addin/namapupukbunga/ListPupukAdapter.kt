package com.addin.namapupukbunga

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.addin.namapupukbunga.databinding.ItemRowPupukBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPupukAdapter(private val listPupuk: ArrayList<ClassPupuk>):
    RecyclerView.Adapter<ListPupukAdapter.listViewHolder>() {

    inner class listViewHolder(val binding: ItemRowPupukBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(classPupuk: ClassPupuk){
            Glide.with(itemView.context)
                .load(classPupuk.imgPupuk)
                .apply(RequestOptions().override(600,800))
                .error(R.drawable.ic_baseline_error_24)
                .into(binding.imgItem)
            binding.txtTitle.text= classPupuk.namePupuk
            binding.txtDescription.text=classPupuk.descPupuk
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listViewHolder {

        val binding = ItemRowPupukBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return listViewHolder(binding)
    }

    override fun onBindViewHolder(holder: listViewHolder, position: Int) {
        holder.bind(listPupuk[position])
        val dataPupuk = listPupuk[position]
        holder.itemView.setOnClickListener {
            val classPupukIntent = ClassPupuk(
                dataPupuk.namePupuk,
                dataPupuk.descPupuk,
                dataPupuk.imgPupuk,

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