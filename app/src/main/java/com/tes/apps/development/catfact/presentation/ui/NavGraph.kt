package com.tes.apps.development.catfact.presentation.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tes.apps.development.catfact.presentation.detail.DetailScreen
import com.tes.apps.development.catfact.presentation.home.HomeScreen

@Composable
fun NavGraph(
    navController: NavHostController,
) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(
            "${Screen.Detail.route}?height={height} width={width} url={url} name={name} origin={origin} adaptability={adaptability} affectionLevel={affectionLevel} intelligence={intelligence} desc={desc} catFriendly={catFriendly} dogFriendly={dogFriendly} lifeSpan={lifeSpan}"
        ) { backStackEntry ->
            val height = backStackEntry.arguments?.getString("height")
            val width = backStackEntry.arguments?.getString("width")
            val url = backStackEntry.arguments?.getString("url")
            val name = backStackEntry.arguments?.getString("name")
            val origin = backStackEntry.arguments?.getString("origin")
            val adaptability = backStackEntry.arguments?.getString("adaptability")
            val affectionLevel = backStackEntry.arguments?.getString("affectionLevel")
            val intelligence = backStackEntry.arguments?.getString("intelligence")
            val desc = backStackEntry.arguments?.getString("desc")
            val catFriendly = backStackEntry.arguments?.getString("catFriendly")
            val dogFriendly = backStackEntry.arguments?.getString("dogFriendly")
            val lifeSpan = backStackEntry.arguments?.getString("lifeSpan")

            DetailScreen(
                height = height ?: "0",
                width = width ?: "0",
                url = url ?: "",
                navController = navController,
                name = name ?: "",
                origin = origin ?: "",
                adaptability = adaptability ?: " 0",
                affectionLevel = affectionLevel ?: " 0",
                intelligence = intelligence ?: "0",
                desc = desc ?: "",
                catFriendly = catFriendly ?: "0",
                dogFriendly = dogFriendly ?: "0",
                lifeSpan = lifeSpan ?: ""
            )
        }
    }
}