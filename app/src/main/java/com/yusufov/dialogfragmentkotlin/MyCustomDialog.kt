package com.yusufov.dialogfragmentkotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment


class MyCustomDialog : DialogFragment(){

    lateinit var btnLogin:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView:View=inflater.inflate(R.layout.custom_dialog_fragment,container,false)

        btnLogin=rootView.findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener {
            Toast.makeText(context,"Deneme",Toast.LENGTH_LONG).show()

            dismiss()
        }

        return rootView



    }






    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.90).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
    }



}