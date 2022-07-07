package adder.Adder.Adder.statechans.Client;

import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.statechans.Client.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<Adder, Client> implements Succ_Out_Server_quit {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<Adder, Client> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}