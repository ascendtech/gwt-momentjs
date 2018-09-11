package us.ascendtech.client.momentjs.js;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Payam Meyer
 * Docs: http://momentjs.com/docs/
 */
@JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Moment")
public class MomentJS {

	public MomentJS() {
	}

	public MomentJS(String dateTime) {
	}

	@JsMethod
	public native String format(String formatting);

	@JsMethod
	public native double year();

	@JsMethod
	public native double month();

	@JsMethod
	public native double day();

	@JsMethod
	public native void add(int value, String unit);

	@JsMethod
	public native void subtract(int value, String unit);

}
