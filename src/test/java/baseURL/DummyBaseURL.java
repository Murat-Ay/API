package baseURL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class DummyBaseURL {
    protected RequestSpecification dummySpec;

    @Before
    public void setUp(){
        dummySpec = new RequestSpecBuilder().setBaseUri("http://dummy.restapiexample.com/api/v1")
                .build();
    }
}