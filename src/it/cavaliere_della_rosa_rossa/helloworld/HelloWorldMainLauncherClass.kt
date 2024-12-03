package it.cavaliere_della_rosa_rossa.helloworld

class HelloWorldMainLauncherClass(val foo: Int) {
    fun songRefrain() {
        for (i in 0 until foo) println("Hello World!")
        var pippo = 0
        while (pippo < foo) {
            println("Hello World!")
            pippo++
        }
    }

    /*
        If I may introduce a bug, the JVM will manage it for me
        ensuring both security and portability.
        Then I'll write my code once, and run it everywhere!
        With static and strong typing, will let my programs be type safe!
    */

    fun falseMethod() {
        val metal = false
        if (!metal) {
            val joeyDeCaio: String? = null
            joeyDeCaio?.length
        }
    }

    /*
        ...and unlike the original by Nanowar of Steel
        this attempt of mine is guaranteed to succeed
        'cause not only is Kotlin type safe
        but this wonderful language is also null safe!

        the entry point is in src/Main.kt
        enjoy your happy ending. 🌹
    */
}