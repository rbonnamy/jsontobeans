package jsontobeans.ex4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jsontobeans.communs.TextDto;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActeurWithIgnoreDto {

	private String title;
	private int pageid;
	private TextDto text;

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
	public TextDto getText() {
		return text;
	}

	/** Setter
	 * @param text the text to set
	 */
	public void setText(TextDto text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Acteur [title=" + title + ", pageid=" + pageid + ", text=" + text + "]";
	}
}
