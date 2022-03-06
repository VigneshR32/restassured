package jsonbuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vicky.methodhandlers.PostHandler;
import io.restassured.response.ResponseBody;
import pojo.JsonBody;
import pojo.JsonResultBody;


public class JsonBodyBuilder {

    public static void main(String[] args) {
        JsonBodyBuilder jsonBodyBuilder = new JsonBodyBuilder();
        JsonBody jsonBody = new JsonBody("Vignesh Ramalingam","2600000","29");
        System.out.println(jsonBodyBuilder.jsonBody(jsonBody));
        /*JsonResultBody jsonResultBody = new JsonResultBody("success", new Data("Vignesh","2600000",31,1));
        System.out.println(jsonBodyBuilder.jsonBody(jsonResultBody));*/
        PostHandler postRequestHandler = new PostHandler("http://dummy.restapiexample.com/api/v1/create");

        String response = ((ResponseBody) postRequestHandler.getResponse(jsonBodyBuilder.jsonBody(jsonBody)).getBody()).asString();
        System.out.println(response);
        JsonResultBody jsonResultBody = jsonBodyBuilder.serialize(response, JsonResultBody.class);
        System.out.println(jsonResultBody.getStatus());
    }
    public <T> String jsonBody(T obj){
        ObjectMapper objectMapper = new ObjectMapper();
        String s = null;
        try {
            s=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }

    public <T> T serialize(String s, Class T){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return  (T) objectMapper.readValue(s,T);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
