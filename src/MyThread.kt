fun main(args: Array<String>) {
    var mt = MyThread()
    mt.start()
    for (index in 1..10) {
        println("Main Thread $index")
    }
}


class MyThread : Thread() {

    override fun run() {
        super.run()
        for (index in 1..10) {
            println("${this.name} $index")
            try {
                Thread.sleep(1000)
            } catch (ex: InterruptedException) {
                println("${this.name} get interrupted")
            }
        }
    }

}