/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Page" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Page implements Serializable, Cloneable, StructuredPojo {

    private String apikey;

    private String botId;

    private String conceptId;

    private String createdTime;

    private String projectId;

    private String query;

    private String url;

    /**
     * @param apikey
     */

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     * @return
     */

    public String getApikey() {
        return this.apikey;
    }

    /**
     * @param apikey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page apikey(String apikey) {
        setApikey(apikey);
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

    public Page botId(String botId) {
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

    public Page conceptId(String conceptId) {
        setConceptId(conceptId);
        return this;
    }

    /**
     * @param createdTime
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @param createdTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page createdTime(String createdTime) {
        setCreatedTime(createdTime);
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

    public Page projectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * @param query
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * @param query
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page query(String query) {
        setQuery(query);
        return this;
    }

    /**
     * @param url
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * @param url
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page url(String url) {
        setUrl(url);
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
        if (getApikey() != null)
            sb.append("Apikey: ").append(getApikey()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getConceptId() != null)
            sb.append("ConceptId: ").append(getConceptId()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Page == false)
            return false;
        Page other = (Page) obj;
        if (other.getApikey() == null ^ this.getApikey() == null)
            return false;
        if (other.getApikey() != null && other.getApikey().equals(this.getApikey()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getConceptId() == null ^ this.getConceptId() == null)
            return false;
        if (other.getConceptId() != null && other.getConceptId().equals(this.getConceptId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApikey() == null) ? 0 : getApikey().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getConceptId() == null) ? 0 : getConceptId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public Page clone() {
        try {
            return (Page) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        webrobotapi.model.transform.PageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
