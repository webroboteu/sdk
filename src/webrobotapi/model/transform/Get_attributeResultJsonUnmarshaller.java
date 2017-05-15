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
 * Get_attributeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_attributeResultJsonUnmarshaller implements Unmarshaller<Get_attributeResult, JsonUnmarshallerContext> {

    public Get_attributeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_attributeResult get_attributeResult = new Get_attributeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_attributeResult;
        }

        while (true) {
            if (token == null)
                break;

            get_attributeResult.setConceptAttribute(ConceptAttributeJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_attributeResult;
    }

    private static Get_attributeResultJsonUnmarshaller instance;

    public static Get_attributeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_attributeResultJsonUnmarshaller();
        return instance;
    }
}
