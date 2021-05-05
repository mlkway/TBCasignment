class ClassForMathOperation {


    fun greatestCommonDivisor(firstNumber: Int, secondNumber: Int):Int {

        var counter = if (firstNumber > secondNumber) secondNumber else firstNumber

        while (counter > 0){

            if (firstNumber % counter == 0 && secondNumber % counter == 0) return counter

            counter --
        }
        return counter

    }

    fun evenNumbersSumBeforeOneHundred(counter: Int): Int {

        return if (counter < 2) counter else counter-2 + evenNumbersSumBeforeOneHundred( counter - 2)

    }



    fun leastCommonMultiple(firstNumber: Int, secondNumber: Int): Int{

        var leastCommon = if (firstNumber > secondNumber) firstNumber else secondNumber

        while (true){
            if (leastCommon % firstNumber == 0 && leastCommon % secondNumber == 0){
                return leastCommon
            }
            leastCommon++
        }
    }

    fun containDollarSymbol(arg: String): Boolean{
        return arg.contains("$")
    }

    fun reverseInteger(arg: Int): Int{
        return arg.toString().reversed().toInt()
    }

    fun checkPalindrome(arg: String):Boolean{
        val charcterFilter = ",.:; "
        val checker =
            arg.toLowerCase().
            filterNot { charcterFilter.indexOf(it) > -1 }
        return checker == checker.reversed()
    }

}