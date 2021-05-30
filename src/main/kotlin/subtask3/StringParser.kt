package subtask3

class StringParser {


    fun getResult(str: String): Array<String> {

        val bOpen = charArrayOf('<', '(', '[')
        val bClose = charArrayOf('>', ')', ']')

        val result = mutableListOf<String>()
        var count = 0

        for (i in str.withIndex()) {
            if (i.value in bOpen) {
                val indexOpenBracket = bOpen.indexOf(i.value)
                val close = bClose[indexOpenBracket]

                for (j in i.index + 1 until str.length) {
                    when {
                        str[j] == i.value -> count++
                        str[j] == close -> if (count == 0) {
                            result.add(str.substring(i.index + 1 until j))
                        } else {
                            count--
                        }
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}
