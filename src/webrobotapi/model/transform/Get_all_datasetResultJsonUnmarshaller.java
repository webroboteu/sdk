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
 * Get_all_datasetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_datasetResultJsonUnmarshaller implements Unmarshaller<Get_all_datasetResult, JsonUnmarshallerContext> {

    public Get_all_datasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_all_datasetResult get_all_datasetResult = new Get_all_datasetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_all_datasetResult;
        }

        while (true) {
            if (token == null)
                break;

            get_all_datasetResult.setArrayOfBotDataset(new ListUnmarshaller<BotDataset>(BotDatasetJsonUnmarshaller.getInstance()).unmarshall(context));
            token = context.nextToken();
        }

        return get_all_datasetResult;
    }

    private static Get_all_datasetResultJsonUnmarshaller instance;

    public static Get_all_datasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_all_datasetResultJsonUnmarshaller();
        return instance;
    }
}
