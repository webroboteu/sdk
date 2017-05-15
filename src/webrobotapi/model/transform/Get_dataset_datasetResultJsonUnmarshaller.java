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
 * Get_dataset_datasetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_datasetResultJsonUnmarshaller implements Unmarshaller<Get_dataset_datasetResult, JsonUnmarshallerContext> {

    public Get_dataset_datasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_dataset_datasetResult get_dataset_datasetResult = new Get_dataset_datasetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_dataset_datasetResult;
        }

        while (true) {
            if (token == null)
                break;

            get_dataset_datasetResult.setBotDataset(BotDatasetJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_dataset_datasetResult;
    }

    private static Get_dataset_datasetResultJsonUnmarshaller instance;

    public static Get_dataset_datasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_dataset_datasetResultJsonUnmarshaller();
        return instance;
    }
}
