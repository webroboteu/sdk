/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Delete_datasetset_version" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_datasetset_versionRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String botId;

    private String datasetId;

    private String projectId;

    private String versionsetId;

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

    public Delete_datasetset_versionRequest botId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * @param datasetId
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * @return
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @param datasetId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delete_datasetset_versionRequest datasetId(String datasetId) {
        setDatasetId(datasetId);
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

    public Delete_datasetset_versionRequest projectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * @param versionsetId
     */

    public void setVersionsetId(String versionsetId) {
        this.versionsetId = versionsetId;
    }

    /**
     * @return
     */

    public String getVersionsetId() {
        return this.versionsetId;
    }

    /**
     * @param versionsetId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delete_datasetset_versionRequest versionsetId(String versionsetId) {
        setVersionsetId(versionsetId);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getVersionsetId() != null)
            sb.append("VersionsetId: ").append(getVersionsetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Delete_datasetset_versionRequest == false)
            return false;
        Delete_datasetset_versionRequest other = (Delete_datasetset_versionRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getVersionsetId() == null ^ this.getVersionsetId() == null)
            return false;
        if (other.getVersionsetId() != null && other.getVersionsetId().equals(this.getVersionsetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getVersionsetId() == null) ? 0 : getVersionsetId().hashCode());
        return hashCode;
    }

    @Override
    public Delete_datasetset_versionRequest clone() {
        return (Delete_datasetset_versionRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public Delete_datasetset_versionRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
