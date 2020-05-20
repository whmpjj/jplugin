package test.net.jplugin.core.das.select_router;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import net.jplugin.common.kits.AssertKit;
import net.jplugin.core.das.api.DataSourceFactory;
import net.jplugin.core.das.api.SQLTemplate;

public class SelectRouterTest {

	public void test() throws SQLException {
//		DbCreate4Router.drop();
//		DbCreate4Router.createDb();
		DbCreate4Router.create();
		
		DataSource dsa = DataSourceFactory.getDataSource("the-db_a");
		DataSource dsb = DataSourceFactory.getDataSource("the-db_b");
		DataSource dsc = DataSourceFactory.getDataSource("the-db_c");
		
		DataSource ds_select = DataSourceFactory.getDataSource("the-select-db");
		
		SQLTemplate.executeInsertSql(ds_select.getConnection(), "insert into the_tb1(f1) values ('a')", null);
		List<Map<String, String>> result = SQLTemplate.executeSelect(ds_select.getConnection(), "select count(*) c from the_tb1", null);
		AssertKit.assertEqual("1",result.get(0).get("c")+"");
		
		SQLTemplate.executeInsertSql(ds_select.getConnection(), "insert into the_tb2(f1) values ('a')", null);
		result = SQLTemplate.executeSelect(ds_select.getConnection(), "select count(*) c from the_tb2", null);
		AssertKit.assertEqual("1",result.get(0).get("c")+"");
		
		SQLTemplate.executeInsertSql(ds_select.getConnection(), "insert into the_tb3(f1) values ('a')", null);
		result = SQLTemplate.executeSelect(ds_select.getConnection(), "select count(*) c from the_tb3", null);
		AssertKit.assertEqual("1",result.get(0).get("c")+"");
		
		
		
		
		
	}
}
