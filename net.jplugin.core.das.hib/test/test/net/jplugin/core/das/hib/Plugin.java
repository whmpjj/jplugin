package test.net.jplugin.core.das.hib;

import test.net.luis.plugin.das.hib.DBPojoIdNativeTest;
import test.net.luis.plugin.das.hib.DBPojoTest;
import test.net.luis.plugin.das.hib.DasTest;
import test.net.luis.plugin.das.hib.StatementTest;
import test.net.luis.plugin.das.hib.mt.MtPojo;
import test.net.luis.plugin.das.hib.mt.MtServiceTest;
import test.net.luis.plugin.das.hib.mt.NonMtPojo;
import net.jplugin.core.das.hib.api.ExtensionDasHelper;
import net.jplugin.core.kernel.api.AbstractPluginForTest;
import net.jplugin.core.kernel.api.CoreServicePriority;

/**
 *
 * @author: LiuHang
 * @version 创建时间：2015-2-5 下午06:13:07
 **/

public class Plugin extends AbstractPluginForTest{

	public Plugin(){
		ExtensionDasHelper.addDataMappingExtension(this, DBHibTest.class);
		
		
		ExtensionDasHelper.addDataMappingExtension(this, DBPojoTest.class);
		ExtensionDasHelper.addDataMappingExtension(this, DBPojoIdNativeTest.class);
		
		ExtensionDasHelper.addDataMappingExtension(this, MtPojo.class);
		ExtensionDasHelper.addDataMappingExtension(this, NonMtPojo.class);
	}
	/* (non-Javadoc)
	 * @see net.luis.plugin.kernel.api.AbstractPluginForTest#test()
	 */
	@Override
	public void test() throws Exception {
		new HibTest().test();
		
//		DasTest.test();
//		StatementTest.test();
//		new MtServiceTest().test();
	}

	/* (non-Javadoc)
	 * @see net.luis.plugin.kernel.api.AbstractPlugin#getPrivority()
	 */
	@Override
	public int getPrivority() {
		return CoreServicePriority.DAS_HIB+1;
	}

}
