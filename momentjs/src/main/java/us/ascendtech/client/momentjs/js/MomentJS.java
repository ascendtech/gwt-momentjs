package us.ascendtech.client.momentjs.js;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Payam Meyer
 * Docs: http://momentjs.com/docs/
 */
@JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "moment")
public class MomentJS {

	public MomentJS() {
	}

	public MomentJS(String dateTime) {
	}

	@JsMethod
	public native void add(int addition, String unit);

	@JsMethod
	public native String format(String formatting);

}
