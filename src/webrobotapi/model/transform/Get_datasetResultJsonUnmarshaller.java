/**
 * null
 */
package webrobotapi.model.transform;

import java.io.*;
import java.math.*;

import javax.annotation.Generated;

import org.apache.commons.io.IOUtils;
import webrobotapi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Get_datasetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_datasetResultJsonUnmarshaller implements Unmarshaller<Get_datasetResult, JsonUnmarshallerContext> {

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

    public Get_datasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_datasetResult get_datasetResult = new Get_datasetResult();

        return get_datasetResult;
    }

    private static Get_datasetResultJsonUnmarshaller instance;

    public static Get_datasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_datasetResultJsonUnmarshaller();
        return instance;
    }
}
