package com.example.primerleague.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<B:ViewBinding>:AppCompatActivity() {
    abstract val LOG_TAG:String
    abstract var bindingInflater:(LayoutInflater)->B
    private lateinit var binding: ViewBinding
    protected val bindingV
        get() = binding as B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=bindingInflater(layoutInflater)
        setContentView(binding.root)
        parseFile()
        callBacks()
    }

    abstract fun callBacks()

    abstract fun parseFile()
    fun log(value:Any){
        Log.v(LOG_TAG,value.toString())
    }
}