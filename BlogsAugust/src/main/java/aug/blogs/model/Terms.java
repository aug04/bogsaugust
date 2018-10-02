package aug.blogs.model;

import java.io.Serializable;

public class Terms implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String slug;
	private int termGroup;
	
	public Terms() {
		
	}

	public Terms(int id, String name, String slug, int termGroup) {
		super();
		this.id = id;
		this.name = name;
		this.slug = slug;
		this.termGroup = termGroup;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public int getTermGroup() {
		return termGroup;
	}

	public void setTermGroup(int termGroup) {
		this.termGroup = termGroup;
	}

	@Override
	public String toString() {
		return "Terms [id=" + id + ", name=" + name + ", slug=" + slug
				+ ", termGroup=" + termGroup + "]";
	}
	
}
