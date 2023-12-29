package com.example.mynavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mynavigationapp.databinding.FragmentBBinding
import com.example.mynavigationapp.databinding.FragmentCBinding



/**
 * A simple [Fragment] subclass.
 * Use the [CFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CFragment : Fragment() {


    lateinit var binding: FragmentCBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentCBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonD.setOnClickListener { v->
            Navigation.findNavController(v).navigate(R.id.action_CFragment_to_DFragment)
        }
    }


}