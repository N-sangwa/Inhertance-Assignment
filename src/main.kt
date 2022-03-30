fun main(){
    var myCar = Car("Toyota","Legacy", "Black",7)
    myCar.carry(5)
    myCar.carry(9)
    myCar.identity()
    println(myCar.calculateParkingFees(6))
    var schoolBus=Bus("Acura","Single Deck", "Red",49)
    schoolBus.carry(49)
    schoolBus.carry(60)
    println(schoolBus.calculateParkingFees(8))
    println(schoolBus.maxTripFare(160.00))


}
open class Car(var make:String, var model:String,var color:String,var capacity:Int){
   fun carry(people:Int){
       var x = people-capacity
       if (people<=capacity){
           println("Carrying $people passengers")
       }
else println("Over Capacity by $x")
   }
    fun identity (){
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours:Int):Int{
  return hours*20 }
}

class Bus(make:String, model:String, color:String,capacity:Int):Car(make,model,color, capacity){
    fun maxTripFare(fare:Double):Double{
        return fare*capacity
    }
    override fun calculateParkingFees(hours:Int):Int{
        return hours*capacity
    }
}






