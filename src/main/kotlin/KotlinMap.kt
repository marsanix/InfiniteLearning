fun main() {

    val groupMap = mapOf(
        "one" to "Group 1",
        2 to "Group 2",
        3 to "Group 3",
        4 to "Group 4",
        5 to "Group 5",
        6 to "Group 6",
        7 to "Group 7",
    )

    println(groupMap)

   // println(groupMap[6].up)
//    println(groupMap.getValue(7))
//
//    println(groupMap.values)
//    println(groupMap.keys)

     val mutableGroupMap = groupMap.toMutableMap()

     println(mutableGroupMap)

     mutableGroupMap["one"] = "Group Satu"
     mutableGroupMap.put(8, "Group 8")

     println(mutableGroupMap)

}

