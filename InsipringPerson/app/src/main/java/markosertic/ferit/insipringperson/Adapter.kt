package markosertic.ferit.insipringperson

import android.content.Context
import android.util.Log.i
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*
import com.squareup.picasso.Picasso



class Adapter(poznateOsobe: MutableList<Osoba>, personClick:quoteOnClick, context: Context):
    RecyclerView.Adapter<OsobaViewHolder>() {
    private val poznateOsobe : MutableList<Osoba> = mutableListOf()
    private val personOnClick : quoteOnClick
    private val context : Context

    init {
        this.poznateOsobe.addAll(poznateOsobe)
        this.personOnClick =  personClick
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OsobaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        val holder = OsobaViewHolder(view)
        return holder
    }
    override fun getItemCount(): Int {
        val size : Int = poznateOsobe.size
        return size
    }

    override fun onBindViewHolder(holder: OsobaViewHolder, position: Int) {
        val person =poznateOsobe[position]
        holder.populateOnViewHolder(person, personOnClick)

        Picasso.with(context).load(person.getImageUrl()).into(holder.itemView.ivImage)//Picasso library s neta, copy-paste, radi i dobro je :)
    }
}
interface quoteOnClick {
    fun getQuote(index : Int)
}