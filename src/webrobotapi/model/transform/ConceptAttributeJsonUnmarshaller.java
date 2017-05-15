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
 * ConceptAttribute JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConceptAttributeJsonUnmarshaller implements Unmarshaller<ConceptAttribute, JsonUnmarshallerContext> {

    public ConceptAttribute unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConceptAttribute conceptAttribute = new ConceptAttribute();

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
                    conceptAttribute.setApikey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isRelaxedXpath", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setIsRelaxedXpath(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("label", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("multipleValues", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setMultipleValues(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regexp", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setRegexp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resultXPath", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setResultXPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sparqlQuery", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setSparqlQuery(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uri", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("withRegexp", targetDepth)) {
                    context.nextToken();
                    conceptAttribute.setWithRegexp(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return conceptAttribute;
    }

    private static ConceptAttributeJsonUnmarshaller instance;

    public static ConceptAttributeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConceptAttributeJsonUnmarshaller();
        return instance;
    }
}
