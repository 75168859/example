package cn.pattern.strategy1;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class DaoSupport<T> implements Dao<T> {

	@Override
	public T findById(Serializable id, String sql,RowMapper<T> rm) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		T t = null;
		try {
			con = JdbcUtil.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setObject(1, id);
			rs  = pstmt.executeQuery();
			if(rs.next()){
				//把这条记录包装成对象
				//具体的表才知道具体如何去包装
				t = rm.getRow(rs);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return t;
	}

	@Override
	public int saveOrDelOrUpdate(String sql, Object... obj) {

		return 0;
	}

	@Override
	public List<T> find(String sql, Object... obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
