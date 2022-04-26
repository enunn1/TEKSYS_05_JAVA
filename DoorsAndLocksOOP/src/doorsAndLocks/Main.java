package doorsAndLocks;

public class Main {

	public static void main(String[] args) {
		
		Key key = new Key(Keyshape.Oval);
		System.out.println(key + " " +  key.shape());

		Key spareKey = (Key)key.clone();
		
		Door d1 = new Door(key);
		
		Keychain kc1 = new Keychain();
		kc1.addKey(key);
		
		System.out.println(kc1.keyCount());
		
		Warehouse w = new Warehouse();
		
		for (int i = 0; i < w.doors().size(); i++) {
			Door d = w.doors().get(i);
			System.out.println("Door #" + (i+1) + ":");
			if (d.hasKey()) {
				System.out.println(d.key() + " " + d.key().shape());
			} else {
				System.out.println("This door does not have a key");
			}
			if (d.isLocked()) {
				System.out.println("This door is locked");
			} else {
				System.out.println("This door is unlocked");
			}
		}

	}

}
