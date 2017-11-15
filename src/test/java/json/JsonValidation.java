package json;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import java.io.IOException;
import java.io.File;


public class JsonValidation {

    public static void main( String[] args ) throws IOException, ProcessingException
    {
        File schemaFile = new File("schemaProjects.json");
        File jsonFile = new File("dataProjects.json");

        if (ValidationUtils.isJsonValid(schemaFile, jsonFile)){
            System.out.println("Valid!");
        }else{
            System.out.println("NOT valid!");
        }
    }

}
