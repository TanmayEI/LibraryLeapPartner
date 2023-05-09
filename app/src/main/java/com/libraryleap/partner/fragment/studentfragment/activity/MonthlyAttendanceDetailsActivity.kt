package com.libraryleap.partner.fragment.studentfragment.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import com.libraryleap.partner.databinding.ActivityMonthlyDetailsAttendanceBinding
import com.libraryleap.partner.fragment.studentfragment.activity.adapter.MonthlyAttendanceDetailsAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

class MonthlyAttendanceDetailsActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMonthlyDetailsAttendanceBinding
    var email:String=""
    var password:String=""
    private lateinit var todayEnquiryAdapter: MonthlyAttendanceDetailsAdapter
    private lateinit var homedetailslist: List<TodayEnquiryViewModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMonthlyDetailsAttendanceBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setSupportActionBar(binding.toolbar)

        binding.back.setOnClickListener {
            onBackPressed()
        }


        home_list()
        binding.todayAttendance.layoutManager = LinearLayoutManager(this)
        binding.todayAttendance.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        todayEnquiryAdapter = MonthlyAttendanceDetailsAdapter(homedetailslist,this)

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