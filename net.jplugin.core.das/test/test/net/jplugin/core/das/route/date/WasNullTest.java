package test.net.jplugin.core.das.route.date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class WasNullTest {

	public static void test(Connection conn, String string, Object[] objects) throws SQLException {
		PreparedStatement stmt = conn.prepareStatement(string);
		stmt.setTimestamp(1, (Timestamp) objects[0]);
		ResultSet rs = stmt.executeQuery();
		rs.next();
		int val = rs.getInt("count(*)");
		System.out.println(val);
		rs.wasNull();
		
		rs.close();
		stmt.close();
	}

}
