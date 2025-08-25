package GenericInterface;

public interface IVeritabanı<T>{
	public void ekle(T clazz);
	
	public void sil(T clazz);
	
	public void guncelle(T clazz);
}
