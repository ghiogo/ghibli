package com.example.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.presentation.databinding.ItemFilmsBinding
import com.example.presentation.models.ResponseUI

class FilmsAdapter : ListAdapter<ResponseUI, FilmsAdapter.AnimeViewHolder>(
    diffUtil
) {

    inner class AnimeViewHolder(private val binding: ItemFilmsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(dataItem: ResponseUI) {
            binding.tvFilms.text = dataItem.originalTitle
            binding.tvFilms2.text = dataItem.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemFilmsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let {
            holder.onBind(it)
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<ResponseUI>() {
            override fun areItemsTheSame(oldItem: ResponseUI, newItem: ResponseUI): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: ResponseUI, newItem: ResponseUI): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }
}