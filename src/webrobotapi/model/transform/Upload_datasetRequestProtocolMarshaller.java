/**
 * null
 */
package webrobotapi.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import webrobotapi.ApiGatewayProtocolFactoryUploadImpl;
import webrobotapi.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Upload_datasetRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Upload_datasetRequestProtocolMarshaller implements Marshaller<Request<Upload_datasetRequest>, Upload_datasetRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/datasets/{projectId}/{botId}/upload/{attachmentName}/{length}").httpMethodName(HttpMethodName.POST)
            .hasExplicitPayloadMember(true).hasPayloadMembers(true).serviceName("webrobotapi").build();

    private final ApiGatewayProtocolFactoryUploadImpl protocolFactory;

    public Upload_datasetRequestProtocolMarshaller(ApiGatewayProtocolFactoryUploadImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<Upload_datasetRequest> marshall(Upload_datasetRequest upload_datasetRequest) {

        if (upload_datasetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<Upload_datasetRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    upload_datasetRequest);

            protocolMarshaller.startMarshalling();
            Upload_datasetRequestMarshaller.getInstance().marshall(upload_datasetRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
