package app

import dev.zacsweers.metro.createGraph

fun main() {
    val graph = createGraph<AppGraph>()

    println(graph.setItems)
}

