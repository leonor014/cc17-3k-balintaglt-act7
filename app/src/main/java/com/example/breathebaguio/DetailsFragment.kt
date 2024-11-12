package com.example.breathebaguio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.breathebaguio.databinding.FragmentDetailsBinding
import androidx.navigation.fragment.navArgs as DetailsFragmentArgs
import kotlin.reflect.KProperty

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    private val args: DetailsFragmentArgs by DetailsFragment.DetailsFragmentArgs()

    class DetailsFragmentArgs {
        operator fun getValue(detailsFragment: DetailsFragment, property: KProperty<*>): DetailsFragment.DetailsFragmentArgs {

            return TODO("Provide the return value")
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Accessing the Place object from the arguments
        val place = args.place
        binding.placeImage.setImageResource(place.imageResource)
        binding.placeDetails.text = place.details
        binding.placeLocation.text = place.location
    }
}


