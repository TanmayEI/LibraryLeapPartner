package com.libraryleap.partner.fragment.homefragment.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import com.libraryleap.partner.databinding.ActivityTodayAttendanceBinding
import com.libraryleap.partner.fragment.homefragment.activity.adapter.TodayAttendanceAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

class TodayAttendanceActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityTodayAttendanceBinding
    var email:String=""
    var password:String=""
    private lateinit var todayEnquiryAdapter: TodayAttendanceAdapter
    private lateinit var homedetailslist: List<TodayEnquiryViewModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTodayAttendanceBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setSupportActionBar(binding.toolbar)

        binding.back.setOnClickListener {
            onBackPressed()
        }


        home_list()
        binding.todayAttendance.layoutManager = LinearLayoutManager(this)
        binding.todayAttendance.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        todayEnquiryAdapter = TodayAttendanceAdapter(homedetailslist,this)

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