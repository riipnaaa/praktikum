package com.example.praktikum2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GacoanAdapter(private val context: Context, private val gacoan:List<Gacoan>,val listener:(Gacoan) -> Unit)
    : RecyclerView.Adapter<GacoanAdapter.GacoanViewHolder>() {

    class GacoanViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val imgGacoan = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameGacoan = view.findViewById<TextView>(R.id.tv_item_name)
        val descGacoan = view.findViewById<TextView>(R.id.tv_item_description)


        fun bindView(gacoan: Gacoan, listener: (Gacoan) -> Unit){
            imgGacoan.setImageResource(gacoan.imgGacoan)
            nameGacoan.text = gacoan.nameGacoan
            descGacoan.text = gacoan.descGacoan
            itemView.setOnClickListener {
                listener(gacoan)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GacoanViewHolder {
       return GacoanViewHolder(
           LayoutInflater.from(context).inflate(R.layout.satu,parent, false))

    }

    override fun onBindViewHolder(holder: GacoanViewHolder, position: Int) {
        holder.bindView(gacoan[position], listener)
    }
    override fun getItemCount(): Int = gacoan.size
    }
