import static org.junit.Assert.*;

import org.junit.Test;


public class TreeInverterTest {
	private TreeInverter inverter = new TreeInverter();
	
	@Test
	public void testInvertTree() {
		TreeNode tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		TreeNode inverted = inverter.invertTree(tree);
		
		assertEquals(1, inverted.val);
		assertEquals(3, inverted.left.val);
		assertEquals(2, inverted.right.val);
	}
	
	@Test
	public void testInvertTreeDeep() {
		TreeNode tree = new TreeNode(1, 
					new TreeNode(2, new TreeNode(4), new TreeNode(5)), 
					new TreeNode(3, new TreeNode(6), new TreeNode(7)));
		TreeNode inverted = inverter.invertTree(tree);
		assertEquals(1, tree.val);
		assertEquals(7, inverted.left.left.val);
		assertEquals(6, inverted.left.right.val);
		assertEquals(5, inverted.right.left.val);
		assertEquals(4, inverted.right.right.val);
	}
}
