package cubex.mahesh.actv_jan9am19

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_language_selection.*
import android.util.DisplayMetrics
import java.util.*


class LanguageSelection : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_selection)

        b1.setOnClickListener {
                nextScreen("en")
        }
        b2.setOnClickListener {
                nextScreen("hi")
        }
        b3.setOnClickListener {
                nextScreen("te")
        }
    } // onCreate

    fun nextScreen(lang:String)
    {
        val dm = resources.getDisplayMetrics()
        val conf = resources.getConfiguration()
        conf.setLocale(Locale(lang))
        resources.updateConfiguration(conf, dm)


        var i = Intent(this@LanguageSelection,
            MainActivity::class.java)
        startActivity(i)
    }
}
