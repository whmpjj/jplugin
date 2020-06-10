package net.jplugin.core.config;

import net.jplugin.core.kernel.api.AbstractBasicPlugin;
import net.jplugin.core.kernel.api.Extension;

public class ExtensionConfigHelper {
	public static void addConfigChangeHandlerExtension(AbstractBasicPlugin plugin,String keyformat,Class t){
		plugin.addExtension(Extension.create(Plugin.EP_CONFIG_CHANGE_HANDLER,keyformat,t));
	}
}
