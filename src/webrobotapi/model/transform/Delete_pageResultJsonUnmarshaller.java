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
 * Delete_pageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_pageResultJsonUnmarshaller implements Unmarshaller<Delete_pageResult, JsonUnmarshallerContext> {

    public Delete_pageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_pageResult delete_pageResult = new Delete_pageResult();

        return delete_pageResult;
    }

    private static Delete_pageResultJsonUnmarshaller instance;

    public static Delete_pageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_pageResultJsonUnmarshaller();
        return instance;
    }
}
