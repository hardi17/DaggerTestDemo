package com.example.daggertestdemo.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class ApplicationContext

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class ActivityContext

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class DummyValue

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class DummyIntValue