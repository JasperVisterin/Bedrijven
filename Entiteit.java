package BedrijvenB;

import java.util.HashSet;
import java.util.Set;

public abstract class Entiteit {
	/**
	 * @representationObject
	 * @PeerObjects
	 * 
	 * @invar | Bedrijven !=null 
	 * @invar | Bedrijven.stream().allMatch(b->b!=null) 
	 * @invar | Bedrijven.stream().allMatch(b->b.getEigenaar().equals(this))
	 * 
	 */
	HashSet<Bedrijf> Bedrijven = new HashSet<>(); 
	/**
	 * @invar | getBedrijven().isEmpty()&&getBedrijven()!=null
	 */
	public Entiteit() {}
	
	/**
	 * @invar | result !=null 
	 * @invar | result.stream().allMatch(b->b!=null) 
	 * @invar | result.stream().allMatch(b->b.getEigenaar().equals(this))
	 * @creates | result
	 * @PeerObjects
	 * 
	 */
	public Set<Bedrijf> getBedrijven(){
		return Set.copyOf(Bedrijven); 
	}
	
	

	
}
