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
 * BotDatasetVersion JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotDatasetVersionJsonUnmarshaller implements Unmarshaller<BotDatasetVersion, JsonUnmarshallerContext> {

    public BotDatasetVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        BotDatasetVersion botDatasetVersion = new BotDatasetVersion();

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
                    botDatasetVersion.setApikey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetId", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setDatasetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputdatabaseName", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setInputdatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputtableName", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setInputtableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputdatabaseName", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setOutputdatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputtableName", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setOutputtableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetPath", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setTargetPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetPathOutput", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setTargetPathOutput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    botDatasetVersion.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return botDatasetVersion;
    }

    private static BotDatasetVersionJsonUnmarshaller instance;

    public static BotDatasetVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BotDatasetVersionJsonUnmarshaller();
        return instance;
    }
}
