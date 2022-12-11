package test;
import baseURL.JsonPlaceHolderBaseURL;
import org.junit.Test;
import pojos.PojoJsonPlace;
public class C27_Put_PojoClass extends JsonPlaceHolderBaseURL {
    /*
   C27_Put_PojoClass
https://jsonplaceholder.typicode.com/posts/70 url'ine asagidaki
body’e sahip bir PUT request yolladigimizda donen response’in
response body’sinin asagida verilen ile ayni oldugunu test ediniz
    Request Body
   {
   "title":"Ahmet",
   "body":"Merhaba",
   "userId":10,
   "id":70
   }
   Expected Body
   {
   "title":"Ahmet",
   "body":"Merhaba",
   "userId":10,
   "id":70
   }
    */
    @Test
    public void put01(){
        // 1 - Request icin gerekli URL ve Body olustur
        specJsonPlace.pathParams("pp1","posts","pp2",70);
        // Request Body icin pojo Class olusturduk :
        PojoJsonPlace reqBody = new PojoJsonPlace("Ahmet","Merhaba",10,70);
        System.out.println("reqBody = " + reqBody);
    }
}