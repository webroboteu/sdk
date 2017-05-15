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
 * Delete_bot_from_idRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Delete_bot_from_idRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectId").build();

    private static final Delete_bot_from_idRequestMarshaller instance = new Delete_bot_from_idRequestMarshaller();

    public static Delete_bot_from_idRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Delete_bot_from_idRequest delete_bot_from_idRequest, ProtocolMarshaller protocolMarshaller) {

        if (delete_bot_from_idRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(delete_bot_from_idRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(delete_bot_from_idRequest.getProjectId(), PROJECTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
