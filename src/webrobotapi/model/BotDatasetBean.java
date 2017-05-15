/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;
import webrobotapi.DataType;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/BotDatasetBean" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotDatasetBean implements Serializable, Cloneable, StructuredPojo {

    private String attachmentName;

    private String comments;

    private Boolean containsHeader;

    private String dataSourceType;

    private String dataTargetType;

    private String dataType;

    private String firstline;

    private String name;

    private String version;

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

    public BotDatasetBean attachmentName(String attachmentName) {
        setAttachmentName(attachmentName);
        return this;
    }

    /**
     * @param comments
     */

    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return
     */

    public String getComments() {
        return this.comments;
    }

    /**
     * @param comments
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetBean comments(String comments) {
        setComments(comments);
        return this;
    }

    /**
     * @param containsHeader
     */

    public void setContainsHeader(Boolean containsHeader) {
        this.containsHeader = containsHeader;
    }

    /**
     * @return
     */

    public Boolean getContainsHeader() {
        return this.containsHeader;
    }

    /**
     * @param containsHeader
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetBean containsHeader(Boolean containsHeader) {
        setContainsHeader(containsHeader);
        return this;
    }

    /**
     * @return
     */

    public Boolean isContainsHeader() {
        return this.containsHeader;
    }

    /**
     * @param dataSourceType
     */

    public void setDataSourceType(DataSourceType dataSourceType) {
        if(dataSourceType == DataSourceType.S3)
        this.dataSourceType = "s3";
    }

    /**
     * @return
     */

    public DataSourceType getDataSourceType() {

        if(this.dataSourceType == "s3")
            return  DataSourceType.S3;
        else
            return  DataSourceType.S3;
    }

    /**
     * @param dataSourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetBean dataSourceType(DataSourceType dataSourceType) {
        setDataSourceType(dataSourceType);
        return this;
    }

    /**
     * @param dataTargetType
     */

    public void setDataTargetType(DataTargetType dataTargetType)
    {
        if(dataTargetType == DataTargetType.S3)
        this.dataTargetType = "s3";
    }

    /**
     * @return
     */

    public DataTargetType getDataTargetType() {
        if(this.dataTargetType == "s3")
           return DataTargetType.S3;
        else
           return DataTargetType.S3;
    }

    /**
     * @param dataTargetType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetBean dataTargetType(DataTargetType dataTargetType) {
        setDataTargetType(dataTargetType);
        return this;
    }

    /**
     * @param dataType
     */

    public void setDataType(DataType dataType)
    {
        if(dataType == DataType.CSV)
        this.dataType = "csv";
    }

    /**
     * @return
     */

    public DataType getDataType()
    {
        if(this.dataType == "csv")
            return DataType.CSV;
        return DataType.CSV;
    }

    /**
     * @param dataType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetBean dataType(DataType dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * @param firstline
     */

    public void setFirstline(String firstline) {
        this.firstline = firstline;
    }

    /**
     * @return
     */

    public String getFirstline() {
        return this.firstline;
    }

    /**
     * @param firstline
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotDatasetBean firstline(String firstline) {
        setFirstline(firstline);
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

    public BotDatasetBean name(String name) {
        setName(name);
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

    public BotDatasetBean version(String version) {
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
        if (getAttachmentName() != null)
            sb.append("AttachmentName: ").append(getAttachmentName()).append(",");
        if (getComments() != null)
            sb.append("Comments: ").append(getComments()).append(",");
        if (getContainsHeader() != null)
            sb.append("ContainsHeader: ").append(getContainsHeader()).append(",");
        if (getDataSourceType() != null)
            sb.append("DataSourceType: ").append(getDataSourceType()).append(",");
        if (getDataTargetType() != null)
            sb.append("DataTargetType: ").append(getDataTargetType()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getFirstline() != null)
            sb.append("Firstline: ").append(getFirstline()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof BotDatasetBean == false)
            return false;
        BotDatasetBean other = (BotDatasetBean) obj;
        if (other.getAttachmentName() == null ^ this.getAttachmentName() == null)
            return false;
        if (other.getAttachmentName() != null && other.getAttachmentName().equals(this.getAttachmentName()) == false)
            return false;
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && other.getComments().equals(this.getComments()) == false)
            return false;
        if (other.getContainsHeader() == null ^ this.getContainsHeader() == null)
            return false;
        if (other.getContainsHeader() != null && other.getContainsHeader().equals(this.getContainsHeader()) == false)
            return false;
        if (other.getDataSourceType() == null ^ this.getDataSourceType() == null)
            return false;
        if (other.getDataSourceType() != null && other.getDataSourceType().equals(this.getDataSourceType()) == false)
            return false;
        if (other.getDataTargetType() == null ^ this.getDataTargetType() == null)
            return false;
        if (other.getDataTargetType() != null && other.getDataTargetType().equals(this.getDataTargetType()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getFirstline() == null ^ this.getFirstline() == null)
            return false;
        if (other.getFirstline() != null && other.getFirstline().equals(this.getFirstline()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getAttachmentName() == null) ? 0 : getAttachmentName().hashCode());
        hashCode = prime * hashCode + ((getComments() == null) ? 0 : getComments().hashCode());
        hashCode = prime * hashCode + ((getContainsHeader() == null) ? 0 : getContainsHeader().hashCode());
        hashCode = prime * hashCode + ((getDataSourceType() == null) ? 0 : getDataSourceType().hashCode());
        hashCode = prime * hashCode + ((getDataTargetType() == null) ? 0 : getDataTargetType().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getFirstline() == null) ? 0 : getFirstline().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public BotDatasetBean clone() {
        try {
            return (BotDatasetBean) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        webrobotapi.model.transform.BotDatasetBeanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
