fun main(){
    val m = Point( 8, 9)
    val k = Point(6,10)
    println(m.toString())
    println(k.toString())
    println(m == k)


}

class Point(x: Int, y: Int){

    var x: Int = x
    var y: Int = y
    override fun toString(): String {
        return ("($x, $y)")
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point){
            if(x == other.x && y == other.y)
                return true
        }
        return false
    }



    }
}