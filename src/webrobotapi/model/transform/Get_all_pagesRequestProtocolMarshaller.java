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
 * Get_all_pagesRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Get_all_pagesRequestProtocolMarshaller implements Marshaller<Request<Get_all_pagesRequest>, Get_all_pagesRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/inductions/{projectId}/{botId}/concepts/{conceptId}/pages").httpMethodName(HttpMethodName.GET)
            .hasExplicitPayloadMember(false).hasPayloadMembers(false).serviceName("webrobotapi").build();

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory;

    public Get_all_pagesRequestProtocolMarshaller(com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<Get_all_pagesRequest> marshall(Get_all_pagesRequest get_all_pagesRequest) {

        if (get_all_pagesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<Get_all_pagesRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    get_all_pagesRequest);

            protocolMarshaller.startMarshalling();
            Get_all_pagesRequestMarshaller.getInstance().marshall(get_all_pagesRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
