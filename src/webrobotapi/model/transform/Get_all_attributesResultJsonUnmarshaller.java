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
 * Get_all_attributesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_attributesResultJsonUnmarshaller implements Unmarshaller<Get_all_attributesResult, JsonUnmarshallerContext> {

    public Get_all_attributesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_all_attributesResult get_all_attributesResult = new Get_all_attributesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_all_attributesResult;
        }

        while (true) {
            if (token == null)
                break;

            get_all_attributesResult.setArrayOfConcept(new ListUnmarshaller<Concept>(ConceptJsonUnmarshaller.getInstance()).unmarshall(context));
            token = context.nextToken();
        }

        return get_all_attributesResult;
    }

    private static Get_all_attributesResultJsonUnmarshaller instance;

    public static Get_all_attributesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_all_attributesResultJsonUnmarshaller();
        return instance;
    }
}
