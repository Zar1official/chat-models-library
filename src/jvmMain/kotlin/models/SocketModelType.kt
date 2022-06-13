package models

sealed class SocketModelType(val type: String) {
    object GeneralChatMessage : SocketModelType("message")
    object DialogMessage: SocketModelType("dialog-message")
}