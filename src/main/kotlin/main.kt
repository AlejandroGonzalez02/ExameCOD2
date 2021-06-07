import kotlin.random.Random

fun main(args: Array<String>) {

//Apartado1
    var contador = 0
    for (resultado in Exercicio1(11).tabla7){
        println("7 x $contador = $resultado")
        contador++

        //Apartado2
        contador = 1
        val numAl = Exercicio2(10){
            Random.nextInt(50,250)
        }
        numAl.aleatorios.forEach {
            println("$contador = $it")
            contador++
        }
    }
}