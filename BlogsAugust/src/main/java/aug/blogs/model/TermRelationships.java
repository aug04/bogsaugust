package aug.blogs.model;

import java.io.Serializable;

public class TermRelationships implements Serializable {

	private static final long serialVersionUID = 1L;

	private int objectId;
	private int termTaxonomyId;
	private int termOrder;
	
	public TermRelationships() {
		
	}

	public TermRelationships(int objectId, int termTaxonomyId, int termOrder) {
		super();
		this.objectId = objectId;
		this.termTaxonomyId = termTaxonomyId;
		this.termOrder = termOrder;
	}

	public int getObjectId() {
		return objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	public int getTermTaxonomyId() {
		return termTaxonomyId;
	}

	public void setTermTaxonomyId(int termTaxonomyId) {
		this.termTaxonomyId = termTaxonomyId;
	}

	public int getTermOrder() {
		return termOrder;
	}

	public void setTermOrder(int termOrder) {
		this.termOrder = termOrder;
	}

	@Override
	public String toString() {
		return "TermRelationships [objectId=" + objectId + ", termTaxonomyId="
				+ termTaxonomyId + ", termOrder=" + termOrder + "]";
	}
	
}
