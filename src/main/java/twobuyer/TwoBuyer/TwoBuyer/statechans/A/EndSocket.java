package twobuyer.TwoBuyer.TwoBuyer.statechans.A;

import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<TwoBuyer, A> implements Succ_Out_Seller_Quit {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, A> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}