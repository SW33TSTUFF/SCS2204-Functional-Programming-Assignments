object question2 extends App { 

    case class Book(title: String, author: String, isbn: String)

    var library: Set[Book] = Set(  
    Book("1984", "George Orwell", "1234567890"),  
    Book("To Kill a Mockingbird", "Harper Lee", "0987654321"),  
    Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455")  
    )

    def addBook(newBook: Book): Unit = {  
    library += newBook  
    println(s"Added: ${newBook.title} by ${newBook.author}")  
    }

    def removeBook(isbn: String): Unit = {  
    val bookToRemove = library.find(_.isbn == isbn)  
    bookToRemove match {  
        case Some(book) =>  
        library -= book 
        println(s"Removed: ${book.title} by ${book.author}")  
        case None =>  
        println(s"No book found with ISBN: $isbn")  
    }
    }

    def isBookInLibrary(isbn: String): Boolean = {  
    library.exists(_.isbn == isbn)  
    }


    println("Initial library collection:")  
    library.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))  


    val newBook = Book("Brave New World", "Aldous Huxley", "2233445566")  
    addBook(newBook)  


    println("\nUpdated library collection:") 
    library.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})")) 


    removeBook("0987654321") 

    println("\nUpdated library collection after removal:")  
    library.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))  

    val isbnToCheck = "1234567890" 
    if (isBookInLibrary(isbnToCheck)) {  
    println(s"\nThe book with ISBN $isbnToCheck is in the library.")  
    } else {  
    println(s"\nThe book with ISBN $isbnToCheck is not in the library.")  
    }
}