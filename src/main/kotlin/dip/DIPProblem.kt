package dip

class DIPProblem {
    fun list() = BookRepository(BOOK_API_KEY).getBooks()

    companion object {
        const val BOOK_API_KEY = "abc123"
    }
}