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
 * StatusjobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatusjobResultJsonUnmarshaller implements Unmarshaller<StatusjobResult, JsonUnmarshallerContext> {

    public StatusjobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StatusjobResult statusjobResult = new StatusjobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return statusjobResult;
        }

        while (true) {
            if (token == null)
                break;

            statusjobResult.setJobStatus(JobStatusJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return statusjobResult;
    }

    private static StatusjobResultJsonUnmarshaller instance;

    public static StatusjobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StatusjobResultJsonUnmarshaller();
        return instance;
    }
}
