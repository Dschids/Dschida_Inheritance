/*
Property name - Changing this to Business Name because it makes more sense to me.
A constant commercial rate at $5 per 1000 square feet (a 10,000 sqft property will be charged $50 dollars per week)
A multi-property field
A method that calculates weekly charges, if they have multiple properties provide a 10% discount. The method should
display all information about the customer, the property, and the weekly charge.
Commercial class is subclass of customer with additional businessName, and multipropery variables
*/
class Commercial (var businessName: String,
                  var multiProperty: Int,
                  customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double):
        Customer(customerName, customerPhone, customerAddress, squareFootage)
{
    var weeklyCost = calculate()

    // displaying all the info
    fun displayInfo(){
        println("\nBusiness Name: $businessName")
        println("Business Address: $customerAddress")
        println("Contact Name: $customerName")
        println("Contact Phone: $customerPhone")
        println("Number of Properties: $multiProperty")
        println("Total Square Footage: $squareFootage")
        println("Total weekly costs: "+ dollarformat.format(weeklyCost) + "\n")
    }
    // calculates total weekly cost
    fun calculate(): Double{
        var cost = 0.00
        // if there's more than one property apply 10% discount
        if (multiProperty > 1){
            cost = squareFootage/1000 * 5 * .90
        }
        // if only 1 property, no discount
        else{
            cost = squareFootage/1000 * 5
        }
        return cost
    }
}