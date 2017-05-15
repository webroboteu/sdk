/**
 * null
 */
package webrobotapi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import webrobotapi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Create_conceptResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Create_conceptResultJsonUnmarshaller implements Unmarshaller<Create_conceptResult, JsonUnmarshallerContext> {

    public Create_conceptResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Create_conceptResult create_conceptResult = new Create_conceptResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return create_conceptResult;
        }

        while (true) {
            if (token == null)
                break;

            create_conceptResult.setConcept(ConceptJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return create_conceptResult;
    }

    private static Create_conceptResultJsonUnmarshaller instance;

    public static Create_conceptResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Create_conceptResultJsonUnmarshaller();
        return instance;
    }
}
