package twobuyer.TwoBuyer.TwoBuyer.statechans.A;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces.*;

public final class TwoBuyer_A_4 extends org.scribble.runtime.statechans.BranchSocket<TwoBuyer, A> implements Branch_A_B_date_Date__B_reject<TwoBuyer_A_1, TwoBuyer_A_1> {
	public static final TwoBuyer_A_4 cast = null;

	protected TwoBuyer_A_4(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, A> se, boolean dummy) {
		super(se);
	}

	@Override
	public TwoBuyer_A_4_Cases branch(B role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.B);
		Branch_A_B_date_Date__B_reject_Enum openum;
		if (m.op.equals(TwoBuyer.date)) {
			openum = Branch_A_B_date_Date__B_reject_Enum.date;
		}
		else if (m.op.equals(TwoBuyer.reject)) {
			openum = Branch_A_B_date_Date__B_reject_Enum.reject;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new TwoBuyer_A_4_Cases(this.se, true, openum, m);
	}

	public void branch(B role, TwoBuyer_A_4_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_A_B_date_Date__B_reject<TwoBuyer_A_1, TwoBuyer_A_1>) handler);
	}

	@Override
	public void branch(B role, Handle_A_B_date_Date__B_reject<TwoBuyer_A_1, TwoBuyer_A_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.B);
		if (m.op.equals(TwoBuyer.date)) {
			handler.receive(new TwoBuyer_A_1(this.se, true), TwoBuyer.date, new org.scribble.runtime.util.Buf<>((java.util.Date) m.payload[0]));
		}
		else
		if (m.op.equals(TwoBuyer.reject)) {
			handler.receive(new TwoBuyer_A_1(this.se, true), TwoBuyer.reject);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(B role, Handle_A_B_date_Date__B_reject<Succ_In_B_date_Date, Succ_In_B_reject> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.B);
		if (m.op.equals(TwoBuyer.date)) {
			handler.receive(new TwoBuyer_A_1(this.se, true), TwoBuyer.date, new org.scribble.runtime.util.Buf<>((java.util.Date) m.payload[0]));
		}
		else
		if (m.op.equals(TwoBuyer.reject)) {
			handler.receive(new TwoBuyer_A_1(this.se, true), TwoBuyer.reject);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}