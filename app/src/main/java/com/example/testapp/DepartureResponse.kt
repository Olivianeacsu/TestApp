package com.example.testapp

data class DepartureResponse(
    val Departure: List<Departure>?,
    val TechnicalMessages: TechnicalMessages? = null,
    val serverVersion: String? = null,
    val dialectVersion: String? = null,
    val planRtTs: String? = null,
    val requestId: String? = null
)

data class Departure(
    val JourneyDetailRef: JourneyDetailRef? = null,
    val JourneyStatus: String? = null,
    val ProductAtStop: ProductAtStop? = null,
    val Product: List<Product>? = null,
    val Notes: Notes? = null,

    val name: String? = null,
    val type: String? = null,
    val stop: String? = null,
    val stopid: String? = null,
    val stopExtId: String? = null,
    val lon: Double? = null,
    val lat: Double? = null,
    val time: String? = null,
    val date: String? = null,
    val reachable: Boolean? = null,
    val direction: String? = null,
    val directionFlag: String? = null
)

data class JourneyDetailRef(
    val ref: String?
)

data class ProductAtStop(
    val name: String? = null,
    val internalName: String? = null,
    val displayNumber: String? = null,
    val num: String? = null,
    val line: String? = null,
    val lineId: String? = null,
    val operator: String? = null,
    val operatorCode: String? = null
    // add more if you need
)

data class Product(
    val name: String? = null,
    val internalName: String? = null,
    val displayNumber: String? = null,
    val num: String? = null,
    val line: String? = null,
    val lineId: String? = null,
    val operator: String? = null,
    val operatorCode: String? = null
)

data class Notes(
    val Note: List<Note>?
)

data class Note(
    val value: String? = null,
    val key: String? = null,
    val type: String? = null
)

data class TechnicalMessages(
    val TechnicalMessage: List<TechnicalMessage>?
)

data class TechnicalMessage(
    val value: String?,
    val key: String?
)