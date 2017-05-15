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
 * Create_pageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Create_pageResultJsonUnmarshaller implements Unmarshaller<Create_pageResult, JsonUnmarshallerContext> {

    public Create_pageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Create_pageResult create_pageResult = new Create_pageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return create_pageResult;
        }

        while (true) {
            if (token == null)
                break;

            create_pageResult.setPage(PageJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return create_pageResult;
    }

    private static Create_pageResultJsonUnmarshaller instance;

    public static Create_pageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Create_pageResultJsonUnmarshaller();
        return instance;
    }
}
