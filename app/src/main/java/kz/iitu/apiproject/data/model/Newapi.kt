package kz.iitu.apiproject.data.model


import com.google.gson.annotations.SerializedName

data class Newapi(
    @SerializedName("entries")
    val entries: List<Entry>,
    @SerializedName("links")
    val links: Links,
    @SerializedName("size")
    val size: Int
) {
    data class Entry(
        @SerializedName("full_url")
        val fullUrl: String,
        @SerializedName("last_update")
        val lastUpdate: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("seed_count")
        val seedCount: Int,
        @SerializedName("url")
        val url: String
    )

    data class Links(
        @SerializedName("self")
        val self: String
    )
}