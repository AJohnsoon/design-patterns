package src.criacional.factory.v2.after.factory;

import src.criacional.factory.v2.utils.model.IPhone;
import src.criacional.factory.v2.utils.entities.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{
	@Override
	protected IPhone createIPhone() {
		return new IPhoneX();
	}
}
