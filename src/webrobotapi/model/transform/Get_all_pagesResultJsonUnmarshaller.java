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
 * Get_all_pagesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_pagesResultJsonUnmarshaller implements Unmarshaller<Get_all_pagesResult, JsonUnmarshallerContext> {

    public Get_all_pagesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_all_pagesResult get_all_pagesResult = new Get_all_pagesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_all_pagesResult;
        }

        while (true) {
            if (token == null)
                break;

            get_all_pagesResult.setArrayOfPage(new ListUnmarshaller<Page>(PageJsonUnmarshaller.getInstance()).unmarshall(context));
            token = context.nextToken();
        }

        return get_all_pagesResult;
    }

    private static Get_all_pagesResultJsonUnmarshaller instance;

    public static Get_all_pagesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_all_pagesResultJsonUnmarshaller();
        return instance;
    }
}
