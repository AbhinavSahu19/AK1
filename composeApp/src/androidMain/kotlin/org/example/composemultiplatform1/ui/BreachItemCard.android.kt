package org.example.composemultiplatform1.ui

import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.text.HtmlCompat

@Composable
actual fun DescriptionDisplay(desc: String) {
    AndroidView(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, 0.dp, 10.dp, 5.dp)
            .background(color = Color.White),
        factory = { context -> TextView(context).apply {
            setTextColor(android.graphics.Color.BLACK)
            textSize = 18f
            setLinkTextColor(android.graphics.Color.BLUE)
            movementMethod = LinkMovementMethod.getInstance()
        } },
        update = { it.text = HtmlCompat.fromHtml(desc, HtmlCompat.FROM_HTML_MODE_COMPACT) }
    )
}