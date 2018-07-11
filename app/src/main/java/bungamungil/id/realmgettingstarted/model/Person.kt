package bungamungil.id.realmgettingstarted.model

import io.realm.RealmObject

open class Person : RealmObject() {

    var name: String = ""

    var age: Int = 0

}