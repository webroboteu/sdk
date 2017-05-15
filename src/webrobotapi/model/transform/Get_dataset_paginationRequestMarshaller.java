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
 * Get_dataset_paginationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Get_dataset_paginationRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<String> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("limit").build();
    private static final MarshallingInfo<String> OFFSET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("offset").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectId").build();
    private static final MarshallingInfo<String> VERSIONSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("versionsetId").build();

    private static final Get_dataset_paginationRequestMarshaller instance = new Get_dataset_paginationRequestMarshaller();

    public static Get_dataset_paginationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Get_dataset_paginationRequest get_dataset_paginationRequest, ProtocolMarshaller protocolMarshaller) {

        if (get_dataset_paginationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(get_dataset_paginationRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(get_dataset_paginationRequest.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(get_dataset_paginationRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(get_dataset_paginationRequest.getOffset(), OFFSET_BINDING);
            protocolMarshaller.marshall(get_dataset_paginationRequest.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(get_dataset_paginationRequest.getVersionsetId(), VERSIONSETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
