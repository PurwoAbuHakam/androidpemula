package com.dicoding.ale.purwobeginner.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.ale.purwobeginner.R
import com.dicoding.ale.purwobeginner.model.Bugs

class ListBugsAdapter(private val listBugs: ArrayList<Bugs>) : RecyclerView.Adapter<ListBugsAdapter.ListViewHolder>() {
    private lateinit var onClickListener: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onClickListener = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_bugs, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBugs.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val bugs = listBugs[position]

        Glide.with(holder.itemView.context)
            .load(bugs.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.ivBugs)

        holder.tvName.text = bugs.name
        var spiBugs = bugs.spi
        holder.tvSpi.text = "Index Pain : $spiBugs"
        holder.tvReview.text = bugs.detail

        holder.itemView.setOnClickListener {
            onClickListener.onItemClicked(listBugs[holder.adapterPosition])
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_bugs_name)
        var tvSpi: TextView = itemView.findViewById(R.id.tv_spi_rate)
        var tvReview: TextView = itemView.findViewById(R.id.tv_bugs_review)
        var ivBugs: ImageView = itemView.findViewById(R.id.item_images)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Bugs)
    }
}

