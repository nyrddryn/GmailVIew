package com.betty.listview

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.betty.listview.adapter.ItemAdapter
import com.betty.listview.data.Datasource
import com.betty.listview.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataset = Datasource().loadMails()
        binding.recyclerView.adapter = ItemAdapter(this, dataset)
        binding.recyclerView.setHasFixedSize(true)
    }
}

