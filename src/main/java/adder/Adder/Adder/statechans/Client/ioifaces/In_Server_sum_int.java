package adder.Adder.Adder.statechans.Client.ioifaces;

import java.io.IOException;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;

public interface In_Server_sum_int<__Succ extends Succ_In_Server_sum_int> {

	abstract public __Succ receive(Server role, sum op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}