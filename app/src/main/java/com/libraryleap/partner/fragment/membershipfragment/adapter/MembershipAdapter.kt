package com.topcutlawn.Fragments.HomeFragment.Adapters

import android.R
import android.content.Context
import android.graphics.Color
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.libraryleap.partner.databinding.MembershipViewBinding
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel


class MembershipAdapter  (
    var homedetailslist: List<TodayEnquiryViewModel>,
    val mContext: Context,
) : RecyclerView.Adapter<MembershipAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: MembershipViewBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            MembershipViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(homedetailslist[position]) {

                val s = "999 for 3 Month"
                val ss1 = SpannableString(s)
                ss1.setSpan(RelativeSizeSpan(2f), 0, 4, 0) // set size

                ss1.setSpan(ForegroundColorSpan(Color.parseColor("#1E437A")), 0, 4, 0) // set color

                binding.price.text = ss1

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