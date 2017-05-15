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
 * Get_all_projectsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_projectsResultJsonUnmarshaller implements Unmarshaller<Get_all_projectsResult, JsonUnmarshallerContext> {

    public Get_all_projectsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_all_projectsResult get_all_projectsResult = new Get_all_projectsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_all_projectsResult;
        }

        while (true) {
            if (token == null)
                break;

            get_all_projectsResult.setArrayOfBotProject(new ListUnmarshaller<BotProject>(BotProjectJsonUnmarshaller.getInstance()).unmarshall(context));
            token = context.nextToken();
        }

        return get_all_projectsResult;
    }

    private static Get_all_projectsResultJsonUnmarshaller instance;

    public static Get_all_projectsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_all_projectsResultJsonUnmarshaller();
        return instance;
    }
}
