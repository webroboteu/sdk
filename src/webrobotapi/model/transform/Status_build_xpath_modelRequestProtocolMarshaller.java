/**
 * null
 */
package webrobotapi.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import webrobotapi.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Status_build_xpath_modelRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Status_build_xpath_modelRequestProtocolMarshaller implements Marshaller<Request<Status_build_xpath_modelRequest>, Status_build_xpath_modelRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/inductions/{projectId}/{botId}/wrapper/build/status/{id}").httpMethodName(HttpMethodName.POST)
            .hasExplicitPayloadMember(false).hasPayloadMembers(false).serviceName("webrobotapi").build();

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory;

    public Status_build_xpath_modelRequestProtocolMarshaller(com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<Status_build_xpath_modelRequest> marshall(Status_build_xpath_modelRequest status_build_xpath_modelRequest) {

        if (status_build_xpath_modelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<Status_build_xpath_modelRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(
                    SDK_OPERATION_BINDING, status_build_xpath_modelRequest);

            protocolMarshaller.startMarshalling();
            Status_build_xpath_modelRequestMarshaller.getInstance().marshall(status_build_xpath_modelRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
