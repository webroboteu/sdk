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
 * Delete_datasetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_datasetResultJsonUnmarshaller implements Unmarshaller<Delete_datasetResult, JsonUnmarshallerContext> {

    public Delete_datasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_datasetResult delete_datasetResult = new Delete_datasetResult();

        return delete_datasetResult;
    }

    private static Delete_datasetResultJsonUnmarshaller instance;

    public static Delete_datasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_datasetResultJsonUnmarshaller();
        return instance;
    }
}
