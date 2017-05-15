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
 * Get_version_setResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_version_setResultJsonUnmarshaller implements Unmarshaller<Get_version_setResult, JsonUnmarshallerContext> {

    public Get_version_setResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_version_setResult get_version_setResult = new Get_version_setResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_version_setResult;
        }

        while (true) {
            if (token == null)
                break;

            get_version_setResult.setBotDatasetVersion(BotDatasetVersionJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_version_setResult;
    }

    private static Get_version_setResultJsonUnmarshaller instance;

    public static Get_version_setResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_version_setResultJsonUnmarshaller();
        return instance;
    }
}
