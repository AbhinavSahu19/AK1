package org.example.composemultiplatform1.utils

import kotlinx.datetime.*
import kotlinx.datetime.TimeZone

fun formatDateTime(dateTimeString: String): String {
    val instant = Instant.parse(dateTimeString)
    val dateTime = instant.toLocalDateTime(TimeZone.currentSystemDefault())

    val month = dateTime.month.name.lowercase().replaceFirstChar { it.uppercase() }.substring(0, 3)
    return "${month} ${dateTime.dayOfMonth}, ${dateTime.year} - ${dateTime.hour}:${dateTime.minute}:${dateTime.second} ${TimeZone.currentSystemDefault().id}"
}

fun formatDate(inputDate: String): String {
    val date: LocalDate = inputDate.toLocalDate()
    return "${date.month.name.lowercase().replaceFirstChar { it.uppercase() }} ${date.dayOfMonth}, ${date.year}"
}
