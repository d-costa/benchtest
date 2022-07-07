package twobuyer.TwoBuyer.TwoBuyer.statechans.A;

import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces.*;

public final class TwoBuyer_A_4_Cases extends org.scribble.runtime.statechans.CaseSocket<TwoBuyer, A> implements Case_A_B_date_Date__B_reject<TwoBuyer_A_1, TwoBuyer_A_1> {
	public static final TwoBuyer_A_4_Cases cast = null;
	public final TwoBuyer_A_4.Branch_A_B_date_Date__B_reject_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected TwoBuyer_A_4_Cases(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, A> se, boolean dummy, TwoBuyer_A_4.Branch_A_B_date_Date__B_reject_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public TwoBuyer_A_1 receive(B role, date op, org.scribble.runtime.util.Buf<? super java.util.Date> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(TwoBuyer.date)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.util.Date) m.payload[0];
		return new TwoBuyer_A_1(this.se, true);
	}

	public TwoBuyer_A_1 receive(date op, org.scribble.runtime.util.Buf<? super java.util.Date> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(TwoBuyer.B, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public TwoBuyer_A_1 receive(date op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.util.Date>) this.se.gc);
	}

	public TwoBuyer_A_1 receive(B role, reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(TwoBuyer.reject)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new TwoBuyer_A_1(this.se, true);
	}

	public TwoBuyer_A_1 receive(reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(TwoBuyer.B, op);
	}

	@Override
	public Branch_A_B_date_Date__B_reject.Branch_A_B_date_Date__B_reject_Enum getOp() {
		return this.op;
	}
}