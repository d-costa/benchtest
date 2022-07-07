package adder.Adder.Adder.statechans.Client;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class Adder_Client_3_Future extends org.scribble.runtime.util.ScribFuture {
	public java.lang.Integer pay1;

	protected Adder_Client_3_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public Adder_Client_3_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (java.lang.Integer) m.payload[0];
		return this;
	}
}