package com.example.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import okhttp3.Dispatcher
import retrofit2.Callback

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceStatic: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.Inflate(layoutInflater)
        setContentView(binding.root)


        val call = APIService.api_instance.getAgents()
        call.enqueue(object : Callback<List<ValoModel>> {
            override fun onResponse(call: Call<<List<ValoModel>, response: Response<List<ValoModel>) {

                    val resultSearchResult: SearchResult? = response.body()
                    Log.i("onResponse", response.code().toString())
                    recyclerView.adapter = RecyclerAdapter(resultSearchResult)
                }
            }
            override fun onFailure(call: Call<SearchResult>, t: Throwable) {
                Log.d("API Fetch", "Error while fetching", t)
            }
        })

private fun <T> Call<T>.enqueue(any: Any) {

}
