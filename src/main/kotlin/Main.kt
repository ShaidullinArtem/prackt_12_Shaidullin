import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun touch(n: Int) {
    for(i in 1..n) {
        delay(1000L)
        println("touch");
    }
}

suspend fun main(args: Array<String>) =  coroutineScope{
    println("Enter touch count: ");
    val n: Int = readln().toInt();
    launch { touch(n) }
    println("Start touch!");
}