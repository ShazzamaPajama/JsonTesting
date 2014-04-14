/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsontesting;

import java.io.PrintWriter;
import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author paul.koroski
 */
public class JsonTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        
        JsonObject model = Json.createObjectBuilder()
                .add("Type", "Messge")
                .add("Message", "This is the message")
                .add("Number", 24)
                .build();
        
        out.println("json model created");
        String test = model.toString();
        out.println("json model converted to string");
        
        StringReader testreader = new StringReader(test);
        
        JsonReader reader = Json.createReader(testreader);
        
        JsonObject jsontest = reader.readObject();
        out.println("json string converted into new object");
        
        out.println(jsontest.get("Type"));
    }
    
}
