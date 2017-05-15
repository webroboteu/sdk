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
 * Get_pageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_pageResultJsonUnmarshaller implements Unmarshaller<Get_pageResult, JsonUnmarshallerContext> {

    public Get_pageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_pageResult get_pageResult = new Get_pageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_pageResult;
        }

        while (true) {
            if (token == null)
                break;

            get_pageResult.setConceptAttribute(ConceptAttributeJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_pageResult;
    }

    private static Get_pageResultJsonUnmarshaller instance;

    public static Get_pageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_pageResultJsonUnmarshaller();
        return instance;
    }
}
