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
 * Get_bot_from_nameResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_bot_from_nameResultJsonUnmarshaller implements Unmarshaller<Get_bot_from_nameResult, JsonUnmarshallerContext> {

    public Get_bot_from_nameResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_bot_from_nameResult get_bot_from_nameResult = new Get_bot_from_nameResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_bot_from_nameResult;
        }

        while (true) {
            if (token == null)
                break;

            get_bot_from_nameResult.setBot(BotJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_bot_from_nameResult;
    }

    private static Get_bot_from_nameResultJsonUnmarshaller instance;

    public static Get_bot_from_nameResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_bot_from_nameResultJsonUnmarshaller();
        return instance;
    }
}
