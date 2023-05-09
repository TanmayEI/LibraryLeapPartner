package com.libraryleap.partner.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.libraryleap.partner.activity.forgotactivity.ForgotPasswordActivity
import com.libraryleap.partner.activity.mainactivity.MainActivity
import com.libraryleap.partner.activity.registeractivity.RegistrationActivity
import com.libraryleap.partner.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityLoginBinding
    var email:String=""
    var password:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setSupportActionBar(binding.toolbar)


        binding.register.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }

        binding.login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.forgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }



    }


    override fun onBackPressed() {

    }




}