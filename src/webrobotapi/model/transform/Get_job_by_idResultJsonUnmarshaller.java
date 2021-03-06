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
 * Get_job_by_idResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_job_by_idResultJsonUnmarshaller implements Unmarshaller<Get_job_by_idResult, JsonUnmarshallerContext> {

    public Get_job_by_idResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_job_by_idResult get_job_by_idResult = new Get_job_by_idResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_job_by_idResult;
        }

        while (true) {
            if (token == null)
                break;

            get_job_by_idResult.setJob(JobJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_job_by_idResult;
    }

    private static Get_job_by_idResultJsonUnmarshaller instance;

    public static Get_job_by_idResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_job_by_idResultJsonUnmarshaller();
        return instance;
    }
}
