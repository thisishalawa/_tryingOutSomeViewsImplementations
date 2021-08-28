package master.trying_out.some_views.animations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import master.trying_out.some_views.R
import master.trying_out.some_views.databinding.FragmentAnimationsBinding

class AnimationsFragment : Fragment() {

    // binding
    private var _binding: FragmentAnimationsBinding? = null
    private val binding get() = _binding!!

    // anim
    var animFadeIn: Animation? = null
    var animFadeOut: Animation? = null
    var animBlink: Animation? = null
    var animZoomIn: Animation? = null
    var animZoomOut: Animation? = null
    var animRotate: Animation? = null
    var animMove: Animation? = null
    var animSlideUp: Animation? = null
    var animSlideDown: Animation? = null
    var animBounce: Animation? = null
    var animSequential: Animation? = null
    var animTogether: Animation? = null
    var animCrossFadeIn: Animation? = null
    var animCrossFadeOut: Animation? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnimationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    override fun onStart() {
        super.onStart()

        animFadeIn = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        animFadeIn = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        binding.btnFadeIn.setOnClickListener {
            binding.txtFadeIn.visibility = View.VISIBLE
            binding.txtFadeIn.startAnimation(animFadeIn)

        }
        animFadeOut = AnimationUtils.loadAnimation(context, R.anim.fade_out)
        binding.btnFadeOut.setOnClickListener {
            binding.txtFadeOut.visibility = View.VISIBLE
            binding.txtFadeOut.startAnimation(animFadeOut)
        }
        /*
        *
        *
        *
        * */
        animCrossFadeIn = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        animCrossFadeOut = AnimationUtils.loadAnimation(context, R.anim.fade_out)
        binding.btnCrossFade.setOnClickListener {
            binding.txtOut.visibility = View.VISIBLE
            binding.txtOut.startAnimation(animCrossFadeIn)
            binding.txtIn.startAnimation(animCrossFadeOut)
        }
        /*
        *
        *
        *
        *
        *  */
        animBlink = AnimationUtils.loadAnimation(context, R.anim.blink)
        binding.btnBlink.setOnClickListener {
            binding.txtBlink.visibility = View.VISIBLE
            binding.txtBlink.startAnimation(animBlink)
        }
        /*
        *
        *
        * */
        animZoomIn = AnimationUtils.loadAnimation(
            context,
            R.anim.zoom_in
        )

        binding.btnZoomIn.setOnClickListener {
            binding.txtZoomIn.visibility = View.VISIBLE
            binding.txtZoomIn.startAnimation(animZoomIn)
        }
        animZoomOut = AnimationUtils.loadAnimation(
            context,
            R.anim.zoom_out
        )

        binding.btnZoomOut.setOnClickListener {
            binding.txtZoomOut.visibility = View.VISIBLE
            binding.txtZoomOut.startAnimation(animZoomOut)
        }

        /*
        *
        *
        *
        * */
        animRotate = AnimationUtils.loadAnimation(
            context,
            R.anim.rotate
        )

        binding.btnRotate.setOnClickListener {
            binding.txtRotate.startAnimation(
                animRotate
            )
        }
        /*
        *
        * */
        animMove = AnimationUtils.loadAnimation(
            context,
            R.anim.move
        )
        binding.btnMove.setOnClickListener {
            binding.txtMove.startAnimation(
                animMove
            )
        }
        /*
        *
        *
        * */
        animSlideUp = AnimationUtils.loadAnimation(
            context,
            R.anim.slide_up
        )
        binding.btnSlideUp.setOnClickListener {
            binding.txtSlideUp.startAnimation(
                animSlideUp
            )
        }
        animSlideDown = AnimationUtils.loadAnimation(
            context,
            R.anim.slide_down
        )
        binding.btnSlideDown.setOnClickListener {
            binding.txtSlideDown.startAnimation(
                animSlideDown
            )
        }
        /*
        *
        *
        * */
        animBounce = AnimationUtils.loadAnimation(
            context,
            R.anim.bounce
        )
        binding.btnBounce.setOnClickListener(View.OnClickListener {
            binding.txtBounce.startAnimation(
                animBounce
            )
        })
        /*
        *
        *
        * */
        animSequential = AnimationUtils.loadAnimation(
            context,
            R.anim.sequential
        )
        binding.btnSequential.setOnClickListener {
            binding.txtSeq.startAnimation(
                animSequential
            )
        }

        /*
        *
        *
        *
        * */
        animTogether = AnimationUtils.loadAnimation(
            context,
            R.anim.together
        )
        binding.btnTogether.setOnClickListener {
            binding.txtTog.startAnimation(
                animTogether
            )
        }
    }
}
