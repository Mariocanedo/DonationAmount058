package com.example.donationamount058

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.donationamount058.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // referenciado Mbinding y kla clase controller
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var  controller: Controller

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
  mBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
//inicializar controller
   controller= Controller()

        mBinding.button.setOnClickListener{makeDonation()}

    }

    private fun makeDonation(){

   val donation= controller.saveDonation(mBinding.tvDonation.text.toString())
        if( donation){

            val totalDonation = controller.totalDonation()
            // recibo el total de las donaciones
            val total= getString(R.string.total_donaciones,totalDonation.toString())
            mBinding.tvTotal.text= total
            val toast = Toast.makeText(applicationContext, "Donación exitosa", Toast.LENGTH_LONG)
            toast.show()

        }
        else{

            val toast1 = Toast.makeText(applicationContext, "Donación Fallida",Toast.LENGTH_LONG)
            toast1.show()
        }
    }


}