/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_version_set" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_version_setResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private BotDatasetVersion botDatasetVersion;

    /**
     * @param botDatasetVersion
     */

    public void setBotDatasetVersion(BotDatasetVersion botDatasetVersion) {
        this.botDatasetVersion = botDatasetVersion;
    }

    /**
     * @return
     */

    public BotDatasetVersion getBotDatasetVersion() {
        return this.botDatasetVersion;
    }

    /**
     * @param botDatasetVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_version_setResult botDatasetVersion(BotDatasetVersion botDatasetVersion) {
        setBotDatasetVersion(botDatasetVersion);
        return this;
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
        if (getBotDatasetVersion() != null)
            sb.append("BotDatasetVersion: ").append(getBotDatasetVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_version_setResult == false)
            return false;
        Get_version_setResult other = (Get_version_setResult) obj;
        if (other.getBotDatasetVersion() == null ^ this.getBotDatasetVersion() == null)
            return false;
        if (other.getBotDatasetVersion() != null && other.getBotDatasetVersion().equals(this.getBotDatasetVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotDatasetVersion() == null) ? 0 : getBotDatasetVersion().hashCode());
        return hashCode;
    }

    @Override
    public Get_version_setResult clone() {
        try {
            return (Get_version_setResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
