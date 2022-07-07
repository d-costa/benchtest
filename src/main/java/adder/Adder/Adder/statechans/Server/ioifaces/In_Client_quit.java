package adder.Adder.Adder.statechans.Server.ioifaces;

import java.io.IOException;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;

public interface In_Client_quit<__Succ extends Succ_In_Client_quit> {

	abstract public __Succ receive(Client role, quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}