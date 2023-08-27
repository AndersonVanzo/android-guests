package com.knownt.guests.ui.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.knownt.guests.databinding.ActivityGuestFormBinding
import com.knownt.guests.ui.viewmodel.GuestFormViewModel

class GuestFormActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGuestFormBinding
    private lateinit var viewModel: GuestFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[GuestFormViewModel::class.java]

        binding.buttonSave.setOnClickListener { onSaveButtonClick() }
        binding.radioPresent.isChecked = true
    }

    private fun onSaveButtonClick() {}
}