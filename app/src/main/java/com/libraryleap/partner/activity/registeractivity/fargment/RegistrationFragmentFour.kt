package com.libraryleap.partner.activity.registeractivity.fargment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.libraryleap.partner.R
import com.libraryleap.partner.activity.registeractivity.RegistrationActivity
import com.libraryleap.partner.databinding.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class RegistrationFragmentFour : Fragment() {

    private var _binding: FragmentRegistrationFourBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRegistrationFourBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as RegistrationActivity?)?.update_screen("")
        binding.payment.setOnClickListener {
            findNavController().navigate(R.id.RegistrationFragmentUnderreview)
        }

/*
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
*/
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}