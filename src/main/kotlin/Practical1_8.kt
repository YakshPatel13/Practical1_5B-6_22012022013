fun main(){
    println("\n22012022013 Yaksh Patel")
    var a2= arrayOf(5,4,3,2,1)
    var a3= intArrayOf(8,9,7)
    var a4=Array(5){0}
    println("Creste Array Using ArrayOf=${a2.contentToString()}\n")
    println("Creste Array Using IntArrayOf=${a3.contentToString()}\n")
    println("Creste Array Using Array=${a4.contentToString()}\n\n")
    var a1= arrayListOf<Int>()
    print("Enter Your Array Size =")
    var size= readln().toInt()
    println("Enter Your $size Elements!!")
    for(i in 0..(size-1)){
        print("Enter a[$i]=")
        a1.add(readln().toInt())
    }
    println("Before Sorting Array Is")
    a1.forEach{print(it,)}
    println("\nAfter Sorting Using Build-In Function")
    a1.sort()
    a1.forEach{print(it,)}
    var a5= arrayOf(5,4,3,2,1)
    println("\nBefore Sorting Array Is")
    a5.forEach { print(it,) }
    var temp:Int
    for(i in 0 .. size-1){
        for(j in 0 .. i){
            if(a5[i]<a5[j]){ temp=a5[i]
                a5[i]=a5[j]
                a5[j]=temp
            } }
    }
    println("\nAfter Sorting Without Using Build-In Function")
    a5.forEach { print(it,) }
}
