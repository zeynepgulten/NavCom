package com.zeynepgltn.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zeynepgltn.myapplication.databinding.FragmentIkinciBinding

class IkinciFragment : Fragment() {
    private lateinit var binding: FragmentIkinciBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentIkinciBinding.inflate(inflater, container, false)

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_ikinciFragment_to_ucuncuFragment)
        }
        return binding.root
    }
}
