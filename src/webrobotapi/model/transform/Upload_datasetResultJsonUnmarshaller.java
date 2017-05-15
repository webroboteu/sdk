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
 * Upload_datasetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Upload_datasetResultJsonUnmarshaller implements Unmarshaller<Upload_datasetResult, JsonUnmarshallerContext> {

    public Upload_datasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Upload_datasetResult upload_datasetResult = new Upload_datasetResult();

        return upload_datasetResult;
    }

    private static Upload_datasetResultJsonUnmarshaller instance;

    public static Upload_datasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Upload_datasetResultJsonUnmarshaller();
        return instance;
    }
}
