package srp

interface AuthTokenStorage {
    fun store(token: String)
    fun clear()
}

class SRPSolution (private val authTokenStorage: AuthTokenStorage) {
    fun login() {}
    fun storeAuthToken(token: String) {
        authTokenStorage.store(token)
    }
    fun clearAuthToken() {
        authTokenStorage.clear()
    }
}