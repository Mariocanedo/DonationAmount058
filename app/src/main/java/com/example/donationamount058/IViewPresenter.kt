package com.example.donationamount058

interface IViewPresenter {


    // actualiza el monto del texto en la vista

    fun updateTotalDonation(totalAmount: Int)

    // muestra mensaje de confirmación
    fun displayConfirmationMessage()

    // muestra mensaje de error
    fun displayErrorMessage()

    fun displayColorAlert(color:String)
}