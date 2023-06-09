package com.example.presentation.ui.fragments

import androidx.lifecycle.viewModelScope
import com.example.domain.either.Either
import com.example.domain.usecases.FilmsUseCase
import com.example.presentation.base.BaseViewModel
import com.example.presentation.models.ResponseUI
import com.example.presentation.models.toUI
import com.example.presentation.state.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FilmsViewModel @Inject constructor(
    private val filmsUseCase: FilmsUseCase
) : BaseViewModel() {

    private val _filmsState = MutableStateFlow<UIState<List<ResponseUI>>>(UIState.Loading())
    val filmsState get() = _filmsState.asStateFlow()

    init {
        fetchFilms()
    }

    private fun fetchFilms() {
        viewModelScope.launch {
            filmsUseCase().collect {
                when (it) {
                    is Either.Left -> {
                        it.message?.let { error ->
                            _filmsState.value = UIState.Error(error)
                        }
                    }

                    is Either.Right -> {
                        it.data?.let {
                            _filmsState.value = UIState.Success(it.map { anime ->
                                anime.toUI()
                            })
                        }
                    }
                }
            }
        }
    }
}