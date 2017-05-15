/**
 * null
 */
package webrobotapi.model;

import java.io.InputStream;
import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_dataset_output" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_outputResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private InputStream inputStream;
    public InputStream getInputStream()
    {
        return inputStream;
    }
    public void setInputStream(InputStream inputStream)
    {
        this.inputStream = inputStream;
    }
    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_dataset_outputResult == false)
            return false;
        Get_dataset_outputResult other = (Get_dataset_outputResult) obj;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public Get_dataset_outputResult clone() {
        try {
            return (Get_dataset_outputResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
