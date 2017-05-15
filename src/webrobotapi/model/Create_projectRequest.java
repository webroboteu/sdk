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
public class Create_projectRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

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

    public Create_projectRequest botProject(BotProject botProject) {
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

        if (obj instanceof Create_projectRequest == false)
            return false;
        Create_projectRequest other = (Create_projectRequest) obj;
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
    public Create_projectRequest clone() {
        return (Create_projectRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public Create_projectRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
