package com.addin.namapupukbunga

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.addin.namapupukbunga.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val background = object: Thread(){
            override fun run() {
                try {
                    sleep(3000)
                    val mIntent = Intent(baseContext,MainActivity::class.java)
                    startActivity(mIntent)
                    this@SplashScreen.finish()
                }catch (e: Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()

    }
}