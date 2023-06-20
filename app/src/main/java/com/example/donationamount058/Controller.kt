package com.example.donationamount058

import java.time.temporal.TemporalAmount

class Controller {

    // Comunico en el Model
    private val model : DonationModel
    init {
        model= DonationModel()
    }

    // llamo la funcion de model guardar
    fun saveDonation(amount: String): Boolean {

        return  model.saveDonation(amount)
    }


    // llamo la funcion de model muestra las donaciones
    fun totalDonation(): Int {

        return model.getDonationAMount()
    }




}