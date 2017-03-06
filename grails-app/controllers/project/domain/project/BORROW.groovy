package project
import java.util.Date;

class BORROW {
    Date issueDate
    Date dueDate
    Date receiveDate
    
    static belongTo=[book:BOOK]
    static hasOne=[member:MEMBER]
    static constraints = {
        issueDate nullable:false
        dueDate nullable:false
        receiveDate nullable:false
    }
}
