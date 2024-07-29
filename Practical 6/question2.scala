import scala.io.StdIn.readLine

object StudentRecordApp extends App {

  def getStudentInfo(name: String, marks: String, totalMarks: String): (String, Int, Int, Double, Char) = {
    val nameValid = if (name.isEmpty) "Unknown" else name
    val marksInt = marks.toInt
    val totalMarksInt = totalMarks.toInt
    
    val percentage = (marksInt.toDouble / totalMarksInt) * 100

    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (nameValid, marksInt, totalMarksInt, percentage, grade)
  }

  def validateInput(name: String, marks: String, totalMarks: String): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else {
      try {
        val marksInt = marks.toInt
        val totalMarksInt = totalMarks.toInt
        if (marksInt < 0 || marksInt > totalMarksInt) {
          (false, Some("Marks must be positive and cannot exceed total possible marks."))
        } else if (totalMarksInt <= 0) {
          (false, Some("Total possible marks must be greater than zero."))
        } else {
          (true, None)
        }
      } catch {
        case _: NumberFormatException => (false, Some("Marks and total possible marks must be integers."))
      }
    }
  }

  def getStudentInfoWithRetry: (String, Int, Int, Double, Char) = {
    var isValid = false
    var errorMessage: Option[String] = None
    var name = ""
    var marks = ""
    var totalMarks = ""

    while (!isValid) {
      name = readLine("Enter student's name: ")
      marks = readLine("Enter marks obtained: ")
      totalMarks = readLine("Enter total possible marks: ")

      val validationResult = validateInput(name, marks, totalMarks)
      isValid = validationResult._1
      errorMessage = validationResult._2

      if (!isValid) {
        println(s"Error: ${errorMessage.getOrElse("Unknown error")}")
      }
    }

    getStudentInfo(name, marks, totalMarks)
  }

  // Function to print student record
  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Marks: $totalMarks")
    println(s"Percentage: ${"%.2f".format(percentage)}%")
    println(s"Grade: $grade")
  }

  var continueFlag = true

  while (continueFlag) {
    val studentRecord = getStudentInfoWithRetry
    printStudentRecord(studentRecord)
    
    val continueInput = readLine("Do you want to continue? (yes/no): ")
    if (continueInput.toLowerCase != "yes") {
      continueFlag = false
    }
  }
}
