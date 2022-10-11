package com.catnip.cowboyshoot.ui.onboarding.entername

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.catnip.cowboyshoot.databinding.ActivityChooseMenuBinding


class ChooseMenu : AppCompatActivity() {
    private val binding: ActivityChooseMenuBinding by lazy {
        ActivityChooseMenuBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(binding.root)
        showText()

    }
    fun showText(){
        val name = intent.getStringExtra("Name")
        binding.tvTitleMenu.text = "Hi   " + name + "!"
        binding.tvVsComputer.text = name + "   vs   Computer"
        binding.tvVsPlayer.text = name + "   vs   Player"
    }
}