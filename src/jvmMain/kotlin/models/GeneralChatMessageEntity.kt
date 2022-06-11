package models

import kotlinx.serialization.Serializable

@Serializable
data class GeneralChatMessageEntity(val messageId: Int = 0, val senderUserName: String, val text: String, val timestamp: Long)