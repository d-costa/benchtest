package adder.Adder.Adder.statechans.Server;

import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;
import adder.Adder.Adder.statechans.Server.ioifaces.*;

public final class Adder_Server_1_Cases extends org.scribble.runtime.statechans.CaseSocket<Adder, Server> implements Case_Server_Client_quit__Client_v1_int<EndSocket, Adder_Server_2> {
	public static final Adder_Server_1_Cases cast = null;
	public final Adder_Server_1.Branch_Server_Client_quit__Client_v1_int_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected Adder_Server_1_Cases(org.scribble.runtime.session.SessionEndpoint<Adder, Server> se, boolean dummy, Adder_Server_1.Branch_Server_Client_quit__Client_v1_int_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public adder.Adder.Adder.statechans.Server.EndSocket receive(Client role, quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(Adder.quit)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public adder.Adder.Adder.statechans.Server.EndSocket receive(quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(Adder.Client, op);
	}

	public Adder_Server_2 receive(Client role, v1 op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(Adder.v1)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Integer) m.payload[0];
		return new Adder_Server_2(this.se, true);
	}

	public Adder_Server_2 receive(v1 op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(Adder.Client, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public Adder_Server_2 receive(v1 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Integer>) this.se.gc);
	}

	@Override
	public Branch_Server_Client_quit__Client_v1_int.Branch_Server_Client_quit__Client_v1_int_Enum getOp() {
		return this.op;
	}
}