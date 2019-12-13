package company.ryzhkov

import company.ryzhkov.list.Empty
import company.ryzhkov.list.InnerList
import company.ryzhkov.list.LinkedRecursiveList

fun main() {
    var list: LinkedRecursiveList<Int> = Empty

    for (i in 0..1000) {
        list = InnerList(i, list)
    }

    println(list[500])
    println(list.size)
}
