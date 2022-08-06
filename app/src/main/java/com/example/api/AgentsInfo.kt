package com.example.api

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.api.databinding.ActivityAgentsInfoBinding
import com.example.api.databinding.ActivityMainBinding

class AgentsInfo : AppCompatActivity() {
    lateinit var binding: ActivityAgentsInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgentsInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)


       val Valo = intent.getParcelableExtra<ValoModel>("AgentsInfo")
       val imgUrl = intent.getStringExtra("img")

        binding.name.text= Valo?.

    }
}