package witcher;

/**
 * Clase que representa a un brujo con tres atributos: name, health y hasSoul.
 * 	Esta clase se usara para un videojuego RPG.
 * 
 * @author Jorge Burgos
 * @version 1.0
 */
public class Witcher {

	/**
	 * atributo name que es el nombre del brujo.
	 */
	private String name;
	
	// atributo health que es la vida del brujo.
	private int health;
	
	// Si el brujo tiene o no alma.
	private boolean hasSoul;
	
	/**
	 * Getter para obtener el nombre del brujo
	 * @return Devuelve el nombre del brujo
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter para introducir el nombre del brujo
	 * @param name Nombre del brujo
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter para obtener la cantidad de vida del brujo
	 * @return Devuelve el numero de vidas que le quedan al brujo
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Setter para establecer la vida del brujo
	 * @param health Cantidad de vida del brujo
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * Funcion para saber si el brujo tiene alma
	 * @return Devuelve si el brujo tiene alma o no
	 */
	public boolean isHasSoul() {
		return hasSoul;
	}

	/**
	 * Setter para establecer el alma del brujo
	 * @param hasSoul Valor booleano si tiene o no alma
	 */
	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}

	/**
	 * Nos dice si el brujo esta o no muerto:
	 * <ul>
	 * <li>Si no tiene vida</li>
	 * <li>Si tiene vida pero no tiene alma</li>
	 * </ul>
	 * @return Si esta o no muerto
	 */
	public boolean isDeath() {
		
		if (health == 0) {
			return true;
		}
		
		else if (!hasSoul) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
