package models

import kotlinx.serialization.Serializable

@Serializable
data class SocketModel(val type: String, val value: String)