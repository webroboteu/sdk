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
 * Delete_attributeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_attributeResultJsonUnmarshaller implements Unmarshaller<Delete_attributeResult, JsonUnmarshallerContext> {

    public Delete_attributeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_attributeResult delete_attributeResult = new Delete_attributeResult();

        return delete_attributeResult;
    }

    private static Delete_attributeResultJsonUnmarshaller instance;

    public static Delete_attributeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_attributeResultJsonUnmarshaller();
        return instance;
    }
}
