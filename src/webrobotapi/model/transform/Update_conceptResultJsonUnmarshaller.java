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
 * Update_conceptResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Update_conceptResultJsonUnmarshaller implements Unmarshaller<Update_conceptResult, JsonUnmarshallerContext> {

    public Update_conceptResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Update_conceptResult update_conceptResult = new Update_conceptResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return update_conceptResult;
        }

        while (true) {
            if (token == null)
                break;

            update_conceptResult.setConcept(ConceptJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return update_conceptResult;
    }

    private static Update_conceptResultJsonUnmarshaller instance;

    public static Update_conceptResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Update_conceptResultJsonUnmarshaller();
        return instance;
    }
}
