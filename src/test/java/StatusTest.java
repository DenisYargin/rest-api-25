import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.is;

public class StatusTest {
    @Test
    void totalcheck5(){
        get("https://selenoid.autotests.cloud/status")
                .then()
                .body("total", is(5));
    }
}
