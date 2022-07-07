package twobuyer.TwoBuyer.TwoBuyer.statechans.A;

import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces.*;

public final class TwoBuyer_A_2 extends org.scribble.runtime.statechans.ReceiveSocket<TwoBuyer, A> implements Receive_A_Seller_price_int<TwoBuyer_A_3> {
	public static final TwoBuyer_A_2 cast = null;

	protected TwoBuyer_A_2(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, A> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_A_3 receive(Seller role, price op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.Seller);
		arg1.val = (java.lang.Integer) m.payload[0];
		return new TwoBuyer_A_3(this.se, true);
	}

	public TwoBuyer_A_3 async(Seller role, price op, org.scribble.runtime.util.Buf<TwoBuyer_A_2_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new TwoBuyer_A_2_Future(super.getFuture(TwoBuyer.Seller));
		return new TwoBuyer_A_3(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(TwoBuyer.Seller);
	}

	@SuppressWarnings("unchecked")
	public TwoBuyer_A_3 async(Seller role, price op) throws org.scribble.main.ScribRuntimeException {
		return async(TwoBuyer.Seller, op, (org.scribble.runtime.util.Buf<TwoBuyer_A_2_Future>) this.se.gc);
	}
}