/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Create_project" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Create_projectResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private BotProject botProject;

    /**
     * @param botProject
     */

    public void setBotProject(BotProject botProject) {
        this.botProject = botProject;
    }

    /**
     * @return
     */

    public BotProject getBotProject() {
        return this.botProject;
    }

    /**
     * @param botProject
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Create_projectResult botProject(BotProject botProject) {
        setBotProject(botProject);
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
        if (getBotProject() != null)
            sb.append("BotProject: ").append(getBotProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Create_projectResult == false)
            return false;
        Create_projectResult other = (Create_projectResult) obj;
        if (other.getBotProject() == null ^ this.getBotProject() == null)
            return false;
        if (other.getBotProject() != null && other.getBotProject().equals(this.getBotProject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotProject() == null) ? 0 : getBotProject().hashCode());
        return hashCode;
    }

    @Override
    public Create_projectResult clone() {
        try {
            return (Create_projectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
