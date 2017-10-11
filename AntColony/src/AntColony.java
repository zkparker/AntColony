
public class AntColony {
	public static void main(String[] args) {
		Environment antEnvironment = new Environment();
		
		AntSimGUI gui = new AntSimGUI();
		
		Ants ant = new Ants();
		
		ColonyNodeView node = new ColonyNodeView();
		
		ColonyView view = new ColonyView(27, 27);
	}
}
