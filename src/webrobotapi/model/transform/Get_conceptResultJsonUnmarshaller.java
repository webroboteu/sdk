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
 * Get_conceptResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_conceptResultJsonUnmarshaller implements Unmarshaller<Get_conceptResult, JsonUnmarshallerContext> {

    public Get_conceptResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_conceptResult get_conceptResult = new Get_conceptResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_conceptResult;
        }

        while (true) {
            if (token == null)
                break;

            get_conceptResult.setConcept(ConceptJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_conceptResult;
    }

    private static Get_conceptResultJsonUnmarshaller instance;

    public static Get_conceptResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_conceptResultJsonUnmarshaller();
        return instance;
    }
}
