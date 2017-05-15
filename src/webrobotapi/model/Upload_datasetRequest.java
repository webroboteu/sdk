/**
 * null
 */
package webrobotapi.model;

import java.io.InputStream;
import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Upload_dataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Upload_datasetRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String attachmentName;

    private String botId;

    private String length;

    private String projectId;

    private InputStream stream;

    /**
     * @param attachmentName
     */

    public void setInputstream(InputStream inputstream) {
        this.stream = inputstream;
    }

    /**
     * @return
     */

    public InputStream getInputstream() {
        return this.stream;
    }

    /**
     * @param attachmentName
     */

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    /**
     * @return
     */

    public String getAttachmentName() {
        return this.attachmentName;
    }

    /**
     * @param attachmentName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Upload_datasetRequest attachmentName(String attachmentName) {
        setAttachmentName(attachmentName);
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

    public Upload_datasetRequest botId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * @param length
     */

    public void setLength(long length) {
        this.length = new Long(length).toString();;
    }

    /**
     * @return
     */

    public String getLength() {
        return this.length;
    }

    /**
     * @param length
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Upload_datasetRequest length(long length) {
        setLength(length);
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

    public Upload_datasetRequest projectId(String projectId) {
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
        if (getAttachmentName() != null)
            sb.append("AttachmentName: ").append(getAttachmentName()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getLength() != null)
            sb.append("Length: ").append(getLength()).append(",");
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

        if (obj instanceof Upload_datasetRequest == false)
            return false;
        Upload_datasetRequest other = (Upload_datasetRequest) obj;
        if (other.getAttachmentName() == null ^ this.getAttachmentName() == null)
            return false;
        if (other.getAttachmentName() != null && other.getAttachmentName().equals(this.getAttachmentName()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getLength() == null ^ this.getLength() == null)
            return false;
        if (other.getLength() != null && other.getLength().equals(this.getLength()) == false)
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

        hashCode = prime * hashCode + ((getAttachmentName() == null) ? 0 : getAttachmentName().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        return hashCode;
    }

    @Override
    public Upload_datasetRequest clone() {
        return (Upload_datasetRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public Upload_datasetRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
