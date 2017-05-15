package webrobotapi;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.util.IOUtils;

public class DummyHandler<T> implements HttpResponseHandler<T> {
    private final T preCannedResponse;
    public DummyHandler(T preCannedResponse) { this.preCannedResponse = preCannedResponse; }

    @Override
    public T handle(HttpResponse response) throws Exception {
        System.out.println(IOUtils.toString(response.getContent()));
        return preCannedResponse;
    }

    @Override
    public boolean needsConnectionLeftOpen() { return false; }
}