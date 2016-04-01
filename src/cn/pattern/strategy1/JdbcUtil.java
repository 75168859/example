package cn.pattern.strategy1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtil {
	private static Properties prop = new Properties();
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	static {
		try {
			prop.load(JdbcUtil.class
					.getResourceAsStream("/jdbc/database.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		Connection con = tl.get();
		if (con == null) {
			try {
				Class.forName(prop.getProperty("driver"));
				con = DriverManager.getConnection(prop.getProperty("url"),
						prop.getProperty("name"), prop.getProperty("pass"));
				tl.set(con);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		return con;
	}
}
