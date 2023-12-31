package com.androiddevs.mvvmnewsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val source: Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
)

{
    override fun toString(): String {
        return "SOURCE::: ${source.name} \n" +
               "TITLE::: $title \n" +
               "DESCRIPTION::: $description \n" +
               "PUBLISHED_AT::: $publishedAt \n" +
               "======================================"
    }
}