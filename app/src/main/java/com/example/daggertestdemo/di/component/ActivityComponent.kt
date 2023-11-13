package com.example.daggertestdemo.di.component

import com.example.daggertestdemo.di.ActivityScope
import com.example.daggertestdemo.di.module.ActivityModule
import com.example.daggertestdemo.ui.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}