package com.agesadev.cryptoapp.presentation

sealed class Screen(val route:String){
    object  CoinListScreen:Screen(route = "coin_list_screen")
    object  CoinDetailScreen:Screen("coin_detail_screen")
}