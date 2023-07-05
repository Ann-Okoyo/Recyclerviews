package dev.okoyo71.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.LinearLayoutManager
import dev.okoyo71.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    override fun onResume(){
        super.onResume()

    }
    fun displayNamesList(){
        var name = listOf("Ann","Sera","Kate","Ashley","Sophie","Perry")
        binding.rvnames.layoutManager =LinearLayoutManager(this)
        val namesAdapter = NamesRvAdapter(name)
        binding.rvnames.adapter=namesAdapter
    }
}