import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
import org.junit.jupiter.api.condition.EnabledIfSystemProperty
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow


class TestCondicionales {

    //Compruebo que la propiedad del sistema indicada corresponde al valor puesto en matches
    @Test
    @EnabledIfSystemProperty(named="PROCESSOR_LEVEL", matches="23")
    internal fun SistemProperty() {
        assertDoesNotThrow { PropiedadesSistema.SystemProperties() }
    }

    //Compruebo que la variable del sistema indicado corresponde al valor puesto en matches
    @Test
    @EnabledIfEnvironmentVariable(named="os.version", matches="10.0")
    internal fun EnviromentVariable() {
        assertDoesNotThrow { PropiedadesSistema.SystemEnviroment() }
    }
}
