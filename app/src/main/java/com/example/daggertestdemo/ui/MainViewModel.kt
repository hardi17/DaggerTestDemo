package com.example.daggertestdemo.ui

import com.example.daggertestdemo.data.HelloDagger
import com.example.daggertestdemo.di.ActivityScope
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScope
class MainViewModel @Inject constructor(
    private val dummyName1 : HelloDagger,
    private val dummyName2 : HelloDagger,
    private val aValue : HelloDagger
) {

    fun getHashCode() : String {
        return "Hashcode 1 : "  + dummyName1.hashCode() + "\n" +
               "Hashcode 2 : "  + dummyName2.hashCode()
    }

    fun getName() : String{
        return "Name : " + dummyName1.getDummyName()
    }

    fun getAdditionVal() : Int{
        return aValue.add()
     }

    fun getMultiplicationVal() : Int{
        return aValue.multiply()
     }

}