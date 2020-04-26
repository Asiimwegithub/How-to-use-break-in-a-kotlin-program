fun main(args: Array<String>){
    //we wanna println from 1-10 but we want before we reach 10 let the loop stop at 5
    // Now we go to a do while loop
    var x = 1
    do{
        println(x)
        if (x==5){
            break
        }
        x++
    }while (x<=10)
    //we run again to see if it stops at 5 instead of continuing up to 10

}