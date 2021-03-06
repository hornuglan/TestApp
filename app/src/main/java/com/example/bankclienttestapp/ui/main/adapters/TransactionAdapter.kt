package com.example.bankclienttestapp.ui.main.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bankclienttestapp.R
import com.example.bankclienttestapp.ui.main.viewholders.TransactionViewHolder
import com.example.bankclienttestapp.ui.main.viewmodel.Transaction

class TransactionAdapter(
    private val inflater: LayoutInflater,
    var items: ArrayList<Transaction>
) : RecyclerView.Adapter<TransactionViewHolder>() {

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        return TransactionViewHolder(
            inflater.inflate(
                R.layout.layout_transactions_history_list_item,
                parent,
                false
            )
        )
    }
}