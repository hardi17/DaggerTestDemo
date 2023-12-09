package com.example.daggertestdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import com.example.daggertestdemo.MyApplication
import com.example.daggertestdemo.R
import com.example.daggertestdemo.data.HelloDagger
import com.example.daggertestdemo.databinding.ActivityMainBinding
import com.example.daggertestdemo.di.component.ActivityComponent
import com.example.daggertestdemo.di.component.DaggerActivityComponent
import com.example.daggertestdemo.di.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvDummy.text = viewModel.getName()
        binding.tvDummy2.text = viewModel.getHashCode()
        binding.tvAdd.text = "Addition is : " + viewModel.getAdditionVal()
        binding.tvMultiply.text = "Multiplication is : " + viewModel.getMultiplicationVal()
        binding.tvDiv.text = "Division is : " + viewModel.getDivision()
    }

    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)

    }
}