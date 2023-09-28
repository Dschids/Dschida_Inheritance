import java.text.DecimalFormat

/*
String customerName
String customerPhone
String customerAddress
double squareFootage
*/
open class Customer (var customerName: String,
                var customerPhone: String,
                var customerAddress: String,
                var squareFootage: Double){
    var dollarformat = DecimalFormat("$#,###.00")
}