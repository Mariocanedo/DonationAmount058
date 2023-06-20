package com.example.donationamount058

class DonationModel {

    private var totalAmount: Int = 0


    init {

        this.totalAmount = 0

    }


    // para guardar donaciones
    fun saveDonation(donation: String): Boolean {
        val amount = donation.toIntOrNull()
        if (amount != null && amount > 0) {

            totalAmount += amount
            return true
        }
        return false
    }

    fun getDonationAMount(): Int {

        return totalAmount
    }


}