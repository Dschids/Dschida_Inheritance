/*
A constant rate at $6 per 1000 square feet
A senior field
A method that calculates weekly charges, if the senior field is set to true then provide a 15% discount.
The method should display all information about the customer, the property, and the weekly charge.
Residential class is subclass of customer with additional senior variable
*/
class Residential (var senior: Boolean,
                   customerName: String,
                   customerPhone: String,
                   customerAddress: String,
                   squareFootage: Double):
        Customer(customerName, customerPhone, customerAddress, squareFootage)
{
    var weeklyCost = calculate()

    fun displayInfo(){
        var seniorDiscount = ""
        // checks if senior is true and sets variable to "Yes" if true and "No" if not
        if (senior)
            seniorDiscount = "Yes"
        else
            seniorDiscount = "No"
        // display all the infor
        println("\nCustomer Name: $customerName")
        println("Customer Phone: $customerPhone")
        println("Customer Address: $customerAddress")
        println("Total Square Footage: $squareFootage")
        println("Senior Discount: $seniorDiscount")
        println("Total weekly costs: "+ dollarformat.format(weeklyCost) + "\n")
    }
    // calculates total weekly cost
    fun calculate(): Double{
        var cost = 0.00
        // if customer is a senior apply 15% discount
        if (senior){
            cost = squareFootage/1000 * 6 * .85
        }
        // if customer is not a senior no discount
        else{
            cost = squareFootage/1000 * 6
        }
        return cost
    }
}