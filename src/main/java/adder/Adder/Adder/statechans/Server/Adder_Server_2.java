package adder.Adder.Adder.statechans.Server;

import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;
import adder.Adder.Adder.statechans.Server.ioifaces.*;

public final class Adder_Server_2 extends org.scribble.runtime.statechans.ReceiveSocket<Adder, Server> implements Receive_Server_Client_v2_int<Adder_Server_3> {
	public static final Adder_Server_2 cast = null;

	protected Adder_Server_2(org.scribble.runtime.session.SessionEndpoint<Adder, Server> se, boolean dummy) {
		super(se);
	}

	public Adder_Server_3 receive(Client role, v2 op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Adder.Client);
		arg1.val = (java.lang.Integer) m.payload[0];
		return new Adder_Server_3(this.se, true);
	}

	public Adder_Server_3 async(Client role, v2 op, org.scribble.runtime.util.Buf<Adder_Server_2_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new Adder_Server_2_Future(super.getFuture(Adder.Client));
		return new Adder_Server_3(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(Adder.Client);
	}

	@SuppressWarnings("unchecked")
	public Adder_Server_3 async(Client role, v2 op) throws org.scribble.main.ScribRuntimeException {
		return async(Adder.Client, op, (org.scribble.runtime.util.Buf<Adder_Server_2_Future>) this.se.gc);
	}
}