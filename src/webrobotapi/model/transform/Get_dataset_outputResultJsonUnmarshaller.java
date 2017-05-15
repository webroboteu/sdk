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
 * Get_dataset_outputResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_outputResultJsonUnmarshaller implements Unmarshaller<Get_dataset_outputResult, JsonUnmarshallerContext> {

    public Get_dataset_outputResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_dataset_outputResult get_dataset_outputResult = new Get_dataset_outputResult();

        return get_dataset_outputResult;
    }

    private static Get_dataset_outputResultJsonUnmarshaller instance;

    public static Get_dataset_outputResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_dataset_outputResultJsonUnmarshaller();
        return instance;
    }
}
