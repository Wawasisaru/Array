fun main(){
name("Saru","Serah","Sara","Seraa")
    capital()
    loops()
    println(content("leyla","Lehla","Lehqa"))

}
fun name(name1: String,name2: String,name3: String,name4: String){
    var add = arrayOf(name1,name2,name3,name4)
    println(add.contentToString())
}
fun capital(){
    var capital = arrayOf("harare","dodoma","mumbai","jakrta")
    for (city in capital){
        println(city.capitalize())}
}
fun loops(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    val value = println(numbers.indexOf(158))
        var sorted = numbers.sortedArray()
    println(sorted.contentToString())
}
fun content(name1: String,name2: String,name3: String): String {
    var naming = arrayOf(name1, name2, name3)
    return naming.contentToString()
}