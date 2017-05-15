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
 * DeleteprojectbyidResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteprojectbyidResultJsonUnmarshaller implements Unmarshaller<DeleteprojectbyidResult, JsonUnmarshallerContext> {

    public DeleteprojectbyidResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteprojectbyidResult deleteprojectbyidResult = new DeleteprojectbyidResult();

        return deleteprojectbyidResult;
    }

    private static DeleteprojectbyidResultJsonUnmarshaller instance;

    public static DeleteprojectbyidResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteprojectbyidResultJsonUnmarshaller();
        return instance;
    }
}
