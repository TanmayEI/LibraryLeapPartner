package com.libraryleap.partner.fragment.homefragment.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import com.libraryleap.partner.databinding.ActivityAttendanceManagementBinding
import com.libraryleap.partner.fragment.homefragment.activity.adapter.AttendanceManagementAdapter
import com.libraryleap.partner.fragment.homefragment.activity.adapter.TodayAttendanceAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

class AttendanceManagementActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityAttendanceManagementBinding
    var email:String=""
    var password:String=""
    private lateinit var todayEnquiryAdapter: AttendanceManagementAdapter
    private lateinit var homedetailslist: List<TodayEnquiryViewModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAttendanceManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setSupportActionBar(binding.toolbar)

        binding.back.setOnClickListener {
            onBackPressed()
        }


        home_list()
        binding.todayAttendance.layoutManager = LinearLayoutManager(this)
        binding.todayAttendance.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        todayEnquiryAdapter = AttendanceManagementAdapter(homedetailslist,this)

        binding.todayAttendance.adapter = todayEnquiryAdapter



    }
    fun home_list(){
        homedetailslist = listOf(
            TodayEnquiryViewModel(
                "Residential Services",
            ),
            TodayEnquiryViewModel(
                "Commercial Services",
            ),
            TodayEnquiryViewModel(
                "Residential Services",
            )
        )
    }






}