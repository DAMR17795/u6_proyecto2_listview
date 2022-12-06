package www.iesmurgi.u6_proyecto2_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Variables
    private lateinit var miLista:ListView
    private lateinit var tvPais:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Asignacion a variables
        miLista = findViewById(R.id.miLista)
        tvPais = findViewById(R.id.tvPais)
        //Array con los Paises
        val misPaises = arrayOf("España", "Inglaterra", "Alemania", "Francia", "Italia",
            "Portugal", "Polonia", "Rusia", "Grecia", "Noruega")
        //ArrayAdapter para asignar los paises a la varible miLista
        ArrayAdapter(this, android.R.layout.simple_list_item_1, misPaises).also {
                adaptador -> miLista.setAdapter(adaptador)}

        //Metodo para al clickar obtener el elemento y
        //realizar setText() a tvPais
        miLista.setOnItemClickListener { parent, view, position, id ->
            //1.- Llamando al padre
            val pais = parent.getItemAtPosition(position).toString()
            //2.- Llamando al adaptador
            //Dan el mismo resultado
            val pais2 = parent.adapter.getItem(position).toString()
            tvPais.setText(pais)
        }
        }
    }





