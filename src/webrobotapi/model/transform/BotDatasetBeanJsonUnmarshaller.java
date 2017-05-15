/**
 * null
 */
package webrobotapi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import webrobotapi.DataType;
import webrobotapi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BotDatasetBean JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotDatasetBeanJsonUnmarshaller implements Unmarshaller<BotDatasetBean, JsonUnmarshallerContext> {

    public BotDatasetBean unmarshall(JsonUnmarshallerContext context) throws Exception {
        BotDatasetBean botDatasetBean = new BotDatasetBean();

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
                if (context.testExpression("attachmentName", targetDepth)) {
                    context.nextToken();
                    botDatasetBean.setAttachmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("comments", targetDepth)) {
                    context.nextToken();
                    botDatasetBean.setComments(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("containsHeader", targetDepth)) {
                    context.nextToken();
                    botDatasetBean.setContainsHeader(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("dataSourceType", targetDepth)) {
                    context.nextToken();

                   String dataSourceType = context.getUnmarshaller(String.class).unmarshall(context);
                    if(dataSourceType == "s3")
                        botDatasetBean.setDataSourceType(DataSourceType.S3);
                    else
                        botDatasetBean.setDataSourceType(DataSourceType.S3);
                }
                if (context.testExpression("dataTargetType", targetDepth)) {
                    context.nextToken();
                    String dataTargetType = context.getUnmarshaller(String.class).unmarshall(context);
                    if(dataTargetType == "s3")
                        botDatasetBean.setDataTargetType(DataTargetType.S3);
                    else
                        botDatasetBean.setDataTargetType(DataTargetType.S3);
                }
                if (context.testExpression("dataType", targetDepth)) {
                    context.nextToken();
                    String dataType = context.getUnmarshaller(String.class).unmarshall(context);
                    if(dataType == "csv")
                        botDatasetBean.setDataType(DataType.CSV);
                    else
                        botDatasetBean.setDataType(DataType.CSV);
                }
                if (context.testExpression("firstline", targetDepth)) {
                    context.nextToken();
                    botDatasetBean.setFirstline(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    botDatasetBean.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    botDatasetBean.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return botDatasetBean;
    }

    private static BotDatasetBeanJsonUnmarshaller instance;

    public static BotDatasetBeanJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BotDatasetBeanJsonUnmarshaller();
        return instance;
    }
}
