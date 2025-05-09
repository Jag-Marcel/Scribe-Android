// SPDX-License-Identifier: GPL-3.0-or-later

package be.scri.navigation

/**
 * Defines the navigation destinations (screens) used within the app.
 * Each screen has a unique [route] string used for navigation.
 */
sealed class Screen(
    val route: String,
) {
    /**
     * Screen for the initial installation or setup process.
     */
    data object Installation : Screen("installation_screen")

    /**
     * Screen where the user can configure general app settings.
     */
    data object Settings : Screen("settings_screen")

    /**
     * Screen for changing language specific keyboard settings.
     */
    data object LanguageSettings : Screen("language_settings_screen")

    /**
     * Screen displaying information about the app.
     */
    data object About : Screen("about_screen")

    /**
     * Screen showing the app's privacy policy.
     */
    data object PrivacyPolicy : Screen("privacy_policy_screen")

    /**
     * Screen showing the relationship between Wikimedia and Scribe
     */
    data object WikimediaScribe : Screen("wikimedia_scribe_screen")

    /**
     * Screen containing the third party codes used in the application.
     */
    data object ThirdParty : Screen("third_party_screen")
}
