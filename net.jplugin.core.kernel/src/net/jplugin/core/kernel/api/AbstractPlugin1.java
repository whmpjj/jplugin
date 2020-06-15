package net.jplugin.core.kernel.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.jplugin.common.kits.AssertKit;
import net.jplugin.common.kits.ReflactKit;
import net.jplugin.common.kits.StringKit;
import net.jplugin.common.kits.reso.ResolverKit;

/**
 * @author: LiuHang
 * @version 创建时间：2015-2-22 上午11:43:12
 **/

public abstract class AbstractPlugin extends AbstractBasicPlugin{
	
	public AbstractPlugin() {
		List<IBindExtensionHandler> handlers = AutoBindExtensionManager.INSTANCE.getHandlers();
		for (IBindExtensionHandler h:handlers){
			h.handle(this);
		}	
	}
}
