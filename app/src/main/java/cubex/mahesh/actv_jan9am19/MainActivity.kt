package cubex.mahesh.actv_jan9am19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var values = resources.getStringArray(R.array.countries)
     //       var values = arrayOf("Saudi Arebia","Sri Lanka")

        /*    var myadapter = ArrayAdapter<String>(this,
                                                        R.layout.indiitem, values ) */
        var myadapter = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_single_choice, values )
        actv.setAdapter(myadapter)
        actv.threshold = 1
    }
}
