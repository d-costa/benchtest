package twobuyer.TwoBuyer.TwoBuyer.statechans.B;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces.*;

public final class TwoBuyer_B_1 extends org.scribble.runtime.statechans.BranchSocket<TwoBuyer, B> implements Branch_B_Seller_Quit__Seller_price_int<EndSocket, TwoBuyer_B_2> {
	public static final TwoBuyer_B_1 cast = null;

	protected TwoBuyer_B_1(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, B> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_B_1(org.scribble.runtime.session.MPSTEndpoint<TwoBuyer, B> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public TwoBuyer_B_1_Cases branch(Seller role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.Seller);
		Branch_B_Seller_Quit__Seller_price_int_Enum openum;
		if (m.op.equals(TwoBuyer.price)) {
			openum = Branch_B_Seller_Quit__Seller_price_int_Enum.price;
		}
		else if (m.op.equals(TwoBuyer.Quit)) {
			openum = Branch_B_Seller_Quit__Seller_price_int_Enum.Quit;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new TwoBuyer_B_1_Cases(this.se, true, openum, m);
	}

	public void branch(Seller role, TwoBuyer_B_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_B_Seller_Quit__Seller_price_int<EndSocket, TwoBuyer_B_2>) handler);
	}

	@Override
	public void branch(Seller role, Handle_B_Seller_Quit__Seller_price_int<EndSocket, TwoBuyer_B_2> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.Seller);
		if (m.op.equals(TwoBuyer.price)) {
			handler.receive(new TwoBuyer_B_2(this.se, true), TwoBuyer.price, new org.scribble.runtime.util.Buf<>((java.lang.Integer) m.payload[0]));
		}
		else
		if (m.op.equals(TwoBuyer.Quit)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), TwoBuyer.Quit);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(Seller role, Handle_B_Seller_Quit__Seller_price_int<Succ_In_Seller_Quit, Succ_In_Seller_price_int> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(TwoBuyer.Seller);
		if (m.op.equals(TwoBuyer.price)) {
			handler.receive(new TwoBuyer_B_2(this.se, true), TwoBuyer.price, new org.scribble.runtime.util.Buf<>((java.lang.Integer) m.payload[0]));
		}
		else
		if (m.op.equals(TwoBuyer.Quit)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), TwoBuyer.Quit);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}