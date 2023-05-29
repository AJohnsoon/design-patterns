package src.criacional.factory.v2.after.factory;

import src.criacional.factory.v2.utils.model.*;

public abstract class IPhoneFactory {
	public IPhone orderItem(){
		IPhone device = null;
		device = createIPhone();
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}

	protected abstract IPhone createIPhone();
}
