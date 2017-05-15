/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_all_pages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_pagesRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String botId;

    private String conceptId;

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

    public Get_all_pagesRequest botId(String botId) {
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

    public Get_all_pagesRequest conceptId(String conceptId) {
        setConceptId(conceptId);
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

    public Get_all_pagesRequest projectId(String projectId) {
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

        if (obj instanceof Get_all_pagesRequest == false)
            return false;
        Get_all_pagesRequest other = (Get_all_pagesRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getConceptId() == null ^ this.getConceptId() == null)
            return false;
        if (other.getConceptId() != null && other.getConceptId().equals(this.getConceptId()) == false)
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
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_pagesRequest clone() {
        return (Get_all_pagesRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public Get_all_pagesRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
