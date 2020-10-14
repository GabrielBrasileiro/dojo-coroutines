package dojo.coroutines.io

import dojo.coroutines.BuildConfig
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json


object NorrisApi {

    var baseUrl = BuildConfig.API_BASE_URL

    private val httpClient by lazy {
        HttpClient() {
            install(JsonFeature) {
                serializer = createSerializer()
            }
        }
    }

    private fun createSerializer() =
        KotlinxSerializer(
            Json {
                isLenient = false
                ignoreUnknownKeys = true
                allowSpecialFloatingPointValues = true
                useArrayPolymorphism = false
            }
        )

    fun getRandomJoke(): Joke {
        TODO("GET: API/jokes/random")
    }
}