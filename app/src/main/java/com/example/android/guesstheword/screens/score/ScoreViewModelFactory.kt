package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
//use Factory beacuse we want to Crete construture of ViewModel by Ower Own
class ScoreViewModelFactory(private val finalScore :Int ) :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)){
            return ScoreViewModel(finalScore) as T

        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
