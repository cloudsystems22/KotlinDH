class Person(val name: String) {
    val children: MutableList<Person> = mutableListOf<Person>()
    constructor(name:String, parente:Person) : this(name){
        parente.children.add(this)

    }
}