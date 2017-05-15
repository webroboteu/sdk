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
 * Create_projectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Create_projectResultJsonUnmarshaller implements Unmarshaller<Create_projectResult, JsonUnmarshallerContext> {

    public Create_projectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Create_projectResult create_projectResult = new Create_projectResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return create_projectResult;
        }

        while (true) {
            if (token == null)
                break;

            create_projectResult.setBotProject(BotProjectJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return create_projectResult;
    }

    private static Create_projectResultJsonUnmarshaller instance;

    public static Create_projectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Create_projectResultJsonUnmarshaller();
        return instance;
    }
}
