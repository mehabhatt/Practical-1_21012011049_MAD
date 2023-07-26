class Car(model:String,owner:String,miles:Int,original_Price:Double,current_Price:Double){
    lateinit var model:String
    lateinit var owner:String
    var miles:Int
    var original_Price:Double
    var current_Price:Double

    init{
        this.model = model
        this.owner = owner
        this.miles = miles
        this.original_Price = original_Price
        this.current_Price = current_Price
    }

    fun getCarInformation(): String {
        return model
    }
    fun getOriginalCarPrice(): Double {
        return original_Price
    }
    fun getCurrentCarPrice(): Double {
        return current_Price
    }
    fun displayCarInfo(){
        println("----------")
        println("Car Information: ${getCarInformation()}")
        println("Car Owner: $owner")
        println("Miles Drive: $miles")
        println("Original Car Price: ${getOriginalCarPrice()}")
        println("Current Car Price: ${getCurrentCarPrice()}")
        println("----------\n")
    }

}
fun main() {
    println("21012011049_Meha Bhatt")
    println("Creating Car Class Object- car1.")
    println("Object of class is created and Init is called")
    val car1 = Car("BMW, 2017","Ananya",120, 1000000.0,9855000.0)
    car1.displayCarInfo()
    println("Creating Car Class Object- car2.")
    println("Object of class is created and Init is called")
    val car2 = Car("Audi, 2020","Naman",50, 4000000.0,3850000.0)
    car2.displayCarInfo()
    println("********** ArrayList of Car **********")
    println("Object of class is created and Init is called")
    val carlist = ArrayList<Car>()
    carlist.add(Car("Toyota, 2017","Ram",1000,1080000.0,1079000.0))
    carlist.add(Car("Maruti, 2020","Nisha",200,4000000.0,3998000.0))
    carlist.add(Car("Brezza, 2021","Karan",140,900000.0,850000.0))
    carlist[0].displayCarInfo()
    carlist[1].displayCarInfo()
    carlist[2].displayCarInfo()
}