package com.example.breathebaguio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.breathebaguio.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.clubAndBarButton.setOnClickListener {
            navigateToCategory("Club and Bar")
        }
        binding.restaurantsButton.setOnClickListener {
            navigateToCategory("Restaurants")
        }
        binding.kidFriendlyButton.setOnClickListener {
            navigateToCategory("Kid-Friendly Places")
        }
        binding.parksButton.setOnClickListener {
            navigateToCategory("Parks")
        }
        binding.shoppingCentersButton.setOnClickListener {
            navigateToCategory("Shopping Centers")
        }
    }

    private fun navigateToCategory(category: String) {
        val action = MainFragmentDirections.actionMainFragmentToCategoryFragment(category)
        findNavController().navigate(action)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

private fun NavController.navigate(action: Any) {
    TODO("Not yet implemented")
}

class MainFragmentDirections {
    companion object {
        fun actionMainFragmentToCategoryFragment(category: String): Any {
            TODO("Not yet implemented")
            return TODO("Provide the return value")
        }
    }

}
