package br.com.dio.app.repositories.data.repositories

import br.com.dio.app.repositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepositories {
    suspend fun listRepositories(use: String): Flow<List<Repo>>
}