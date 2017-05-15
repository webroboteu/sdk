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
 * Get_project_by_nameResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_project_by_nameResultJsonUnmarshaller implements Unmarshaller<Get_project_by_nameResult, JsonUnmarshallerContext> {

    public Get_project_by_nameResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_project_by_nameResult get_project_by_nameResult = new Get_project_by_nameResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_project_by_nameResult;
        }

        while (true) {
            if (token == null)
                break;

            get_project_by_nameResult.setBotProject(BotProjectJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_project_by_nameResult;
    }

    private static Get_project_by_nameResultJsonUnmarshaller instance;

    public static Get_project_by_nameResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_project_by_nameResultJsonUnmarshaller();
        return instance;
    }
}
