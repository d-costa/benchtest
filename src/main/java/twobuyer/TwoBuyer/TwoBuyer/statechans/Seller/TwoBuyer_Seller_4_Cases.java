package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller;

import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces.*;

public final class TwoBuyer_Seller_4_Cases extends org.scribble.runtime.statechans.CaseSocket<TwoBuyer, Seller> implements Case_Seller_B_address_String__B_reject<TwoBuyer_Seller_5, TwoBuyer_Seller_1> {
	public static final TwoBuyer_Seller_4_Cases cast = null;
	public final TwoBuyer_Seller_4.Branch_Seller_B_address_String__B_reject_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected TwoBuyer_Seller_4_Cases(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, Seller> se, boolean dummy, TwoBuyer_Seller_4.Branch_Seller_B_address_String__B_reject_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public TwoBuyer_Seller_5 receive(B role, address op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(TwoBuyer.address)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		return new TwoBuyer_Seller_5(this.se, true);
	}

	public TwoBuyer_Seller_5 receive(address op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(TwoBuyer.B, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public TwoBuyer_Seller_5 receive(address op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.String>) this.se.gc);
	}

	public TwoBuyer_Seller_1 receive(B role, reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(TwoBuyer.reject)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new TwoBuyer_Seller_1(this.se, true);
	}

	public TwoBuyer_Seller_1 receive(reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(TwoBuyer.B, op);
	}

	@Override
	public Branch_Seller_B_address_String__B_reject.Branch_Seller_B_address_String__B_reject_Enum getOp() {
		return this.op;
	}
}