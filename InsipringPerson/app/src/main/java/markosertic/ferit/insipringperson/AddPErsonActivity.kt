package markosertic.ferit.insipringperson

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_person.*

class AddPErsonActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_person)
        btnADD2.setOnClickListener() {
            if (etIdentifier.text.toString().trim().isEmpty() ||
                etNameLastName.text.toString().trim().isEmpty() ||
                etDate.text.toString().trim().isEmpty() ||
                etInfo.text.toString().trim().isEmpty() ||
                etImage.text.toString().trim().isEmpty() ||
                etQuotes.text.toString().trim().isEmpty()
            ) {
                Toast.makeText(this, "INCORECT INPUT", Toast.LENGTH_SHORT).show()
            } else {
                val identifierString: String = etIdentifier.text.toString()
                val identifier: Int = identifierString.toInt()
                val name: String = etNameLastName.text.toString()
                val birtdate: String = etDate.text.toString()
                val information: String = etInfo.text.toString()
                val imageURL: String = etImage.text.toString()
                val quotes = etQuotes.text.toString().split(";").toTypedArray()

                val novaOsoba =
                    Osoba(identifier, imageURL, name, birtdate, information, quotes)

                Osobe.dodajOsobu(novaOsoba)
                reset()
            }
        }

        btnBack.setOnClickListener() {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
            private fun reset() {
                etIdentifier.setText("")
                etIdentifier.setText(" ")
                etNameLastName.setText(" ")
                etDate.setText(" ")
                etInfo.setText(" ")
                etImage.setText(" ")
                etQuotes.setText(" ")
            }
        }
