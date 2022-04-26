package doorsAndLocks;

import java.util.*;

public class Warehouse {

	private List<Door> doors;
	
	// default constructor
	public Warehouse() {
		doors = new ArrayList<Door>();
		for (int i = 0; i < 100; i++) {
			if (i < 90) {
				int shapeValue = (int) Math.floor(Math.random() * 4);
				Keyshape shape = Keyshape.Unknown;
				switch (shapeValue) {
				case 0:
					shape = Keyshape.Square;
					break;
				case 1:
					shape = Keyshape.Circular;
					break;
				case 2:
					shape = Keyshape.Oval;
					break;
				case 3:
					shape = Keyshape.TrapezoidDown;
					break;
				}
				doors.add(new Door(new Key(shape)));
			} else {
				doors.add(new Door(null));
			}
		}
	}
	
	public Warehouse(int numDoors, double ratio) {
		int doorsWithKeys = (int) (numDoors * ratio);
		doors = new ArrayList<Door>();
		for (int i = 0; i < numDoors; i++) {
			if (i < doorsWithKeys) {
				int shapeValue = (int) Math.floor(Math.random() * 4);
				Keyshape shape = Keyshape.Unknown;
				switch (shapeValue) {
				case 0:
					shape = Keyshape.Square;
					break;
				case 1:
					shape = Keyshape.Circular;
					break;
				case 2:
					shape = Keyshape.Oval;
					break;
				case 3:
					shape = Keyshape.TrapezoidDown;
					break;
				}
				doors.add(new Door(new Key(shape)));
			} else {
				doors.add(new Door(null));
			}
		}
	}
	
	public List<Door> doors() {
		return doors;
	}
}
