package com.example.bankclienttestapp.ui.main.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bankclienttestapp.model.Currency
import com.example.bankclienttestapp.R
import com.example.bankclienttestapp.ui.main.viewmodel.Transaction

class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val transactionIcon: ImageView = itemView.findViewById(R.id.transaction_item_icon)
    private val transactionTitle: TextView = itemView.findViewById(R.id.transaction_item_title)
    private val transactionDate: TextView = itemView.findViewById(R.id.transaction_item_date)
    private val transactionCurrentSum: TextView =
        itemView.findViewById(R.id.transaction_item_current_sum)
    private val transactionDefaultSum: TextView =
        itemView.findViewById(R.id.transaction_item_default_sum)

    fun bind(item: Transaction) {
        transactionTitle.text = item.title
        transactionDate.text = item.date
        transactionCurrentSum.text = "£ ${item.convertedAmount.toString()}"
        transactionDefaultSum.text = "$ ${item.amount}"

        when (item.currency) {
            Currency.GBP -> {
                transactionCurrentSum.text = "£ ${item.convertedAmount.toString()}"
            }
            Currency.EUR -> {
                transactionCurrentSum.text = "€ ${item.convertedAmount.toString()}"
            }
            Currency.RUB -> {
                transactionCurrentSum.text = "₽ ${item.convertedAmount.toString()}"
            }
            else -> {
            }
        }

        Glide.with(transactionIcon)
            .load(item.iconUrl)
            .centerCrop()
            .into(transactionIcon)
    }
}