package com.example.kotlindemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by 96274 on 2018/2/6.
 */
class MyAdapter : RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private var context : Context? = null
    private var mList : ArrayList<String>? = null

    constructor(context: Context , list: ArrayList<String> ){
        this.context = context
        this.mList = list
        Log.d("Tag","构造器")
    }
    class ViewHolder : RecyclerView.ViewHolder {
        var img : ImageView
        var text : TextView
        constructor(itemView : View) : super(itemView){
            this.img = itemView!!.findViewById(R.id.tu) as ImageView
            this.text = itemView!!.findViewById(R.id.text) as TextView
        }
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        if(mList?.size as Int > position){
            holder?.img?.setImageResource(R.mipmap.ic_launcher)
            holder?.text?.text = mList!!.get(position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.item,parent,false )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList?.size as Int
    }

    fun addData(dataList : Array<String>): Unit{
        if(dataList.size == 0)
            return
        mList?.addAll(dataList)
        notifyDataSetChanged()
    }
}
