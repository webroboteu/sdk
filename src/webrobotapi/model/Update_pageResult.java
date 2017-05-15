/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Update_page" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Update_pageResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private Page page;

    /**
     * @param page
     */

    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * @return
     */

    public Page getPage() {
        return this.page;
    }

    /**
     * @param page
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update_pageResult page(Page page) {
        setPage(page);
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
        if (getPage() != null)
            sb.append("Page: ").append(getPage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Update_pageResult == false)
            return false;
        Update_pageResult other = (Update_pageResult) obj;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        return hashCode;
    }

    @Override
    public Update_pageResult clone() {
        try {
            return (Update_pageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
