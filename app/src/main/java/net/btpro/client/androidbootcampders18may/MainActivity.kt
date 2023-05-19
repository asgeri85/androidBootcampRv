package net.btpro.client.androidbootcampders18may

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import net.btpro.client.androidbootcampders18may.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val animalAdapter = AnimalAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setRecyclerView()
        createList()
    }

    private fun createList() {
        val a1 = Animal(1, "Aslan", "20", R.drawable.aslan)
        val a2 = Animal(2, "Qoyun", "5", R.drawable.qoyun)
        val a3 = Animal(3, "İt", "10", R.drawable.it)
        val a4 = Animal(4, "Canavar", "20", R.drawable.canavar)

        val list = arrayListOf<Animal>()
        list.add(a1)
        list.add(a2)
        list.add(a3)
        list.add(a4)
        list.add(a1)
        list.add(a2)
        list.add(a3)
        list.add(a4)

        animalAdapter.updateList(list)

    }

    private fun setRecyclerView() {
        binding.rvAnimal.layoutManager =
            GridLayoutManager(applicationContext, 2, GridLayoutManager.VERTICAL, false)
        binding.rvAnimal.adapter = animalAdapter
    }
}