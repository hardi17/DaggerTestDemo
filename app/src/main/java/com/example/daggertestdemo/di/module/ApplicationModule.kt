package com.example.daggertestdemo.di.module

import android.content.Context
import com.example.daggertestdemo.MyApplication
import com.example.daggertestdemo.di.ActivityContext
import com.example.daggertestdemo.di.ApplicationContext
import com.example.daggertestdemo.di.DummyIntValue
import com.example.daggertestdemo.di.DummyValue
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: MyApplication){

    @Provides
    @ApplicationContext
    fun provideContext() : Context{
        return application
    }

   @Provides
   @DummyValue
   fun provideDummyName() : String{
       return "Welcome to Dagger"
   }

    @Provides
    @DummyIntValue
    fun provideDummyIntValue() : Int {
        return 4
    }

}