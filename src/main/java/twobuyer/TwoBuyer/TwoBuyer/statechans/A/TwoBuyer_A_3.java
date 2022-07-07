package twobuyer.TwoBuyer.TwoBuyer.statechans.A;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces.*;

public final class TwoBuyer_A_3 extends org.scribble.runtime.statechans.OutputSocket<TwoBuyer, A> implements Select_A_B_aShare_int<TwoBuyer_A_4> {
	public static final TwoBuyer_A_3 cast = null;

	protected TwoBuyer_A_3(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, A> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_A_4 send(B role, aShare op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, TwoBuyer.aShare, arg0);

		return new TwoBuyer_A_4(this.se, true);
	}
}