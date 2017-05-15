/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Statusjob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatusjobResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private JobStatus jobStatus;

    /**
     * @param jobStatus
     */

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * @return
     */

    public JobStatus getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @param jobStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusjobResult jobStatus(JobStatus jobStatus) {
        setJobStatus(jobStatus);
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
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatusjobResult == false)
            return false;
        StatusjobResult other = (StatusjobResult) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public StatusjobResult clone() {
        try {
            return (StatusjobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
