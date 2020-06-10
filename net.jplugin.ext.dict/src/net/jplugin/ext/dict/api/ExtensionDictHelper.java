package net.jplugin.ext.dict.api;

import net.jplugin.core.kernel.api.AbstractBasicPlugin;
import net.jplugin.core.kernel.api.Extension;

public class ExtensionDictHelper {
	public static void addDictProvdExtension(AbstractBasicPlugin plugin,String name,Class impl){
		plugin.addExtension(Extension.create(net.jplugin.ext.dict.Plugin.EP_DICT_PROVIDER, name,impl));
	}
}
