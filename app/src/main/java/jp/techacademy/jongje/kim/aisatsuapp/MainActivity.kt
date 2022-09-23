package jp.techacademy.jongje.kim.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1){
            showTimePickerDialog()
        } else textView.text="挨拶"
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (hour >= 18 ) {
                    textView.text = "こんばんわ"
                }else if (hour >= 10) {
                    textView.text = "こんにちわ"
                }else if (2>hour ) {
                    textView.text = "こんばんわ"
                }else textView.text = "おはよう"

                //textView.text="$hour:$minute"

                },
            13, 0, true)
        timePickerDialog.show()
    }






    }