//.Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z”(5points)

fun main(){
    var myAccount=CurrentAccount(123OB,"Liliane saving",500.67)
    deposit(45.00)
    println(myAccount.balance)
    withdraw(100.00)
    println(myAccount.balance)
    println(myAccount.details)

}

class CurrentAccount(number:String, name:String, balance:Double){
}
fun deposit(amount:Double){
    var deposited=deposit
    balance+=deposit
    return balance
}
fun withdraw(amount:Double) {
    var decreament = decrease
    balance -= decrease
    return balance
}

fun details(){
    println("Account number $number with balance $balance is operated by $name"  )
}

class SavingsAccount(number:String, name:String, balance:Double,withdrawals:Int):CurrentAccount(number,name,balance){
}


fun makeWithdrawal(withdrawals:Int){
    if (withdrawals<4){
        println(withdraw)
    }

}

fun times(withdrawal:Int){
    var count=withdraw
    withdrawals+=withdraw
    return withdrawals
}

//Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5points