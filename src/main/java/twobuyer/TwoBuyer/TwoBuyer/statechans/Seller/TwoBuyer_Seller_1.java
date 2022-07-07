package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces.*;

public final class TwoBuyer_Seller_1 extends org.scribble.runtime.statechans.BranchSocket<TwoBuyer, Seller> implements Branch_Seller_A_Quit__A_id_String<TwoBuyer_Seller_6, TwoBuyer_Seller_2> {
	public static final TwoBuyer_Seller_1 cast = null;

	protected TwoBuyer_Seller_1(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, Seller> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_Seller_1(org.scribble.runtime.session.MPSTEndpoint<TwoBuyer, Seller> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public TwoBuyer_Seller_1_Cases branch(A role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.A);
		Branch_Seller_A_Quit__A_id_String_Enum openum;
		if (m.op.equals(TwoBuyer.id)) {
			openum = Branch_Seller_A_Quit__A_id_String_Enum.id;
		}
		else if (m.op.equals(TwoBuyer.Quit)) {
			openum = Branch_Seller_A_Quit__A_id_String_Enum.Quit;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new TwoBuyer_Seller_1_Cases(this.se, true, openum, m);
	}

	public void branch(A role, TwoBuyer_Seller_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_Seller_A_Quit__A_id_String<TwoBuyer_Seller_6, TwoBuyer_Seller_2>) handler);
	}

	@Override
	public void branch(A role, Handle_Seller_A_Quit__A_id_String<TwoBuyer_Seller_6, TwoBuyer_Seller_2> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.A);
		if (m.op.equals(TwoBuyer.id)) {
			handler.receive(new TwoBuyer_Seller_2(this.se, true), TwoBuyer.id, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else
		if (m.op.equals(TwoBuyer.Quit)) {
			handler.receive(new TwoBuyer_Seller_6(this.se, true), TwoBuyer.Quit);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(A role, Handle_Seller_A_Quit__A_id_String<Succ_In_A_Quit, Succ_In_A_id_String> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.A);
		if (m.op.equals(TwoBuyer.id)) {
			handler.receive(new TwoBuyer_Seller_2(this.se, true), TwoBuyer.id, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else
		if (m.op.equals(TwoBuyer.Quit)) {
			handler.receive(new TwoBuyer_Seller_6(this.se, true), TwoBuyer.Quit);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}