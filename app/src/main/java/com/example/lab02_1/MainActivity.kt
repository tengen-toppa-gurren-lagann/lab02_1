package com.example.lab02_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("create method","onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.d("start method","onStart")
        super.onStart()
    }

    override fun onRestart() {
        Log.d("restart method","onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d("pause method","onPause")
        super.onPause()
    }

    override fun onResume() {
        Log.d("resume method","onResume")
        super.onResume()
    }

    override fun onStop() {
        Log.d("stop method","onStop")
        super.onStop()
    }

    override fun onDestroy(){
        Log.d("destroy method","onDestroy")
        super.onDestroy()
    }
}
