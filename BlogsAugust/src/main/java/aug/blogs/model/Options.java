package aug.blogs.model;

import java.io.Serializable;

public class Options implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String value;
	private String autoLoad;
	
	public Options() {
		
	}

	public Options(int id, String name, String value, String autoLoad) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.autoLoad = autoLoad;
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getAutoLoad() {
		return autoLoad;
	}

	public void setAutoLoad(String autoLoad) {
		this.autoLoad = autoLoad;
	}

	@Override
	public String toString() {
		return "Options [id=" + id + ", name=" + name + ", value=" + value
				+ ", autoLoad=" + autoLoad + "]";
	}
	
}
