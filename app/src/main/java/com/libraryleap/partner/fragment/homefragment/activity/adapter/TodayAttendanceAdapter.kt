package com.libraryleap.partner.fragment.homefragment.activity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.libraryleap.partner.databinding.TodayAttendanceViewBinding
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

class TodayAttendanceAdapter  (
    var homedetailslist: List<TodayEnquiryViewModel>,
    val mContext: Context,
) : RecyclerView.Adapter<TodayAttendanceAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: TodayAttendanceViewBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            TodayAttendanceViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(homedetailslist[position]) {
             //   binding.tvName.text = this.CarName

             /*   binding.llHome.setOnClickListener {
                    val mainIntent = Intent(mContext, PropertyManagement::class.java)
                    mContext.startActivity(mainIntent)
                }*/
         /*       binding.llBlog.setOnClickListener {
                    val mainIntent = Intent(mContext, VehicleDetailsActivity::class.java)
                    mContext.startActivity(mainIntent)
                }*/
//                binding.ivFavourite.setImageResource(R.drawable.favorite)

            }
/*
            binding.llHome.setOnClickListener {
                val mainIntent = Intent(mContext, ResidentialActivity::class.java)
                mContext.startActivity(mainIntent)
            }
*/

        }
    }

    override fun getItemCount(): Int {
        return homedetailslist.size
    }
}