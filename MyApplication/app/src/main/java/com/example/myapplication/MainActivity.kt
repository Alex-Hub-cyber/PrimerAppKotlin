package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   // Eje()
       // tiposDeVariableExplicita()
       // operadores()
       // principal ()
        //sentenciaMen()
        Bucle()

    }

    //Variables
    private fun variablesyConstantes() {
        var miPrimerVariable = "Hola estudiantes de programacion IV"
        println(miPrimerVariable)
        miPrimerVariable = "este es el nuevo valor de la variable"
        println(miPrimerVariable)

        var miSegundaVaribale = miPrimerVariable
        println(miSegundaVaribale)

        //Constates
        val miPrimerConstante = "Esta es una constante y no puede cambiar su valor"
        println(miPrimerConstante)
        //  miPrimerConstante="Otro valor de la constante"


        //Constantes Numericas
        var entero = 2
        var miDoble = 2.2
        println(entero)
        println(miDoble)
        ///////////////////////////////////////////////////////


    }

    private fun Eje() {
        println("Primer Ejercicio")
        var nombre: String = "alex"
        var Apellido: String = "garcia"
        var edad: Int = 23
        edad = 32
        var salario = 600
        salario = 600

        var nombreCompleto = nombre + " " + Apellido
        println(nombreCompleto)
        Apellido = "Lopez"

        nombreCompleto = nombre + " " + Apellido
        println(nombreCompleto)

        val nacimiento = 2000
        var actualidad = Calendar.getInstance().get(Calendar.YEAR)
        var edadActual = actualidad - nacimiento
 println("Edad ="+edadActual)

    }
    ////////////////////////////////////////////////////////////////////////
    private fun tiposDeVariableExplicita()
    {
        //Tip de datos
        var enteroExplicito:Int =45
        var enteroDeducido =45
        println(enteroDeducido.javaClass)

        var doubleExplicito = 45.45
        var dobleDeducido = 35.35
        println(dobleDeducido.javaClass)

        var flotanteExplicito: Float= 45.45F
        var flotanteDoble =35.35F
        println(flotanteDoble.javaClass)

        var largoExplicito :Long=454545L
        var largoDoble =353535L
        println(largoDoble.javaClass)

        var textoExplicito:String="45"
        var textoDoble="45"
        println(textoDoble.javaClass)

    }
    //////////////////////////////////////////////////////////////////////
   private  fun operadores(){

       val num1=4
       val num2 =6

       //suma
       var suma:Int = num1+num2
       println("suma: "+ suma)


       //resta
       var resta:Int = num1-num2
       println("resta: "+ resta)

       //multiplicacion
       var multiplicacion:Int = num1*num2
       println("multiplicacon: "+ multiplicacion)

       //division
       var division:Int = num1/num2
       println("division: "+ division)


        //Boolean (bool)
       val boolean1: Boolean =true
       val boolean2=false
       val boolean3=true
       println(boolean1==boolean2)
       println(boolean1&&boolean3)



}
    //////////////////////////////////////////////////
    fun principal (){
        println("Hola estudiantes les saluda desde la funcion principal")
        saludo("alex","garcia")


        var saludo =retornarSaludo("keyri","keyri")
        println(saludo)

    }
    fun saludo(nombre:String, apellido:String){
        println(nombre+""+apellido)

    }
    fun retornarSaludo(nombre:String,apellido: String):String{
        return nombre+""+apellido

    }
    //var resSuma=suma(5.6,3.674)
    //var resRedondeo=redondeo()
    fun suma(num1:Double,num2:Float):Double{
        var resultado =num1+num2
        println(resultado.javaClass)
        return resultado

    }
    fun redondeo (num:Double) {

     //   println(String.format(("$5.21",num))
    }
    private fun sentencial(){
        val miNum1=12
        val miNum2=8
        val miNum3=45
        val miNum4=50
        val miNum5=6
        if (miNum1<=10){
            println("$miNum1 es mayor o igual que 10")
        } else{
            println("$miNum1 es mayor que 10")
        }
    }
    private fun sentenciaMen(){
        val pais = "El Salvador"

        when(pais){
            "El Salvador"->{
                println("el idioma de $pais es el espanol")
            }
            "Brasil"->{
                println("el idioma de $pais es el portugues")
            }
            "Francia"->{
                println("el idioma de $pais es el frances")
            }
            "EEUU"->{
                println("el idioma de $pais es el English")
            }
            else ->{
                println("no se encontro el pais por ende no sabemos el idioma ")
            }
        }
        val edad=10
        when(edad){
            0,1,2->{
                println("Eres un bebe")
            }
           in 3..10 ->{
                println("Eres un nino/a")
            }
            in 11..17 ->{
                println("Eres un adolecente")
            }
            in 18..30 ->{
                println("Eres un adulto joven")
            }
            in 31..69 ->{
                println("Eres un adulto")
            }
            in 70..79 ->{
                println("Eres un anciano")
            }
            else ->{
                println("Eres un viejo")
            }
        }
    }
    private fun Bucle(){
        val miArreglo= listOf("hola","alumnos","programacion IV")
        for (miString in miArreglo){
            println(miString)
        }
        for (x in 0..10){
            println(x)
        }
        for(x in 0 until 10){
            println(x)
        }
        for(x in 0..10 step 2){
            println(x)
        }
        for(x in 10 downTo 0 step 3){
            println(x)
        }
    }
}