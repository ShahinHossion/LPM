package project

class AUTHOR {
    String id
    String authorName
    static hasMany=[book:Book]
    static constraints = {
        authorName blank:false,maxSize:100
    }
}
