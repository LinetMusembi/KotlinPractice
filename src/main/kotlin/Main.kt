
//    Kotlin Arrays
//    Arrays are used to store multiple values in a single variable.
//    To create an array we use the arrayOf() function.
fun main() {
    val fruits = arrayOf("mangoes", "pineapples", "oranges", "kiwi")
//    println(fruits.get(0))
    println(fruits[0])



//    Change an array element.
//    To change the element of an array element,we have to refer to the index number.
    val subjects = arrayOf("science","maths","English","Biology")
    subjects[1] = "Chemistry"
    println(subjects[1])

//    Array Length/Size
//    To find how many elements are in ana array we use the size property.
    val multiply = arrayOf(2,3,4,5,5)
    println(multiply.size)

//    Checking if an element exists in an array.
//    We use the "in" operator to check whether an element exists in an array.

    val property = arrayOf("house","cars","apartments","land")
    if ("house" in property){
        println("it exists")
    }
    else{
        println("it does not exist")
    }
//Looping through an array
//    We use the for loop to loop through arrays in an element.
    val addition = arrayOf(3,4,5,5,6)
    for (x in addition){
        println(x)
    }

//    Kotlin Ranges

//    Using (..)operator
    val myName = Human("Lynet", 19, 50)
    myName.eat(2)
    myName.speak("I enjoy learning kotlin")
    myName.birthday()


    val myPhone = Phone("Lynet", "Musembi", "musembilinet@gmail.com", "0712763498                         ", "melody")
    println(myPhone.firstName)
    println(myPhone.email)
}
//1. Create a class called Human with these attributes: name, age, weight. It has the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food” and increments the human’s weight by
//the weight of the food eaten(3 points)
//- speak(speech: String) :Prints the string passed to it (2points)
//- birthday( ) :Increments the human’s age by 1 (2
//points)
//Create an instance of this human class and invoke all its functions



class Human(var name: String,var age: Int,var weight: Int) {


    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
        println(weight)
    }


    fun speak(speak: String) {
        println(speak)
    }
    fun birthday() {
        age +=1
        println(age)

    }
}
data class Phone(var firstName: String,var lastName: String,var email: String,var phoneNumber: String,var password: String)


