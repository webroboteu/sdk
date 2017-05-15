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
 * Delete_jobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_jobResultJsonUnmarshaller implements Unmarshaller<Delete_jobResult, JsonUnmarshallerContext> {

    public Delete_jobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_jobResult delete_jobResult = new Delete_jobResult();

        return delete_jobResult;
    }

    private static Delete_jobResultJsonUnmarshaller instance;

    public static Delete_jobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_jobResultJsonUnmarshaller();
        return instance;
    }
}
