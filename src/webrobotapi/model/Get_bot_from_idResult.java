/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_bot_from_id" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_bot_from_idResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private Bot bot;

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

    public Get_bot_from_idResult bot(Bot bot) {
        setBot(bot);
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
            sb.append("Bot: ").append(getBot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_bot_from_idResult == false)
            return false;
        Get_bot_from_idResult other = (Get_bot_from_idResult) obj;
        if (other.getBot() == null ^ this.getBot() == null)
            return false;
        if (other.getBot() != null && other.getBot().equals(this.getBot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBot() == null) ? 0 : getBot().hashCode());
        return hashCode;
    }

    @Override
    public Get_bot_from_idResult clone() {
        try {
            return (Get_bot_from_idResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
