/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_dataset_dataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_datasetResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private BotDataset botDataset;

    /**
     * @param botDataset
     */

    public void setBotDataset(BotDataset botDataset) {
        this.botDataset = botDataset;
    }

    /**
     * @return
     */

    public BotDataset getBotDataset() {
        return this.botDataset;
    }

    /**
     * @param botDataset
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_dataset_datasetResult botDataset(BotDataset botDataset) {
        setBotDataset(botDataset);
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
        if (getBotDataset() != null)
            sb.append("BotDataset: ").append(getBotDataset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_dataset_datasetResult == false)
            return false;
        Get_dataset_datasetResult other = (Get_dataset_datasetResult) obj;
        if (other.getBotDataset() == null ^ this.getBotDataset() == null)
            return false;
        if (other.getBotDataset() != null && other.getBotDataset().equals(this.getBotDataset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotDataset() == null) ? 0 : getBotDataset().hashCode());
        return hashCode;
    }

    @Override
    public Get_dataset_datasetResult clone() {
        try {
            return (Get_dataset_datasetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
