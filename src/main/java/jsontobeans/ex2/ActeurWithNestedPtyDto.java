package jsontobeans.ex2;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActeurWithNestedPtyDto {

	private String title;
	private int pageid;
	private String text;
	
	@JsonProperty("text")
	private void unpackNameFromNestedObject(Map<String, String> textObject) {
		text = textObject.get("*");
	}

	/** Getter
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/** Setter
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/** Getter
	 * @return the pageid
	 */
	public int getPageid() {
		return pageid;
	}

	/** Setter
	 * @param pageid the pageid to set
	 */
	public void setPageid(int pageid) {
		this.pageid = pageid;
	}

	/** Getter
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/** Setter
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Acteur [title=" + title + ", pageid=" + pageid + ", text=" + text + "]";
	}
}
