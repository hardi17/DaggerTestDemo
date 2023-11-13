package com.example.daggertestdemo.di.module

import android.app.Activity
import android.content.Context
import com.example.daggertestdemo.di.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity : Activity) {

    @Provides
    @ActivityContext
    fun provideContext() : Context {
        return activity
    }
    
}