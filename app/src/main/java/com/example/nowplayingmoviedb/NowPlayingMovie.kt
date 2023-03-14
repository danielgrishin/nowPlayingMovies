package com.example.nowplayingmoviedb

import com.google.gson.annotations.SerializedName

class NowPlayingMovie {
    @SerializedName("title")
    var title: String? = null

    @SerializedName("overview")
    var description: String? = null

    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    @SerializedName("vote_average")
    var rating = 0.0
}