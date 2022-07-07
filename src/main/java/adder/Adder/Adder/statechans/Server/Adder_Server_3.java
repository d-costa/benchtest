package adder.Adder.Adder.statechans.Server;

import java.io.IOException;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;
import adder.Adder.Adder.statechans.Server.ioifaces.*;

public final class Adder_Server_3 extends org.scribble.runtime.statechans.OutputSocket<Adder, Server> implements Select_Server_Client_sum_int<Adder_Server_1> {
	public static final Adder_Server_3 cast = null;

	protected Adder_Server_3(org.scribble.runtime.session.SessionEndpoint<Adder, Server> se, boolean dummy) {
		super(se);
	}

	public Adder_Server_1 send(Client role, sum op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Adder.sum, arg0);

		return new Adder_Server_1(this.se, true);
	}
}