/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_concept" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_conceptResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private Concept concept;

    /**
     * @param concept
     */

    public void setConcept(Concept concept) {
        this.concept = concept;
    }

    /**
     * @return
     */

    public Concept getConcept() {
        return this.concept;
    }

    /**
     * @param concept
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_conceptResult concept(Concept concept) {
        setConcept(concept);
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
        if (getConcept() != null)
            sb.append("Concept: ").append(getConcept());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_conceptResult == false)
            return false;
        Get_conceptResult other = (Get_conceptResult) obj;
        if (other.getConcept() == null ^ this.getConcept() == null)
            return false;
        if (other.getConcept() != null && other.getConcept().equals(this.getConcept()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConcept() == null) ? 0 : getConcept().hashCode());
        return hashCode;
    }

    @Override
    public Get_conceptResult clone() {
        try {
            return (Get_conceptResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
