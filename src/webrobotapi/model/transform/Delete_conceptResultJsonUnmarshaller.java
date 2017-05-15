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
 * Delete_conceptResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_conceptResultJsonUnmarshaller implements Unmarshaller<Delete_conceptResult, JsonUnmarshallerContext> {

    public Delete_conceptResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_conceptResult delete_conceptResult = new Delete_conceptResult();

        return delete_conceptResult;
    }

    private static Delete_conceptResultJsonUnmarshaller instance;

    public static Delete_conceptResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_conceptResultJsonUnmarshaller();
        return instance;
    }
}
