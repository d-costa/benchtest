package twobuyer.TwoBuyer.TwoBuyer.statechans.B;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class TwoBuyer_B_4_Future extends org.scribble.runtime.util.ScribFuture {
	public java.util.Date pay1;

	protected TwoBuyer_B_4_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public TwoBuyer_B_4_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (java.util.Date) m.payload[0];
		return this;
	}
}