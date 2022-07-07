package twobuyer.TwoBuyer.TwoBuyer.statechans.B;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class TwoBuyer_B_2_Future extends org.scribble.runtime.util.ScribFuture {
	public java.lang.Integer pay1;

	protected TwoBuyer_B_2_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public TwoBuyer_B_2_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (java.lang.Integer) m.payload[0];
		return this;
	}
}