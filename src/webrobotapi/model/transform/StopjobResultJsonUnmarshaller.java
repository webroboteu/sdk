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
 * StopjobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopjobResultJsonUnmarshaller implements Unmarshaller<StopjobResult, JsonUnmarshallerContext> {

    public StopjobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StopjobResult stopjobResult = new StopjobResult();

        return stopjobResult;
    }

    private static StopjobResultJsonUnmarshaller instance;

    public static StopjobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopjobResultJsonUnmarshaller();
        return instance;
    }
}
