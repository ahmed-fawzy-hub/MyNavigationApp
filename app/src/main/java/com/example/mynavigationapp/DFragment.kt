package com.example.mynavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mynavigationapp.databinding.FragmentDBinding


/**
 * A simple [Fragment] subclass.
 * Use the [DFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DFragment : Fragment() {


    lateinit var binding:FragmentDBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentDBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBack.setOnClickListener { v->
            Navigation.findNavController(v).popBackStack()
        }
    }


}