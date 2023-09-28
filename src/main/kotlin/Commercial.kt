/*
Property name
A constant commercial rate at $5 per 1000 square feet (a 10,000 sqft property will be charged $50 dollars per week)
A multi-property field
A method that calculates weekly charges, if they have multiple properties provide a 10% discount. The method should
display all information about the customer, the property, and the weekly charge.
*/
class Commercial (var propertyName: String,
                  var multiProperty: Int,
                  customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double):
        Customer(customerName, customerPhone, customerAddress, squareFootage)
{
    var weeklyCost = calculate()

    fun displayInfo(){
        println("Customer Name: $customerName")
        println("Customer Phone: $customerPhone")
        println("Customer Address: $customerAddress")
        println("Total Square Footage: $squareFootage")
        println("Business Name: $propertyName")
        println("Number of Properties: $multiProperty")
        println("Total weekly costs: "+ dollarformat.format(weeklyCost))
    }
    fun calculate(): Double{
        var cost = 0.00
        if (multiProperty > 1){
            cost = squareFootage/1000 * 5 * .90
        }
        else{
            cost = squareFootage/1000 * 5
        }
        return cost
    }
}