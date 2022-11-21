package jsontobeans.communs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextDto {

	@JsonProperty("*")
	private String value;

	/** Getter
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/** Setter
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "TextDto [value=" + value + "]";
	}
}
