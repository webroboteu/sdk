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
 * Status_build_xpath_modelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Status_build_xpath_modelResultJsonUnmarshaller implements Unmarshaller<Status_build_xpath_modelResult, JsonUnmarshallerContext> {

    public Status_build_xpath_modelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Status_build_xpath_modelResult status_build_xpath_modelResult = new Status_build_xpath_modelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return status_build_xpath_modelResult;
        }

        while (true) {
            if (token == null)
                break;

            status_build_xpath_modelResult.setJobStatus(JobStatusJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return status_build_xpath_modelResult;
    }

    private static Status_build_xpath_modelResultJsonUnmarshaller instance;

    public static Status_build_xpath_modelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Status_build_xpath_modelResultJsonUnmarshaller();
        return instance;
    }
}
