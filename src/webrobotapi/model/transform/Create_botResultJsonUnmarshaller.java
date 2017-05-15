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
 * Create_botResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Create_botResultJsonUnmarshaller implements Unmarshaller<Create_botResult, JsonUnmarshallerContext> {

    public Create_botResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Create_botResult create_botResult = new Create_botResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return create_botResult;
        }

        while (true) {
            if (token == null)
                break;

            create_botResult.setBot(BotJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return create_botResult;
    }

    private static Create_botResultJsonUnmarshaller instance;

    public static Create_botResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Create_botResultJsonUnmarshaller();
        return instance;
    }
}
