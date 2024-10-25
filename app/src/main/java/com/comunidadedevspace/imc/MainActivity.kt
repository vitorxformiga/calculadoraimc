package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Recuperar os componentes Edittext
            // Criar uma variavel e associar o componente de UI <TextImputEditText>
        // Recuyperar o botao da tela
        //colocaar acao no botao setOnClickListener
        // Recuperar texto no edtpeso


        val edtpeso = findViewById<TextInputEditText>(R.id.edtpeso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edtaltura)

        val bttn_calcular = findViewById<Button>(R.id.bttn_calcular)

        bttn_calcular.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtaltura.text

            println("Acao do botao" + altura)

        }
    }
}