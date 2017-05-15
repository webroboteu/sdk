/**
 * null
 */
package webrobotapi.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import webrobotapi.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

import java.io.InputStream;

/**
 * Upload_datasetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Upload_datasetRequestMarshaller {

    private static final MarshallingInfo<String> ATTACHMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("attachmentName").build();
    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> LENGTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("length").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectId").build();

    private static final MarshallingInfo<InputStream> INPUT_STREAM = MarshallingInfo.builder(MarshallingType.STREAM)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();

    private static final Upload_datasetRequestMarshaller instance = new Upload_datasetRequestMarshaller();

    public static Upload_datasetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Upload_datasetRequest upload_datasetRequest, ProtocolMarshaller protocolMarshaller) {

        if (upload_datasetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(upload_datasetRequest.getAttachmentName(), ATTACHMENTNAME_BINDING);
            protocolMarshaller.marshall(upload_datasetRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(upload_datasetRequest.getLength(), LENGTH_BINDING);
            protocolMarshaller.marshall(upload_datasetRequest.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(upload_datasetRequest.getInputstream(), INPUT_STREAM);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
