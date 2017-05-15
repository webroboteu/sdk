package webrobotapi;

import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerImpl;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.opensdk.BaseRequest;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;

/**
 * Created by roger on 03/05/17.
 */


@ThreadSafe
@Immutable
public class WebrobotClientHandler extends SdkClientHandler {

    private String baseEndpoint;
    public WebrobotClientHandler(ClientHandlerParams handlerParams,String baseEndpoint) {
        super(handlerParams);
        this.baseEndpoint = baseEndpoint;
    }


}