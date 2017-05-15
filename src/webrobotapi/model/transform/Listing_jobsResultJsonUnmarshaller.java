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
 * Listing_jobsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Listing_jobsResultJsonUnmarshaller implements Unmarshaller<Listing_jobsResult, JsonUnmarshallerContext> {

    public Listing_jobsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Listing_jobsResult listing_jobsResult = new Listing_jobsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listing_jobsResult;
        }

        while (true) {
            if (token == null)
                break;

            listing_jobsResult.setArrayOfJob(new ListUnmarshaller<Job>(JobJsonUnmarshaller.getInstance()).unmarshall(context));
            token = context.nextToken();
        }

        return listing_jobsResult;
    }

    private static Listing_jobsResultJsonUnmarshaller instance;

    public static Listing_jobsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Listing_jobsResultJsonUnmarshaller();
        return instance;
    }
}
