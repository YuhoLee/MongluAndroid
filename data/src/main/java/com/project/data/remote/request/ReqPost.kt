package com.project.data.remote.request

import com.google.gson.annotations.SerializedName

data class ReqPost(
    @SerializedName("title") val title: String,
    @SerializedName("content") val content: String,
    @SerializedName("imageUrl") val imageUrl: String,
    @SerializedName("isQuest") val isQuest: Boolean,
    @SerializedName("questId") val questId: Int,
    @SerializedName("hashtags") val hashtags: List<String>,
)