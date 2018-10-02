package aug.blogs.model;

import java.io.Serializable;

public class TermTaxonomy implements Serializable {

	private static final long serialVersionUID = 1L;

	private int termTaxonomyId;
	private int termId;
	private String taxonomy;
	private String description;
	private int parent;
	private int count;
	
	public TermTaxonomy() {
		
	}

	public TermTaxonomy(int termTaxonomyId, int termId, String taxonomy,
			String description, int parent, int count) {
		super();
		this.termTaxonomyId = termTaxonomyId;
		this.termId = termId;
		this.taxonomy = taxonomy;
		this.description = description;
		this.parent = parent;
		this.count = count;
	}

	public int getTermTaxonomyId() {
		return termTaxonomyId;
	}

	public void setTermTaxonomyId(int termTaxonomyId) {
		this.termTaxonomyId = termTaxonomyId;
	}

	public int getTermId() {
		return termId;
	}

	public void setTermId(int termId) {
		this.termId = termId;
	}

	public String getTaxonomy() {
		return taxonomy;
	}

	public void setTaxonomy(String taxonomy) {
		this.taxonomy = taxonomy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "TermTaxonomy [termTaxonomyId=" + termTaxonomyId + ", termId="
				+ termId + ", taxonomy=" + taxonomy + ", description="
				+ description + ", parent=" + parent + ", count=" + count + "]";
	}
	
}
