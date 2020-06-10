package net.jplugin.core.lock;

import net.jplugin.core.kernel.api.AbstractBasicPlugin;
import net.jplugin.core.kernel.api.CoreServicePriority;

public class Plugin extends AbstractBasicPlugin{

	public void onCreateServices() {
		
	}

	@Override
	public int getPrivority() {
		return CoreServicePriority.LOCK;
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}

}
