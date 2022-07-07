package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces.*;

public final class TwoBuyer_Seller_4 extends org.scribble.runtime.statechans.BranchSocket<TwoBuyer, Seller> implements Branch_Seller_B_address_String__B_reject<TwoBuyer_Seller_5, TwoBuyer_Seller_1> {
	public static final TwoBuyer_Seller_4 cast = null;

	protected TwoBuyer_Seller_4(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, Seller> se, boolean dummy) {
		super(se);
	}

	@Override
	public TwoBuyer_Seller_4_Cases branch(B role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.B);
		Branch_Seller_B_address_String__B_reject_Enum openum;
		if (m.op.equals(TwoBuyer.address)) {
			openum = Branch_Seller_B_address_String__B_reject_Enum.address;
		}
		else if (m.op.equals(TwoBuyer.reject)) {
			openum = Branch_Seller_B_address_String__B_reject_Enum.reject;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new TwoBuyer_Seller_4_Cases(this.se, true, openum, m);
	}

	public void branch(B role, TwoBuyer_Seller_4_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_Seller_B_address_String__B_reject<TwoBuyer_Seller_5, TwoBuyer_Seller_1>) handler);
	}

	@Override
	public void branch(B role, Handle_Seller_B_address_String__B_reject<TwoBuyer_Seller_5, TwoBuyer_Seller_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.B);
		if (m.op.equals(TwoBuyer.address)) {
			handler.receive(new TwoBuyer_Seller_5(this.se, true), TwoBuyer.address, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else
		if (m.op.equals(TwoBuyer.reject)) {
			handler.receive(new TwoBuyer_Seller_1(this.se, true), TwoBuyer.reject);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(B role, Handle_Seller_B_address_String__B_reject<Succ_In_B_address_String, Succ_In_B_reject> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.B);
		if (m.op.equals(TwoBuyer.address)) {
			handler.receive(new TwoBuyer_Seller_5(this.se, true), TwoBuyer.address, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else
		if (m.op.equals(TwoBuyer.reject)) {
			handler.receive(new TwoBuyer_Seller_1(this.se, true), TwoBuyer.reject);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}