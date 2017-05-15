/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_all_dataset_version" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_dataset_versionResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private java.util.List<BotDataset> arrayOfBotDataset;

    /**
     * @return
     */

    public java.util.List<BotDataset> getArrayOfBotDataset() {
        return arrayOfBotDataset;
    }

    /**
     * @param arrayOfBotDataset
     */

    public void setArrayOfBotDataset(java.util.Collection<BotDataset> arrayOfBotDataset) {
        if (arrayOfBotDataset == null) {
            this.arrayOfBotDataset = null;
            return;
        }

        this.arrayOfBotDataset = new java.util.ArrayList<BotDataset>(arrayOfBotDataset);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayOfBotDataset(java.util.Collection)} or {@link #withArrayOfBotDataset(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param arrayOfBotDataset
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_dataset_versionResult arrayOfBotDataset(BotDataset... arrayOfBotDataset) {
        if (this.arrayOfBotDataset == null) {
            setArrayOfBotDataset(new java.util.ArrayList<BotDataset>(arrayOfBotDataset.length));
        }
        for (BotDataset ele : arrayOfBotDataset) {
            this.arrayOfBotDataset.add(ele);
        }
        return this;
    }

    /**
     * @param arrayOfBotDataset
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_dataset_versionResult arrayOfBotDataset(java.util.Collection<BotDataset> arrayOfBotDataset) {
        setArrayOfBotDataset(arrayOfBotDataset);
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
        if (getArrayOfBotDataset() != null)
            sb.append("ArrayOfBotDataset: ").append(getArrayOfBotDataset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_all_dataset_versionResult == false)
            return false;
        Get_all_dataset_versionResult other = (Get_all_dataset_versionResult) obj;
        if (other.getArrayOfBotDataset() == null ^ this.getArrayOfBotDataset() == null)
            return false;
        if (other.getArrayOfBotDataset() != null && other.getArrayOfBotDataset().equals(this.getArrayOfBotDataset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayOfBotDataset() == null) ? 0 : getArrayOfBotDataset().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_dataset_versionResult clone() {
        try {
            return (Get_all_dataset_versionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
