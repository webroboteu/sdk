/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_all_versionset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_versionsetResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private java.util.List<BotDatasetVersion> arrayOfBotDatasetVersion;

    /**
     * @return
     */

    public java.util.List<BotDatasetVersion> getArrayOfBotDatasetVersion() {
        return arrayOfBotDatasetVersion;
    }

    /**
     * @param arrayOfBotDatasetVersion
     */

    public void setArrayOfBotDatasetVersion(java.util.Collection<BotDatasetVersion> arrayOfBotDatasetVersion) {
        if (arrayOfBotDatasetVersion == null) {
            this.arrayOfBotDatasetVersion = null;
            return;
        }

        this.arrayOfBotDatasetVersion = new java.util.ArrayList<BotDatasetVersion>(arrayOfBotDatasetVersion);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayOfBotDatasetVersion(java.util.Collection)} or
     * {@link #withArrayOfBotDatasetVersion(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param arrayOfBotDatasetVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_versionsetResult arrayOfBotDatasetVersion(BotDatasetVersion... arrayOfBotDatasetVersion) {
        if (this.arrayOfBotDatasetVersion == null) {
            setArrayOfBotDatasetVersion(new java.util.ArrayList<BotDatasetVersion>(arrayOfBotDatasetVersion.length));
        }
        for (BotDatasetVersion ele : arrayOfBotDatasetVersion) {
            this.arrayOfBotDatasetVersion.add(ele);
        }
        return this;
    }

    /**
     * @param arrayOfBotDatasetVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_versionsetResult arrayOfBotDatasetVersion(java.util.Collection<BotDatasetVersion> arrayOfBotDatasetVersion) {
        setArrayOfBotDatasetVersion(arrayOfBotDatasetVersion);
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
        if (getArrayOfBotDatasetVersion() != null)
            sb.append("ArrayOfBotDatasetVersion: ").append(getArrayOfBotDatasetVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_all_versionsetResult == false)
            return false;
        Get_all_versionsetResult other = (Get_all_versionsetResult) obj;
        if (other.getArrayOfBotDatasetVersion() == null ^ this.getArrayOfBotDatasetVersion() == null)
            return false;
        if (other.getArrayOfBotDatasetVersion() != null && other.getArrayOfBotDatasetVersion().equals(this.getArrayOfBotDatasetVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayOfBotDatasetVersion() == null) ? 0 : getArrayOfBotDatasetVersion().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_versionsetResult clone() {
        try {
            return (Get_all_versionsetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
