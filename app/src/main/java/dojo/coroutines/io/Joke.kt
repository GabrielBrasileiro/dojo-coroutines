package dojo.coroutines.io

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Joke(
    @SerialName("icon_url")
    val iconUrl: String,
    @SerialName("value")
    val value: String
)