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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/BotDatasetVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotDatasetVersion implements Serializable, Cloneable, StructuredPojo {

    private String apikey;

    private String botId;

    private String datasetId;

    private String id;

    private String inputdatabaseName;

    private String inputtableName;

    private String jobId;

    private String name;

    private String outputdatabaseName;

    private String outputtableName;

    private String projectId;

    private String status;

    private String targetPath;

    private String targetPathOutput;

    private String version;

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

    public BotDatasetVersion apikey(String apikey) {
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

    public BotDatasetVersion botId(String botId) {
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

    public BotDatasetVersion datasetId(String datasetId) {
        setDatasetId(datasetId);
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

    public BotDatasetVersion id(String id) {
        setId(id);
        return this;
    }

    /**
     * @param inputdatabaseName
     */

    public void setInputdatabaseName(String inputdatabaseName) {
        this.inputdatabaseName = inputdatabaseName;
    }

    /**
     * @return
     */

    public String getInputdatabaseName() {
        return this.inputdatabaseName;
    }

    /**
     * @param inputdatabaseName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetVersion inputdatabaseName(String inputdatabaseName) {
        setInputdatabaseName(inputdatabaseName);
        return this;
    }

    /**
     * @param inputtableName
     */

    public void setInputtableName(String inputtableName) {
        this.inputtableName = inputtableName;
    }

    /**
     * @return
     */

    public String getInputtableName() {
        return this.inputtableName;
    }

    /**
     * @param inputtableName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetVersion inputtableName(String inputtableName) {
        setInputtableName(inputtableName);
        return this;
    }

    /**
     * @param jobId
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * @return
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * @param jobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetVersion jobId(String jobId) {
        setJobId(jobId);
        return this;
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

    public BotDatasetVersion name(String name) {
        setName(name);
        return this;
    }

    /**
     * @param outputdatabaseName
     */

    public void setOutputdatabaseName(String outputdatabaseName) {
        this.outputdatabaseName = outputdatabaseName;
    }

    /**
     * @return
     */

    public String getOutputdatabaseName() {
        return this.outputdatabaseName;
    }

    /**
     * @param outputdatabaseName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetVersion outputdatabaseName(String outputdatabaseName) {
        setOutputdatabaseName(outputdatabaseName);
        return this;
    }

    /**
     * @param outputtableName
     */

    public void setOutputtableName(String outputtableName) {
        this.outputtableName = outputtableName;
    }

    /**
     * @return
     */

    public String getOutputtableName() {
        return this.outputtableName;
    }

    /**
     * @param outputtableName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetVersion outputtableName(String outputtableName) {
        setOutputtableName(outputtableName);
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

    public BotDatasetVersion projectId(String projectId) {
        setProjectId(projectId);
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

    public BotDatasetVersion status(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param targetPath
     */

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    /**
     * @return
     */

    public String getTargetPath() {
        return this.targetPath;
    }

    /**
     * @param targetPath
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetVersion targetPath(String targetPath) {
        setTargetPath(targetPath);
        return this;
    }

    /**
     * @param targetPathOutput
     */

    public void setTargetPathOutput(String targetPathOutput) {
        this.targetPathOutput = targetPathOutput;
    }

    /**
     * @return
     */

    public String getTargetPathOutput() {
        return this.targetPathOutput;
    }

    /**
     * @param targetPathOutput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetVersion targetPathOutput(String targetPathOutput) {
        setTargetPathOutput(targetPathOutput);
        return this;
    }

    /**
     * @param version
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * @param version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetVersion version(String version) {
        setVersion(version);
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
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInputdatabaseName() != null)
            sb.append("InputdatabaseName: ").append(getInputdatabaseName()).append(",");
        if (getInputtableName() != null)
            sb.append("InputtableName: ").append(getInputtableName()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputdatabaseName() != null)
            sb.append("OutputdatabaseName: ").append(getOutputdatabaseName()).append(",");
        if (getOutputtableName() != null)
            sb.append("OutputtableName: ").append(getOutputtableName()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargetPath() != null)
            sb.append("TargetPath: ").append(getTargetPath()).append(",");
        if (getTargetPathOutput() != null)
            sb.append("TargetPathOutput: ").append(getTargetPathOutput()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotDatasetVersion == false)
            return false;
        BotDatasetVersion other = (BotDatasetVersion) obj;
        if (other.getApikey() == null ^ this.getApikey() == null)
            return false;
        if (other.getApikey() != null && other.getApikey().equals(this.getApikey()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInputdatabaseName() == null ^ this.getInputdatabaseName() == null)
            return false;
        if (other.getInputdatabaseName() != null && other.getInputdatabaseName().equals(this.getInputdatabaseName()) == false)
            return false;
        if (other.getInputtableName() == null ^ this.getInputtableName() == null)
            return false;
        if (other.getInputtableName() != null && other.getInputtableName().equals(this.getInputtableName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputdatabaseName() == null ^ this.getOutputdatabaseName() == null)
            return false;
        if (other.getOutputdatabaseName() != null && other.getOutputdatabaseName().equals(this.getOutputdatabaseName()) == false)
            return false;
        if (other.getOutputtableName() == null ^ this.getOutputtableName() == null)
            return false;
        if (other.getOutputtableName() != null && other.getOutputtableName().equals(this.getOutputtableName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetPath() == null ^ this.getTargetPath() == null)
            return false;
        if (other.getTargetPath() != null && other.getTargetPath().equals(this.getTargetPath()) == false)
            return false;
        if (other.getTargetPathOutput() == null ^ this.getTargetPathOutput() == null)
            return false;
        if (other.getTargetPathOutput() != null && other.getTargetPathOutput().equals(this.getTargetPathOutput()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApikey() == null) ? 0 : getApikey().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInputdatabaseName() == null) ? 0 : getInputdatabaseName().hashCode());
        hashCode = prime * hashCode + ((getInputtableName() == null) ? 0 : getInputtableName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputdatabaseName() == null) ? 0 : getOutputdatabaseName().hashCode());
        hashCode = prime * hashCode + ((getOutputtableName() == null) ? 0 : getOutputtableName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetPath() == null) ? 0 : getTargetPath().hashCode());
        hashCode = prime * hashCode + ((getTargetPathOutput() == null) ? 0 : getTargetPathOutput().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public BotDatasetVersion clone() {
        try {
            return (BotDatasetVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        webrobotapi.model.transform.BotDatasetVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
