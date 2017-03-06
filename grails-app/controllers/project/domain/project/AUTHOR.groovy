package project

class AUTHOR {
    String id
    String authorName
    static hasMany=[book:BOOK]
    static constraints = {
        authorName blank:false,maxSize:100
    }
}
