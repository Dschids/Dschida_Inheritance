import java.text.DecimalFormat

/*
String customerName
String customerPhone
String customerAddress
double squareFootage
not actually doing much with this class
initialize the dollarfomat var here so it can be used in the subclasses
*/
open class Customer (var customerName: String,
                var customerPhone: String,
                var customerAddress: String,
                var squareFootage: Double){
    // set the formatting to display $ sign with 2 decimals
    var dollarformat = DecimalFormat("$#,###.00")
}