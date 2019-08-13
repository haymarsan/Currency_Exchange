package com.hms.currencyexchange.viewholders.pod

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SmartRecyclerView :  RecyclerView {


    private var mEmptyView: View? = null

    private val dataObserver = object : RecyclerView.AdapterDataObserver(){

        override fun onChanged() {
            super.onChanged()
            checkIfEmpty()
        }

        override fun onItemRangeInserted(positionStart: Int, itemCount: Int) {
            super.onItemRangeInserted(positionStart, itemCount)
            checkIfEmpty()

        }


        override fun onItemRangeRemoved(positionStart: Int, itemCount: Int) {
            super.onItemRangeRemoved(positionStart, itemCount)
            checkIfEmpty()
        }
    }

    /**
     * check if adapter connected to SRV is empty. If so, show emptyView.
     */

    private fun checkIfEmpty() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle)
}