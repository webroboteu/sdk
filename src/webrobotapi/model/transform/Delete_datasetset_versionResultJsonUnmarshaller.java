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
 * Delete_datasetset_versionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_datasetset_versionResultJsonUnmarshaller implements Unmarshaller<Delete_datasetset_versionResult, JsonUnmarshallerContext> {

    public Delete_datasetset_versionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_datasetset_versionResult delete_datasetset_versionResult = new Delete_datasetset_versionResult();

        return delete_datasetset_versionResult;
    }

    private static Delete_datasetset_versionResultJsonUnmarshaller instance;

    public static Delete_datasetset_versionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_datasetset_versionResultJsonUnmarshaller();
        return instance;
    }
}
