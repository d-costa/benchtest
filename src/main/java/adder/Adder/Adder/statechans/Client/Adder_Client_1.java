package adder.Adder.Adder.statechans.Client;

import java.io.IOException;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;
import adder.Adder.Adder.statechans.Client.ioifaces.*;

public final class Adder_Client_1 extends org.scribble.runtime.statechans.OutputSocket<Adder, Client> implements Select_Client_Server_quit__Server_v1_int<EndSocket, Adder_Client_2> {
	public static final Adder_Client_1 cast = null;

	protected Adder_Client_1(org.scribble.runtime.session.SessionEndpoint<Adder, Client> se, boolean dummy) {
		super(se);
	}

	public Adder_Client_1(org.scribble.runtime.session.MPSTEndpoint<Adder, Client> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public adder.Adder.Adder.statechans.Client.EndSocket send(Server role, quit op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Adder.quit);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public Adder_Client_2 send(Server role, v1 op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Adder.v1, arg0);

		return new Adder_Client_2(this.se, true);
	}
}