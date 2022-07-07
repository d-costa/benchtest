package adder.Adder.Adder.statechans.Server;

import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.statechans.Server.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<Adder, Server> implements Succ_In_Client_quit {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<Adder, Server> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}