class InitOrderDemo (name:String) {
    val firstPropert = "Primeira propriedade $name" . also(::println)

    init{
        println("Primeiro bloco inicializador que imprime ${name}")
    }

    val secondPropert = "Segunda propriedade: ${name.length}" . also(::println)

    init{
        println("Segundo bloco inicializador que imprime ${name.length}")
    }
}