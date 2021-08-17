package sg.edu.rp.id19030019.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var textView = ""
    var number = 0.0
    var plus = false
    var minus = false
    var multiply = false
    var divide = false
    var percent = false
    var plusminus = false
    var isDot = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAC.setOnClickListener {
            tvScreen.text = ""
            textView = ""
        }
        btnEqual.setOnClickListener {
            if (plus == true) {
                tvScreen.text = (number + tvScreen.text.toString().toDouble()).toString()
            } else if (minus == true) {
                tvScreen.text = (number - tvScreen.text.toString().toDouble()).toString()
            } else if (divide == true) {
                tvScreen.text = (number / tvScreen.text.toString().toDouble()).toString()
            } else if (multiply == true) {
                tvScreen.text = (number * tvScreen.text.toString().toDouble()).toString()
            }else if (percent == true) {
                tvScreen.text = (tvScreen.text.toString().toDouble() / 100).toString()
            }else if (plusminus == true) {
                tvScreen.text = (number + tvScreen.text.toString().toDouble()).toString()
            }
        }
        btnPlus.setOnClickListener {
            plus = true
            number = tvScreen.text.toString().toDouble()
            textView = ""
            multiply = false
            minus = false
            divide = false
        }
        btnMinus.setOnClickListener {
            minus = true
            number = textView.toDouble()
            textView = ""
            multiply = false
            plus = false
            divide = false
        }

        btnMultiply.setOnClickListener {
            multiply = true
            number = textView.toDouble()
            textView = ""
            plus = false
            minus = false
            divide = false
        }
        btnDivide.setOnClickListener {
            divide = true
            number = textView.toDouble()
            textView = ""
            multiply = false
            minus = false
            plus = false
        }
        btnPercentage.setOnClickListener {
            percent = true
            number = textView.toDouble()
            textView = ""
            plus = false
            minus = false
            multiply = false
            divide = false
        }
        btnPlusMinus.setOnClickListener {
            plusminus = true
            number = 0 - tvScreen.text.toString().toDouble()
            tvScreen.text = "$number"
            textView = ""
            plus = false
            minus = false
            multiply = false
            divide = false
            percent = false
        }
    }

    fun btnOnClick(view: View) {
        val btnSelected = view as Button
        when (btnSelected.id) {
            btn0.id -> textView += "0"
            btn1.id -> textView += "1"
            btn2.id -> textView += "2"
            btn3.id -> textView += "3"
            btn4.id -> textView += "4"
            btn5.id -> textView += "5"
            btn6.id -> textView += "6"
            btn7.id -> textView += "7"
            btn8.id -> textView += "8"
            btn9.id -> textView += "9"
            btnDot.id -> textView + "."
        }
        tvScreen.text = textView
    }
}