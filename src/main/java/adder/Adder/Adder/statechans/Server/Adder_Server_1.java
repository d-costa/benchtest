package adder.Adder.Adder.statechans.Server;

import java.io.IOException;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.statechans.Server.ioifaces.*;

public final class Adder_Server_1 extends org.scribble.runtime.statechans.BranchSocket<Adder, Server> implements Branch_Server_Client_quit__Client_v1_int<EndSocket, Adder_Server_2> {
	public static final Adder_Server_1 cast = null;

	protected Adder_Server_1(org.scribble.runtime.session.SessionEndpoint<Adder, Server> se, boolean dummy) {
		super(se);
	}

	public Adder_Server_1(org.scribble.runtime.session.MPSTEndpoint<Adder, Server> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public Adder_Server_1_Cases branch(Client role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Adder.Client);
		Branch_Server_Client_quit__Client_v1_int_Enum openum;
		if (m.op.equals(Adder.quit)) {
			openum = Branch_Server_Client_quit__Client_v1_int_Enum.quit;
		}
		else if (m.op.equals(Adder.v1)) {
			openum = Branch_Server_Client_quit__Client_v1_int_Enum.v1;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new Adder_Server_1_Cases(this.se, true, openum, m);
	}

	public void branch(Client role, Adder_Server_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_Server_Client_quit__Client_v1_int<EndSocket, Adder_Server_2>) handler);
	}

	@Override
	public void branch(Client role, Handle_Server_Client_quit__Client_v1_int<EndSocket, Adder_Server_2> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Adder.Client);
		if (m.op.equals(Adder.quit)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), Adder.quit);
		}
		else
		if (m.op.equals(Adder.v1)) {
			handler.receive(new Adder_Server_2(this.se, true), Adder.v1, new org.scribble.runtime.util.Buf<>((java.lang.Integer) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(Client role, Handle_Server_Client_quit__Client_v1_int<Succ_In_Client_quit, Succ_In_Client_v1_int> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Adder.Client);
		if (m.op.equals(Adder.quit)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), Adder.quit);
		}
		else
		if (m.op.equals(Adder.v1)) {
			handler.receive(new Adder_Server_2(this.se, true), Adder.v1, new org.scribble.runtime.util.Buf<>((java.lang.Integer) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}