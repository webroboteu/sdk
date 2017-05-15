/**
null
*/
package webrobotapi;

import java.io.*;
import java.net.URI;
import java.util.*;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.http.*;
import com.amazonaws.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.amazonaws.http.response.AwsResponseHandlerAdapter;
import com.amazonaws.internal.AmazonWebServiceRequestAdapter;
import com.amazonaws.internal.SdkBufferedInputStream;
import com.amazonaws.internal.ServiceEndpointBuilder;
import com.amazonaws.opensdk.SdkResponseMetadata;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;


import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.RuntimeHttpUtils;
import com.sun.jndi.toolkit.url.Uri;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.CoreProtocolPNames;
import webrobotapi.model.*;
import webrobotapi.model.transform.*;
import webrobotapi.webrobotapi;

/**
 * Client for accessing webrobotapi.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class webrobotapiClient implements webrobotapi {


    private ApiGatewayClientConfigurationFactory apiGatewayClientConfigurationFactory;

    /**
     @param status_build_xpath_modelRequest
     @return Result of the status_build_xpath_model operation returned by the service.
     @throws InternalServerErrorException
     @sample webrobotapi.status_build_xpath_model
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/status_build_xpath_model" target="_top">AWS API Documentation</a>*/
    @Override
    public Status_build_xpath_modelResult status_build_xpath_model(Status_build_xpath_modelRequest status_build_xpath_modelRequest) {
        HttpResponseHandler<Status_build_xpath_modelResult> responseHandler =
                protocolFactory.createResponseHandler(new JsonOperationMetadata()
                                .withPayloadJson(true)
                                .withHasStreamingSuccessResponse(false)
                        , new Status_build_xpath_modelResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class)
                        .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Status_build_xpath_modelRequest, Status_build_xpath_modelResult>()
                        .withMarshaller(    new Status_build_xpath_modelRequestProtocolMarshaller(protocolFactory)
                        )
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(status_build_xpath_modelRequest));
    }

    /**
     @param statusjobRequest
     @return Result of the statusjob operation returned by the service.
     @throws BadRequestException
     @throws InternalServerErrorException
     @sample webrobotapi.statusjob
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/statusjob" target="_top">AWS API Documentation</a>*/
    @Override
    public StatusjobResult statusjob(StatusjobRequest statusjobRequest) {
        HttpResponseHandler<StatusjobResult> responseHandler =
                protocolFactory.createResponseHandler(new JsonOperationMetadata()
                                .withPayloadJson(true)
                                .withHasStreamingSuccessResponse(false)
                        , new StatusjobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                        .withModeledClass(BadRequestException.class)
                        .withHttpStatusCode(400),
                new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class)
                        .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<StatusjobRequest, StatusjobResult>()
                        .withMarshaller(    new StatusjobRequestProtocolMarshaller(protocolFactory)
                        )
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(statusjobRequest));
    }

    /**
     @param stop_build_xpath_modelRequest
     @return Result of the stop_build_xpath_model operation returned by the service.
     @throws InternalServerErrorException
     @sample webrobotapi.stop_build_xpath_model
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/stop_build_xpath_model" target="_top">AWS API Documentation</a>*/
    @Override
    public Stop_build_xpath_modelResult stop_build_xpath_model(Stop_build_xpath_modelRequest stop_build_xpath_modelRequest) {
        HttpResponseHandler<Stop_build_xpath_modelResult> responseHandler =
                protocolFactory.createResponseHandler(new JsonOperationMetadata()
                                .withPayloadJson(true)
                                .withHasStreamingSuccessResponse(false)
                        , new Stop_build_xpath_modelResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class)
                        .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Stop_build_xpath_modelRequest, Stop_build_xpath_modelResult>()
                        .withMarshaller(    new Stop_build_xpath_modelRequestProtocolMarshaller(protocolFactory)
                        )
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(stop_build_xpath_modelRequest));
    }

    /**
     @param stopjobRequest
     @return Result of the stopjob operation returned by the service.
     @throws BadRequestException
     @throws InternalServerErrorException
     @sample webrobotapi.stopjob
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/stopjob" target="_top">AWS API Documentation</a>*/
    @Override
    public StopjobResult stopjob(StopjobRequest stopjobRequest) {
        HttpResponseHandler<StopjobResult> responseHandler =
                protocolFactory.createResponseHandler(new JsonOperationMetadata()
                                .withPayloadJson(true)
                                .withHasStreamingSuccessResponse(false)
                        , new StopjobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                        .withModeledClass(BadRequestException.class)
                        .withHttpStatusCode(400),
                new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class)
                        .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<StopjobRequest, StopjobResult>()
                        .withMarshaller(    new StopjobRequestProtocolMarshaller(protocolFactory)
                        )
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(stopjobRequest));
    }



    /**
     @param update_pageRequest
     @return Result of the update_page operation returned by the service.
     @throws InternalServerErrorException
     @sample webrobotapi.update_page
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/update_page" target="_top">AWS API Documentation</a>*/
    @Override
    public Update_pageResult update_page(Update_pageRequest update_pageRequest) {
        HttpResponseHandler<Update_pageResult> responseHandler =
                protocolFactory.createResponseHandler(new JsonOperationMetadata()
                                .withPayloadJson(true)
                                .withHasStreamingSuccessResponse(false)
                        , new Update_pageResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class)
                        .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Update_pageRequest, Update_pageResult>()
                        .withMarshaller(    new Update_pageRequestProtocolMarshaller(protocolFactory)
                        )
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(update_pageRequest));
    }


    private final WebrobotClientHandler clientHandler;

    private URI endpoint;
    private String apikey;

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(new JsonClientMetadata()
        .withProtocolVersion("1.1")
        .withSupportsCbor(false)
        .withSupportsIon(false)
        .withContentTypeOverride("application/json")
                .addErrorMetadata(new JsonErrorShapeMetadata()
                    .withErrorCode("InternalServerErrorException")
                    .withModeledClass(InternalServerErrorException.class))
                .addErrorMetadata(new JsonErrorShapeMetadata()
                    .withErrorCode("BadRequestException")
                    .withModeledClass(BadRequestException.class))
        .withBaseServiceExceptionClass(webrobotapiException.class)
        );


    private final ApiGatewayProtocolFactoryUploadImpl protocolFactoryUpload = new ApiGatewayProtocolFactoryUploadImpl(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .withContentTypeOverride("application/octet-stream")
            .addErrorMetadata(new JsonErrorShapeMetadata()
                    .withErrorCode("InternalServerErrorException")
                    .withModeledClass(InternalServerErrorException.class))
            .addErrorMetadata(new JsonErrorShapeMetadata()
                    .withErrorCode("BadRequestException")
                    .withModeledClass(BadRequestException.class))
            .withBaseServiceExceptionClass(webrobotapiException.class)
    );


    /**
     * Constructs a new client to invoke service methods on
     * webrobotapi using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientParams Object providing client parameters.
     */
    webrobotapiClient(AwsSyncClientParams clientParams,String endpoint,String apikey) {
        this.clientHandler = new WebrobotClientHandler(
            new ClientHandlerParams().withClientParams(clientParams),endpoint);
        try {
            this.endpoint = new URI(endpoint);
            this.apikey = apikey;
        }
        catch(Exception ex)
        {}
        this.apiGatewayClientConfigurationFactory = new ApiGatewayClientConfigurationFactory();

    }



    /**
     @param get_all_botsRequest
     @return Result of the get_all_bots operation returned by the service.
     @throws BadRequestException
     @throws InternalServerErrorException
     @sample webrobotapi.get_all_bots
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/get_all_bots" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_all_botsResult get_all_bots(Get_all_botsRequest get_all_botsRequest) {
        HttpResponseHandler<Get_all_botsResult> responseHandler =
                protocolFactory.createResponseHandler(new JsonOperationMetadata()
                                .withPayloadJson(true)
                                .withHasStreamingSuccessResponse(false)
                        , new Get_all_botsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                        .withModeledClass(BadRequestException.class)
                        .withHttpStatusCode(400),
                new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class)
                        .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_all_botsRequest, Get_all_botsResult>()
                        .withMarshaller(    new Get_all_botsRequestProtocolMarshaller(protocolFactory)
                        )
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_all_botsRequest));
    }

    /**
@param build_xpath_modelRequest 
@return Result of the build_xpath_model operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.build_xpath_model
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/build_xpath_model" target="_top">AWS API Documentation</a>*/
    @Override
    public Build_xpath_modelResult build_xpath_model(Build_xpath_modelRequest build_xpath_modelRequest) {
        HttpResponseHandler<Build_xpath_modelResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Build_xpath_modelResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Build_xpath_modelRequest, Build_xpath_modelResult>()
                        .withMarshaller(    new Build_xpath_modelRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(build_xpath_modelRequest));
    }

    /**
@param create_attributeRequest 
@return Result of the create_attribute operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.create_attribute
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_attribute" target="_top">AWS API Documentation</a>*/
    @Override
    public Create_attributeResult create_attribute(Create_attributeRequest create_attributeRequest) {
        HttpResponseHandler<Create_attributeResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Create_attributeResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Create_attributeRequest, Create_attributeResult>()
                        .withMarshaller(    new Create_attributeRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(create_attributeRequest));
    }

    /**
@param create_botRequest 
@return Result of the create_bot operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.create_bot
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_bot" target="_top">AWS API Documentation</a>*/
    @Override
    public Create_botResult create_bot(Create_botRequest create_botRequest) {
        HttpResponseHandler<Create_botResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Create_botResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Create_botRequest, Create_botResult>()
                        .withMarshaller(    new Create_botRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(create_botRequest));
    }

    /**
@param create_conceptRequest 
@return Result of the create_concept operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.create_concept
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_concept" target="_top">AWS API Documentation</a>*/
    @Override
    public Create_conceptResult create_concept(Create_conceptRequest create_conceptRequest) {
        HttpResponseHandler<Create_conceptResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Create_conceptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Create_conceptRequest, Create_conceptResult>()
                        .withMarshaller(    new Create_conceptRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(create_conceptRequest));
    }

    /**
@param create_jobRequest 
@return Result of the create_job operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.create_job
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_job" target="_top">AWS API Documentation</a>*/
    @Override
    public Create_jobResult create_job(Create_jobRequest create_jobRequest) {
        HttpResponseHandler<Create_jobResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Create_jobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Create_jobRequest, Create_jobResult>()
                        .withMarshaller(    new Create_jobRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(create_jobRequest));
    }

    /**
@param create_pageRequest 
@return Result of the create_page operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.create_page
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_page" target="_top">AWS API Documentation</a>*/
    @Override
    public Create_pageResult create_page(Create_pageRequest create_pageRequest) {
        HttpResponseHandler<Create_pageResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Create_pageResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Create_pageRequest, Create_pageResult>()
                        .withMarshaller(    new Create_pageRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(create_pageRequest));
    }

    /**
@param create_projectRequest 
@return Result of the create_project operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.create_project
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_project" target="_top">AWS API Documentation</a>*/
    @Override
    public Create_projectResult create_project(Create_projectRequest create_projectRequest) {
        HttpResponseHandler<Create_projectResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Create_projectResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Create_projectRequest, Create_projectResult>()
                        .withMarshaller(    new Create_projectRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(create_projectRequest));
    }

    /**
@param delete_attributeRequest 
@return Result of the delete_attribute operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_attribute
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_attribute" target="_top">AWS API Documentation</a>*/
    @Override
    public Delete_attributeResult delete_attribute(Delete_attributeRequest delete_attributeRequest) {
        HttpResponseHandler<Delete_attributeResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Delete_attributeResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Delete_attributeRequest, Delete_attributeResult>()
                        .withMarshaller(    new Delete_attributeRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(delete_attributeRequest));
    }

    /**
@param delete_bot_from_idRequest 
@return Result of the delete_bot_from_id operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_bot_from_id
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_bot_from_id" target="_top">AWS API Documentation</a>*/
    @Override
    public Delete_bot_from_idResult delete_bot_from_id(Delete_bot_from_idRequest delete_bot_from_idRequest) {
        HttpResponseHandler<Delete_bot_from_idResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Delete_bot_from_idResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Delete_bot_from_idRequest, Delete_bot_from_idResult>()
                        .withMarshaller(    new Delete_bot_from_idRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(delete_bot_from_idRequest));
    }

    /**
@param delete_conceptRequest 
@return Result of the delete_concept operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_concept
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_concept" target="_top">AWS API Documentation</a>*/
    @Override
    public Delete_conceptResult delete_concept(Delete_conceptRequest delete_conceptRequest) {
        HttpResponseHandler<Delete_conceptResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Delete_conceptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Delete_conceptRequest, Delete_conceptResult>()
                        .withMarshaller(    new Delete_conceptRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(delete_conceptRequest));
    }

    /**
@param delete_datasetRequest 
@return Result of the delete_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_dataset" target="_top">AWS API Documentation</a>*/
    @Override
    public Delete_datasetResult delete_dataset(Delete_datasetRequest delete_datasetRequest) {
        HttpResponseHandler<Delete_datasetResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Delete_datasetResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Delete_datasetRequest, Delete_datasetResult>()
                        .withMarshaller(    new Delete_datasetRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(delete_datasetRequest));
    }

    /**
@param delete_datasetset_versionRequest 
@return Result of the delete_datasetset_version operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_datasetset_version
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_datasetset_version" target="_top">AWS API Documentation</a>*/
    @Override
    public Delete_datasetset_versionResult delete_datasetset_version(Delete_datasetset_versionRequest delete_datasetset_versionRequest) {
        HttpResponseHandler<Delete_datasetset_versionResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Delete_datasetset_versionResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Delete_datasetset_versionRequest, Delete_datasetset_versionResult>()
                        .withMarshaller(    new Delete_datasetset_versionRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(delete_datasetset_versionRequest));
    }

    /**
@param delete_jobRequest 
@return Result of the delete_job operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_job
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_job" target="_top">AWS API Documentation</a>*/
    @Override
    public Delete_jobResult delete_job(Delete_jobRequest delete_jobRequest) {
        HttpResponseHandler<Delete_jobResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Delete_jobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Delete_jobRequest, Delete_jobResult>()
                        .withMarshaller(    new Delete_jobRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(delete_jobRequest));
    }

    /**
@param delete_pageRequest 
@return Result of the delete_page operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_page
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_page" target="_top">AWS API Documentation</a>*/
    @Override
    public Delete_pageResult delete_page(Delete_pageRequest delete_pageRequest) {
        HttpResponseHandler<Delete_pageResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Delete_pageResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Delete_pageRequest, Delete_pageResult>()
                        .withMarshaller(    new Delete_pageRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(delete_pageRequest));
    }

    /**
@param deleteprojectbyidRequest 
@return Result of the deleteprojectbyid operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.deleteprojectbyid
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/deleteprojectbyid" target="_top">AWS API Documentation</a>*/
    @Override
    public DeleteprojectbyidResult deleteprojectbyid(DeleteprojectbyidRequest deleteprojectbyidRequest) {
        HttpResponseHandler<DeleteprojectbyidResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new DeleteprojectbyidResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<DeleteprojectbyidRequest, DeleteprojectbyidResult>()
                        .withMarshaller(    new DeleteprojectbyidRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(deleteprojectbyidRequest));
    }

    /**
@param get all conceptsRequest 
@return Result of the get all concepts operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get all concepts
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get all concepts" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_all_conceptsResult get_all_concepts(Get_all_conceptsRequest get_all_conceptsRequest) {
        HttpResponseHandler<Get_all_conceptsResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_all_conceptsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_all_conceptsRequest, Get_all_conceptsResult>()
                        .withMarshaller(    new Get_all_conceptsRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_all_conceptsRequest));
    }

    /**
@param get_all_attributesRequest 
@return Result of the get_all_attributes operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_all_attributes
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_attributes" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_all_attributesResult get_all_attributes(Get_all_attributesRequest get_all_attributesRequest) {
        HttpResponseHandler<Get_all_attributesResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_all_attributesResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_all_attributesRequest, Get_all_attributesResult>()
                        .withMarshaller(    new Get_all_attributesRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_all_attributesRequest));
    }

    /**
@param get_all_datasetRequest 
@return Result of the get_all_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_all_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_dataset" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_all_datasetResult get_all_dataset(Get_all_datasetRequest get_all_datasetRequest) {
        HttpResponseHandler<Get_all_datasetResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_all_datasetResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_all_datasetRequest, Get_all_datasetResult>()
                        .withMarshaller(    new Get_all_datasetRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_all_datasetRequest));
    }

    /**
@param get_all_dataset_versionRequest 
@return Result of the get_all_dataset_version operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_all_dataset_version
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_dataset_version" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_all_dataset_versionResult get_all_dataset_version(Get_all_dataset_versionRequest get_all_dataset_versionRequest) {
        HttpResponseHandler<Get_all_dataset_versionResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_all_dataset_versionResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_all_dataset_versionRequest, Get_all_dataset_versionResult>()
                        .withMarshaller(    new Get_all_dataset_versionRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_all_dataset_versionRequest));
    }

    /**
@param get_all_pagesRequest 
@return Result of the get_all_pages operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_all_pages
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_pages" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_all_pagesResult get_all_pages(Get_all_pagesRequest get_all_pagesRequest) {
        HttpResponseHandler<Get_all_pagesResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_all_pagesResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_all_pagesRequest, Get_all_pagesResult>()
                        .withMarshaller(    new Get_all_pagesRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_all_pagesRequest));
    }

    /**
@param get_all_projectsRequest 
@return Result of the get_all_projects operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_all_projects
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_projects" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_all_projectsResult get_all_projects(Get_all_projectsRequest get_all_projectsRequest) {
        HttpResponseHandler<Get_all_projectsResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_all_projectsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_all_projectsRequest, Get_all_projectsResult>()
                        .withMarshaller(    new Get_all_projectsRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_all_projectsRequest));
    }

    /**
@param get_all_versionsetRequest 
@return Result of the get_all_versionset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_all_versionset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_versionset" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_all_versionsetResult get_all_versionset(Get_all_versionsetRequest get_all_versionsetRequest) {
        HttpResponseHandler<Get_all_versionsetResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_all_versionsetResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_all_versionsetRequest, Get_all_versionsetResult>()
                        .withMarshaller(    new Get_all_versionsetRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_all_versionsetRequest));
    }

    /**
@param get_attributeRequest 
@return Result of the get_attribute operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_attribute
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_attribute" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_attributeResult get_attribute(Get_attributeRequest get_attributeRequest) {
        HttpResponseHandler<Get_attributeResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_attributeResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_attributeRequest, Get_attributeResult>()
                        .withMarshaller(    new Get_attributeRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_attributeRequest));
    }

    /**
@param get_bot_from_idRequest 
@return Result of the get_bot_from_id operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_bot_from_id
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_bot_from_id" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_bot_from_idResult get_bot_from_id(Get_bot_from_idRequest get_bot_from_idRequest) {
        HttpResponseHandler<Get_bot_from_idResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_bot_from_idResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_bot_from_idRequest, Get_bot_from_idResult>()
                        .withMarshaller(    new Get_bot_from_idRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_bot_from_idRequest));
    }

    /**
@param get_bot_from_nameRequest 
@return Result of the get_bot_from_name operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_bot_from_name
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_bot_from_name" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_bot_from_nameResult get_bot_from_name(Get_bot_from_nameRequest get_bot_from_nameRequest) {
        HttpResponseHandler<Get_bot_from_nameResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_bot_from_nameResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_bot_from_nameRequest, Get_bot_from_nameResult>()
                        .withMarshaller(    new Get_bot_from_nameRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_bot_from_nameRequest));
    }

    /**
@param get_conceptRequest 
@return Result of the get_concept operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_concept
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_concept" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_conceptResult get_concept(Get_conceptRequest get_conceptRequest) {
        HttpResponseHandler<Get_conceptResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_conceptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_conceptRequest, Get_conceptResult>()
                        .withMarshaller(    new Get_conceptRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_conceptRequest));
    }


    // convert InputStream to String
    private static String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();

    }

    /**
@param get_datasetRequest 
@return Result of the get_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_datasetResult get_dataset(Get_datasetRequest get_datasetRequest)
    {
        Get_datasetRequestProtocolMarshaller marshaller =  new Get_datasetRequestProtocolMarshaller(protocolFactory);
        Request<Get_datasetRequest> request = marshaller.marshall(get_datasetRequest);
        request.setEndpoint(this.endpoint);
        String myendpoint =  request.getEndpoint().toString().substring(0,request.getEndpoint().toString().length()-1) + request.getResourcePath();
        CloseableHttpClient client = HttpClients.createDefault();
        Get_datasetResult datasetResult = new Get_datasetResult();
        HttpResponseHandler<AmazonWebServiceResponse<String>> responseHandler = new HttpResponseHandler<AmazonWebServiceResponse<String>>() {
            @Override
            public AmazonWebServiceResponse<String> handle(HttpResponse response) throws Exception {
                AmazonWebServiceResponse<String> awsResponse = new AmazonWebServiceResponse<String>();
                awsResponse.setResult("ok");
                return awsResponse;
            }
            @Override
            public boolean needsConnectionLeftOpen() {
                return true;
            }
        };
        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );
        request.setEndpoint(this.endpoint);
        request.addHeader("x-api-key",this.apikey);
        AmazonHttpClient amazonclient = new AmazonHttpClient(this.apiGatewayClientConfigurationFactory.getConfig().withConnectionTimeout(100000));
        HttpResponse response = amazonclient.requestExecutionBuilder()
                .request(request)
                .errorResponseHandler(errorResponseHandler)
                .execute(responseHandler).getHttpResponse();
        datasetResult.setInputStream(response.getContent());
        return datasetResult;
    }


    /**
@param get_dataset_datasetRequest 
@return Result of the get_dataset_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_dataset" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_dataset_datasetResult get_dataset_dataset(Get_dataset_datasetRequest get_dataset_datasetRequest) {
        HttpResponseHandler<Get_dataset_datasetResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_dataset_datasetResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_dataset_datasetRequest, Get_dataset_datasetResult>()
                        .withMarshaller(    new Get_dataset_datasetRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_dataset_datasetRequest));
    }

    /**
@param get_dataset_inputRequest 
@return Result of the get_dataset_input operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_input
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_input" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_dataset_inputResult get_dataset_input(Get_dataset_inputRequest get_dataset_inputRequest) {

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );
        Get_dataset_inputRequestProtocolMarshaller marshaller =  new Get_dataset_inputRequestProtocolMarshaller(protocolFactory);
        Request<Get_dataset_inputRequest> request = marshaller.marshall(get_dataset_inputRequest);
        request.setEndpoint(this.endpoint);
        Get_dataset_inputResult datasetResult = new Get_dataset_inputResult();
        HttpResponseHandler<AmazonWebServiceResponse<String>> responseHandler = new HttpResponseHandler<AmazonWebServiceResponse<String>>() {
            @Override
            public AmazonWebServiceResponse<String> handle(HttpResponse response) throws Exception {
                AmazonWebServiceResponse<String> awsResponse = new AmazonWebServiceResponse<String>();
                awsResponse.setResult("ok");
                return awsResponse;
            }
            @Override
            public boolean needsConnectionLeftOpen() {
                return true;
            }
        };

        request.setEndpoint(this.endpoint);
        request.addHeader("x-api-key",this.apikey);
        AmazonHttpClient amazonclient = new AmazonHttpClient(this.apiGatewayClientConfigurationFactory.getConfig().withConnectionTimeout(100000));
        HttpResponse response = amazonclient.requestExecutionBuilder()
                .request(request)
                .errorResponseHandler(errorResponseHandler)
                .execute(responseHandler).getHttpResponse();
        datasetResult.setInputStream(response.getContent());
        return datasetResult;
    }

    /**
@param get_dataset_input_paginationRequest 
@return Result of the get_dataset_input_pagination operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_input_pagination
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_input_pagination" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_dataset_input_paginationResult get_dataset_input_pagination(Get_dataset_input_paginationRequest get_dataset_input_paginationRequest) {
        HttpResponseHandler<Get_dataset_input_paginationResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_dataset_input_paginationResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_dataset_input_paginationRequest, Get_dataset_input_paginationResult>()
                        .withMarshaller(    new Get_dataset_input_paginationRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_dataset_input_paginationRequest));
    }

    /**
@param get_dataset_outputRequest 
@return Result of the get_dataset_output operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_output
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_output" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_dataset_outputResult get_dataset_output(Get_dataset_outputRequest get_dataset_outputRequest)
    {
        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );
        Get_dataset_outputRequestProtocolMarshaller marshaller =  new Get_dataset_outputRequestProtocolMarshaller(protocolFactory);
        Request<Get_dataset_outputRequest> request = marshaller.marshall(get_dataset_outputRequest);
        request.setEndpoint(this.endpoint);
        Get_dataset_outputResult datasetResult = new Get_dataset_outputResult();
        HttpResponseHandler<AmazonWebServiceResponse<String>> responseHandler = new HttpResponseHandler<AmazonWebServiceResponse<String>>() {
            @Override
            public AmazonWebServiceResponse<String> handle(HttpResponse response) throws Exception {
                AmazonWebServiceResponse<String> awsResponse = new AmazonWebServiceResponse<String>();
                awsResponse.setResult("ok");
                return awsResponse;
            }
            @Override
            public boolean needsConnectionLeftOpen() {
                return true;
            }
        };

        request.setEndpoint(this.endpoint);
        request.addHeader("x-api-key",this.apikey);
        AmazonHttpClient amazonclient = new AmazonHttpClient(this.apiGatewayClientConfigurationFactory.getConfig().withConnectionTimeout(100000));
        HttpResponse response = amazonclient.requestExecutionBuilder()
                .request(request)
                .errorResponseHandler(errorResponseHandler)
                .execute(responseHandler).getHttpResponse();
        datasetResult.setInputStream(response.getContent());
        return datasetResult;

    }

    /**
@param get_dataset_output_paginationRequest 
@return Result of the get_dataset_output_pagination operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_output_pagination
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_output_pagination" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_dataset_output_paginationResult get_dataset_output_pagination(Get_dataset_output_paginationRequest get_dataset_output_paginationRequest) {
        HttpResponseHandler<Get_dataset_output_paginationResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_dataset_output_paginationResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_dataset_output_paginationRequest, Get_dataset_output_paginationResult>()
                        .withMarshaller(    new Get_dataset_output_paginationRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_dataset_output_paginationRequest));
    }

    /**
@param get_dataset_paginationRequest 
@return Result of the get_dataset_pagination operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_pagination
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_pagination" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_dataset_paginationResult get_dataset_pagination(Get_dataset_paginationRequest get_dataset_paginationRequest) {
        HttpResponseHandler<Get_dataset_paginationResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_dataset_paginationResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_dataset_paginationRequest, Get_dataset_paginationResult>()
                        .withMarshaller(    new Get_dataset_paginationRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_dataset_paginationRequest));
    }

    /**
@param get_dataset_statusRequest 
@return Result of the get_dataset_status operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_status
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_status" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_dataset_statusResult get_dataset_status(Get_dataset_statusRequest get_dataset_statusRequest) {
        HttpResponseHandler<Get_dataset_statusResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_dataset_statusResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_dataset_statusRequest, Get_dataset_statusResult>()
                        .withMarshaller(    new Get_dataset_statusRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_dataset_statusRequest));
    }

    /**
@param get_job_by_idRequest 
@return Result of the get_job_by_id operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_job_by_id
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_job_by_id" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_job_by_idResult get_job_by_id(Get_job_by_idRequest get_job_by_idRequest) {
        HttpResponseHandler<Get_job_by_idResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_job_by_idResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_job_by_idRequest, Get_job_by_idResult>()
                        .withMarshaller(    new Get_job_by_idRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_job_by_idRequest));
    }

    /**
@param get_pageRequest 
@return Result of the get_page operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_page
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_page" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_pageResult get_page(Get_pageRequest get_pageRequest) {
        HttpResponseHandler<Get_pageResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_pageResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_pageRequest, Get_pageResult>()
                        .withMarshaller(    new Get_pageRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_pageRequest));
    }

    /**
@param get_project_by_idRequest 
@return Result of the get_project_by_id operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_project_by_id
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_project_by_id" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_project_by_idResult get_project_by_id(Get_project_by_idRequest get_project_by_idRequest) {
        HttpResponseHandler<Get_project_by_idResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_project_by_idResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_project_by_idRequest, Get_project_by_idResult>()
                        .withMarshaller(    new Get_project_by_idRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_project_by_idRequest));
    }

    /**
@param get_project_by_nameRequest 
@return Result of the get_project_by_name operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_project_by_name
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_project_by_name" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_project_by_nameResult get_project_by_name(Get_project_by_nameRequest get_project_by_nameRequest) {
        HttpResponseHandler<Get_project_by_nameResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_project_by_nameResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_project_by_nameRequest, Get_project_by_nameResult>()
                        .withMarshaller(    new Get_project_by_nameRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_project_by_nameRequest));
    }

    /**
@param get_version_setRequest 
@return Result of the get_version_set operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_version_set
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_version_set" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_version_setResult get_version_set(Get_version_setRequest get_version_setRequest) {
        HttpResponseHandler<Get_version_setResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_version_setResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_version_setRequest, Get_version_setResult>()
                        .withMarshaller(    new Get_version_setRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_version_setRequest));
    }

    /**
@param get_version_set_from_versionRequest 
@return Result of the get_version_set_from_version operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_version_set_from_version
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_version_set_from_version" target="_top">AWS API Documentation</a>*/
    @Override
    public Get_version_set_from_versionResult get_version_set_from_version(Get_version_set_from_versionRequest get_version_set_from_versionRequest) {
        HttpResponseHandler<Get_version_set_from_versionResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Get_version_set_from_versionResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Get_version_set_from_versionRequest, Get_version_set_from_versionResult>()
                        .withMarshaller(    new Get_version_set_from_versionRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(get_version_set_from_versionRequest));
    }

    /**
@param listing_jobsRequest 
@return Result of the listing_jobs operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.listing_jobs
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/listing_jobs" target="_top">AWS API Documentation</a>*/
    @Override
    public Listing_jobsResult listing_jobs(Listing_jobsRequest listing_jobsRequest) {
        HttpResponseHandler<Listing_jobsResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Listing_jobsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Listing_jobsRequest, Listing_jobsResult>()
                        .withMarshaller(    new Listing_jobsRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(listing_jobsRequest));
    }

    /**
@param startjobRequest 
@return Result of the startjob operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.startjob
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/startjob" target="_top">AWS API Documentation</a>*/
    @Override
    public StartjobResult startjob(StartjobRequest startjobRequest) {
        HttpResponseHandler<StartjobResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new StartjobResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<StartjobRequest, StartjobResult>()
                        .withMarshaller(    new StartjobRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(startjobRequest));
    }

    /**
@param update_attributeRequest 
@return Result of the update_attribute operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.update_attribute
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/update_attribute" target="_top">AWS API Documentation</a>*/
    @Override
    public Update_attributeResult update_attribute(Update_attributeRequest update_attributeRequest) {
        HttpResponseHandler<Update_attributeResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Update_attributeResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Update_attributeRequest, Update_attributeResult>()
                        .withMarshaller(    new Update_attributeRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(update_attributeRequest));
    }

    /**
@param update_botRequest 
@return Result of the update_bot operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.update_bot
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/update_bot" target="_top">AWS API Documentation</a>*/
    @Override
    public Update_botResult update_bot(Update_botRequest update_botRequest) {
        HttpResponseHandler<Update_botResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Update_botResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(BadRequestException.class)
                    .withHttpStatusCode(400), 
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Update_botRequest, Update_botResult>()
                        .withMarshaller(    new Update_botRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(update_botRequest));
    }

    /**
@param update_conceptRequest 
@return Result of the update_concept operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.update_concept
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/update_concept" target="_top">AWS API Documentation</a>*/
    @Override
    public Update_conceptResult update_concept(Update_conceptRequest update_conceptRequest) {
        HttpResponseHandler<Update_conceptResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Update_conceptResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Update_conceptRequest, Update_conceptResult>()
                        .withMarshaller(    new Update_conceptRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(update_conceptRequest));
    }

    /**
     @param upload_datasetRequest
     @return Result of the upload_dataset operation returned by the service.
     @throws InternalServerErrorException
     @sample webrobotapi.upload_dataset
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/upload_dataset" target="_top">AWS API Documentation</a>*/
    @Override
    public Upload_datasetResult upload_dataset(Upload_datasetRequest upload_datasetRequest) {
        HttpResponseHandler<Upload_datasetResult> responseHandler =
                protocolFactoryUpload.createResponseHandler(new JsonOperationMetadata()
                                .withPayloadJson(true)
                                .withHasStreamingSuccessResponse(false)
                        , new Upload_datasetResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class)
                        .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Upload_datasetRequest, Upload_datasetResult>()
                        .withMarshaller(    new Upload_datasetRequestProtocolMarshaller(protocolFactoryUpload)
                        )
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(upload_datasetRequest));
    }


    /**
@param uplod_datasetRequest 
@return Result of the uplod_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.uplod_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/uplod_dataset" target="_top">AWS API Documentation</a>*/
    @Override
    public Uplod_datasetResult uplod_dataset(Uplod_datasetRequest uplod_datasetRequest) {
        HttpResponseHandler<Uplod_datasetResult> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true)
                .withHasStreamingSuccessResponse(false)
            , new Uplod_datasetResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata()
                    .withModeledClass(InternalServerErrorException.class)
                    .withHttpStatusCode(500)
        );

        return clientHandler.execute(
                new ClientExecutionParams<Uplod_datasetRequest, Uplod_datasetResult>()
                        .withMarshaller(    new Uplod_datasetRequestProtocolMarshaller(protocolFactory)
)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(uplod_datasetRequest));
    }

    /**
     * Create the error response handler for the operation.
     * @param errorShapeMetadata Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(
            JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata()
                                                                  .withErrorShapes(Arrays.asList(
                                                                          errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
