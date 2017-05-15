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
 * Update_botResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Update_botResultJsonUnmarshaller implements Unmarshaller<Update_botResult, JsonUnmarshallerContext> {

    public Update_botResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Update_botResult update_botResult = new Update_botResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return update_botResult;
        }

        while (true) {
            if (token == null)
                break;

            update_botResult.setBot(BotJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return update_botResult;
    }

    private static Update_botResultJsonUnmarshaller instance;

    public static Update_botResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Update_botResultJsonUnmarshaller();
        return instance;
    }
}
