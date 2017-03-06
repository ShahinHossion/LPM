package project

class MEMBER {
    String id
    String memberName;
    
    static hasmany=[borrow:BORROW]
    static constraints = {
        memberName blank:false,maxSize:100
    }
}
