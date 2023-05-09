package com.libraryleap.partner.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.libraryleap.partner.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // setSupportActionBar(binding.toolbar)

        loadSplashScreen()



    }

    private fun loadSplashScreen(){
        Handler().postDelayed({

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
            /*var status = "false"
            status = SharedPreferenceUtils.getInstance(this)?.getStringValue(
                ConstantUtils.IS_LOGIN, ""
            ).toString()
            if (status.equals("true")) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }*/
        }, 3000)










        /*  Handler().postDelayed({
              val intent = Intent(this, MainActivity::class.java)
              startActivity(intent)

              finish()
          },TIME_OUT)*/
    }


}