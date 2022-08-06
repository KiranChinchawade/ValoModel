package com.example.api

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.api.databinding.ActivityAgentsInfoBinding
import com.example.api.databinding.ActivityMainBinding

class AgentsInfo : AppCompatActivity() {
    lateinit var binding: ActivityAgentsInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding
        setContentView(R.layout.activity_agents_info)
    }
}