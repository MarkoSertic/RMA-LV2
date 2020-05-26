package markosertic.ferit.insipringperson

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class OsobaViewHolder(view:View):RecyclerView.ViewHolder(view) {
    fun populateOnViewHolder (person: Osoba, personOnClick: quoteOnClick) {
        itemView.tvName.text = person.name
        itemView.tvDates.text = person.birthday
        itemView.tvInformation.text = person.description
        itemView.ivImage.setOnClickListener() {
            personOnClick.getQuote(person.index)
        }

    }
}