package aug.blogs.model;

import java.io.Serializable;
import java.util.Date;

public class Posts implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private int author;
	private Date postDate;
	private Date postModified;
	private String contents;
	private String title;
	private String excerpt;
	private String status;
	private String postName;
	private String guid;
	private int termsId;
	private String postType;
	
	public Posts() {
		
	}

	public Posts(int id, int author, Date postDate, Date postModified,
			String contents, String title, String excerpt, String status,
			String postName, String guid, int termsId, String postType) {
		super();
		this.id = id;
		this.author = author;
		this.postDate = postDate;
		this.postModified = postModified;
		this.contents = contents;
		this.title = title;
		this.excerpt = excerpt;
		this.status = status;
		this.postName = postName;
		this.guid = guid;
		this.termsId = termsId;
		this.postType = postType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public Date getPostModified() {
		return postModified;
	}

	public void setPostModified(Date postModified) {
		this.postModified = postModified;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExcerpt() {
		return excerpt;
	}

	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public int getTermsId() {
		return termsId;
	}

	public void setTermsId(int termsId) {
		this.termsId = termsId;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	@Override
	public String toString() {
		return "Posts [id=" + id + ", author=" + author + ", postDate="
				+ postDate + ", postModified=" + postModified + ", contents="
				+ contents + ", title=" + title + ", excerpt=" + excerpt
				+ ", status=" + status + ", postName=" + postName + ", guid="
				+ guid + ", termsId=" + termsId + ", postType=" + postType
				+ "]";
	}
	
}
