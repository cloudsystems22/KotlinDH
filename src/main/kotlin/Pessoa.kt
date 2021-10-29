class Pessoa {
    var nome:String = ""
    var idade:Int = 0
    var altura:Double = 0.0

    fun nomeEidade(nome:String, idade:Int) : String {
        return "Olá $nome, sua idade é $idade ."
    }
}