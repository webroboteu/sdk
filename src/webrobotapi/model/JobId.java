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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/JobId" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobId implements Serializable, Cloneable, StructuredPojo {

    private String jobid;

    /**
     * @param jobid
     */

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    /**
     * @return
     */

    public String getJobid() {
        return this.jobid;
    }

    /**
     * @param jobid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobId jobid(String jobid) {
        setJobid(jobid);
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
        if (getJobid() != null)
            sb.append("Jobid: ").append(getJobid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobId == false)
            return false;
        JobId other = (JobId) obj;
        if (other.getJobid() == null ^ this.getJobid() == null)
            return false;
        if (other.getJobid() != null && other.getJobid().equals(this.getJobid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobid() == null) ? 0 : getJobid().hashCode());
        return hashCode;
    }

    @Override
    public JobId clone() {
        try {
            return (JobId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        webrobotapi.model.transform.JobIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
