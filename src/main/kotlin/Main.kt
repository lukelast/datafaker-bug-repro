import net.datafaker.Faker


private const val INSTANCE_COUNT = 1_000_000

fun main() {
    for (i in 1..INSTANCE_COUNT) {
        val faker = Faker()
        println(faker.ancient().god())
    }
    println("Set breakpoint here")
    // Now set breakpoint in net.datafaker.providers.base.BaseFaker#getProvider
    Faker().ancient().god()
    // Sleep gives some time to capture a heap dump.
    Thread.sleep(30_000)
}
