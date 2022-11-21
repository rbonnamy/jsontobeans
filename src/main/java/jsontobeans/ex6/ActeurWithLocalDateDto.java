package jsontobeans.ex6;

import java.time.LocalDate;

import jsontobeans.communs.TextDto;

public class ActeurWithLocalDateDto {

	private String title;
	private int pageid;
	private LocalDate dateNaissance;
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


	/** Getter
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/** Setter
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "ActeurWithDateDto [title=" + title + ", pageid=" + pageid + ", dateNaissance=" + dateNaissance
				+ ", text=" + text + "]";
	}
}
