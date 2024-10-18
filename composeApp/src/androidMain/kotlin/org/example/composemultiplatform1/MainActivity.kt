package org.example.composemultiplatform1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.example.composemultiplatform1.model.Breach
import org.example.composemultiplatform1.ui.BreachItemCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Composable
@Preview
fun BreachItemCardPreview(){
    BreachItemCard(
        breach = Breach(
            name = "000webhost",
            title = "000webhost",
            domain = "000webhost.com",
            breachDate = "2015-03-01",
            addedDate = "2015-10-26T23:35:45Z",
            modifiedDate = "2017-12-10T21:44:27Z",
            pwnCount = 14936670,
            description = "In approximately March 2015, the free web hosting provider \u003Ca href=\"http://www.troyhunt.com/2015/10/breaches-traders-plain-text-passwords.html\" target=\"_blank\" rel=\"noopener\"\u003E000webhost suffered a major data breach\u003C/a\u003E that exposed almost 15 million customer records. The data was sold and traded before 000webhost was alerted in October. The breach included names, email addresses and plain text passwords.",
            logoPath = "https://haveibeenpwned.com/Content/Images/PwnedLogos/000webhost.png",
            dataClasses = listOf(
                "Email addresses",
                "IP addresses",
                "Names",
                "Passwords"
            ),
            isVerified = true,
            isFabricated = false,
            isSensitive = false,
            isRetired = false,
            isSpamList = false,
            isMalware = false,
            isSubscriptionFree = false
        )
    )
}