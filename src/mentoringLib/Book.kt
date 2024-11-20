package mentoringLib

class Book(
    val title: String = "gfajkdf",
    val pages: MutableList<String>
) {
    private val pricePerPage: Double = 0.02


    fun openPage(pageNumber: Int): String {
        return pages[pageNumber - 1]
    }

    fun addPages(pagesCount: Int) {
        var counter = pagesCount

        while (counter != 0) {
            addPage()
            counter--
        }
    }

    fun calculatePrice(): Double {
        return pages.size * pricePerPage
    }


    private fun addPage() {
        val lastPage = pages.last()
        val pageData = lastPage.split(" ")
        val newPageNumber = pageData[1].toInt() + 1

        pages.add("${pageData[0]} $newPageNumber")
    }
}



