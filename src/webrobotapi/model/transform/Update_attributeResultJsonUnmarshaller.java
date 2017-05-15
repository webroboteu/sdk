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
 * Update_attributeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Update_attributeResultJsonUnmarshaller implements Unmarshaller<Update_attributeResult, JsonUnmarshallerContext> {

    public Update_attributeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Update_attributeResult update_attributeResult = new Update_attributeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return update_attributeResult;
        }

        while (true) {
            if (token == null)
                break;

            update_attributeResult.setConceptAttribute(ConceptAttributeJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return update_attributeResult;
    }

    private static Update_attributeResultJsonUnmarshaller instance;

    public static Update_attributeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Update_attributeResultJsonUnmarshaller();
        return instance;
    }
}
