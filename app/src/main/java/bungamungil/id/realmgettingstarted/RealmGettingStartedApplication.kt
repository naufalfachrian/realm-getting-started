package bungamungil.id.realmgettingstarted

import android.app.Application
import io.realm.Realm

class RealmGettingStartedApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }

}