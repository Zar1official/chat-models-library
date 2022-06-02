import kotlinx.serialization.Serializable

@Serializable
data class UserEntity(val userId: Int = 0, val username: String, val password: String)