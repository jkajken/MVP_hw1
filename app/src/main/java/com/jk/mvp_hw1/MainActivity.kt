package com.jk.mvp_hw1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jk.mvp_hw1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    private var presenter = Presenter()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()

    }

    private fun initClicker() {
        binding.apply {
            btnPlus.setOnClickListener {
                presenter.increment()
            }
            btnMinus.setOnClickListener {
                presenter.decrement()
            }
        }

    }

    override fun changeCount(count: Int) {
        binding.tvCounter.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Congratulations!", Toast.LENGTH_SHORT).show()
    }

    override fun setColor() {
        binding.tvCounter.setTextColor(Color.GREEN)
    }

}