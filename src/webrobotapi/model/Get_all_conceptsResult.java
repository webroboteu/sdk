/**
 null
 */
package webrobotapi.model;
import java.io.Serializable;
import javax.annotation.Generated;

/**

 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/Get all concepts" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_conceptsResult extends com.amazonaws.opensdk.BaseResult
        implements Serializable, Cloneable {


private java.util.List<Concept> arrayOfConcept;





/**
 @return */

public java.util.List<Concept> getArrayOfConcept() {
        return arrayOfConcept;
        }

/**
 @param arrayOfConcept */

public void setArrayOfConcept(java.util.Collection<Concept> arrayOfConcept){
        if (arrayOfConcept == null) {
        this.arrayOfConcept = null;
        return;
        }

        this.arrayOfConcept =
        new java.util.ArrayList<Concept>(arrayOfConcept);
        }

/**
 <p><b>NOTE:</b> This method appends the values to the existing list (if any). Use {@link #setArrayOfConcept(java.util.Collection)} or {@link #withArrayOfConcept(java.util.Collection)} if you want to override the existing values.</p>
 @param arrayOfConcept
 @return Returns a reference to this object so that method calls can be chained together.*/

public Get_all_conceptsResult arrayOfConcept(Concept... arrayOfConcept){
        if (this.arrayOfConcept == null) {
        setArrayOfConcept(new java.util.ArrayList<Concept>(arrayOfConcept.length));
        }
        for (Concept ele : arrayOfConcept) {
        this.arrayOfConcept.add(ele);
        }
        return this;
        }

/**
 @param arrayOfConcept
 @return Returns a reference to this object so that method calls can be chained together.*/

public Get_all_conceptsResult arrayOfConcept(java.util.Collection<Concept> arrayOfConcept){
        setArrayOfConcept(arrayOfConcept);
        return this;
        }





/**
 * Returns a string representation of this object; useful for testing and
 * debugging.
 *
 * @return A string representation of this object.
 *
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArrayOfConcept() != null) sb.append("ArrayOfConcept: ").append(getArrayOfConcept());
        sb.append("}");
        return sb.toString();
        }

@Override
public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Get_all_conceptsResult == false) return false;
        Get_all_conceptsResult other = (Get_all_conceptsResult)obj;
        if (other.getArrayOfConcept() == null ^ this.getArrayOfConcept() == null) return false;
        if (other.getArrayOfConcept() != null && other.getArrayOfConcept().equals(this.getArrayOfConcept()) == false) return false;
        return true;
        }

@Override
public int hashCode() {
final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayOfConcept() == null) ? 0 : getArrayOfConcept().hashCode());
        return hashCode;
        }

@Override
public Get_all_conceptsResult clone() {
        try {
        return (Get_all_conceptsResult) super.clone();
        } catch (CloneNotSupportedException e) {
        throw new IllegalStateException(
        "Got a CloneNotSupportedException from Object.clone() "
        + "even though we're Cloneable!",
        e);
        }
        }

        }
