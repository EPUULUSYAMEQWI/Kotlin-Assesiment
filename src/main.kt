fun main() {
    name()
    var x=parameter("Amekwi", 21)
    println(x)
    var name1=country("Tanzania")
    println(name1.count())
    var result=getRemainder(5,2)
    println(result)


}

fun name() {
  var name="CodeHive"
    var y=name[4].toString()+name[5]+name[6]+name[7]
    println (y)

}
fun parameter (name:String, age:Int){
        println("Hi, my name is $name and i am $age years old")
}
fun country(name1:String):String{
    return name1
}
fun getRemainder(num1:Int,num2:Int):Int{
    var modulus= num1 % num2
    return modulus

}
