/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Delete_page" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_pageRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String botId;

    private String conceptId;

    private String pageId;

    private String projectId;

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

    public Delete_pageRequest botId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * @param conceptId
     */

    public void setConceptId(String conceptId) {
        this.conceptId = conceptId;
    }

    /**
     * @return
     */

    public String getConceptId() {
        return this.conceptId;
    }

    /**
     * @param conceptId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delete_pageRequest conceptId(String conceptId) {
        setConceptId(conceptId);
        return this;
    }

    /**
     * @param pageId
     */

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     * @return
     */

    public String getPageId() {
        return this.pageId;
    }

    /**
     * @param pageId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delete_pageRequest pageId(String pageId) {
        setPageId(pageId);
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

    public Delete_pageRequest projectId(String projectId) {
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getConceptId() != null)
            sb.append("ConceptId: ").append(getConceptId()).append(",");
        if (getPageId() != null)
            sb.append("PageId: ").append(getPageId()).append(",");
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

        if (obj instanceof Delete_pageRequest == false)
            return false;
        Delete_pageRequest other = (Delete_pageRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getConceptId() == null ^ this.getConceptId() == null)
            return false;
        if (other.getConceptId() != null && other.getConceptId().equals(this.getConceptId()) == false)
            return false;
        if (other.getPageId() == null ^ this.getPageId() == null)
            return false;
        if (other.getPageId() != null && other.getPageId().equals(this.getPageId()) == false)
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

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getConceptId() == null) ? 0 : getConceptId().hashCode());
        hashCode = prime * hashCode + ((getPageId() == null) ? 0 : getPageId().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        return hashCode;
    }

    @Override
    public Delete_pageRequest clone() {
        return (Delete_pageRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public Delete_pageRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
