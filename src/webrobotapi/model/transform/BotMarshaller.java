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
 * BotMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BotMarshaller {

    private static final MarshallingInfo<String> APIKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("apikey").build();
    private static final MarshallingInfo<String> CODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("code").build();
    private static final MarshallingInfo<String> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdTime").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("projectId").build();
    private static final MarshallingInfo<String> SPARQLSERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sparql_service").build();

    private static final BotMarshaller instance = new BotMarshaller();

    public static BotMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Bot bot, ProtocolMarshaller protocolMarshaller) {

        if (bot == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bot.getApikey(), APIKEY_BINDING);
            protocolMarshaller.marshall(bot.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(bot.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(bot.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(bot.getId(), ID_BINDING);
            protocolMarshaller.marshall(bot.getName(), NAME_BINDING);
            protocolMarshaller.marshall(bot.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(bot.getSparqlService(), SPARQLSERVICE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
