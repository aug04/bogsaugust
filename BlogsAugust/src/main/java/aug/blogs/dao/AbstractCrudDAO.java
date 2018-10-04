package aug.blogs.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class AbstractCrudDAO extends SqlSessionDaoSupport implements CommonCrudDAO {

	protected String namespace;
	
	public String getNamespace() {
		return namespace;
	}
	
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	@Override
	public List<?> list(String name) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectList(_namespace);
	}

	@Override
	public List<?> list(String namespace, String name) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectList(_namespace);
	}

	@Override
	public List<?> list(String name, Object parameters) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectList(_namespace, parameters);
	}

	@Override
	public List<?> list(String namespace, String name, Object parameters)
			throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectList(_namespace, parameters);
	}

	@Override
	public Map<?, ?> map(String name, String mapKey) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectMap(_namespace, mapKey);
	}

	@Override
	public Map<?, ?> map(String name, Object parameters) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectOne(_namespace, parameters);
	}

	@Override
	public Map<?, ?> map(String name, Object parameters, String mapKey)
			throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectMap(_namespace, parameters, mapKey);
	}

	@Override
	public Object object(String name) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectOne(_namespace);
	}

	@Override
	public Object object(String namespace, String name) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectOne(_namespace);
	}

	@Override
	public Object objectString(String name, String parameters) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectOne(_namespace, parameters);
	}

	@Override
	public Object object(String name, Object parameters) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectOne(_namespace, parameters);
	}

	@Override
	public Object object(String namespace, String name, Object parameters)
			throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().selectOne(_namespace, parameters);
	}

	@Override
	public Object insert() throws Exception {
		String _namespace = new StringBuilder().append(namespace).append(".insert").toString();
		return this.getSqlSession().insert(_namespace);
	}

	@Override
	public Object insert(Object parameters) throws Exception {
		String _namespace = new StringBuilder().append(namespace).append(".insert").toString();
		return this.getSqlSession().insert(_namespace, parameters);
	}

	@Override
	public Object insert(String name, Object parameters) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().insert(_namespace, parameters);
	}

	@Override
	public Object insert(String namespace, String name, Object parameters)
			throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().insert(_namespace, parameters);
	}

	@Override
	public Object update(Object parameters) throws Exception {
		String _namespace = new StringBuilder().append(namespace).append(".update").toString();
		return this.getSqlSession().update(_namespace, parameters);
	}

	@Override
	public Object update(String name, Object parameters) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().update(_namespace, parameters);
	}

	@Override
	public Object update(String namespace, String name, Object parameters)
			throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().update(_namespace, parameters);
	}

	@Override
	public Object delete() throws Exception {
		String _namespace = new StringBuilder().append(namespace).append(".delete").toString();
		return this.getSqlSession().delete(_namespace);
	}

	@Override
	public Object delete(Object parameters) throws Exception {
		String _namespace = new StringBuilder().append(namespace).append(".delete").toString();
		return this.getSqlSession().delete(_namespace, parameters);
	}

	@Override
	public Object delete(String name, Object parameters) throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().delete(_namespace, parameters);
	}

	@Override
	public Object delete(String namespace, String name, Object parameters)
			throws Exception {
		String _namespace = _getNamespace(namespace, name);
		return this.getSqlSession().delete(_namespace, parameters);
	}

	private String _getNamespace(String namespace, String name) {
		return new StringBuilder().append(namespace).append(".").append(name).toString();
	}
	
}
