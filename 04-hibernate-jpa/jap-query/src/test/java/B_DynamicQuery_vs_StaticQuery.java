import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class B_DynamicQuery_vs_StaticQuery extends A_JpaFactory {

    // @Order(1)
    @ParameterizedTest
    @CsvSource({
            "1000.00,1500,1",
            "100.00,150,1"
    })
    void dynamicQueryTest(double from, double to, long res) {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        var query = em.createQuery("select count(p) from Product p where p.ws_price between :from and :to", Long.class);
        query.setParameter("from", from);
        query.setParameter("to", to);
        var result = query.getSingleResult();
        System.out.println("Result: " + result);
        assertEquals(res, result);
    }

}
