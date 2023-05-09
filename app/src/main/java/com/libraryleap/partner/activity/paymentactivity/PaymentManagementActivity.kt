package com.libraryleap.partner.activity.paymentactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.libraryleap.partner.databinding.ActivityBookingManagementBinding
import com.libraryleap.partner.databinding.ActivityPaymentManagementBinding
import com.libraryleap.partner.fragment.studentfragment.activity.adapter.MonthlyAttendanceDetailsAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

class PaymentManagementActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityPaymentManagementBinding
    var email:String=""
    var password:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPaymentManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setSupportActionBar(binding.toolbar)

        binding.back.setOnClickListener {
            onBackPressed()
        }




    }






}