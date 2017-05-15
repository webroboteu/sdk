/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Create_bot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Create_botRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private Bot bot;

    private String projectId;

    /**
     * @param bot
     */

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    /**
     * @return
     */

    public Bot getBot() {
        return this.bot;
    }

    /**
     * @param bot
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Create_botRequest bot(Bot bot) {
        setBot(bot);
        return this;
    }

    /**
     * @param projectId
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @param projectId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Create_botRequest projectId(String projectId) {
        setProjectId(projectId);
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
        if (getBot() != null)
            sb.append("Bot: ").append(getBot()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Create_botRequest == false)
            return false;
        Create_botRequest other = (Create_botRequest) obj;
        if (other.getBot() == null ^ this.getBot() == null)
            return false;
        if (other.getBot() != null && other.getBot().equals(this.getBot()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBot() == null) ? 0 : getBot().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        return hashCode;
    }

    @Override
    public Create_botRequest clone() {
        return (Create_botRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public Create_botRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
