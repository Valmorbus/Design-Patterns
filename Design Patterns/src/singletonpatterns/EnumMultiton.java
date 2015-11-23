package singletonpatterns;

public enum EnumMultiton {
	INSTANCE, SECOND, THIRD;

	public void run() {
		System.out.println("Enum Singleton ");
	}

}
