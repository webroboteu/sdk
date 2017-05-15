/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_project_by_name" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_project_by_nameRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String projectName;

    /**
     * @param projectName
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @param projectName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_project_by_nameRequest projectName(String projectName) {
        setProjectName(projectName);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_project_by_nameRequest == false)
            return false;
        Get_project_by_nameRequest other = (Get_project_by_nameRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        return hashCode;
    }

    @Override
    public Get_project_by_nameRequest clone() {
        return (Get_project_by_nameRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public Get_project_by_nameRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
