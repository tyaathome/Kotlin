package com.example.tyaathome.kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.tyaathome.kotlin.R
import kotlinx.android.synthetic.main.item.view.*

/**
 * Created by tyaathome on 2017/5/21.
 */

class ItemAdapter constructor(context: Context, listdata: List<String>) : BaseAdapter() {

    private var mContext: Context = context
    private var mListdata: List<String> = listdata

    override fun getItem(position: Int): String {
        return mListdata.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return mListdata.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var holder: ViewHolder?
        var view = convertView

        when {
            convertView == null -> {
                view = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false)
                holder = ViewHolder(view)
                view.setTag(holder)
            }
            else -> {
                holder = view!!.getTag() as ViewHolder
            }
        }

        holder.tv.text = mListdata.get(position)

        return view
    }

    private class ViewHolder(view : View) {
        var tv: TextView = view.tv
    }

}
