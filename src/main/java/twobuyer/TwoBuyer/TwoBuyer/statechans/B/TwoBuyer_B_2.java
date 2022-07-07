package twobuyer.TwoBuyer.TwoBuyer.statechans.B;

import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces.*;

public final class TwoBuyer_B_2 extends org.scribble.runtime.statechans.ReceiveSocket<TwoBuyer, B> implements Receive_B_A_aShare_int<TwoBuyer_B_3> {
	public static final TwoBuyer_B_2 cast = null;

	protected TwoBuyer_B_2(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, B> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_B_3 receive(A role, aShare op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.A);
		arg1.val = (java.lang.Integer) m.payload[0];
		return new TwoBuyer_B_3(this.se, true);
	}

	public TwoBuyer_B_3 async(A role, aShare op, org.scribble.runtime.util.Buf<TwoBuyer_B_2_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new TwoBuyer_B_2_Future(super.getFuture(TwoBuyer.A));
		return new TwoBuyer_B_3(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(TwoBuyer.A);
	}

	@SuppressWarnings("unchecked")
	public TwoBuyer_B_3 async(A role, aShare op) throws org.scribble.main.ScribRuntimeException {
		return async(TwoBuyer.A, op, (org.scribble.runtime.util.Buf<TwoBuyer_B_2_Future>) this.se.gc);
	}
}