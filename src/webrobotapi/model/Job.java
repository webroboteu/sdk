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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Job" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    private String apikey;

    private String botId;

    private String createdTime;

    private String datasetId;

    private String error;

    private String id;

    private Boolean isImmediate;

    private String projectId;

    private String scheduleInfo;

    private String status;

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

    public Job apikey(String apikey) {
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

    public Job botId(String botId) {
        setBotId(botId);
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

    public Job createdTime(String createdTime) {
        setCreatedTime(createdTime);
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

    public Job datasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * @param error
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * @return
     */

    public String getError() {
        return this.error;
    }

    /**
     * @param error
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job error(String error) {
        setError(error);
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

    public Job id(String id) {
        setId(id);
        return this;
    }

    /**
     * @param isImmediate
     */

    public void setIsImmediate(Boolean isImmediate) {
        this.isImmediate = isImmediate;
    }

    /**
     * @return
     */

    public Boolean getIsImmediate() {
        return this.isImmediate;
    }

    /**
     * @param isImmediate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job isImmediate(Boolean isImmediate) {
        setIsImmediate(isImmediate);
        return this;
    }

    /**
     * @return
     */

    public Boolean isImmediate() {
        return this.isImmediate;
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

    public Job projectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * @param scheduleInfo
     */

    public void setScheduleInfo(String scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }

    /**
     * @return
     */

    public String getScheduleInfo() {
        return this.scheduleInfo;
    }

    /**
     * @param scheduleInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job scheduleInfo(String scheduleInfo) {
        setScheduleInfo(scheduleInfo);
        return this;
    }

    /**
     * @param status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job status(String status) {
        setStatus(status);
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
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIsImmediate() != null)
            sb.append("IsImmediate: ").append(getIsImmediate()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getScheduleInfo() != null)
            sb.append("ScheduleInfo: ").append(getScheduleInfo()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getApikey() == null ^ this.getApikey() == null)
            return false;
        if (other.getApikey() != null && other.getApikey().equals(this.getApikey()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsImmediate() == null ^ this.getIsImmediate() == null)
            return false;
        if (other.getIsImmediate() != null && other.getIsImmediate().equals(this.getIsImmediate()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getScheduleInfo() == null ^ this.getScheduleInfo() == null)
            return false;
        if (other.getScheduleInfo() != null && other.getScheduleInfo().equals(this.getScheduleInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApikey() == null) ? 0 : getApikey().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsImmediate() == null) ? 0 : getIsImmediate().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getScheduleInfo() == null) ? 0 : getScheduleInfo().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        webrobotapi.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
