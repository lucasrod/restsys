package gutierrezrodriguez.dominio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import gutierrezrodriguez.dominio.evaluacion.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        EvaluacionSetEstrellasTest.class,
        EvaluacionEsSorteableTest.class,
        EvaluacionEsValidaTest.class
})
public class TestSuite {
	
}