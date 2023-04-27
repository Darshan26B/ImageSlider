package com.darshan.imageslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import com.darshan.imageslider.Adapter.ImageAdapte
import com.darshan.imageslider.R.drawable.*
import com.darshan.imageslider.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var imgs = arrayOf(city1, city2, city3, city4, city5, city8)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    binding.Viewpager.adapter=ImageAdapte(imgs)
    }

}