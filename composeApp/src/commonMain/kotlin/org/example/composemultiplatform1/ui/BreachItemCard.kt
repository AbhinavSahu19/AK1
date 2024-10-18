package org.example.composemultiplatform1.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.composemultiplatform1.model.Breach
import org.example.composemultiplatform1.utils.formatDate
import org.example.composemultiplatform1.utils.formatDateTime
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun BreachItemCard(
    breach: Breach
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(7.dp, 2.dp),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Column {
            Text(text = breach.name,
                fontSize = 24.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(10.dp, 5.dp,10.dp,1.dp))
            Text(text  = breach.domain,
                fontSize = 21.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(10.dp, 0.dp,10.dp,1.dp)
            )
            DateDisplay(type = "Breach Date", date = formatDate(breach.breachDate))
            DateDisplay(type = "Added Date", date = formatDateTime(breach.addedDate))
            DateDisplay(type = "Modified Date", date = formatDateTime(breach.modifiedDate))
            PwnCountDisplay(breach.pwnCount)
            Text(text = "Description :-",
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(10.dp, 2.dp,10.dp,0.dp))
            DescriptionDisplay(desc = breach.description)
            BooleanDisplay("Verified", breach.isVerified)
            BooleanDisplay("Fabricated", breach.isFabricated)
            BooleanDisplay("Sensitive", breach.isSensitive)
            BooleanDisplay("Retired", breach.isRetired)
            BooleanDisplay("Spam List", breach.isSpamList)
            BooleanDisplay("Malware", breach.isMalware)
            BooleanDisplay("Subscription Free", breach.isSubscriptionFree)
        }
    }
}
@Composable
fun PwnCountDisplay(
    count: Int
){
    Row (
        modifier = Modifier.padding(10.dp, 1.dp)
    ){
        Text(text = "PWN Count: ",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black
        )
        Text(text = count.toString(),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )
    }
}
@Composable
expect fun DescriptionDisplay(desc: String)


@Composable
fun BooleanDisplay(
    type: String,
    status: Boolean
){
    Row (
        modifier = Modifier.padding(10.dp, 0.dp)
    ){
        Text(text = "$type: ",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black
        )
        Text(text = status.toString(),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )
    }

}
@Composable
fun DateDisplay(
    type: String,
    date: String
){
    Row (
        modifier = Modifier.padding(10.dp, 0.dp)
    ){
        Text(text = "$type: ",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black
        )
        Text(text = date,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )
    }
}
