package Stry;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RestAssuredTest {
    public static void main(String[] args) {
//        POST /login
//
//        Request:
//        {
//            "username": "admin",
//                "password": "admin123"
//        }
//
//        Response:
//        {
//            "token": "abc123xyz",
//                "userId": 101
//        }

//        String responebody="//        {\n" +
//                "//            \"username\": \"admin\",\n" +
//                "//                \"password\": \"admin123\"\n" +
//                "//        }";
//        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
//         given()
//                                .header("Content-Type", "application/json")
//                                .body(responebody)
//                            .when()
//                                .post("/login")
//                            .then()
//                                    .log().all()
//                         .statusCode(201)
//                                 .body("token",equalTo("abc123xyz"))
//                 .body("userId",equalTo(101));

        String requestbody="//        {\n" +
                "//            \"username\": \"admin\",\n" +
                "//                \"password\": \"admin123\"\n" +
                "//        }";
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        Response response =given()
                .header("Content-Type", "application/json")
                .body(requestbody)
                .when()
                .post("/login");
//                .then()
//                .log().all()
//                .statusCode(201)
//                .body("token",equalTo("abc123xyz"))
//                .body("userId",equalTo(101));

        response.then().log().all()
                .statusCode(201)
                .body("token",equalTo("abc123xyz"))
                .body("userId",equalTo(101));

        String token = response.jsonPath().getString("token");
        System.out.println(token);

        given()
                .header("Authorization", "Bearer " + token)
                .when()
                .get("/users/profile")
                .then()
                .statusCode(200);
    }
}
