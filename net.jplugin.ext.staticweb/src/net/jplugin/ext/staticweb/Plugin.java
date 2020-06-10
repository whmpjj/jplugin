package net.jplugin.ext.staticweb;

import net.jplugin.core.kernel.api.AbstractBasicPlugin;
import net.jplugin.core.kernel.api.CorePlugin;
import net.jplugin.core.kernel.api.CoreServicePriority;

public class Plugin extends AbstractBasicPlugin{

	@Override
	public void init() {
		
	}

	@Override
	public int getPrivority() {
		return CoreServicePriority.STATIC_WEB;
	}

}
