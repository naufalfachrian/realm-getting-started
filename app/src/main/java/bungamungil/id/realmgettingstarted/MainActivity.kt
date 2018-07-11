package bungamungil.id.realmgettingstarted

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import bungamungil.id.realmgettingstarted.model.Person
import bungamungil.id.realmgettingstarted.model.PersonAdapter
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = PersonAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        Realm.getDefaultInstance().executeTransaction {
            val person = Person().apply {
                name = "Bunga Mungil"
                age = 9
            }
            it.insert(person)
        }

        val persons = Realm.getDefaultInstance().where(Person::class.java).findAll()
        adapter.items.addAll(persons)
        adapter.notifyDataSetChanged()
    }
}
