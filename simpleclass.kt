/**
 * Created by pc on 10/2/2017.
 */

class car(Type:String , Model:Int , Price:Double,
           Milesdrive:Int , Owner:String)
{
    var Owner:String?=null
    var Price:Double?=null
    var Milesdrive:Int?=null
    init {
        println("Type : $Type")
        println("Model : $Model")
        println("Price : $Price")
        println("Milesdrive : $Milesdrive")
        println("Owner : $Owner")
        this.Owner=Owner
        this.Price=Price
        this.Milesdrive=Milesdrive
    }
    fun getprice():Double?{
        return this.Price!!-(this.Milesdrive!!.toDouble()*10)
    }
    fun getowner():String?
    {
        return this.Owner;
    }
}
fun main(args:Array<String>)
{
    var car1=car("BMW",1500,40000.00,341,"Sajal")
    println("Price "+car1.getprice())
    println("Owner "+car1.getowner())
}
