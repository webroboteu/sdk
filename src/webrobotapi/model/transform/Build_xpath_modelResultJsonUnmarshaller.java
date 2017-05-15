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
 * Build_xpath_modelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Build_xpath_modelResultJsonUnmarshaller implements Unmarshaller<Build_xpath_modelResult, JsonUnmarshallerContext> {

    public Build_xpath_modelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Build_xpath_modelResult build_xpath_modelResult = new Build_xpath_modelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return build_xpath_modelResult;
        }

        while (true) {
            if (token == null)
                break;

            build_xpath_modelResult.setJobId(JobIdJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return build_xpath_modelResult;
    }

    private static Build_xpath_modelResultJsonUnmarshaller instance;

    public static Build_xpath_modelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Build_xpath_modelResultJsonUnmarshaller();
        return instance;
    }
}
