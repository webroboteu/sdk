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
 * StartjobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartjobResultJsonUnmarshaller implements Unmarshaller<StartjobResult, JsonUnmarshallerContext> {

    public StartjobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartjobResult startjobResult = new StartjobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startjobResult;
        }

        while (true) {
            if (token == null)
                break;

            startjobResult.setJobid(JobIdJsonUnmarshaller.getInstance().unmarshall(context).getJobid());
            token = context.nextToken();
        }

        return startjobResult;
    }

    private static StartjobResultJsonUnmarshaller instance;

    public static StartjobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartjobResultJsonUnmarshaller();
        return instance;
    }
}
