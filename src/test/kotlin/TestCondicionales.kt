import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
import org.junit.jupiter.api.condition.EnabledIfSystemProperty
import org.junit.jupiter.api.Test



class TestCondicionales {

    @Test
    fun imprimirVars(){
        println("SYSTEM ENVIROMENT")
        println("==================================")
        println(System.getenv().forEach { println(it) })
        println("SYSTEM PROPERTIES")
        println("==================================")
        println(System.getProperties().forEach {println(it)})
    }

    @Test
    //Compruebo que la propiedad del sistema indicada corresponde al valor puesto en matches
    //@EnabledIfSystemProperty(named="SESSIONAME", matches="Console")
    @EnabledIfSystemProperty(named="PROCESSOR_LEVEL", matches="23")
    internal fun SistemProperty() {
        println("Propiedad del sistema correcta")
    }

    @Test
    //Compruebo que la variable del sistema indicado corresponde al valor puesto en matches
    @EnabledIfEnvironmentVariable(named="os.version", matches="10.0")
    internal fun EnviromentVariable() {
        println("Variable de entorno correcta")
    }
}
