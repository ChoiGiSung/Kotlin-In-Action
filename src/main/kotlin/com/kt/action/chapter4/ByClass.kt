package com.kt.action.chapter4

class CountingSet<T>(
    val countingSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by countingSet {

    var objectsAdded = 0
        private set

    override fun add(element: T): Boolean {
        objectsAdded++
        return countingSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return countingSet.addAll(elements)
    }
}
