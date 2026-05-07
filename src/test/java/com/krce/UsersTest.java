//package com.krce;
//
//import io.restassured.RestAssured;
//import org.hamcrest.Matcher;
//import org.hamcrest.Matchers;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class UsersTest {
//    @BeforeClass
//    public void setup(){
//        RestAssured.baseURI="https://api.escuelajs.co/api/v1";
//    }
//    @Test(priority = 1)
//    public void testGetUsers(){
//        RestAssured.given()
//                .when()
//                .get("/users")
//                .then()
//                .log().all()
//                .statusCode(200)
//                .body("size()", Matchers.greaterThan(0));
//    }
//    @Test(priority = 2)
//    public void testCreateUser(){
//        RestAssured.given()
//                .when()
//                .post("/users/")
//                .then()
//    }
//}
