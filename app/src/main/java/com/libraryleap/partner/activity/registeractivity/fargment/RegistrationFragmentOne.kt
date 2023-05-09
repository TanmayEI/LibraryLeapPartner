package com.libraryleap.partner.activity.registeractivity.fargment

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.libraryleap.partner.R
import com.libraryleap.partner.databinding.FragmentHomeBinding
import com.libraryleap.partner.databinding.FragmentRegistrationOneBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class RegistrationFragmentOne : Fragment() {

    private var _binding: FragmentRegistrationOneBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRegistrationOneBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.next.setOnClickListener {
            showDialog()
            //findNavController().navigate(R.id.RegistrationFragmentTwo)
        }

/*
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
*/
    }

    fun showDialog() {
        var dialog = Dialog(requireContext())
        dialog.getWindow()!!
            .setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            );

        lateinit var next: TextView
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.popup)
        next = dialog.findViewById(R.id.next)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()

        next.setOnClickListener {
            dialog.dismiss()
            findNavController().navigate(R.id.RegistrationFragmentTwo)
        }


        //dialog.window?.setLayout(9050, 1300)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}