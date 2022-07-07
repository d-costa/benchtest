package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Out_Seller_id_String<__Succ extends Succ_Out_Seller_id_String> {

	abstract public __Succ send(Seller role, id op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}