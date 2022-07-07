package twobuyer.TwoBuyer.TwoBuyer.statechans.B;

import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<TwoBuyer, B> implements Succ_In_Seller_Quit {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, B> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}