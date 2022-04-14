


fun main(){
    var myAccount=CurrentAccount("ob657","Liliane", 500.40)
    addMoney(45.00)
    println(myAccount.balance)
    reduceMoney(100.00)
    println(myAccount.balance)
    details()
    var saving=SavingAccount()


}

open class CurrentAccount(var accountnumber:String, var accountname:String, var balance:Double){
}
fun addMoney(amount:Double){
    var balance=amount
    balance+=amount
    return balance
}



fun reduceMoney(amount:Double) {
    var balance = amount
    balance -= amount
    return balance
}

fun details(accountnumber:String, accountname:String, balance:Double){
    var statement= "Account number $accountnumber with balance $balance is operated by $accountname"
    println(statement )
}

class SavingsAccount(number:String, name:String, balance:Double,withdrawals:Int):CurrentAccount(number,name,balance){
}


fun makeWithdrawal(withdrawals:Int){
    if (withdrawals<4){
        println("withdraw")
         }

}

fun times(withdrawal:Int){
    var count=withdrawal
    count++

}

//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)

fun





