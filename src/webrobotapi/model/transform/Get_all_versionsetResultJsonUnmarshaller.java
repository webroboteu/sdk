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
 * Get_all_versionsetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_versionsetResultJsonUnmarshaller implements Unmarshaller<Get_all_versionsetResult, JsonUnmarshallerContext> {

    public Get_all_versionsetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_all_versionsetResult get_all_versionsetResult = new Get_all_versionsetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_all_versionsetResult;
        }

        while (true) {
            if (token == null)
                break;

            get_all_versionsetResult.setArrayOfBotDatasetVersion(new ListUnmarshaller<BotDatasetVersion>(BotDatasetVersionJsonUnmarshaller.getInstance())
                    .unmarshall(context));
            token = context.nextToken();
        }

        return get_all_versionsetResult;
    }

    private static Get_all_versionsetResultJsonUnmarshaller instance;

    public static Get_all_versionsetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_all_versionsetResultJsonUnmarshaller();
        return instance;
    }
}
