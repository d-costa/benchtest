package twobuyer.TwoBuyer.TwoBuyer.statechans.B;

import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces.*;

public final class TwoBuyer_B_1_Cases extends org.scribble.runtime.statechans.CaseSocket<TwoBuyer, B> implements Case_B_Seller_Quit__Seller_price_int<EndSocket, TwoBuyer_B_2> {
	public static final TwoBuyer_B_1_Cases cast = null;
	public final TwoBuyer_B_1.Branch_B_Seller_Quit__Seller_price_int_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected TwoBuyer_B_1_Cases(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, B> se, boolean dummy, TwoBuyer_B_1.Branch_B_Seller_Quit__Seller_price_int_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public TwoBuyer_B_2 receive(Seller role, price op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(TwoBuyer.price)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Integer) m.payload[0];
		return new TwoBuyer_B_2(this.se, true);
	}

	public TwoBuyer_B_2 receive(price op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(TwoBuyer.Seller, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public TwoBuyer_B_2 receive(price op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Integer>) this.se.gc);
	}

	public twobuyer.TwoBuyer.TwoBuyer.statechans.B.EndSocket receive(Seller role, Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(TwoBuyer.Quit)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public twobuyer.TwoBuyer.TwoBuyer.statechans.B.EndSocket receive(Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(TwoBuyer.Seller, op);
	}

	@Override
	public Branch_B_Seller_Quit__Seller_price_int.Branch_B_Seller_Quit__Seller_price_int_Enum getOp() {
		return this.op;
	}
}