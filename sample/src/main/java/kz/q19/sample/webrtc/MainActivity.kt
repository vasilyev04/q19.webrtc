package kz.q19.sample.webrtc

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kz.q19.sample.R

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(WebRTCActivity.newIntent(this))
        }
    }

}