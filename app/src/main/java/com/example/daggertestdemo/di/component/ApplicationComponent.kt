package com.example.daggertestdemo.di.component

import android.content.Context
import com.example.daggertestdemo.MyApplication
import com.example.daggertestdemo.data.HelloDagger
import com.example.daggertestdemo.di.ApplicationContext
import com.example.daggertestdemo.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    @ApplicationContext
    fun getContext() :Context

    fun getDummyText() : HelloDagger
}