package com.knownt.guests

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.knownt.guests.databinding.ActivityGuestFormBinding

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