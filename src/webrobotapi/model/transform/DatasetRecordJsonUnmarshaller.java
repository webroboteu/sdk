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
 * DatasetRecord JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetRecordJsonUnmarshaller implements Unmarshaller<DatasetRecord, JsonUnmarshallerContext> {

    public DatasetRecord unmarshall(JsonUnmarshallerContext context) throws Exception {
        DatasetRecord datasetRecord = new DatasetRecord();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("fields", targetDepth)) {
                    context.nextToken();
                    datasetRecord.setFields(new ListUnmarshaller<DatasetField>(DatasetFieldJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return datasetRecord;
    }

    private static DatasetRecordJsonUnmarshaller instance;

    public static DatasetRecordJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatasetRecordJsonUnmarshaller();
        return instance;
    }
}
