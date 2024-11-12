package com.example.breathebaguio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.breathebaguio.databinding.FragmentCategoryBinding
import kotlin.reflect.KProperty
import androidx.navigation.fragment.navArgs as navArgs1

class CategoryFragment : Fragment() {
    private lateinit var binding: FragmentCategoryBinding
    private val viewModel: MainViewModel by viewModels()
    private val args: CategoryFragmentArgs by CategoryFragment.CategoryFragmentArgs()

    class CategoryFragmentArgs {
        operator fun getValue(categoryFragment: CategoryFragment, property: KProperty<*>): CategoryFragment.CategoryFragmentArgs {

            return TODO("Provide the return value")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Setting up the category title from the navigation argument
        binding.categoryTitle.text = args.category
        binding.placesRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Observing places from the ViewModel and setting the adapter
        viewModel.loadPlaces(args.category)
        viewModel.places.observe(viewLifecycleOwner) { places ->
            binding.placesRecyclerView.adapter = PlaceAdapter(places) { place ->
                val action = CategoryFragmentDirections
                    .actionCategoryFragmentToDetailsFragment(place)
                findNavController().navigate(action)
            }

        }
    }

    class CategoryFragmentDirections {
        companion object {
            fun actionCategoryFragmentToDetailsFragment(place: Place): Any {

                return TODO("Provide the return value")
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.placesRecyclerView.adapter = null
    }

}