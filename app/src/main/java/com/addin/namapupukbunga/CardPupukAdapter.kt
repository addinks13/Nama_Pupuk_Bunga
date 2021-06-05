package com.addin.namapupukbunga

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.addin.namapupukbunga.databinding.ItemCardviewPupukBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardPupukAdapter(private val listPupuk: ArrayList<ClassPupuk>) :
    RecyclerView.Adapter<CardPupukAdapter.cardViewHolder>() {

    inner class cardViewHolder(val cardviewPupukBinding: ItemCardviewPupukBinding) :
        RecyclerView.ViewHolder(cardviewPupukBinding.root) {
        fun bind(classPupuk: ClassPupuk){
            Glide.with(itemView.context)
                .load(classPupuk.imgPupuk)
                .apply(RequestOptions().override(600,800))
                .error(R.drawable.ic_baseline_error_24)
                .into(cardviewPupukBinding.imgCardView)
            cardviewPupukBinding.txtTitleCard.text = classPupuk.namePupuk
            cardviewPupukBinding.txtDescriptionCard.text = classPupuk.descPupuk
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewHolder {
       val binding = ItemCardviewPupukBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return cardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: cardViewHolder, position: Int) {
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
        holder.cardviewPupukBinding.buttonShare.setOnClickListener {
            //untuk share
            val eBody: String = R.string.body.toString()
            val eSubject: String = R.string.subject.toString()
            val eAddress: String = R.string.email2.toString()
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:" + eAddress)
                putExtra(Intent.EXTRA_SUBJECT, eSubject)
                putExtra(Intent.EXTRA_TEXT, eBody)
            }
            it.context.startActivity(Intent.createChooser(emailIntent, R.string.title.toString()))
        }
    }

    override fun getItemCount(): Int {
       return listPupuk.size
    }
}