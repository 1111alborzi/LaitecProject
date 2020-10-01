package laitecproject.personaltest.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
//        Splash Code
        val splashTime = object : Thread() {
            override fun run() {
                super.run()
                try {
                    sleep(3000)
                } catch (e:Exception) {
                } finally {
                    startActivity(Intent(this@Splash,MainActivity::class.java))
                }
            }
        }
        splashTime.start()
    }
    override fun onPause() {
        super.onPause()
        finish()
    }
}



