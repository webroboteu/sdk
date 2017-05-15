/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_all_pages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_pagesResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private java.util.List<Page> arrayOfPage;

    /**
     * @return
     */

    public java.util.List<Page> getArrayOfPage() {
        return arrayOfPage;
    }

    /**
     * @param arrayOfPage
     */

    public void setArrayOfPage(java.util.Collection<Page> arrayOfPage) {
        if (arrayOfPage == null) {
            this.arrayOfPage = null;
            return;
        }

        this.arrayOfPage = new java.util.ArrayList<Page>(arrayOfPage);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayOfPage(java.util.Collection)} or {@link #withArrayOfPage(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param arrayOfPage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_pagesResult arrayOfPage(Page... arrayOfPage) {
        if (this.arrayOfPage == null) {
            setArrayOfPage(new java.util.ArrayList<Page>(arrayOfPage.length));
        }
        for (Page ele : arrayOfPage) {
            this.arrayOfPage.add(ele);
        }
        return this;
    }

    /**
     * @param arrayOfPage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_pagesResult arrayOfPage(java.util.Collection<Page> arrayOfPage) {
        setArrayOfPage(arrayOfPage);
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
        if (getArrayOfPage() != null)
            sb.append("ArrayOfPage: ").append(getArrayOfPage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_all_pagesResult == false)
            return false;
        Get_all_pagesResult other = (Get_all_pagesResult) obj;
        if (other.getArrayOfPage() == null ^ this.getArrayOfPage() == null)
            return false;
        if (other.getArrayOfPage() != null && other.getArrayOfPage().equals(this.getArrayOfPage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayOfPage() == null) ? 0 : getArrayOfPage().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_pagesResult clone() {
        try {
            return (Get_all_pagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
