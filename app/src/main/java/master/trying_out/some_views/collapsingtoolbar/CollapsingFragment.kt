package master.trying_out.some_views.collapsingtoolbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import master.trying_out.some_views.MainActivity
import master.trying_out.some_views.databinding.FragmentCollapsingBinding

class CollapsingFragment : Fragment() {

    // binding
    private var _binding: FragmentCollapsingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCollapsingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onStart() {
        super.onStart()



        (activity as MainActivity).supportActionBar?.hide()
        binding.collapsingToolbarId.apply {
            isTitleEnabled = true
            title = "Kind Arthur"
        }

    }


}
