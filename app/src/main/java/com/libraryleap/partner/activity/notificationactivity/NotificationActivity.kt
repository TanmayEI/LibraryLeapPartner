package com.libraryleap.partner.activity.notificationactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import com.libraryleap.partner.databinding.ActivityNotificationBinding
import com.libraryleap.partner.databinding.ActivityTodayAttendanceBinding
import com.libraryleap.partner.fragment.homefragment.activity.adapter.TodayAttendanceAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

class NotificationActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityNotificationBinding
    var email:String=""
    var password:String=""
    private lateinit var todayEnquiryAdapter: NotificationAdapter
    private lateinit var homedetailslist: List<TodayEnquiryViewModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setSupportActionBar(binding.toolbar)

        binding.back.setOnClickListener {
            onBackPressed()
        }


        home_list()
        binding.notification.layoutManager = LinearLayoutManager(this)
        binding.notification.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        todayEnquiryAdapter = NotificationAdapter(homedetailslist,this)

        binding.notification.adapter = todayEnquiryAdapter



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