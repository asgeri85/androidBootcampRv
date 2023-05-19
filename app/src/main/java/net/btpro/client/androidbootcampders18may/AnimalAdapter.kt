package net.btpro.client.androidbootcampders18may

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.btpro.client.androidbootcampders18may.databinding.ItemAnimalBinding

class AnimalAdapter : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    private val animalList = arrayListOf<Animal>()

    inner class AnimalViewHolder(val itemAnimalBinding: ItemAnimalBinding) :
        RecyclerView.ViewHolder(itemAnimalBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val layout = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return AnimalViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animalList[position]

        holder.itemAnimalBinding.textViewName.text = animal.name
        holder.itemAnimalBinding.textViewAge.text = animal.age
        holder.itemAnimalBinding.imageView.setImageResource(animal.image)
    }

    fun updateList(newList: List<Animal>) {
        animalList.clear()
        animalList.addAll(newList)
        notifyDataSetChanged()
    }
}