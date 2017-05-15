/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Uplod_dataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Uplod_datasetRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private BotDatasetBean botDatasetBean;

    private String botId;

    private String projectId;

    /**
     * @param botDatasetBean
     */

    public void setBotDatasetBean(BotDatasetBean botDatasetBean) {
        this.botDatasetBean = botDatasetBean;
    }

    /**
     * @return
     */

    public BotDatasetBean getBotDatasetBean() {
        return this.botDatasetBean;
    }

    /**
     * @param botDatasetBean
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Uplod_datasetRequest botDatasetBean(BotDatasetBean botDatasetBean) {
        setBotDatasetBean(botDatasetBean);
        return this;
    }

    /**
     * @param botId
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * @return
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * @param botId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Uplod_datasetRequest botId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * @param projectId
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @param projectId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Uplod_datasetRequest projectId(String projectId) {
        setProjectId(projectId);
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
        if (getBotDatasetBean() != null)
            sb.append("BotDatasetBean: ").append(getBotDatasetBean()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Uplod_datasetRequest == false)
            return false;
        Uplod_datasetRequest other = (Uplod_datasetRequest) obj;
        if (other.getBotDatasetBean() == null ^ this.getBotDatasetBean() == null)
            return false;
        if (other.getBotDatasetBean() != null && other.getBotDatasetBean().equals(this.getBotDatasetBean()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotDatasetBean() == null) ? 0 : getBotDatasetBean().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        return hashCode;
    }

    @Override
    public Uplod_datasetRequest clone() {
        return (Uplod_datasetRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public Uplod_datasetRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
