package adder.Adder.Adder;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.scribble.core.type.name.Role;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;

public final class Adder extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("adder.Adder.Adder");
	public static final Client Client = adder.Adder.Adder.roles.Client.Client;
	public static final Server Server = adder.Adder.Adder.roles.Server.Server;
	public static final quit quit = adder.Adder.Adder.ops.quit.quit;
	public static final sum sum = adder.Adder.Adder.ops.sum.sum;
	public static final v2 v2 = adder.Adder.Adder.ops.v2.v2;
	public static final v1 v1 = adder.Adder.Adder.ops.v1.v1;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(new Role[] {Client, Server}));

	public Adder() {
		super(Adder.IMPATH, Adder.SOURCE, Adder.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return Adder.ROLES;
	}
}