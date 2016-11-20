package gutierrezrodriguez.dominio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import gutierrezrodriguez.dominio.evaluacion.*;
import gutierrezrodriguez.dominio.restaurante.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        EvaluacionSetEstrellasTest.class,
        EvaluacionEsSorteableTest.class,
        EvaluacionEsValidaTest.class,
        RestauranteSetEvaluacionTest.class
})
public class TestSuite {
	
}