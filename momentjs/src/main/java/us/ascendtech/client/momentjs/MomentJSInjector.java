package us.ascendtech.client.momentjs;

import com.google.gwt.core.client.ScriptInjector;
import us.ascendtech.client.momentjs.js.MomentJSBundle;

public class MomentJSInjector {

	public static void injectMomentJS() {
		ScriptInjector.fromString(MomentJSBundle.INSTANCE.momentjs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

}
