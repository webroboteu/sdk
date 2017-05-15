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
 * Page JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PageJsonUnmarshaller implements Unmarshaller<Page, JsonUnmarshallerContext> {

    public Page unmarshall(JsonUnmarshallerContext context) throws Exception {
        Page page = new Page();

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
                if (context.testExpression("apikey", targetDepth)) {
                    context.nextToken();
                    page.setApikey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    page.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("conceptId", targetDepth)) {
                    context.nextToken();
                    page.setConceptId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    page.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    page.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("query", targetDepth)) {
                    context.nextToken();
                    page.setQuery(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    page.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return page;
    }

    private static PageJsonUnmarshaller instance;

    public static PageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PageJsonUnmarshaller();
        return instance;
    }
}
