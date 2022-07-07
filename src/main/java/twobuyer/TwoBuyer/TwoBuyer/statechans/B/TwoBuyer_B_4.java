package twobuyer.TwoBuyer.TwoBuyer.statechans.B;

import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces.*;

public final class TwoBuyer_B_4 extends org.scribble.runtime.statechans.ReceiveSocket<TwoBuyer, B> implements Receive_B_Seller_date_Date<TwoBuyer_B_5> {
	public static final TwoBuyer_B_4 cast = null;

	protected TwoBuyer_B_4(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, B> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_B_5 receive(Seller role, date op, org.scribble.runtime.util.Buf<? super java.util.Date> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.Seller);
		arg1.val = (java.util.Date) m.payload[0];
		return new TwoBuyer_B_5(this.se, true);
	}

	public TwoBuyer_B_5 async(Seller role, date op, org.scribble.runtime.util.Buf<TwoBuyer_B_4_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new TwoBuyer_B_4_Future(super.getFuture(TwoBuyer.Seller));
		return new TwoBuyer_B_5(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(TwoBuyer.Seller);
	}

	@SuppressWarnings("unchecked")
	public TwoBuyer_B_5 async(Seller role, date op) throws org.scribble.main.ScribRuntimeException {
		return async(TwoBuyer.Seller, op, (org.scribble.runtime.util.Buf<TwoBuyer_B_4_Future>) this.se.gc);
	}
}