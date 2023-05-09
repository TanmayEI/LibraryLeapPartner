package com.libraryleap.partner.activity.forgotactivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration

import com.libraryleap.partner.R
import com.libraryleap.partner.activity.LoginActivity
import com.libraryleap.partner.databinding.ActivityCreateNewPassBinding


class CreateNewPasswordActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityCreateNewPassBinding
    var confirm_pass:String=""
    var password:String=""
    var eyepass:Int=0
    var eyeconfirmpass:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCreateNewPassBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setSupportActionBar(binding.toolbar)

        binding.back.setOnClickListener {
            onBackPressed()
        }

        binding.sendCode.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
           // validation()

        }

        binding.eyePass.setOnClickListener {
            if (eyepass == 0) {
                binding.eyePass.setImageResource(R.drawable.eye)
                binding.password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                // binding.etPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)
                binding.password.setSelection(binding.password.length())
                eyepass = 1
            } else {
                binding.eyePass.setImageResource(R.drawable.eye_invisible)
                binding.confirmPass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                //  binding.etPassword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD)
                binding.confirmPass.setSelection(binding.confirmPass.length())
                eyepass = 0

            }
        }






            binding.eyeConfirmPass.setOnClickListener {
                if (eyeconfirmpass == 0) {
                    binding.eyeConfirmPass.setImageResource(R.drawable.eye)
                    binding.password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    // binding.etPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)
                    binding.password.setSelection(binding.password.length())
                    eyeconfirmpass = 1
                } else {
                    binding.eyeConfirmPass.setImageResource(R.drawable.eye_invisible)
                    binding.confirmPass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    //  binding.etPassword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD)
                    binding.confirmPass.setSelection(binding.confirmPass.length())
                    eyeconfirmpass = 0

                }
            }


    }

    private fun validation() {
        confirm_pass = binding.confirmPass.text.toString().trim()
        password = binding.password.text.toString().trim()
        if (password.isEmpty()) {
            binding.password.requestFocus()
            binding.password.setError("Enter Password")
        }  else if (password.isEmpty()) {
            binding.confirmPass.requestFocus()
            binding.confirmPass.setError("Enter Confirm password")
        }


        else {
/*
            if(NetworkUtils.checkInternetConnection(this))
            {
                CreateNewPass(
                    binding.password.text.toString(),
                    binding.confirmPass.text.toString()
                )

            } else {
                Snackbar.make(binding.root, "Please check your Internet Connection", Snackbar.LENGTH_LONG)
                    .show()
            }
*/
        }

    }


}