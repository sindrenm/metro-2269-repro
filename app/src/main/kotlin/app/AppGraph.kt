package app

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import lib.SetItem

@DependencyGraph(AppScope::class)
internal interface AppGraph {
    val setItems: Set<SetItem>
}
