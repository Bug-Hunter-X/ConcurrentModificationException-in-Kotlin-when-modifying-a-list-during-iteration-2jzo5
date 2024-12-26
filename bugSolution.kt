fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.entries.removeIf { it.value > 2 }
    println(map) // Output: {a=1, b=2}

    //Correct way to modify list during iteration
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item > 2) {
            iterator.remove()
        }
    }
    println(list2) // Output: [1, 2]
    
    //Alternative using list.removeAll
    val list3 = mutableListOf(1,2,3,4,5)
    list3.removeAll { it > 2 }
    println(list3) // Output: [1,2]
} 