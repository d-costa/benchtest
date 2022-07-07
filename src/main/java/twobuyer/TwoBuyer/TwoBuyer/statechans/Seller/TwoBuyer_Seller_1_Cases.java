package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller;

import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces.*;

public final class TwoBuyer_Seller_1_Cases extends org.scribble.runtime.statechans.CaseSocket<TwoBuyer, Seller> implements Case_Seller_A_Quit__A_id_String<TwoBuyer_Seller_6, TwoBuyer_Seller_2> {
	public static final TwoBuyer_Seller_1_Cases cast = null;
	public final TwoBuyer_Seller_1.Branch_Seller_A_Quit__A_id_String_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected TwoBuyer_Seller_1_Cases(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, Seller> se, boolean dummy, TwoBuyer_Seller_1.Branch_Seller_A_Quit__A_id_String_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public TwoBuyer_Seller_2 receive(A role, id op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(TwoBuyer.id)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		return new TwoBuyer_Seller_2(this.se, true);
	}

	public TwoBuyer_Seller_2 receive(id op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(TwoBuyer.A, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public TwoBuyer_Seller_2 receive(id op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.String>) this.se.gc);
	}

	public TwoBuyer_Seller_6 receive(A role, Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(TwoBuyer.Quit)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new TwoBuyer_Seller_6(this.se, true);
	}

	public TwoBuyer_Seller_6 receive(Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(TwoBuyer.A, op);
	}

	@Override
	public Branch_Seller_A_Quit__A_id_String.Branch_Seller_A_Quit__A_id_String_Enum getOp() {
		return this.op;
	}
}