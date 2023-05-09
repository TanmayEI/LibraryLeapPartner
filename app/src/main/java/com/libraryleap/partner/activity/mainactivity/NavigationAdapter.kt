package com.topcutlawn.Fragments.HomeFragment.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.libraryleap.partner.activity.mainactivity.NavigationItemModel
import com.libraryleap.partner.activity.mainactivity.OnClickNavigator
import com.libraryleap.partner.databinding.RowNavDrawerBinding

class NavigationAdapter  (
    var homedetailslist: List<NavigationItemModel>,
    val mContext: Context,
    val OnClickNavigatio:OnClickNavigator,
) : RecyclerView.Adapter<NavigationAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: RowNavDrawerBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            RowNavDrawerBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }



    override fun getItemCount(): Int {
        return homedetailslist.size
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(homedetailslist[position]) {
                //   binding.tvName.text = this.CarName

                binding.navigationIcon.setImageResource(homedetailslist[position].icon)
                binding.navigationTitle.setText(homedetailslist[position].title)

                binding.linear.setOnClickListener {
                    OnClickNavigatio.onClick(homedetailslist[position].title)
                  //  Toast.makeText(mContext,"click",Toast.LENGTH_SHORT).show()
                }

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
}