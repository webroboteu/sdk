/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Build_xpath_model" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Build_xpath_modelResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private JobId jobId;

    /**
     * @param jobId
     */

    public void setJobId(JobId jobId) {
        this.jobId = jobId;
    }

    /**
     * @return
     */

    public JobId getJobId() {
        return this.jobId;
    }

    /**
     * @param jobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Build_xpath_modelResult jobId(JobId jobId) {
        setJobId(jobId);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Build_xpath_modelResult == false)
            return false;
        Build_xpath_modelResult other = (Build_xpath_modelResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public Build_xpath_modelResult clone() {
        try {
            return (Build_xpath_modelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
