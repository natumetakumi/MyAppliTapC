package com.example.myapplitapc

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedIndexState: Bundle?){
        super.onCreate(savedIndexState)
        setContentView(R.layout.activity_main)
    }
    var c = 0
fun plus(v : View) {
    c++
    tv.text = "$c"
}
    fun minus(v : View){
        c--
        tv.text="$c"
    }
}