package com.knownt.guests.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.knownt.guests.domain.repository.GuestRepository

class GuestFormViewModel : ViewModel() {
    private val repository = GuestRepository.getInstance()
}