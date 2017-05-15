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
 * Get_version_set_from_versionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_version_set_from_versionResultJsonUnmarshaller implements Unmarshaller<Get_version_set_from_versionResult, JsonUnmarshallerContext> {

    public Get_version_set_from_versionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_version_set_from_versionResult get_version_set_from_versionResult = new Get_version_set_from_versionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_version_set_from_versionResult;
        }

        while (true) {
            if (token == null)
                break;

            get_version_set_from_versionResult.setBotDatasetVersion(BotDatasetVersionJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_version_set_from_versionResult;
    }

    private static Get_version_set_from_versionResultJsonUnmarshaller instance;

    public static Get_version_set_from_versionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_version_set_from_versionResultJsonUnmarshaller();
        return instance;
    }
}
