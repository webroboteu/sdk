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
 * Create_attributeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Create_attributeResultJsonUnmarshaller implements Unmarshaller<Create_attributeResult, JsonUnmarshallerContext> {

    public Create_attributeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Create_attributeResult create_attributeResult = new Create_attributeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return create_attributeResult;
        }

        while (true) {
            if (token == null)
                break;

            create_attributeResult.setConceptAttribute(ConceptAttributeJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return create_attributeResult;
    }

    private static Create_attributeResultJsonUnmarshaller instance;

    public static Create_attributeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Create_attributeResultJsonUnmarshaller();
        return instance;
    }
}
