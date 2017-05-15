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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/ConceptAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConceptAttribute implements Serializable, Cloneable, StructuredPojo {

    private String apikey;

    private String createdTime;

    private String id;

    private Boolean isRelaxedXpath;

    private String label;

    private Boolean multipleValues;

    private String name;

    private String projectId;

    private String regexp;

    private String resultXPath;

    private String sparqlQuery;

    private String uri;

    private Boolean withRegexp;

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

    public ConceptAttribute apikey(String apikey) {
        setApikey(apikey);
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

    public ConceptAttribute createdTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConceptAttribute id(String id) {
        setId(id);
        return this;
    }

    /**
     * @param isRelaxedXpath
     */

    public void setIsRelaxedXpath(Boolean isRelaxedXpath) {
        this.isRelaxedXpath = isRelaxedXpath;
    }

    /**
     * @return
     */

    public Boolean getIsRelaxedXpath() {
        return this.isRelaxedXpath;
    }

    /**
     * @param isRelaxedXpath
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConceptAttribute isRelaxedXpath(Boolean isRelaxedXpath) {
        setIsRelaxedXpath(isRelaxedXpath);
        return this;
    }

    /**
     * @return
     */

    public Boolean isRelaxedXpath() {
        return this.isRelaxedXpath;
    }

    /**
     * @param label
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * @param label
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConceptAttribute label(String label) {
        setLabel(label);
        return this;
    }

    /**
     * @param multipleValues
     */

    public void setMultipleValues(Boolean multipleValues) {
        this.multipleValues = multipleValues;
    }

    /**
     * @return
     */

    public Boolean getMultipleValues() {
        return this.multipleValues;
    }

    /**
     * @param multipleValues
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConceptAttribute multipleValues(Boolean multipleValues) {
        setMultipleValues(multipleValues);
        return this;
    }

    /**
     * @return
     */

    public Boolean isMultipleValues() {
        return this.multipleValues;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConceptAttribute name(String name) {
        setName(name);
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

    public ConceptAttribute projectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * @param regexp
     */

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

    /**
     * @return
     */

    public String getRegexp() {
        return this.regexp;
    }

    /**
     * @param regexp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConceptAttribute regexp(String regexp) {
        setRegexp(regexp);
        return this;
    }

    /**
     * @param resultXPath
     */

    public void setResultXPath(String resultXPath) {
        this.resultXPath = resultXPath;
    }

    /**
     * @return
     */

    public String getResultXPath() {
        return this.resultXPath;
    }

    /**
     * @param resultXPath
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConceptAttribute resultXPath(String resultXPath) {
        setResultXPath(resultXPath);
        return this;
    }

    /**
     * @param sparqlQuery
     */

    public void setSparqlQuery(String sparqlQuery) {
        this.sparqlQuery = sparqlQuery;
    }

    /**
     * @return
     */

    public String getSparqlQuery() {
        return this.sparqlQuery;
    }

    /**
     * @param sparqlQuery
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConceptAttribute sparqlQuery(String sparqlQuery) {
        setSparqlQuery(sparqlQuery);
        return this;
    }

    /**
     * @param uri
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * @return
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * @param uri
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConceptAttribute uri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * @param withRegexp
     */

    public void setWithRegexp(Boolean withRegexp) {
        this.withRegexp = withRegexp;
    }

    /**
     * @return
     */

    public Boolean getWithRegexp() {
        return this.withRegexp;
    }

    /**
     * @param withRegexp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConceptAttribute withRegexp(Boolean withRegexp) {
        setWithRegexp(withRegexp);
        return this;
    }

    /**
     * @return
     */

    public Boolean isWithRegexp() {
        return this.withRegexp;
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
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIsRelaxedXpath() != null)
            sb.append("IsRelaxedXpath: ").append(getIsRelaxedXpath()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getMultipleValues() != null)
            sb.append("MultipleValues: ").append(getMultipleValues()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getRegexp() != null)
            sb.append("Regexp: ").append(getRegexp()).append(",");
        if (getResultXPath() != null)
            sb.append("ResultXPath: ").append(getResultXPath()).append(",");
        if (getSparqlQuery() != null)
            sb.append("SparqlQuery: ").append(getSparqlQuery()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getWithRegexp() != null)
            sb.append("WithRegexp: ").append(getWithRegexp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConceptAttribute == false)
            return false;
        ConceptAttribute other = (ConceptAttribute) obj;
        if (other.getApikey() == null ^ this.getApikey() == null)
            return false;
        if (other.getApikey() != null && other.getApikey().equals(this.getApikey()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsRelaxedXpath() == null ^ this.getIsRelaxedXpath() == null)
            return false;
        if (other.getIsRelaxedXpath() != null && other.getIsRelaxedXpath().equals(this.getIsRelaxedXpath()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getMultipleValues() == null ^ this.getMultipleValues() == null)
            return false;
        if (other.getMultipleValues() != null && other.getMultipleValues().equals(this.getMultipleValues()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getRegexp() == null ^ this.getRegexp() == null)
            return false;
        if (other.getRegexp() != null && other.getRegexp().equals(this.getRegexp()) == false)
            return false;
        if (other.getResultXPath() == null ^ this.getResultXPath() == null)
            return false;
        if (other.getResultXPath() != null && other.getResultXPath().equals(this.getResultXPath()) == false)
            return false;
        if (other.getSparqlQuery() == null ^ this.getSparqlQuery() == null)
            return false;
        if (other.getSparqlQuery() != null && other.getSparqlQuery().equals(this.getSparqlQuery()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getWithRegexp() == null ^ this.getWithRegexp() == null)
            return false;
        if (other.getWithRegexp() != null && other.getWithRegexp().equals(this.getWithRegexp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApikey() == null) ? 0 : getApikey().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsRelaxedXpath() == null) ? 0 : getIsRelaxedXpath().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getMultipleValues() == null) ? 0 : getMultipleValues().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getRegexp() == null) ? 0 : getRegexp().hashCode());
        hashCode = prime * hashCode + ((getResultXPath() == null) ? 0 : getResultXPath().hashCode());
        hashCode = prime * hashCode + ((getSparqlQuery() == null) ? 0 : getSparqlQuery().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getWithRegexp() == null) ? 0 : getWithRegexp().hashCode());
        return hashCode;
    }

    @Override
    public ConceptAttribute clone() {
        try {
            return (ConceptAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        webrobotapi.model.transform.ConceptAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
