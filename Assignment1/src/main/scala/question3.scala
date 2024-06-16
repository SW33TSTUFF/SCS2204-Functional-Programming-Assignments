object question3 extends App{
  def volumeOfSphere(radius:Float) = (4.0/3) * Math.PI * Math.pow(radius, 3)
  val volume = volumeOfSphere(5)
  println("Volume of the sphere of radius 5: " + volume)
}
