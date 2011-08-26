import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

public class TreeDemo extends JPanel implements TreeSelectionListener {

	private JTree tree;

	private static boolean useSystemLookAndFeel = false;

	public TreeDemo() {
		// super(new GridLayout(1,0));

		// Create the nodes.
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Root");
		createNodes(top);

		// Create a tree that allows one selection at a time.
		tree = new JTree(top);
		tree.getSelectionModel().setSelectionMode(
				TreeSelectionModel.SINGLE_TREE_SELECTION);

		// Listen for when the selection changes.
		tree.addTreeSelectionListener(this);

		// Create the scroll pane and add the tree to it.
		JScrollPane treeView = new JScrollPane(tree);
		Dimension minimumSize = new Dimension(300, 100);
		treeView.setMinimumSize(minimumSize);

	}

	public void valueChanged(TreeSelectionEvent e) {
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree
				.getLastSelectedPathComponent();

		if (node == null)
			return;

	}

	private void createNodes(DefaultMutableTreeNode top) {
		DefaultMutableTreeNode node = null;
		DefaultMutableTreeNode container = null;
		DefaultMutableTreeNode component = null;
		DefaultMutableTreeNode host = null;

		node = new DefaultMutableTreeNode("Node 1");
		top.add(node);

		container = new DefaultMutableTreeNode("Container 1");
		node.add(container);

		component = new DefaultMutableTreeNode("Letstalk");
		container.add(component);

		host = new DefaultMutableTreeNode("host 1");
		component.add(host);
		host = new DefaultMutableTreeNode("host 2");
		component.add(host);
		host = new DefaultMutableTreeNode("host 3");
		component.add(host);

		container = new DefaultMutableTreeNode("Container 2");
		node.add(container);

		component = new DefaultMutableTreeNode("Letstalk");
		container.add(component);

		host = new DefaultMutableTreeNode("host 4");
		component.add(host);
		host = new DefaultMutableTreeNode("host 5");
		component.add(host);

		node = new DefaultMutableTreeNode("Node 2");
		top.add(node);

		container = new DefaultMutableTreeNode("Container 1");
		node.add(container);

		component = new DefaultMutableTreeNode("Letstalk");
		container.add(component);

		host = new DefaultMutableTreeNode("host 6");
		component.add(host);

	}

	private static void createAndShowGUI() {
		if (useSystemLookAndFeel) {
			try {
				UIManager.setLookAndFeel(UIManager
						.getSystemLookAndFeelClassName());
			} catch (Exception e) {
				System.err.println("Couldn't use system look and feel.");
			}
		}

		// Make sure we have nice window decorations.
		JFrame.setDefaultLookAndFeelDecorated(true);

		// Create and set up the window.
		JFrame frame = new JFrame("TreeDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		TreeDemo newContentPane = new TreeDemo();
		newContentPane.setOpaque(false); // content panes must be opaque
		frame.setContentPane(newContentPane);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
