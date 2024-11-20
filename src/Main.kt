import mentoringLib.Book

fun main() {

    val book = Book(
        title = "Zbrodnia i kara",
        pages = mutableListOf(
            "strona 1",
            "strona 2",
            "strona 3",
//            "strona 4",
//            "strona 5",
//            "strona 6",
        )
    )

    book.addPages(1)


    println(book.calculatePrice())

}
