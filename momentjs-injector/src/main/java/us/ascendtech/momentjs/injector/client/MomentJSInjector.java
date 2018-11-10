package us.ascendtech.momentjs.injector.client;

import com.google.gwt.core.client.ScriptInjector;

public class MomentJSInjector {

	public static void injectMomentJS() {
		ScriptInjector.fromString(MomentJSBundle.INSTANCE.momentjs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

}
