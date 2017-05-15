
/**
 null
 */
package webrobotapi.model.transform;
import javax.annotation.Generated;
import com.amazonaws.SdkClientException;
import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;
import webrobotapi.model.Get_all_conceptsRequest;

/**
 * Get all conceptsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Get_all_conceptsRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId")
            .build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectId")
            .build();

    private static final Get_all_conceptsRequestMarshaller instance = new Get_all_conceptsRequestMarshaller();

    public static Get_all_conceptsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Get_all_conceptsRequest get_all_conceptsRequest, ProtocolMarshaller protocolMarshaller) {

        if (get_all_conceptsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(
                    get_all_conceptsRequest.getBotId(),
                    BOTID_BINDING);
            protocolMarshaller.marshall(
                    get_all_conceptsRequest.getProjectId(),
                    PROJECTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }
}
