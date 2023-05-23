package kz.iitu.apiproject

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import kz.iitu.apiproject.data.model.Newapi
import kz.iitu.apiproject.databinding.AdapterMainItemBinding

class MainActivityAdapter() : RecyclerView.Adapter<MainActivityAdapter.ViewHolder>() {

    private lateinit var listApi: List<Newapi.Entry>

    inner class ViewHolder(private val binding:AdapterMainItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun initContent(item:Newapi.Entry){
                binding.adapterText.text = item.fullUrl
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdapterMainItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listApi.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.initContent(listApi[position])

    }

    fun submitList(list : List<Newapi.Entry>){
        listApi = list;
    }

}