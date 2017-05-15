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
 * Uplod_datasetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Uplod_datasetResultJsonUnmarshaller implements Unmarshaller<Uplod_datasetResult, JsonUnmarshallerContext> {

    public Uplod_datasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Uplod_datasetResult uplod_datasetResult = new Uplod_datasetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return uplod_datasetResult;
        }

        while (true) {
            if (token == null)
                break;

            uplod_datasetResult.setBotDataset(BotDatasetJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return uplod_datasetResult;
    }

    private static Uplod_datasetResultJsonUnmarshaller instance;

    public static Uplod_datasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Uplod_datasetResultJsonUnmarshaller();
        return instance;
    }
}
