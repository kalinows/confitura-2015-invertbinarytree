
public class TreeInverter {
	public TreeNode invertTree(TreeNode tree) {
		if (tree == null) {
			return null;
		}
		TreeNode buf = tree.left;
		tree.left = invertTree(tree.right);
		tree.right = invertTree(buf);
		return tree;
	}
}
