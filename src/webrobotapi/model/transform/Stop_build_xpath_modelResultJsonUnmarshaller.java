/**
 * null
 */
package webrobotapi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import webrobotapi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Stop_build_xpath_modelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Stop_build_xpath_modelResultJsonUnmarshaller implements Unmarshaller<Stop_build_xpath_modelResult, JsonUnmarshallerContext> {

    public Stop_build_xpath_modelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Stop_build_xpath_modelResult stop_build_xpath_modelResult = new Stop_build_xpath_modelResult();

        return stop_build_xpath_modelResult;
    }

    private static Stop_build_xpath_modelResultJsonUnmarshaller instance;

    public static Stop_build_xpath_modelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Stop_build_xpath_modelResultJsonUnmarshaller();
        return instance;
    }
}
