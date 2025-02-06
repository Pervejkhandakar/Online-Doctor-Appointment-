package com.project.loginandsign.Active

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.project.loginandsign.Apparmant
import com.project.loginandsign.Fourappainment
import com.project.loginandsign.R
import com.project.loginandsign.pasan_me
import com.project.loginandsign.thadd

class sign : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign)

        val doctorCard = findViewById<CardView>(R.id.doctorCard)
val patientCard = findViewById<CardView>(R.id.patientCard)
val thaddCard = findViewById<CardView>(R.id.thaddCard)
val fourCard = findViewById<CardView>(R.id.fourCard)
        val FiveCard= findViewById<CardView>(R.id.FiveCard)
        val sixcard = findViewById<CardView>(R.id.sixcard)
        val savencard = findViewById<CardView>(R.id.savencard)
        val Eatcard = findViewById<CardView>(R.id.Eatcard)
        val ninecard=findViewById<CardView>(R.id.ninecard)
        val Tencard=findViewById<CardView>(R.id.Tencard)
        val Elabine= findViewById<CardView>(R.id.Elabine)
        val twel=findViewById<CardView>(R.id.twel)



        val slide1=findViewById<ImageView>(R.id.slide1)
        val slide2=findViewById<ImageView>(R.id.slide2)
        val slide3=findViewById<ImageView>(R.id.slide3)
        val slide4=findViewById<ImageView>(R.id.slide4)
        val slide5=findViewById<ImageView>(R.id.slide5)
        val slide6=findViewById<ImageView>(R.id.slide6)
        val slide7=findViewById<ImageView>(R.id.slide7)
        val slide8=findViewById<ImageView>(R.id.slide8)
        val slide9=findViewById<ImageView>(R.id.slide9)




        doctorCard.setOnClickListener {
            Toast.makeText(this, "Opening Doctor Profile...", Toast.LENGTH_SHORT).show()


            val intent = Intent(this,  Apparmant::class.java)
            startActivity(intent)
        }
        patientCard.setOnClickListener {
            val intent=Intent(this,pasan_me::class.java)
            startActivity(intent)
        }

        thaddCard.setOnClickListener {
            val intent=Intent(this,thadd::class.java)
            startActivity(intent)
        }
        fourCard.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        FiveCard.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
         sixcard.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        savencard.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        Eatcard.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        ninecard.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }

        Tencard.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        Elabine.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        twel.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        slide1.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }















        slide2.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        slide3.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        slide4.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        slide5.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        slide6.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }
        slide7.setOnClickListener {
            val intent = Intent(this, Fourappainment::class.java)
            startActivity(intent)
        }
        slide8.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }

        slide9.setOnClickListener {
            val intent=Intent(this,Fourappainment::class.java)
            startActivity(intent)
        }








    }
}