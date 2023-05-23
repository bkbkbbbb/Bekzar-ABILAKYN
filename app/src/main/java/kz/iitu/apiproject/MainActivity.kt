package kz.iitu.apiproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*
import kz.iitu.apiproject.data.retrofit.RetrofitBuilder
import kz.iitu.apiproject.databinding.ActivityMainBinding
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.Main).launch {
            kotlin.runCatching {
                RetrofitBuilder.retrofitCall.getPeople()
            }.onSuccess {
                val adapter = MainActivityAdapter()
                adapter.submitList(it.entries)
                binding.rcViewAdapter.adapter = adapter
            }.onFailure {
                Toast.makeText(applicationContext, "$it", Toast.LENGTH_LONG).show()
            }

        }




    }
}