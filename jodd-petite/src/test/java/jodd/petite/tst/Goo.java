// Copyright (c) 2003-present, Jodd Team (jodd.org). All Rights Reserved.

package jodd.petite.tst;

import jodd.petite.meta.PetiteInject;

public class Goo {

	public Foo foo;

	@PetiteInject("loo")
	public Loo looCustom;

}
