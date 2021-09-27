package com.agesadev.cryptoapp.presentation.coin_detail

import com.agesadev.cryptoapp.domain.model.Coin
import com.agesadev.cryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String=""
)
