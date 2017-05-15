
/**
 null
 */
package webrobotapi.model.transform;
import javax.annotation.Generated;

import com.amazonaws.Request;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.protocol.OperationInfo;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.protocol.ProtocolRequestMarshaller;
import com.amazonaws.transform.Marshaller;
import webrobotapi.model.Get_all_conceptsRequest;

/**
 * Get all conceptsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Get_all_conceptsRequestProtocolMarshaller implements Marshaller<Request<Get_all_conceptsRequest>, Get_all_conceptsRequest> {

private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder()
        .protocol(Protocol.API_GATEWAY)
        .requestUri("/inductions/{projectId}/{botId}/concepts")
        .httpMethodName(HttpMethodName.GET)
        .hasExplicitPayloadMember(false)
        .hasPayloadMembers(false)
        .serviceName("webrobotapi")
        .build();

private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory;

public Get_all_conceptsRequestProtocolMarshaller(com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
        }

public Request<Get_all_conceptsRequest> marshall(Get_all_conceptsRequest get_all_conceptsRequest) {

        if (get_all_conceptsRequest == null) {
        throw new SdkClientException("Invalid argument passed to marshall(...)");
        }


        try {
final ProtocolRequestMarshaller<Get_all_conceptsRequest> protocolMarshaller =
        protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING, get_all_conceptsRequest);

        protocolMarshaller.startMarshalling();
        Get_all_conceptsRequestMarshaller.getInstance().marshall(get_all_conceptsRequest, protocolMarshaller);
        return protocolMarshaller.finishMarshalling();
        } catch(Exception e) {
        throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
        }


        }

