
public abstract class Animal {

	//Atributos
	public String nombre;
	
	//Métodos abstractos
	public abstract void seMueve();
	public abstract void leHace();

	}

//Clase caballo
class Caballo extends Animal {

	@Override
	public void seMueve() {
		System.out.println("El caballo se mueve con sus patas");
	}

	@Override
	public void leHace() {
		System.out.println("El caballo hace pff");
		
	}
	
}

//Clase vaca
class Vaca extends Animal {

	@Override
	public void seMueve() {
		System.out.println("La vaca se mueve con sus patas");
		
	}

	@Override
	public void leHace() {
		System.out.println("La vaca hace muuuu");
		
	}
	
}

//Clase cerdo
class Cerdo extends Animal {

	@Override
	public void seMueve() {
		System.out.println("El cerdo se mueve con sus patas");
		
	}

	@Override
	public void leHace() {
		System.out.println("El cerdo hace oink oink");
		
	}
	
}

//Clase gallo
class Gallo extends Animal {

	@Override
	public void seMueve() {
		System.out.println("El gallo se mueve con sus alas");
		
	}

	@Override
	public void leHace() {
		System.out.println("El gallo hace kikiriki");
		
	}
	
}

//Clase paloma
class Paloma extends Animal {

	@Override
	public void seMueve() {
		System.out.println("La paloma se mueve con sus alas");
		
	}

	@Override
	public void leHace() {
		System.out.println("La paloma hace cucurucu");
		
	}
	
}

////////////////////////////////////


