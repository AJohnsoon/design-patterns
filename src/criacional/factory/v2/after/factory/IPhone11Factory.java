package src.criacional.factory.v2.after.factory;

import src.criacional.factory.v2.utils.model.IPhone;
import src.criacional.factory.v2.utils.entities.IPhone11;

public class IPhone11Factory extends IPhoneFactory{
	@Override
	protected IPhone createIPhone() {
		return new IPhone11();
	}
}
