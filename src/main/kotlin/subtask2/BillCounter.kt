package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = bill.toMutableList().sum()
        if (b==(sum-bill[k])/2)
            return "bon appetit"
        else
            return (b-(sum-bill[k])/2).toString()
    }
}
