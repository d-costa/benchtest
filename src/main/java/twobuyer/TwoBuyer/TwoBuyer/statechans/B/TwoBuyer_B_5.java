package twobuyer.TwoBuyer.TwoBuyer.statechans.B;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces.*;

public final class TwoBuyer_B_5 extends org.scribble.runtime.statechans.OutputSocket<TwoBuyer, B> implements Select_B_A_date_Date<TwoBuyer_B_1> {
	public static final TwoBuyer_B_5 cast = null;

	protected TwoBuyer_B_5(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, B> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_B_1 send(A role, date op, java.util.Date arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, TwoBuyer.date, arg0);

		return new TwoBuyer_B_1(this.se, true);
	}
}