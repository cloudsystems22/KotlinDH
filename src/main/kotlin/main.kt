fun main(){
    val initOrderDemo = InitOrderDemo("Agnelo David Fico Neto")
    val pessoa = Pessoa()
    val result = pessoa.nomeEidade("Agnelo David Fico Neto", 43)
    println(result)
    //arrayMain()
}

fun arrayMain(){
    var lista = arrayListOf<String>()

    lista.add("Hello world")
    lista.add("Hello 2")

    for(i in lista){
        println(i)
    }
}