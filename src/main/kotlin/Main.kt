//-----------------------------------------List, Set, Map-----------------------------------------
/*fun main(){
    val numbers = listOf("one", "two", "three", "four")

    println(numbers)
}*/
//--------------------------------------------------
/*
fun main() {
    val numbers = mutableListOf("one", "two", "three", "four")

    numbers.add("five")

    println(numbers)
}*/
//----------------------------
/*fun main(){
    val numbers = mapOf("name" to "John", "age" to 30)

    println(numbers)
}*/
//--------------------------------LIST ---------------------------------------
/*fun main() {
    val theList = listOf("one", "two", "three", "four")
    println(theList)

    val theMutableList = mutableListOf("one", "two", "three", "four")
    println(theMutableList)
}*/
//------------------------------------------------------------------------------------
/*fun main() {
    val theList = listOf("one", "two", "three", "four")
    println(theList)
}*/
//---------------------------------------------------------------------------------
/*fun main() {
    val theList = listOf("one", "two", null, "four", "five")

    println("Size of the list " + theList.size)
}*/
//---------------------------------------------------------------------------------
/*fun main() {
    val theList = listOf("one", "two", "three", "four")

    if("two" in theList){
        println(true)
    }else{
        println(false)
    }
}*/
//--------------------------------------------------------------------------
/*fun main() {
    val theList = listOf("one", "two", "three", "four")

    println("Element at 3rd position " + theList.get(2))
}*/
//----------------------------------------------------------------------
/*fun main() {
    val firstList = listOf("one", "two", "three")
    val secondList = listOf("four", "five", "six")
    val resultList = firstList + secondList

    println(resultList)
}*/
//-------------------------------------------------------------------------------
/*fun main() {
    val firstList = listOf("one", "two", "three")
    val secondList = listOf("one", "five", "six")
    val resultList = firstList - secondList

    println(resultList)
}*/
//-----------------------------------------------------------------------------
/*fun main() {
    val theList = listOf("one", "two", "three", "four", "five")
    val resultList = theList.slice( 2..4)

    println(resultList)
}*/
//------------------------------------------------------------------
/*fun main() {
    val theList = listOf("one", "two", null, "four", "five")
    val resultList = theList.filterNotNull()

    println(resultList)
}*/
//---------------------------------------------------------------------
/*fun main() {
    val theList = listOf(10, 20, 30, 31, 40, 50, -1, 0)
    val resultList = theList.filter{ it > 30}

    println(resultList)
}*/
//---------------------------------------------------------------
/*fun main() {
    val theList = listOf(10, 20, 30, 31, 40, 50, -1, 0)
    val resultList = theList.drop(3)


    println(resultList)
}*/
//--------------------------------------------------------------------\
/*fun main() {
    val theList = listOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultList = theList.groupBy{ it % 3}

    println(resultList)
}*/
//----------------------------------------------------------------------------
/*fun main() {
    val theList = listOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultList = theList.map{ it / 3 }

    println(resultList)
}
//----------------------------------------------------------------------
fun main() {
    val theList = listOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultList = theList.chunked(3)

    println(resultList)
}*/
//---------------------------------------------------------------
/*fun main() {
    val theList = listOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultList = theList.windowed(3)

    println(resultList)
}*/
//----------------------------------------------------------------------
/*fun main() {
    val theList = listOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultList = theList.windowed(3, 3)

    println(resultList)
}*/
//--------------------------------------------------------------
/*fun main() {
    val theList = mutableSetOf(10, 20, 30)

    theList.add(40)
    theList.add(50)
    println(theList)

    theList.remove(10)
    theList.remove(30)
    println(theList)
}*/
//------------------------------------------------------------------------
/*fun main() {
    val theList = listOf("one", "two", "three", "four")

    if(theList.contains("two")){
        println(true)
    }else{
        println(false)
    }

}*/
//--------------------------------------------------------------------------------------
/*fun main() {
    val theList = listOf("one", "two", "three", "four")

    if(theList.isEmpty()){
        println(true)
    }else{
        println(false)
    }
}*/
//----------------------------------------------------------------------------------------
/*fun main() {
    val theList = listOf("one", "two", "three", "four")

    println("Index of 'two' :  " + theList.indexOf("two"))
}*/

//----------------------------------------------------------------------------------------
//Create a list of integers and print all the elements.
/*fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers){
        println(number)
    }
}*/
//---------------------------------------------------------------------
//Find the sum of all the elements in a list of numbers.
/*fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    println("Sum: $sum")
}*/
//--------------------------------------------------------------
//Find the maximum element in a list of numbers.
/*fun main() {
    val numbers = listOf(5, 2, 9, 1, 7)
    var max = Int.MIN_VALUE
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    println("Max: $max")
}*/
//-----------------------------------------------------
//Check if a specific element exists in a list.
/*fun main() {
    val fruits = listOf("apple", "banana", "orange")
    val searchElement = "banana"
    val found = searchElement in fruits
    if (found) {
        println("Element found")
    } else {
        println("Element not found")
    }
}*/
///--------------------------------Map------------------------------
/*fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMap)

    val theMutableMap = mutableSetOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMutableMap)
}*/
//---------------------------------------------------------------'
/*fun main() {
    val theMap = HashMap<String, Int>()

    theMap["one"] = 1
    theMap["two"] = 2
    theMap["three"] = 3
    theMap["four"] = 4

    println(theMap)
}*/
//---------------------------------------------------------------------------
/*fun main() {
    val theMap = mapOf(Pair("one", 1), Pair("two", 2), Pair("three", 3))
    println(theMap)
}*/
//---------------------------------------------------------------------------
/*fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    println("Entries: " + theMap.entries)
    println("Keys:" + theMap.keys)
    println("Values:" + theMap.values)
}
//---------------------------------------------------------------------------
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMap.toString())
}
//---------------------------------------------------------------------------
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    for ((k, v) in theMap) {
        println("$k = $v")
    }

}
//---------------------------------------------------------------------------
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    theMap.forEach {
            k, v -> println("Key = $k, Value = $v")
    }
}
//---------------------------------------------------------------------------'
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    println("Size of the Map " + theMap.size)
    println("Size of the Map " + theMap.count())
}
//---------------------------------------------------------------------------
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    if(theMap.containsKey("two")){
        println(true)
    }else{
        println(false)
    }

    if(theMap.containsValue("two")){
        println(true)
    }else{
        println(false)
    }
}
//---------------------------------------------------------------------------
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    if(theMap.isEmpty()){
        println(true)
    }else{
        println(false)
    }
}
//---------------------------------------------------------------------------
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    println("The value for key two " + theMap.get("two"))
    println("The value for key two " + theMap["two"])
}
//---------------------------------------------------------------------------
fun main() {
    val firstMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    val secondMap = mapOf("one" to 10, "four" to 4)
    val resultMap = firstMap + secondMap

    println(resultMap)
}//---------------------------------------------------------------------------
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    var resultMap = theMap.toSortedMap()
    println(resultMap)
}
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    val theKeyList = listOf("one", "four")
    val resultMap = theMap - theKeyList

    println(resultMap)
}
//---------------------------------------------------------------------------
fun main() {
    val theMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    theMap.remove( "two")
    println(theMap)

    theMap -= listOf("three")
    println(theMap)
}

//----------------------------------------------------------------
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    var resultMap = theMap.filterValues{ it > 2}
    println(resultMap)

    resultMap = theMap.filterKeys{ it == "two"}
    println(resultMap)

    resultMap = theMap.filter{ it.key == "two" || it.value == 4}
    println(resultMap)

}
//---------------------------------------------------------------
fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    val resultMap = theMap.map{ (k, v) -> "Key is $k, Value is $v" }

    println(resultMap)
}
//---------------------------------------------------------------
fun main() {
    val theMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    theMap.put("four", 4)
    println(theMap)

    theMap["five"] = 5
    println(theMap)

    theMap.remove("two")
    println(theMap)

}*/
//---------------------------------------------------------------
//---------------------------------------------------------------
//---------------------------------------------------------------
//---------------------------------------------------------------
//Iterate over the key-value pairs in a map and print them.
/*fun main() {
    val studentGrades = mapOf("John" to 85, "Alice" to 92, "Bob" to 78)
    for ((name, grade) in studentGrades) {
        println("$name: $grade")
    }
}*/
//-------------------------------------------------------------
// -------------------Samgh nhi aya yeh---------------------------------
//Calculate the average grade from a map of student grades.
/*fun main() {
    val studentGrades = mapOf("John" to 85, "Alice" to 92, "Bob" to 78)
    var sum = 0
    for (grade in studentGrades.values) {
        sum += grade
    }
    val average = sum / studentGrades.size.toDouble()
    println("Average Grade: $average")
}*/
//----------------------------------------------------------------------------
//Find the student with the highest grade in a map of student grades.
/*fun main() {
    val studentGrades = mapOf("John" to 85, "Alice" to 92, "Bob" to 78)
    var maxGrade = Int.MIN_VALUE
    var topStudent = ""
    for ((name, grade) in studentGrades) {
        if (grade > maxGrade) {
            maxGrade = grade
            topStudent = name
        }
    }
    println("Top Student: $topStudent")
}*/
//-----------------------------------------------------------------------------
//Check if a specific student exists in a map.
/*fun main() {
    val studentGrades = mapOf("John" to 85, "Alice" to 92, "Bob" to 78)
    val searchStudent = "Alice"
    val found = searchStudent in studentGrades.keys
    if (found) {
        println("$searchStudent is in the map")
    } else {
        println("$searchStudent is not in the map")
    }
}*/
//--------------------------------------Sets-------------------------------------
/*fun main() {
    val theSet = setOf("one", "two", "three", "four")
    println(theSet)

    val theMutableSet = mutableSetOf("one", "two", "three", "four")
    println(theMutableSet)
}*/
//---------------------------------------------------------------------------------
/*fun main() {
    val theSet = setOf("one", "two", null, "four", "five")

    println("Size of the Set " + theSet.size)
}*/
//---------------------------------------------------------------------------------
/*fun main() {
    val theSet = setOf("one", "two", "three", "four")

    if("two" in theSet){
        println(true)
    }else{
        println(false)
    }
}*/
//---------------------------------------------------------------------------------
/*fun main() {
    val theSet = setOf("one", "two", "three", "four")

    if(theSet.contains("two")){
        println(true)
    }else{
        println(false)
    }

}*/
//---------------------------------------------------------------------------------
/*fun main() {
    val theSet = setOf("one", "two", "three", "four")

    if(theSet.isEmpty()){
        println(true)
    }else{
        println(false)
    }
}*/
//---------------------------------------------------------------------------------
/*fun main() {
    val theSet = setOf("one", "two", "three", "four")

    println("Index of 'two' -  " + theSet.indexOf("two"))
}*/
//---------------------------------------------------------------------------------
/*fun main() {
    val theSet = setOf("one", "two", "three", "four")

    println("Element at 3rd position " + theSet.elementAt(2))
}
//---------------------------------------------------------------------------------
fun main() {
    val firstSet = setOf("one", "two", "three")
    val secondSet = setOf("one", "four", "five", "six")
    val resultSet = firstSet + secondSet

    println(resultSet)
}
//---------------------------------------------------------------------------------
fun main() {
    val firstSet = setOf("one", "two", "three")
    val secondSet = setOf("one", "five", "six")
    val resultSet = firstSet - secondSet

    println(resultSet)
}
//---------------------------------------------------------------------------------
fun main() {
    val theSet = setOf("one", "two", null, "four", "five")
    val resultSet = theSet.filterNotNull()

    println(resultSet)
}
//---------------------------------------------------------------------------------
fun main() {
    val theSet = setOf(10, 20, 30, 31, 40, 50, -1, 0)
    var resultSet = theSet.sorted()
    println(resultSet)

    resultSet = theSet.sortedDescending()
    println(resultSet)
}
//---------------------------------------------------------------------------------
fun main() {
    val theSet = setOf(10, 20, 30, 31, 40, 50, -1, 0)
    val resultSet = theSet.filter{ it > 30}

    println(resultSet)
}
//---------------------------------------------------------------------------------
fun main() {
    val theSet = setOf(10, 20, 30, 31, 40, 50, -1, 0)
    val resultSet = theSet.drop(3)

    println(resultSet)
}
//---------------------------------------------------------------------------------
fun main() {
    val theSet = setOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultSet = theSet.groupBy{ it % 3}

    println(resultSet)
}
//---------------------------------------------------------------------------------
fun main() {
    val theSet = setOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultSet = theSet.map{ it / 3 }

    println(resultSet)
}
//---------------------------------------------------------------------------------
fun main() {
    val theSet = setOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultSet = theSet.chunked(3)

    println(resultSet)
}
//---------------------------------------------------------------------------------
fun main() {
    val theSet = setOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultSet = theSet.windowed(3)

    println(resultSet)
}
//---------------------------------------------------------------------------------
fun main() {
    val theSet = setOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultSet = theSet.windowed(3, 3)

    println(resultSet)

//---------------------------------------------------------------------------------
fun main() {
    val theSet = mutableSetOf(10, 20, 30)

    theSet.add(40)
    theSet.add(50)
    println(theSet)

    theSet.remove(10)
    theSet.remove(30)
    println(theSet)

}*/
//---------------------------------------------------------------------------
//Create a set of unique numbers and print its elements.
/*fun main() {
    val numbers = setOf(5, 2, 9, 1, 7)
    for (number in numbers) {
        println(number)
    }
}*/
//---------------------------------------------------------------------------
// Check if a specific element exists in a set.
/*fun main() {
    val fruits = setOf("Apple", "Banana", "Orange", "Mango")
    val searchFruit = "Banana"
    val found = searchFruit in fruits
    if (found) {
        println("$searchFruit is in the set")
    } else {
        println("$searchFruit is not in the set")
    }
}*/
//---------------------------------------------------------------------------
//Find the intersection of two sets.
/*fun main() {
    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(4, 5, 6, 7, 8)
    val intersection = set1.intersect(set2)
    println("Intersection: $intersection")
}*/
//---------------------------------------------------------------------------
// Calculate the union of two sets.
/*fun main() {
    val set1 = setOf(1, 2, 3)
    val set2 = setOf(3, 4, 5)
    val union = set1.union(set2)
    println("Union: $union")
}*/



