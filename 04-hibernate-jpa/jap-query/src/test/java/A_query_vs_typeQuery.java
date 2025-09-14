import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class A_query_vs_typeQuery extends A_JpaFactory {

    @Order(1)
    @ParameterizedTest
    @CsvSource(delimiter = ':', value = {
        "s:2",
        "m:1"
    })
        void queryWithIndexParamTest(String param, int res){
            // var query = em.createQuery("select c from Customer c where c.memberType = :param", Customer.class);
        }

}
