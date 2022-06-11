package constants

sealed class Routes(val path: String) {
    object GeneralChat : Routes(buildRoute("chat-socket"))
    object DialogMessages : Routes(buildRoute("dialog-messages"))
    object GeneralChatMessages : Routes(buildRoute("messages"))
    object Register : Routes(buildRoute("register"))
    object Login : Routes(buildRoute("login"))
    object Users : Routes(buildRoute("users"))
    object GetDialog : Routes(buildRoute("g-dialog"))
    object DialogList : Routes(buildRoute("dialog-list"))
}

private fun buildRoute(path: String) = "/$path"

