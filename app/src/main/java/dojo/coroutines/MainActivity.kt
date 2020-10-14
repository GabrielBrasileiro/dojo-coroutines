package dojo.coroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.btnNewJoke
import kotlinx.android.synthetic.main.activity_main.progress

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // load new joke at start

        setupViews()
    }

    private fun setupViews() {
        btnNewJoke.setOnClickListener {
            // load new joke
        }
    }

    private fun showLoading() {
        progress.isVisible = true
        btnNewJoke.isVisible = false
    }

    private fun hideLoading() {
        progress.isVisible = false
        btnNewJoke.isVisible = true
    }
}