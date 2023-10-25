package pl.example.criminalintentkt

import android.app.Application

// Pamiętaj o dodaniu tej klasy do AndroidManifest!
class CriminalIntentApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        // Inicjalizacja repozytorium
        CrimeRepository.initialize(this)
    }
}