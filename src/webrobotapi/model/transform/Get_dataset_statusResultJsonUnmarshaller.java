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
 * Get_dataset_statusResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_statusResultJsonUnmarshaller implements Unmarshaller<Get_dataset_statusResult, JsonUnmarshallerContext> {

    public Get_dataset_statusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_dataset_statusResult get_dataset_statusResult = new Get_dataset_statusResult();

        return get_dataset_statusResult;
    }

    private static Get_dataset_statusResultJsonUnmarshaller instance;

    public static Get_dataset_statusResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_dataset_statusResultJsonUnmarshaller();
        return instance;
    }
}
