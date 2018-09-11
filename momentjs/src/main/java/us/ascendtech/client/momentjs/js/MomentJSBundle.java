package us.ascendtech.client.momentjs.js;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface MomentJSBundle extends ClientBundle {

	MomentJSBundle INSTANCE = GWT.create(MomentJSBundle.class);

	@Source("moment.min.js")
	TextResource momentjs();

}
