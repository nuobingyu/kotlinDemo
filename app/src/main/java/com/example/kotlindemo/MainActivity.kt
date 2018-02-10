package com.example.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.recyclerView
import java.util.ArrayList
import java.util.zip.Inflater

/**
 * Created by 96274 on 2018/2/6.
 */
public class MainActivity : AppCompatActivity(){

    private var dataList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        if(dataList == null)
            println("dataList为空")
        if(recyclerView == null)
            println("recyclerView为空");
        if(LinearLayoutManager(this) == null )
            println("manager为空")
        if(MyAdapter(this ,dataList) == null )
            println("adapter为空")
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = MyAdapter(this,dataList)

    }

    private fun init() {
        for (i in 0..10) {
            dataList.add("第${i}个文字说明")
        }
    }
}