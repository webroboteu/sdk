/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_all_bots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_botsResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private java.util.List<Bot> arrayOfBot;

    /**
     * @return
     */

    public java.util.List<Bot> getArrayOfBot() {
        return arrayOfBot;
    }

    /**
     * @param arrayOfBot
     */

    public void setArrayOfBot(java.util.Collection<Bot> arrayOfBot) {
        if (arrayOfBot == null) {
            this.arrayOfBot = null;
            return;
        }

        this.arrayOfBot = new java.util.ArrayList<Bot>(arrayOfBot);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayOfBot(java.util.Collection)} or {@link #withArrayOfBot(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param arrayOfBot
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_botsResult arrayOfBot(Bot... arrayOfBot) {
        if (this.arrayOfBot == null) {
            setArrayOfBot(new java.util.ArrayList<Bot>(arrayOfBot.length));
        }
        for (Bot ele : arrayOfBot) {
            this.arrayOfBot.add(ele);
        }
        return this;
    }

    /**
     * @param arrayOfBot
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_botsResult arrayOfBot(java.util.Collection<Bot> arrayOfBot) {
        setArrayOfBot(arrayOfBot);
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
        if (getArrayOfBot() != null)
            sb.append("ArrayOfBot: ").append(getArrayOfBot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_all_botsResult == false)
            return false;
        Get_all_botsResult other = (Get_all_botsResult) obj;
        if (other.getArrayOfBot() == null ^ this.getArrayOfBot() == null)
            return false;
        if (other.getArrayOfBot() != null && other.getArrayOfBot().equals(this.getArrayOfBot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayOfBot() == null) ? 0 : getArrayOfBot().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_botsResult clone() {
        try {
            return (Get_all_botsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
