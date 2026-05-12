# Metro Multibindings Repro

Repro project for https://github.com/ZacSweers/metro/issues/2269. Multi-module
project with `:app` and `:lib`, where `:app` depends on `:lib`. `:lib` defines
the following multibinding:

```kotlin
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
```

`:app` injects a `Set<SetItem>`. It is expected that all three contributed
items are in this set. However, only two of them are present:

```
❯ : ./gradlew run

> Task :app:run
[OnlyContributedSetItem, PublicExposedImplSetItem]
```
