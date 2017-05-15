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
 * Delete_bot_from_idResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_bot_from_idResultJsonUnmarshaller implements Unmarshaller<Delete_bot_from_idResult, JsonUnmarshallerContext> {

    public Delete_bot_from_idResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_bot_from_idResult delete_bot_from_idResult = new Delete_bot_from_idResult();

        return delete_bot_from_idResult;
    }

    private static Delete_bot_from_idResultJsonUnmarshaller instance;

    public static Delete_bot_from_idResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_bot_from_idResultJsonUnmarshaller();
        return instance;
    }
}
