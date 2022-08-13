package dip

class BookRepository(val apiKey: String) {
    fun getBooks(): List<Book> {
        val books = ArrayList<Book>()
        books.add(Book("Lord of the Rings"))
        return books
    }
}