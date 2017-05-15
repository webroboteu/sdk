/**
 * null
 */
package webrobotapi.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import webrobotapi.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Delete_datasetset_versionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Delete_datasetset_versionRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectId").build();
    private static final MarshallingInfo<String> VERSIONSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("versionsetId").build();

    private static final Delete_datasetset_versionRequestMarshaller instance = new Delete_datasetset_versionRequestMarshaller();

    public static Delete_datasetset_versionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Delete_datasetset_versionRequest delete_datasetset_versionRequest, ProtocolMarshaller protocolMarshaller) {

        if (delete_datasetset_versionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(delete_datasetset_versionRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(delete_datasetset_versionRequest.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(delete_datasetset_versionRequest.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(delete_datasetset_versionRequest.getVersionsetId(), VERSIONSETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
