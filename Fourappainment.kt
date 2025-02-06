package com.project.loginandsign

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Fourappainment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourappainment)
        val sendSmsButton: Button = findViewById(R.id.sendSmsButton)
        val googleImage: ImageView = findViewById(R.id.googleImage)
        val Faceboook: ImageView = findViewById(R.id.Facebook)



        sendSmsButton.setOnClickListener {
            sendSmsWithImage()
        }

        googleImage.setOnClickListener {
            openGoogleWebsite()
        }


        Faceboook.setOnClickListener {
            openFacebook()
        }


    }

    private fun sendSmsWithImage() {
        val imageUri: Uri = Uri.parse("android.resource://$packageName/drawable/sample_image") // Replace with your image

        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "image/*"
            putExtra(Intent.EXTRA_STREAM, imageUri)
            putExtra("address", "01712583333")
            putExtra("sms_body", "Type Your Full Details")
        }

        startActivity(Intent.createChooser(intent, "Send SMS"))
    }

    private fun openGoogleWebsite() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
        startActivity(intent)
    }
    private fun openFacebook(){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/parves.khandakar.2024/"))
        startActivity(intent)
    }
}
