package cn.pattern.strategy1;

import java.io.Serializable;
import java.util.List;

public interface Dao<T> {
	public T findById(Serializable id,String sql,RowMapper<T> rm);
	public int saveOrDelOrUpdate(String sql,Object...obj);
	public List<T> find(String sql,Object...obj);
	//...其它的都包装起来
}
