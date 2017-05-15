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
 * BotDatasetVersionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BotDatasetVersionMarshaller {

    private static final MarshallingInfo<String> APIKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("apikey").build();
    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> INPUTDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputdatabaseName").build();
    private static final MarshallingInfo<String> INPUTTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputtableName").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> OUTPUTDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputdatabaseName").build();
    private static final MarshallingInfo<String> OUTPUTTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputtableName").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("projectId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TARGETPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetPath").build();
    private static final MarshallingInfo<String> TARGETPATHOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetPathOutput").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();

    private static final BotDatasetVersionMarshaller instance = new BotDatasetVersionMarshaller();

    public static BotDatasetVersionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BotDatasetVersion botDatasetVersion, ProtocolMarshaller protocolMarshaller) {

        if (botDatasetVersion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(botDatasetVersion.getApikey(), APIKEY_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getId(), ID_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getInputdatabaseName(), INPUTDATABASENAME_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getInputtableName(), INPUTTABLENAME_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getName(), NAME_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getOutputdatabaseName(), OUTPUTDATABASENAME_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getOutputtableName(), OUTPUTTABLENAME_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getTargetPath(), TARGETPATH_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getTargetPathOutput(), TARGETPATHOUTPUT_BINDING);
            protocolMarshaller.marshall(botDatasetVersion.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
