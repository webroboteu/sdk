/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_page" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_pageResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private ConceptAttribute conceptAttribute;

    /**
     * @param conceptAttribute
     */

    public void setConceptAttribute(ConceptAttribute conceptAttribute) {
        this.conceptAttribute = conceptAttribute;
    }

    /**
     * @return
     */

    public ConceptAttribute getConceptAttribute() {
        return this.conceptAttribute;
    }

    /**
     * @param conceptAttribute
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_pageResult conceptAttribute(ConceptAttribute conceptAttribute) {
        setConceptAttribute(conceptAttribute);
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
        if (getConceptAttribute() != null)
            sb.append("ConceptAttribute: ").append(getConceptAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_pageResult == false)
            return false;
        Get_pageResult other = (Get_pageResult) obj;
        if (other.getConceptAttribute() == null ^ this.getConceptAttribute() == null)
            return false;
        if (other.getConceptAttribute() != null && other.getConceptAttribute().equals(this.getConceptAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConceptAttribute() == null) ? 0 : getConceptAttribute().hashCode());
        return hashCode;
    }

    @Override
    public Get_pageResult clone() {
        try {
            return (Get_pageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
