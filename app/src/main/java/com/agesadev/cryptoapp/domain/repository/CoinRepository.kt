package com.agesadev.cryptoapp.domain.repository

import com.agesadev.cryptoapp.data.remote.dto.CoinDetailDto
import com.agesadev.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins():List<CoinDto>

    suspend fun getCoinById(coinId:String):CoinDetailDto
}

