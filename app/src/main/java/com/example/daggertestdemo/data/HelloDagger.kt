package com.example.daggertestdemo.data

import android.content.Context
import com.example.daggertestdemo.di.ApplicationContext
import com.example.daggertestdemo.di.DummyValue
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HelloDagger @Inject constructor(
    @ApplicationContext private val context: Context,
    @DummyValue private val str : String
)  {

    fun getDummyName() : String {
        return "Hello, Dagger $str to test demo"
    }
}