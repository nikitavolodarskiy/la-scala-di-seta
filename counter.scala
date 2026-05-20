//> using scala 3.8.3
//> using toolkit 0.9.2

@main
def countFiles(): Unit = 
    val paths = os.list(os.pwd)
    println(paths.length)