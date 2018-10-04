package aug.blogs.dao;

import java.util.List;
import java.util.Map;

public interface CommonCrudDAO {

	public List<?> list(String name) throws Exception;

	public List<?> list(String namespace, String name) throws Exception;

	public List<?> list(String name, Object parameters) throws Exception;

	public List<?> list(String namespace, String name, Object parameters)
			throws Exception;

	public Map<?, ?> map(String name, String mapKey) throws Exception;

	public Map<?, ?> map(String name, Object parameters) throws Exception;

	public Map<?, ?> map(String name, Object parameters, String mapKey)
			throws Exception;

	public Object object(String name) throws Exception;

	public Object object(String namespace, String name) throws Exception;

	public Object objectString(String name, String parameters) throws Exception;

	public Object object(String name, Object parameters) throws Exception;

	public Object object(String namespace, String name, Object parameters)
			throws Exception;

	public Object insert() throws Exception;

	public Object insert(Object parameters) throws Exception;

	public Object insert(String name, Object parameters) throws Exception;

	public Object insert(String namespace, String name, Object parameters)
			throws Exception;

	public Object update(Object parameters) throws Exception;

	public Object update(String name, Object parameters) throws Exception;

	public Object update(String namespace, String name, Object parameters)
			throws Exception;

	public Object delete() throws Exception;

	public Object delete(Object parameters) throws Exception;

	public Object delete(String name, Object parameters) throws Exception;

	public Object delete(String namespace, String name, Object parameters)
			throws Exception;

}
