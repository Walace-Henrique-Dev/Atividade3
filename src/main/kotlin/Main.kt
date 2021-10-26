fun main(args: Array<String>) {

    /*

3 - Codifique o app para calcular o preço correto do ingresso com base na idade e mostre esse retorno para o usuário.
4 - Caso o usuário não tenha desconto, crie um sistema para a quantidade de ingressos que ele quer e, se ele comprar dois ingressos ou mais, terá um desconto de 30% em cada um.
     */


    print("Digite a sua idade: ")
    var idade = readLine()!!.toInt()

    var precoIng = 18.0
    var desc = 0.0
    var precoFinal = 0.0
    var cont = 0

    if(idade < 5){
        desc = 0.6
    }else if (idade > 60){
        desc = 0.55
    }else{
        print("Quantos ingressos você deseja comprar? ")
        cont = readLine()!!.toInt()

        if(cont > 2){
            desc = 0.3
        }else{
            desc = 0.0
        }
    }

    precoFinal = precoIng - (precoIng * desc)
    println("Você pagará R$$precoFinal nos ingressos")
}