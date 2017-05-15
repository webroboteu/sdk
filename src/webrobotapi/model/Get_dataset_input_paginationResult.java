/**
 * null
 */
package webrobotapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/Get_dataset_input_pagination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_input_paginationResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private java.util.List<DatasetRecord> arrayOfDatasetRecord;

    /**
     * @return
     */

    public java.util.List<DatasetRecord> getArrayOfDatasetRecord() {
        return arrayOfDatasetRecord;
    }

    /**
     * @param arrayOfDatasetRecord
     */

    public void setArrayOfDatasetRecord(java.util.Collection<DatasetRecord> arrayOfDatasetRecord) {
        if (arrayOfDatasetRecord == null) {
            this.arrayOfDatasetRecord = null;
            return;
        }

        this.arrayOfDatasetRecord = new java.util.ArrayList<DatasetRecord>(arrayOfDatasetRecord);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayOfDatasetRecord(java.util.Collection)} or {@link #withArrayOfDatasetRecord(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param arrayOfDatasetRecord
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_dataset_input_paginationResult arrayOfDatasetRecord(DatasetRecord... arrayOfDatasetRecord) {
        if (this.arrayOfDatasetRecord == null) {
            setArrayOfDatasetRecord(new java.util.ArrayList<DatasetRecord>(arrayOfDatasetRecord.length));
        }
        for (DatasetRecord ele : arrayOfDatasetRecord) {
            this.arrayOfDatasetRecord.add(ele);
        }
        return this;
    }

    /**
     * @param arrayOfDatasetRecord
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_dataset_input_paginationResult arrayOfDatasetRecord(java.util.Collection<DatasetRecord> arrayOfDatasetRecord) {
        setArrayOfDatasetRecord(arrayOfDatasetRecord);
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
        if (getArrayOfDatasetRecord() != null)
            sb.append("ArrayOfDatasetRecord: ").append(getArrayOfDatasetRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_dataset_input_paginationResult == false)
            return false;
        Get_dataset_input_paginationResult other = (Get_dataset_input_paginationResult) obj;
        if (other.getArrayOfDatasetRecord() == null ^ this.getArrayOfDatasetRecord() == null)
            return false;
        if (other.getArrayOfDatasetRecord() != null && other.getArrayOfDatasetRecord().equals(this.getArrayOfDatasetRecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayOfDatasetRecord() == null) ? 0 : getArrayOfDatasetRecord().hashCode());
        return hashCode;
    }

    @Override
    public Get_dataset_input_paginationResult clone() {
        try {
            return (Get_dataset_input_paginationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
