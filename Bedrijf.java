package BedrijvenB;
import logicalcollections.LogicalSet;

public class Bedrijf extends Entiteit{
	/**
	 * @invar | eigenaar!=null 
	 * @PeerObjects
	 */
	private Entiteit eigenaar;
	
	/**
	 * @invar | eigenaar!=null 
     * @post | eigenaar==getEigenaar()
	 * @post | eigenaar.getBedrijven().contains(this) 
	 * @post | eigenaar.getBedrijven().stream().anyMatch(e->e.getEigenaar().equals(eigenaar))
//	 * @post | eigenaar.getBedrijven().equals(LogicalSet.plus(old(getBedrijven()),this)) //Oplossing geeft mysterieuze error
	 * 
	 * @mutates_properties | eigenaar.getBedrijven() 
	 * 
	 */
	public Bedrijf(Entiteit eigenaar) {
		this.eigenaar=eigenaar;
		eigenaar.Bedrijven.add(this);
	}
	/**
	 * @inspects | this 
	 */
	public Entiteit getEigenaar() {
		return eigenaar; 
	}
	
	/**
	 * @invar | nieuwe_eigenaar!=null 
	 * @post | nieuwe_eigenaar==getEigenaar()
	 * @post | nieuwe_eigenaar.getBedrijven().contains(this) 
	 * @post | nieuwe_eigenaar.getBedrijven().stream().anyMatch(e->e.equals(this))
	 * @post | nieuwe_eigenaar.getBedrijven().stream().anyMatch(e->e.getEigenaar().equals(nieuwe_eigenaar))
	 * @post | nieuwe_eigenaar.getBedrijven().equals(LogicalSet.plus(old(getBedrijven()),this))
	 * 
	 * @mutates_properties | nieuwe_eigenaar.getBedrijven(), this.getEigenaar() 
	 * 
	 */
	public void bedrijfsOvername(Entiteit nieuwe_eigenaar) {	
		eigenaar.Bedrijven.remove(this);
		this.eigenaar=nieuwe_eigenaar; 
		nieuwe_eigenaar.Bedrijven.add(this);
	}
	
	
}
