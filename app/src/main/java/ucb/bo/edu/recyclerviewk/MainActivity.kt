package ucb.bo.edu.recyclerviewk

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = arrayListOf<Usuario>()
        lista.add(Usuario("Roberto Carlos Callisaya Mamani", "calyr.software@gmail.com"))
        lista.add(Usuario("Gabriela Orosco Montaño", "gabriela_ocsoro@gmail.com"))

        val userListAdapter = UserListAdapter(lista, this)
        recyclerView.adapter = userListAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = linearLayoutManager
    }
}
