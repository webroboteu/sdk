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
 * Create_jobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Create_jobResultJsonUnmarshaller implements Unmarshaller<Create_jobResult, JsonUnmarshallerContext> {

    public Create_jobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Create_jobResult create_jobResult = new Create_jobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return create_jobResult;
        }

        while (true) {
            if (token == null)
                break;

            create_jobResult.setJob(JobJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return create_jobResult;
    }

    private static Create_jobResultJsonUnmarshaller instance;

    public static Create_jobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Create_jobResultJsonUnmarshaller();
        return instance;
    }
}
