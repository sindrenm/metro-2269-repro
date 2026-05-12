package lib

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoSet
import dev.zacsweers.metro.ExperimentalMetroApi
import dev.zacsweers.metro.ExposeImplBinding

interface SetItem

@ContributesIntoSet(AppScope::class)
@OptIn(ExperimentalMetroApi::class)
@ExposeImplBinding
data object PublicExposedImplSetItem : SetItem

@ContributesIntoSet(AppScope::class)
@OptIn(ExperimentalMetroApi::class)
@ExposeImplBinding
internal data object InternalExposedImplSetItem : SetItem

@ContributesIntoSet(AppScope::class)
internal data object OnlyContributedSetItem : SetItem
