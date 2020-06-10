package net.jplugin.core.mtenant;

import net.jplugin.core.kernel.api.AbstractBasicPlugin;
import net.jplugin.core.kernel.api.Extension;

public class ExtensionMTenantHelper {
	public static void addTenantListProvidorExtension(AbstractBasicPlugin p,Class c){
		p.addExtension(Extension.create(net.jplugin.core.mtenant.Plugin.EP_TENANTLIST_PROVIDOR, c));
	}
	public static void addTenantStoreStgProvider(AbstractBasicPlugin p,Class c){
		p.addExtension(Extension.create(net.jplugin.core.mtenant.Plugin.EP_TENANT_STORESTG_PROVIDOR, c));
	}
}
