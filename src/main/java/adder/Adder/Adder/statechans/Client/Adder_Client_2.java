package adder.Adder.Adder.statechans.Client;

import java.io.IOException;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;
import adder.Adder.Adder.statechans.Client.ioifaces.*;

public final class Adder_Client_2 extends org.scribble.runtime.statechans.OutputSocket<Adder, Client> implements Select_Client_Server_v2_int<Adder_Client_3> {
	public static final Adder_Client_2 cast = null;

	protected Adder_Client_2(org.scribble.runtime.session.SessionEndpoint<Adder, Client> se, boolean dummy) {
		super(se);
	}

	public Adder_Client_3 send(Server role, v2 op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Adder.v2, arg0);

		return new Adder_Client_3(this.se, true);
	}
}