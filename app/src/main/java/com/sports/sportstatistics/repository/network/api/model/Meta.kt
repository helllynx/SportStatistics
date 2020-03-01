package com.sports.sportstatistics.repository.network.api.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Meta(

    @SerialName("total_pages")
    val totalPages: Int,

    @SerialName("current_page")
    val currentPage: Int,

    @SerialName("next_page")
    val nextPage: Int?,

    @SerialName("per_page")
    val perPage: Int,

    @SerialName("total_count")
    val totalCount: Int
)
