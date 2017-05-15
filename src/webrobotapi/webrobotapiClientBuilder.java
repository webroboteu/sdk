/**
 * null
 */
package webrobotapi;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link webrobotapi.webrobotapi}.
 * 
 * @see webrobotapi.webrobotapi#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class webrobotapiClientBuilder extends SdkSyncClientBuilder<webrobotapiClientBuilder, webrobotapi> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("xda6xr3yi1.execute-api.ap-south-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "ap-south-1";
    private static String endpoint;
    private static String apikey;

    /**
     * Package private constructor - builder should be created via {@link webrobotapi#builder()}
     */
    webrobotapiClientBuilder(String apikey,String endpoint) {
        super(new ApiGatewayClientConfigurationFactory());
        this.setApiKey(apikey);
        this.setEndpoint(endpoint);
        this.endpoint = endpoint;
        this.apikey = apikey;
    }

    /**
     * Construct a synchronous implementation of webrobotapi using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of webrobotapi.
     */
    @Override
    protected webrobotapi build(AwsSyncClientParams params) {
        return new webrobotapiClient(params,this.endpoint,this.apikey);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
