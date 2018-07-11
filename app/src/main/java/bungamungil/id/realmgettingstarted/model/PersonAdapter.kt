package bungamungil.id.realmgettingstarted.model

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bungamungil.id.realmgettingstarted.R
import kotlinx.android.synthetic.main.item_person.view.*

class PersonAdapter : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    val items = arrayListOf<Person>()

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_person
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Person) {
            itemView.name.text = item.name
            itemView.age.text = "${item.age} y.o."
        }

    }

}