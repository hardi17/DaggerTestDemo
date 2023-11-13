package com.example.daggertestdemo

import android.app.Application
import com.example.daggertestdemo.data.HelloDagger
import com.example.daggertestdemo.di.component.ApplicationComponent
import com.example.daggertestdemo.di.component.DaggerApplicationComponent
import com.example.daggertestdemo.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var helloDagger: HelloDagger

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }


}