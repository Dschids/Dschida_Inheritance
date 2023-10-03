/*
The Main class that presents a menu to the user with the following options:
Residential Customer
Commercial Customer
Done
The Main class should have methods that get data entry from the user about the Residential or Commercial customer
and should display all the information in the form of a quote.
*/
fun main(args: Array<String>) {
    var selection = 0
    do {
        selection = menu()
        if (selection == 1){
            residential()
        }
        else if (selection == 2){
            business()
        }
        else {
            println("Have a nice day!")
        }
    } while (selection != 3)

}
// menu presents a menu and asks user to choose an option, checks that selection is acceptable then returns the selection
fun menu(): Int{
    println("Select Customer Type: ")
    println("1) Residential Customer")
    println("2) Business Customer")
    println("3) Done")
    var selection = readln()!!.toInt()
    while (selection !in 1..3){
        println("That is not a valid selection!")
        println("Please enter a number between 1 and 3!")
        println("Select Customer Type: ")
        println("1) Residential Customer")
        println("2) Business Customer")
        println("3) Done")
        selection = readln()!!.toInt()
    }
    return selection
}
/* residential gets info from user about a residential customer, creates a variable of class Residential with inputted
info then uses Residential's displayIt function to output the data
*/
fun residential() {
    // getting customer info
    println("Enter customer name:")
    var name = readln()!!.toString()
    println("Enter customer phone number:")
    var phone = readln()!!.toString()
    println("Enter customer address:")
    var address = readln()!!.toString()
    println("What is the total square footage of the property?")
    var sqf = readln()!!.toDouble()
    println("Is the customer a Senior? y/n")
    var senior = readln()!!.toString().toLowerCase()
    // make sure user enters 'y' or 'n'
    while (senior != "y" && senior != "n") {
        println("Please enter 'y' for yes or 'n' for no.")
        println("Is the customer a Senior? y/n")
        senior = readln()!!.toString().toLowerCase()
    }
    // setting is senior Boolean based on inputted response
    var isSenior = false
    if (senior == "y"){
        isSenior = true
    }
    // create class instance using inputted info
    var residentialCustomer = Residential(isSenior, name, phone, address, sqf)
    // uses Residential's function displayInfo() to show all information and calculated weekly cost
    residentialCustomer.displayInfo()
}
/* business gets info from user about a commercial customer, creates a variable of class Commercial with inputted
info then uses Commercial's displayIt function to output the data
*/
fun business() {
    var totalSqFt = 0.00
    // getting customer info
    println("Enter business name:")
    var businessName = readln()!!.toString()
    println("Enter business address:")
    var businessAddress = readln()!!.toString()
    println("Enter contact name:")
    var contactName = readln()!!.toString()
    println("Enter contact phone number:")
    var contactNumber = readln()!!.toString()
    println("How many properties?")
    var numProperties = readln()!!.toInt()
    // if there is more than 1 property total up the square footage
    if (numProperties > 1){
        for (item in 1..numProperties) {
            println("Enter square footage of property $item")
            totalSqFt += readln()!!.toDouble()
        }
    }
    // only 1 property just get the square footage from user
    else{
        println("Enter square footage of property:")
        totalSqFt = readln()!!.toDouble()
    }
    var businessCustomer = Commercial(businessName, numProperties , contactName, contactNumber, businessAddress, totalSqFt)
    businessCustomer.displayInfo()
}