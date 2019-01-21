public class Vehicle {
	// TODO You'll need to fill in this entire file
	private VehicleType vehicletype;
	private Space space;
	private boolean isVertical = false;

	public Vehicle(VehicleType vehicletype, Space space, boolean isVertical) {
		this.vehicletype = vehicletype;
		this.space = space;
		this.isVertical = isVertical;
	}

		/**
	 * @return the type associated with this particular vehicle
	 */
	public VehicleType getVehicleType() {
		return vehicletype;
	}

	/**
	 * Provides an array of Spaces that indicate where a particular Vehicle
	 * would be located, based on its current starting space
	 * 
	 * @return the array of Spaces occupied by that particular Vehicles
	 */
	public Space[] spacesOccupied() {

	}

	/**
	 * Calculates an array of the spaces that would be travelled if a vehicle
	 * were to move numSpaces
	 * 
	 * @param numSpaces
	 *            The number of spaces to move (can be negative or positive)
	 * @return The array of Spaces that would need to be checked for Vehicles
	 */
	public Space[] spacesOccupiedOnTrail(int numSpaces) {
		// TODO change this implementation so that you return the correct space
		return null;
	}
}
