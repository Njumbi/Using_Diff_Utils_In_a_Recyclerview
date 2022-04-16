package com.example.diff_utils_recyclerview_example.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.diff_utils_recyclerview_example.databinding.CharactersItemsBinding
import com.example.diff_utils_recyclerview_example.domain.models.CharacterDetails

class CharactersAdapter : RecyclerView.Adapter<CharactersAdapter.CharactersAdapterVh>() {
    class CharactersAdapterVh(var binding: CharactersItemsBinding) :
        RecyclerView.ViewHolder(binding.root)

    private val diffUtil = object : DiffUtil.ItemCallback<CharacterDetails>() {
        override fun areItemsTheSame(
            oldItem: CharacterDetails,
            newItem: CharacterDetails
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: CharacterDetails,
            newItem: CharacterDetails
        ): Boolean {
            return oldItem == newItem
        }

    }

    private val asyncListDiffer = AsyncListDiffer(this, diffUtil)

    fun saveData(dataResponse: List<CharacterDetails>) {
        asyncListDiffer.submitList(dataResponse)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersAdapterVh {
        val binding =
            CharactersItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharactersAdapterVh(binding)
    }

    override fun onBindViewHolder(holder: CharactersAdapterVh, position: Int) {
        val data = asyncListDiffer.currentList[position]
        holder.binding.apply {
            tvCharacterName.text = data.characterName

            Glide
                .with(holder.itemView.context)
                .load(data.profileImageUrl)
                .centerCrop()
                .into(profileImage)
        }


    }

    override fun getItemCount(): Int {
        return asyncListDiffer.currentList.size
    }
}