object question5 extends App{
  val easyPace = 8
  val Tempo = 7
  def getTime(pace:Float, distance:Float) = distance * pace
  val totalRunningTime = getTime(easyPace, 2) + getTime(Tempo, 3) + getTime(easyPace, 2)
  println("The total running time is " + totalRunningTime)
}
