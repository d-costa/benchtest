package adder.Adder.Adder.statechans.Server;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class Adder_Server_2_Future extends org.scribble.runtime.util.ScribFuture {
	public java.lang.Integer pay1;

	protected Adder_Server_2_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public Adder_Server_2_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (java.lang.Integer) m.payload[0];
		return this;
	}
}