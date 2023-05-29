package src.criacional.factory.v2.after.factory;

import src.criacional.factory.v2.utils.model.IPhone;
import src.criacional.factory.v2.utils.entities.IPhoneSE;

public class IPhoneSEFactory extends IPhoneFactory{
	@Override
	protected IPhone createIPhone() {
		return new IPhoneSE();
	}
}
