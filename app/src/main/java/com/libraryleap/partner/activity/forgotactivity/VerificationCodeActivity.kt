package com.libraryleap.partner.activity.forgotactivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.libraryleap.partner.R
import com.libraryleap.partner.activity.registeractivity.RegistrationActivity
import com.libraryleap.partner.activity.registeractivity.fargment.RegistrationFragmentOne
import com.libraryleap.partner.databinding.ActivityForgotBinding
import com.libraryleap.partner.databinding.ActivityRegistrationBinding
import com.libraryleap.partner.databinding.ActivityVerificationBinding
import java.util.regex.Matcher
import java.util.regex.Pattern


class VerificationCodeActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityVerificationBinding
    var email:String=""
    var password:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.verifyNow.setOnClickListener {
            val intent = Intent(this, CreateNewPasswordActivity::class.java)
            startActivity(intent)
        }

        binding.back.setOnClickListener {
            onBackPressed()
        }


    }




}