package markosertic.ferit.insipringperson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPersons.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        btnADD.setOnClickListener(){
            val intent:Intent=Intent(this@MainActivity,AddPErsonActivity::class.java)
            startActivity(intent)
        }


    val personClick = object : quoteOnClick {
        override fun getQuote(index: Int) {
            val poznateOsobe = Osobe.dohvatiOsobu(index)
            if (poznateOsobe != null) {
                Toast.makeText(applicationContext, poznateOsobe.getRandomQuote(), Toast.LENGTH_LONG).show()
            }
        }
    }

    rvPersons.adapter = Adapter(Osobe.poznateOsobe, personClick, this)



}

}

