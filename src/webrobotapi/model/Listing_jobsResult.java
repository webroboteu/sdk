/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Listing_jobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Listing_jobsResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private java.util.List<Job> arrayOfJob;

    /**
     * @return
     */

    public java.util.List<Job> getArrayOfJob() {
        return arrayOfJob;
    }

    /**
     * @param arrayOfJob
     */

    public void setArrayOfJob(java.util.Collection<Job> arrayOfJob) {
        if (arrayOfJob == null) {
            this.arrayOfJob = null;
            return;
        }

        this.arrayOfJob = new java.util.ArrayList<Job>(arrayOfJob);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayOfJob(java.util.Collection)} or {@link #withArrayOfJob(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param arrayOfJob
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listing_jobsResult arrayOfJob(Job... arrayOfJob) {
        if (this.arrayOfJob == null) {
            setArrayOfJob(new java.util.ArrayList<Job>(arrayOfJob.length));
        }
        for (Job ele : arrayOfJob) {
            this.arrayOfJob.add(ele);
        }
        return this;
    }

    /**
     * @param arrayOfJob
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listing_jobsResult arrayOfJob(java.util.Collection<Job> arrayOfJob) {
        setArrayOfJob(arrayOfJob);
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
        if (getArrayOfJob() != null)
            sb.append("ArrayOfJob: ").append(getArrayOfJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Listing_jobsResult == false)
            return false;
        Listing_jobsResult other = (Listing_jobsResult) obj;
        if (other.getArrayOfJob() == null ^ this.getArrayOfJob() == null)
            return false;
        if (other.getArrayOfJob() != null && other.getArrayOfJob().equals(this.getArrayOfJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayOfJob() == null) ? 0 : getArrayOfJob().hashCode());
        return hashCode;
    }

    @Override
    public Listing_jobsResult clone() {
        try {
            return (Listing_jobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
