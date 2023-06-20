package com.example.donationamount058

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.donationamount058.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() ,IViewPresenter{
    // referenciado Mbinding y kla clase controller
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var  presenter: DonationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
  mBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

//inicializar Presenter
       presenter= DonationPresenter(this)

        mBinding.button.setOnClickListener{makeDonation()}

    }

    private fun makeDonation(){

    presenter.saveDonation(mBinding.tvDonation.text.toString())
        mBinding.tvDonation.setText("")
        presenter.totalDonation()
        presenter.ckeckTotal()

    }

    override fun updateTotalDonation(totalAmount: Int) {
   val total = getString(R.string.total_donaciones, totalAmount.toString())
        mBinding.tvTotal.text= total
    }

    override fun displayConfirmationMessage() {
        val toast = Toast.makeText(applicationContext, "Donación exitosa", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun displayErrorMessage() {
        val toast1 = Toast.makeText(applicationContext, "Donación Fallida",Toast.LENGTH_LONG)
        toast1.show()
    }

    override fun displayColorAlert(color: String) {
     mBinding.textView2.setBackgroundColor(Color.parseColor(color))
    }


}