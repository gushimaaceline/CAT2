
fun main(){
    println(namesLength("Celine"))
    println(namesLength("Gushima"))
    var accountHolder = CurrentAccount(83345111,"Keza Sandra",3200000.50)
    accountHolder.deposit(29000.00)
    accountHolder.withdraw(45000.00)
    accountHolder.details()
    var accountHolder2 = SavingsAccount(8937564,"Kay Linda",100000.00,2)
    accountHolder2.withdraw(3000.50)
    accountHolder2.withdrawals
    var car = listOf(Car("Benz","C1800","blue"),
        Car("Toyota","Carina","red"),
        Car("Coaster","Hundai","green"))


}
data class Car(var make:String, var model:String,var color:String)

fun carColors(color:String){
    var blue = mutableListOf<String>()
    var red = mutableListOf<String>()
    var other = mutableListOf<String>()
    when(color){
        "red" -> println( red.add(color))
        "blue" -> println(blue.add(color))
        "other" ->println(other.add(color))
    }
}
fun namesLength (name:String):Int{
    return name.length
}
open class CurrentAccount (var accountnumber:Int,var accountname:String,var balance:Double){
    fun deposit(amount:Double){
        println(amount)
        balance+=amount

    }
    open fun withdraw(amount:Double){
        println(amount)
        balance-=amount

    }
    fun details(){
        println("Account number ${accountnumber} with balance ${balance} is operated by ${accountname}")
    }
}
class SavingsAccount(accountnumber:Int,accountname:String,balance:Double, var withdrawals:Int):CurrentAccount(accountnumber,accountname,balance){
    override fun withdraw (amount: Double){
        while(withdrawals < 4){
            balance-=amount
            withdrawals++
            println(amount)
        }
    }
}
