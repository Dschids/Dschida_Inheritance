/*
The Main class that presents a menu to the user with the following options:
Residential Customer
Commercial Customer
Done
The Main class should have methods that get data entry from the user about the Residential or Commercial customer
and should display all the information in the form of a quote.
*/
fun main(args: Array<String>) {
    var test1 = Commercial("ACME HQ", 3, "Joe Shmo", "555-555", "1234 Overthere Rd.", 50000.00)
    test1.displayInfo()
    var test2 = Residential(true, "Johny Box O Donuts", "555-5309", "987 Lolley Pop Ln", 5000.00)
    test2.displayInfo()
}

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