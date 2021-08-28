package master.trying_out.some_views.spinner

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.zeugmasolutions.localehelper.LocaleHelper
import master.trying_out.some_views.MainActivity
import master.trying_out.some_views.R
import master.trying_out.some_views.databinding.FragmentSpinnerBinding
import master.trying_out.some_views.showToast
import java.util.*

class SpinnerFragment : Fragment(),
    AdapterView.OnItemSelectedListener {

    // binding
    private var _binding: FragmentSpinnerBinding? = null
    private val binding get() = _binding!!

    // spinner
    private var languages = arrayOf("Java", "PHP", "Kotlin", "Javascript", "Python", "Swift")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSpinnerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onStart() {
        super.onStart()


        setUpSpinner1()

        binding.button1.setOnClickListener {
            changeLang()
        }
    }

    /*
    *
    *
    * adapterView . .
    * */
    private fun setUpSpinner1() {
        val arrayAdapter1 =
            context?.let { ArrayAdapter(it, R.layout.spinner_right_aligned, languages) }
        arrayAdapter1?.setDropDownViewResource(R.layout.spinner_right_aligned)

        /* you can also use

          android default spinner
          simple_spinner_dropdown_item

        var aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        *
        * */

        with(binding.spinner1) {
            adapter = arrayAdapter1
            setSelection(0, false)
            onItemSelectedListener = this@SpinnerFragment
            prompt = "Select your favourite language"
            gravity = Gravity.CENTER
        }


    }


    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
        showToast(
            message = "Position:${position}\nLanguage: ${languages[position]}",
            context = context
        )
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        showToast(message = "Nothing selected", context = context)
    }

    /*
    *
    *
    * other
    * */
    private fun changeLang() {
        /*
               prevent that split for language files
               android {
                ...
                ..
                bundle {
                    language {
                        enableSplit = false
                    }
                }
            }
             */

        if (LocaleHelper.getLocale(requireContext()).language == "en")
            (activity as MainActivity).updateLocale(Locale("ar"))
        else
            (activity as MainActivity).updateLocale(Locale("en"))

    }

}
