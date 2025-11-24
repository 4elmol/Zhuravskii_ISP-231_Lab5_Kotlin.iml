package artifact

fun main() {
    val artifacts = listOf<MagicItem>(
        Weapon("Смертоносный Меч", 45, "Epic", "огонь", true),
        Potion("Зелье мгновенного урона", 30, "Rare", 60, true),
        Relic("Эльфийские весы", 75, "Common", "демоническое", 3)
    )

    for (art in artifacts){
        art.describe()
        println(art.use())
        println()
    }
}