fun main(ars: Array<String>) {
    print("Enter your grade: ")
    var grade = readLine()!!.toDouble()

    if (grade >= 90) {
        //success block code
        grade = grade + 1
        print("You have secured level A")
    }

    if (grade >= 50 && grade <= 70) {  // Here we can user range check (grade in 50..70)
        grade = grade + 10
        println("Your grade increased by 10")
    }

    println("You enter grade $grade")
}