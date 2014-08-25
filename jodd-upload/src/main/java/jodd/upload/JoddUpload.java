// Copyright (c) 2003-2014, Jodd Team (jodd.org). All Rights Reserved.

package jodd.upload;

import jodd.Jodd;
import jodd.JoddModule;
import jodd.upload.typeconverter.FileUploadBinder;

/**
 * Jodd UPLOAD module.
 */
public class JoddUpload implements JoddModule {

	static {
		init();
	}

	public static void init() {
		Jodd.init(JoddUpload.class);
	}

	public void start() {
		if (Jodd.isModuleLoaded(Jodd.BEAN)) {
			FileUploadBinder.registerTypeConverter();
		}
	}

}