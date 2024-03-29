package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ControllerTest {

  @Test
  public void testHelloEndpoint() {
    given()
        .when().get("/hello/Shady")
        .then()
        .statusCode(200)
        .body(is("Hi, your Name is what? Your name is who? Your name is: SlimShady!"));
  }
}
