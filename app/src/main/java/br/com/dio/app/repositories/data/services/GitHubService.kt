package br.com.dio.app.repositories.data.services

import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET
   suspend fun listResitories(@Path("user") user: String): List<Repo>
}