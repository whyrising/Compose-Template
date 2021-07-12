package com.why.template.compose.materialisedview

import com.why.template.compose.presentation.Route

data class MainViewModel(
    val topBarTitle: String = "",
    val currentPage: Route = Route.HOME
)

fun updateTopBarTitle(viewModel: MainViewModel, title: String): MainViewModel =
    viewModel.copy(topBarTitle = title)

fun updateCurrentRoute(viewModel: MainViewModel, route: Route): MainViewModel =
    viewModel.copy(currentPage = route)