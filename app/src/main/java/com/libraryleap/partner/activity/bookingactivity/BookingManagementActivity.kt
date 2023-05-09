package com.libraryleap.partner.activity.bookingactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.libraryleap.partner.databinding.ActivityBookingManagementBinding
import com.libraryleap.partner.fragment.studentfragment.activity.adapter.MonthlyAttendanceDetailsAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

class BookingManagementActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityBookingManagementBinding
    var email:String=""
    var password:String=""
    private lateinit var todayEnquiryAdapter: MonthlyAttendanceDetailsAdapter
    private lateinit var homedetailslist: List<TodayEnquiryViewModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBookingManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setSupportActionBar(binding.toolbar)

        binding.back.setOnClickListener {
            onBackPressed()
        }




    }






}