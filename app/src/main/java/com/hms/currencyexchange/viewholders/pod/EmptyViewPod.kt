package com.hms.currencyexchange.viewholders.pod

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.view_pod_empty.view.*

class EmptyViewPod : RelativeLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)


    override fun onFinishInflate() {
        super.onFinishInflate()
    }


    fun setEmptyData(emptyImageID: Int, emptyMessage: String){
        ivEmpty!!.setImageResource(emptyImageID)
        tvEmpty!!.text = emptyMessage
    }


    fun setEmptyData(emptyMessage: String){
        tvEmpty!!.text = emptyMessage
    }

}


