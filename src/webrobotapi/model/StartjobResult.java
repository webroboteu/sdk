/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Startjob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartjobResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private String jobid;

    /**
     * @param jobId
     */

    public void setJobid(String jobId) {
        this.jobid = jobId;
    }

    /**
     * @return
     */

    public String getJobid() {
        return this.jobid;
    }

    /**
     * @param jobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartjobResult jobId(String jobId) {
        setJobid(jobId);
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
            sb.append("JobId: ").append(getJobid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartjobResult == false)
            return false;
        StartjobResult other = (StartjobResult) obj;
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
    public StartjobResult clone() {
        try {
            return (StartjobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
