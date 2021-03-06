package gutierrezrodriguez.dominio;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import gutierrezrodriguez.dominio.evaluacion.*;
import gutierrezrodriguez.dominio.ficha.*;
import gutierrezrodriguez.dominio.restaurante.*;
import gutierrezrodriguez.dominio.sorteo.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    EvaluacionSetEstrellasTest.class,
    EvaluacionEsSorteableTest.class,
    EvaluacionEsValidaTest.class,
    RestauranteSetEvaluacionTest.class,
    RestauranteSetSorteoTest.class,
    SorteoRealizarSorteoTest.class,
    FichaSetHorarioTest.class
})

public class TestSuite {

}