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
 * Bot JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotJsonUnmarshaller implements Unmarshaller<Bot, JsonUnmarshallerContext> {

    public Bot unmarshall(JsonUnmarshallerContext context) throws Exception {
        Bot bot = new Bot();

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
                    bot.setApikey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("code", targetDepth)) {
                    context.nextToken();
                    bot.setCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    bot.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    bot.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    bot.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    bot.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    bot.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sparql_service", targetDepth)) {
                    context.nextToken();
                    bot.setSparqlService(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return bot;
    }

    private static BotJsonUnmarshaller instance;

    public static BotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BotJsonUnmarshaller();
        return instance;
    }
}
