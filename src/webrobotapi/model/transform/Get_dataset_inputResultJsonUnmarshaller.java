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
 * Get_dataset_inputResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_inputResultJsonUnmarshaller implements Unmarshaller<Get_dataset_inputResult, JsonUnmarshallerContext> {

    public Get_dataset_inputResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_dataset_inputResult get_dataset_inputResult = new Get_dataset_inputResult();

        return get_dataset_inputResult;
    }

    private static Get_dataset_inputResultJsonUnmarshaller instance;

    public static Get_dataset_inputResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_dataset_inputResultJsonUnmarshaller();
        return instance;
    }
}
