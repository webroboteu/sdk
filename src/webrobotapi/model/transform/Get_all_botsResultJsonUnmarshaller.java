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
 * Get_all_botsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_botsResultJsonUnmarshaller implements Unmarshaller<Get_all_botsResult, JsonUnmarshallerContext> {

    public Get_all_botsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_all_botsResult get_all_botsResult = new Get_all_botsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_all_botsResult;
        }

        while (true) {
            if (token == null)
                break;

            get_all_botsResult.setArrayOfBot(new ListUnmarshaller<Bot>(BotJsonUnmarshaller.getInstance()).unmarshall(context));
            token = context.nextToken();
        }

        return get_all_botsResult;
    }

    private static Get_all_botsResultJsonUnmarshaller instance;

    public static Get_all_botsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_all_botsResultJsonUnmarshaller();
        return instance;
    }
}
