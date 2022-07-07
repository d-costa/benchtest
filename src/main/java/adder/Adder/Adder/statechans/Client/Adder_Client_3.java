package adder.Adder.Adder.statechans.Client;

import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;
import adder.Adder.Adder.statechans.Client.ioifaces.*;

public final class Adder_Client_3 extends org.scribble.runtime.statechans.ReceiveSocket<Adder, Client> implements Receive_Client_Server_sum_int<Adder_Client_1> {
	public static final Adder_Client_3 cast = null;

	protected Adder_Client_3(org.scribble.runtime.session.SessionEndpoint<Adder, Client> se, boolean dummy) {
		super(se);
	}

	public Adder_Client_1 receive(Server role, sum op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Adder.Server);
		arg1.val = (java.lang.Integer) m.payload[0];
		return new Adder_Client_1(this.se, true);
	}

	public Adder_Client_1 async(Server role, sum op, org.scribble.runtime.util.Buf<Adder_Client_3_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new Adder_Client_3_Future(super.getFuture(Adder.Server));
		return new Adder_Client_1(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(Adder.Server);
	}

	@SuppressWarnings("unchecked")
	public Adder_Client_1 async(Server role, sum op) throws org.scribble.main.ScribRuntimeException {
		return async(Adder.Server, op, (org.scribble.runtime.util.Buf<Adder_Client_3_Future>) this.se.gc);
	}
}