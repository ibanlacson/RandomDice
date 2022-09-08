package com.auf.cea.randomdice

class Dice {
    // Variables
    var die1 = (1..6).random()
    private val lucky1 = 6
    var die2 = (1..20).random()
    private val lucky2 = 2
    var die3 = (1..40).random()
    private val lucky3 = 25

    private var t1: Boolean = lucky1 == die1
    private var t2: Boolean = lucky2 == die2
    private var t3: Boolean = lucky3 == die3

    // Functions
    private fun die1Result():String{
        return if (t1) {
            "You have rolled the lucky number of $lucky1 on a 6 sided dice!"
        } else {
            "No luck try again!"
        }
    }
    private fun die2Result():String{
        return if (t2) {
            "You have rolled the lucky number of $lucky2 on a 20 sided dice!"
        } else {
            "No luck try again!"
        }
    }
    private fun die3Result():String{
        return if (t3) {
            "You have rolled the lucky number of $lucky3 on a 40 sided dice!"
        } else {
            "No luck try again!"
        }
    }
    private fun WinChecker():String{
        return if (t1 && t2 && t3) {
            " won on Dice 1, 2, and 3!"
        } else if (t1 && t2){
            " won on Dice 1 and 2"
        } else if (t1 && t3){
            " won on Dice 1 and 3"
        } else if (t2 && t3){
            " won on Dice 2 and 3"
        } else if (t1){
            " won on Dice 1"
        } else if (t2){
            " won on Dice 2"
        } else if (t3){
            " won on Dice 3"
        } else {
            " lose"
        }
    }
    // Results
    var die1res = die1Result()
    var die2res = die2Result()
    var die3res = die3Result()
    var FinalResult = WinChecker()

}