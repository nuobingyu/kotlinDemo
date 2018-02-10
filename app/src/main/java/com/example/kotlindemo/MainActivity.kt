package com.example.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

/**
 * Created by 96274 on 2018/2/6.
 */
public class MainActivity : AppCompatActivity(){

    private var dataList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()

        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = MyAdapter(this,dataList)

    }

    private fun init() {
        for (i in 0..10) {
            dataList.add("第${i}个文字说明")
        }
    }
}