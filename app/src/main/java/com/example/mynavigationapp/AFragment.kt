package com.example.mynavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mynavigationapp.databinding.FragmentABinding


/**
 * A simple [Fragment] subclass.
 * Use the [AFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AFragment : Fragment() {




    lateinit var binding:FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentABinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonB.setOnClickListener { v->
            val action=AFragmentDirections.actionAFragmentToBFragment("Hello World")
            Navigation.findNavController(v).navigate(action)
        }
        binding.buttonC.setOnClickListener { v->
            Navigation.findNavController(v).navigate(R.id.action_AFragment_to_CFragment)
        }
    }


}