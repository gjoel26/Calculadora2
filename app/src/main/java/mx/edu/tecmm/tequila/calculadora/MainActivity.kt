package mx.edu.tecmm.tequila.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var  tvResultado: TextView
    lateinit var  edNum1: EditText
    lateinit var  edNum2: TextView
    lateinit var  rdSuma: TextView
    lateinit var  rdResta: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvResultado = findViewById(R.id.tvResultado)
        edNum1 = findViewById(R.id.edNum1)
        edNum2 = findViewById(R.id.edNum2)
        rdSuma = findViewById(R.id.rdSuma)
        rdResta = findViewById(R.id.rdResta)


    }
    fun accionClick(view: View){
        val num1 = edNum1.text.toString().toInt()
        val num2 = edNum2.text.toString().toInt()
        var resultado = 0
        if(rdSuma.isChecked){
            resultado = num1 + num2
        }else{
            resultado = num1 - num2
        }
        tvResultado.text = "$resultado"
    }
}