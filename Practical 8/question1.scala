object question1 extends App {
    val alphabetSimple = "abcdefghijklmnopqrstuvwxyz"
    val alphabetSize = alphabetSimple.size
    val shift = 2
    val inputString = "Welcome to UCSC"

    def encrypt(stringInput: String, shiftValue: Int): String = {
        stringInput.map { text =>
            if (text.isLetter) {
                if (text.isLower) {
                    alphabetSimple.charAt((alphabetSimple.indexOf(text) + shiftValue) % alphabetSize)
                } else {
                    alphabetSimple.charAt((alphabetSimple.indexOf(text.toLower) + shiftValue) % alphabetSize).toUpper
                }
            } else {
                text
            }
        }
    }

    def decrypt(stringInput: String, shiftValue: Int): String = {
        stringInput.map { text =>
            if (text.isLetter) {
                if (text.isLower) {
                    alphabetSimple.charAt((alphabetSimple.indexOf(text) - shiftValue + alphabetSize) % alphabetSize)
                } else {
                    alphabetSimple.charAt((alphabetSimple.indexOf(text.toLower) - shiftValue + alphabetSize) % alphabetSize).toUpper
                }
            } else {
                text
            }
        }
    }

    def ceaserCipher(inputString: String, shiftValue: Int, algorithm: (String, Int) => String): String = {
        algorithm(inputString, shiftValue)
    }

    println("Input string is: " + inputString)
    val encryptedText = ceaserCipher(inputString, shift, encrypt)
    println("Encrypted text is: " + encryptedText)

    val decryptedText = ceaserCipher(encryptedText, shift, decrypt)
    println("Decrypted text is: " + decryptedText)
}
