object array{
  def main(args:Array[String]): Unit = {
    val array4=Array(5,2,1,3,4)
    println(array4.sorted.mkString("Array(", ", ", ")"))
    println(array4.reverse.mkString("Array(",",",")"))
    val arr1=Array(1,2,3,5,6,4)
    val cityNames=Array("Kochi","Varkala","Trivandrum","Alapuzzha")
    val groupbyLen=cityNames.groupBy(_.length)
    val groupbyFirstChar=cityNames.groupBy(_.charAt(0))
    groupbyFirstChar.foreach{
      case(key,value)=>println(s"$key:${value.mkString(",")}")
    }

    val groupbyOddorEven=arr1.groupBy(num=>if(num%2==0) "even" else "odd")
    groupbyOddorEven.foreach {
      case (key, value) => println(s"$key:${value.mkString(",")}")
    }
    groupbyLen.foreach{
      case(key,value)=>println(s"$key:${value.mkString(",")}")
    }


  }

}
