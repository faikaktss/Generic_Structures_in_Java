package GenericInterface;

public class VeriTabaniImpl implements IVeritabanı<Müsteri>{

	@Override
	public void ekle(Müsteri clazz) {
		System.out.println("Müşteri eklendi");
	}

	@Override
	public void sil(Müsteri clazz) {
		System.out.println("Müşteri silindi ");
	}

	@Override
	public void guncelle(Müsteri clazz) {
		System.out.println("Müşteri güncellendi");
	}
	
}	
