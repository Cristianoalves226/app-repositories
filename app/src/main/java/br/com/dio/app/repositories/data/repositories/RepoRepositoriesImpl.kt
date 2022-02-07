package br.com.dio.app.repositories.data.repositories

import br.com.dio.app.repositories.data.model.Repo
import br.com.dio.app.repositories.data.services.GitHubService
import kotlinx.coroutines.flow.flow

class RepoRepositoriesImpl(private val service: GitHubService) : RepoRepositories {
    override suspend fun listRepositories(user: String) = flow {
        val repoList = service.listResitories(user)
        emit(repoList)
    }

}