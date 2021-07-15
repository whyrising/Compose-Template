package com.why.template.compose.materialisedview

import com.why.template.compose.presentation.Route

data class MainViewModel(
    val topBarTitle: String = "",
    val currentPage: Route = Route.NONE
)
