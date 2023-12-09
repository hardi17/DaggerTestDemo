package com.example.daggertestdemo.data

import android.content.Context
import com.example.daggertestdemo.di.ApplicationContext
import com.example.daggertestdemo.di.DummyIntValue
import com.example.daggertestdemo.di.DummyValue
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HelloDagger @Inject constructor(
    @ApplicationContext private val context: Context,
    @DummyValue private val str : String,
    @DummyIntValue private val aValue : Int
)  {

    fun getDummyName() : String {
        return "Hello guys, $str test demo"
    }

    fun add() : Int{
        return aValue + aValue
    }

    fun multiply() : Int{
        return aValue * aValue
    }
}