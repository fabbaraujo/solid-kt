package dip

class DIPSolution(private val repository: BookRepository) {
    fun list() = repository.getBooks()
}