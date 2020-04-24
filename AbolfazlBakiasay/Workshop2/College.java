import java.util.ArrayList;

/**
 * 
 * College class
 *
 */
public class College {
	
	//	College Labs list
	private ArrayList<Lab> labs;

	/**
	 * Initializing College's Labs list
	 */
	College() {
		setLabs(new ArrayList<Lab>());
	}

	/**
	 * 
	 * @return The College's Labs list
	 */
	public ArrayList<Lab> getLabs() {
		return labs;
	}

	/**
	 * Sets the College's Labs list
	 * @param labs
	 */
	public void setLabs(ArrayList<Lab> labs) {
		this.labs = labs;
	}

	/**
	 * Adds the given lab to the college's labs list
	 * @param lab
	 */
	public void addLab(Lab lab) {
		this.labs.add(lab);
	}

	/**
	 * Removes the given lab from labs list. if there exists one, returns true.
	 * @param lab lab to remove
	 * @return true if something is removed, otherwise false
	 */
	public boolean removeLab(Lab lab) {
		return this.labs.remove(lab);
	}
	
	/**
	 * Removes the lab given index inside labs list. return the removed lab.
	 * @param ind index to remove
	 * @return The removed lab
	 */
	public Lab removeLab(int ind) {
		if(ind<0 || ind>=labs.size()) return null;
		return this.labs.remove(ind);
	}
	
	/**
	 * 
	 * @param ind index to get
	 * @return Lab at the given index
	 */
	public Lab getLab(int ind) {
		if(ind<0 || ind>=labs.size()) return null;
		return labs.get(ind);
	}

	/*
	 * Prints the state of the College Labs and their content
	 */
	public void print() {
		System.out.println("There Are "+labs.size()+" labs in this College:");
		for(Lab lab:labs) {
			System.out.println("");
			lab.print();
		}
	}
}





