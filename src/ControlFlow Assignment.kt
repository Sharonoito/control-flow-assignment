fun main() {
    oddNumbers()
    println(people("Sharon","Peninnah","Wamboi","Jane","Cate"))
    robots(3)
    robots(15)
    robots(22)
    numbers()

}
fun oddNumbers(){
    for (oddnum in 1..100){
        if(oddnum%2!=0){
        println(oddnum)
        }
    }
}
fun people(name1:String,name2:String,name3:String,name4:String,name5:String):Int {
    var names = arrayOf(name1, name2, name3, name4, name5)
    var sum=0;
    for (name in names) {
        if (name.length >= 5) {
            sum++
        }
    }
    return sum
}
fun robots(age:Int){
    if(age<=6){
        println("Serve a glass of milk")
    }
    else if(age>15){
      println ("Serve a bottle of fanta orange")
    }
    else{
      println("Serve a bottle of cocacola")
    }
}
fun numbers() {
    for (multiple in 1..100) {
        if (multiple % 3 == 0) {
            println("Fizz")
        }else if (multiple % 5 == 0) {
            println("Buzz")
        };if(multiple % 3 == 0 && multiple % 5 == 0) {
            println("FizzBuzz")

        }
    }
}


