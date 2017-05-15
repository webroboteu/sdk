/**
 * null
 */
package webrobotapi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import webrobotapi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Get_dataset_input_paginationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_input_paginationResultJsonUnmarshaller implements Unmarshaller<Get_dataset_input_paginationResult, JsonUnmarshallerContext> {

    public Get_dataset_input_paginationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_dataset_input_paginationResult get_dataset_input_paginationResult = new Get_dataset_input_paginationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_dataset_input_paginationResult;
        }

        while (true) {
            if (token == null)
                break;

            get_dataset_input_paginationResult.setArrayOfDatasetRecord(new ListUnmarshaller<DatasetRecord>(DatasetRecordJsonUnmarshaller.getInstance())
                    .unmarshall(context));
            token = context.nextToken();
        }

        return get_dataset_input_paginationResult;
    }

    private static Get_dataset_input_paginationResultJsonUnmarshaller instance;

    public static Get_dataset_input_paginationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_dataset_input_paginationResultJsonUnmarshaller();
        return instance;
    }
}
