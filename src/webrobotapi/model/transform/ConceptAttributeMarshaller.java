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
 * ConceptAttributeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConceptAttributeMarshaller {

    private static final MarshallingInfo<String> APIKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("apikey").build();
    private static final MarshallingInfo<String> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdTime").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<Boolean> ISRELAXEDXPATH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isRelaxedXpath").build();
    private static final MarshallingInfo<String> LABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("label").build();
    private static final MarshallingInfo<Boolean> MULTIPLEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("multipleValues").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("projectId").build();
    private static final MarshallingInfo<String> REGEXP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("regexp").build();
    private static final MarshallingInfo<String> RESULTXPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resultXPath").build();
    private static final MarshallingInfo<String> SPARQLQUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sparqlQuery").build();
    private static final MarshallingInfo<String> URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("uri").build();
    private static final MarshallingInfo<Boolean> WITHREGEXP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("withRegexp").build();

    private static final ConceptAttributeMarshaller instance = new ConceptAttributeMarshaller();

    public static ConceptAttributeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConceptAttribute conceptAttribute, ProtocolMarshaller protocolMarshaller) {

        if (conceptAttribute == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conceptAttribute.getApikey(), APIKEY_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getId(), ID_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getIsRelaxedXpath(), ISRELAXEDXPATH_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getLabel(), LABEL_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getMultipleValues(), MULTIPLEVALUES_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getName(), NAME_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getRegexp(), REGEXP_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getResultXPath(), RESULTXPATH_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getSparqlQuery(), SPARQLQUERY_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getUri(), URI_BINDING);
            protocolMarshaller.marshall(conceptAttribute.getWithRegexp(), WITHREGEXP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
