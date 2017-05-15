/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Create_job" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Create_jobResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private Job job;

    /**
     * @param job
     */

    public void setJob(Job job) {
        this.job = job;
    }

    /**
     * @return
     */

    public Job getJob() {
        return this.job;
    }

    /**
     * @param job
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Create_jobResult job(Job job) {
        setJob(job);
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
        if (getJob() != null)
            sb.append("Job: ").append(getJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Create_jobResult == false)
            return false;
        Create_jobResult other = (Create_jobResult) obj;
        if (other.getJob() == null ^ this.getJob() == null)
            return false;
        if (other.getJob() != null && other.getJob().equals(this.getJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJob() == null) ? 0 : getJob().hashCode());
        return hashCode;
    }

    @Override
    public Create_jobResult clone() {
        try {
            return (Create_jobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
