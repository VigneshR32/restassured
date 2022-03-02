package jsonbuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Data;
import pojo.JsonBody;
import pojo.JsonResultBody;


public class JsonBodyBuilder {

    public static void main(String[] args) {
        JsonBodyBuilder jsonBodyBuilder = new JsonBodyBuilder();
        JsonBody jsonBody = new JsonBody("Vignesh","2600000",31);
        System.out.println(jsonBodyBuilder.jsonBody(jsonBody));
        JsonResultBody jsonResultBody = new JsonResultBody("success", new Data("Vignesh","2600000",31,1));
        System.out.println(jsonBodyBuilder.jsonBody(jsonResultBody));
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
}
