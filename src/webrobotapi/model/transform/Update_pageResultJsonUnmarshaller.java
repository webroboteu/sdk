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
 * Update_pageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Update_pageResultJsonUnmarshaller implements Unmarshaller<Update_pageResult, JsonUnmarshallerContext> {

    public Update_pageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Update_pageResult update_pageResult = new Update_pageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return update_pageResult;
        }

        while (true) {
            if (token == null)
                break;

            update_pageResult.setPage(PageJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return update_pageResult;
    }

    private static Update_pageResultJsonUnmarshaller instance;

    public static Update_pageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Update_pageResultJsonUnmarshaller();
        return instance;
    }
}
