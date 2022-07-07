package twobuyer.TwoBuyer.TwoBuyer.statechans.A;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces.*;

public final class TwoBuyer_A_1 extends org.scribble.runtime.statechans.OutputSocket<TwoBuyer, A> implements Select_A_Seller_Quit__Seller_id_String<EndSocket, TwoBuyer_A_2> {
	public static final TwoBuyer_A_1 cast = null;

	protected TwoBuyer_A_1(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, A> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_A_1(org.scribble.runtime.session.MPSTEndpoint<TwoBuyer, A> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public TwoBuyer_A_2 send(Seller role, id op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, TwoBuyer.id, arg0);

		return new TwoBuyer_A_2(this.se, true);
	}

	public twobuyer.TwoBuyer.TwoBuyer.statechans.A.EndSocket send(Seller role, Quit op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, TwoBuyer.Quit);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}