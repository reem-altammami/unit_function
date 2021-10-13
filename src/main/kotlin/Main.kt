fun main(args: Array<String>) {
   /* unit function use it when we don't expect any value from function to use it in code
    as modify value in database or use it to print */

 unitReturnType()//the function without parameters, so you do not pass in any arguments

}
fun unitReturnType():Unit { //Unit is return type. we could delete it,it is optional
    println("this function doesn't return any thing, just print")

}