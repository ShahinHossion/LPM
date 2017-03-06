package project

class Book {
    long id
    String bookTitle
    static belongTo =[author:AUTHOR]
    static hasmany=[borrow:BORROW]
    static constraints = {
        bookTitle blank:false,unique:true
    }
}
