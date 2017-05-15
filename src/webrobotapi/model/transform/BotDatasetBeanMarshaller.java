/**
 * null
 */
package webrobotapi.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import webrobotapi.DataType;
import webrobotapi.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BotDatasetBeanMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BotDatasetBeanMarshaller {

    private static final MarshallingInfo<String> ATTACHMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attachmentName").build();
    private static final MarshallingInfo<String> COMMENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("comments").build();
    private static final MarshallingInfo<Boolean> CONTAINSHEADER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containsHeader").build();
    private static final MarshallingInfo<String> DATASOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSourceType").build();
    private static final MarshallingInfo<String> DATATARGETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataTargetType").build();
    private static final MarshallingInfo<String> DATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dataType").build();
    private static final MarshallingInfo<String> FIRSTLINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("firstline").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();

    private static final BotDatasetBeanMarshaller instance = new BotDatasetBeanMarshaller();

    public static BotDatasetBeanMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BotDatasetBean botDatasetBean, ProtocolMarshaller protocolMarshaller) {

        if (botDatasetBean == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {

            String datasourceType = "s3";
           if( botDatasetBean.getDataSourceType() == DataSourceType.S3)
               datasourceType = "s3";
            String dataTargetType = "s3";
            if( botDatasetBean.getDataTargetType() == DataTargetType.S3)
                dataTargetType = "s3";

            String dataType = "csv";
            if( botDatasetBean.getDataType() == DataType.CSV)
                dataType = "csv";

            protocolMarshaller.marshall(botDatasetBean.getAttachmentName(), ATTACHMENTNAME_BINDING);
            protocolMarshaller.marshall(botDatasetBean.getComments(), COMMENTS_BINDING);
            protocolMarshaller.marshall(botDatasetBean.getContainsHeader(), CONTAINSHEADER_BINDING);
            protocolMarshaller.marshall(datasourceType, DATASOURCETYPE_BINDING);
            protocolMarshaller.marshall(dataTargetType, DATATARGETTYPE_BINDING);
            protocolMarshaller.marshall(dataType, DATATYPE_BINDING);
            protocolMarshaller.marshall(botDatasetBean.getFirstline(), FIRSTLINE_BINDING);
            protocolMarshaller.marshall(botDatasetBean.getName(), NAME_BINDING);
            protocolMarshaller.marshall(botDatasetBean.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
