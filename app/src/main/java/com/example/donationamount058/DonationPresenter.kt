package com.example.donationamount058

class DonationPresenter(private val view:IViewPresenter) {

    // Comunico en el Model
    private val model: DonationModel

    init {
        model = DonationModel()
    }

    // llamo la funcion de model guardar
    fun saveDonation(donation: String) {
        if (model.saveDonation(donation)) {
            view.displayConfirmationMessage()
            view.updateTotalDonation(model.getDonationAMount())
        } else {
            view.displayErrorMessage()
        }
    }


    // llamo la funcion de model muestra las donaciones
    fun totalDonation() {
     view.updateTotalDonation(model.getDonationAMount())
    }

    fun ckeckTotal(){

        view.displayColorAlert(model.checKAmount())
    }


}