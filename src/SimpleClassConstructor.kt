class CarWithConstructor {
    var type: String? = null
    var model: String? = null
    var owner: String? = null
    var price: Double? = null
    var milesDrive: Int? = null

    constructor(type: String, model: String, price: Double, milesDrive: Int, owner: String) {
        this.type = type
        this.model = model
        this.owner = owner
        this.price = price
        this.milesDrive = milesDrive
        println("Car detail: [\nType: $type\nModel: $model\nPrice: $price Cr.\nMiles Drive: $milesDrive KM\nOwner: $owner\n]")
    }

    fun getCarPrice(): Double? {
        return price!! - milesDrive!! * 10.0
    }

    fun getCarOwner(): String? {
        return owner
    }
}

fun main(agrs: Array<String>) {
    var myCar = CarWithConstructor("Bugati", "2017", 12000.0, 100, "Vikas Verma")
    println("Price: ${myCar.getCarPrice()}, Owner: ${myCar.getCarOwner()}")
}