/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_all_projects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_projectsResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private java.util.List<BotProject> arrayOfBotProject;

    /**
     * @return
     */

    public java.util.List<BotProject> getArrayOfBotProject() {
        return arrayOfBotProject;
    }

    /**
     * @param arrayOfBotProject
     */

    public void setArrayOfBotProject(java.util.Collection<BotProject> arrayOfBotProject) {
        if (arrayOfBotProject == null) {
            this.arrayOfBotProject = null;
            return;
        }

        this.arrayOfBotProject = new java.util.ArrayList<BotProject>(arrayOfBotProject);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayOfBotProject(java.util.Collection)} or {@link #withArrayOfBotProject(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param arrayOfBotProject
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_projectsResult arrayOfBotProject(BotProject... arrayOfBotProject) {
        if (this.arrayOfBotProject == null) {
            setArrayOfBotProject(new java.util.ArrayList<BotProject>(arrayOfBotProject.length));
        }
        for (BotProject ele : arrayOfBotProject) {
            this.arrayOfBotProject.add(ele);
        }
        return this;
    }

    /**
     * @param arrayOfBotProject
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_projectsResult arrayOfBotProject(java.util.Collection<BotProject> arrayOfBotProject) {
        setArrayOfBotProject(arrayOfBotProject);
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
        if (getArrayOfBotProject() != null)
            sb.append("ArrayOfBotProject: ").append(getArrayOfBotProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_all_projectsResult == false)
            return false;
        Get_all_projectsResult other = (Get_all_projectsResult) obj;
        if (other.getArrayOfBotProject() == null ^ this.getArrayOfBotProject() == null)
            return false;
        if (other.getArrayOfBotProject() != null && other.getArrayOfBotProject().equals(this.getArrayOfBotProject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayOfBotProject() == null) ? 0 : getArrayOfBotProject().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_projectsResult clone() {
        try {
            return (Get_all_projectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
