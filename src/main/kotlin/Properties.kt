class PropiedadesSistema {

    companion object {
        fun SystemEnviroment() {
            System.getenv().forEach { println(it) }
        }

        fun SystemProperties(){
            System.getProperties().forEach {println(it)}
        }
    }


}