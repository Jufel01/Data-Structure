import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class HtmlTree {
    JFrame frame;
    JTree tree;

    public HtmlTree() {
        frame = new JFrame();
        DefaultMutableTreeNode html = new DefaultMutableTreeNode("html");
        DefaultMutableTreeNode head = new DefaultMutableTreeNode("head");
        DefaultMutableTreeNode body = new DefaultMutableTreeNode("body");
        html.add(head);
        html.add(body);

        DefaultMutableTreeNode meta = new DefaultMutableTreeNode("meta");
        DefaultMutableTreeNode title = new DefaultMutableTreeNode("title");
        head.add(meta);
        head.add(title);

        DefaultMutableTreeNode ul = new DefaultMutableTreeNode("ul");
        DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("h1");
        DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("h2");
        body.add(ul);
        body.add(h1);
        body.add(h2);

        DefaultMutableTreeNode li1 = new DefaultMutableTreeNode("li");
        DefaultMutableTreeNode li2 = new DefaultMutableTreeNode("li");
        ul.add(li1);
        ul.add(li2);

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("a");
        h2.add(a);
        tree = new JTree(html);
        frame.setTitle("HtmlTree Suliman");
        frame.add(tree);
        frame.setSize(300, 300);
        frame.setVisible(true);
        System.out.println("1. Root Node: ");
        System.out.println(tree.getModel().getRoot());// root node

        System.out.println("2. Parent nodes: ");
        System.out.println(tree.getModel().getRoot() + ", " + tree.getModel().getChild(html, 0) + ", "
                + tree.getModel().getChild(html, 1) + ", " + tree.getModel().getChild(body, 0) + ", "
                + tree.getModel().getChild(body, 2));

        System.out.println("3. Siblings: ");
        System.out.println(tree.getModel().getChild(html, 0) + " and " + tree.getModel().getChild(html, 1));
        System.out.println(tree.getModel().getChild(head, 0) + " and " + tree.getModel().getChild(head, 1));
        System.out.println(tree.getModel().getChild(body, 0) + ", " + tree.getModel().getChild(body, 1) + " and "
                + tree.getModel().getChild(body, 2));
        System.out.println(tree.getModel().getChild(ul, 0) + " and " + tree.getModel().getChild(ul, 1));

        System.out.println("4. One-level Subtrees: ");
        System.out.println(tree.getModel().getRoot() + "-" + tree.getModel().getChild(html, 0) + "/"
                + tree.getModel().getChild(html, 1));
        System.out.println(tree.getModel().getChild(html, 0) + "-" + tree.getModel().getChild(head, 0) + "/"
                + tree.getModel().getChild(head, 1));
        System.out.println(tree.getModel().getChild(html, 1) + "-" + tree.getModel().getChild(body, 0) + "/"
                + tree.getModel().getChild(body, 1) + "/" + tree.getModel().getChild(body, 2));
        System.out.println(tree.getModel().getChild(body, 0) + "-" + tree.getModel().getChild(ul, 0) + "/"
                + tree.getModel().getChild(ul, 1));
        System.out.println(tree.getModel().getChild(body, 2) + "-" + tree.getModel().getChild(h2, 0));

        System.out.println("5. Nodes per Level: ");
        System.out.println("Level 0: " + tree.getModel().getRoot());
        System.out.println("Level 1: " + tree.getModel().getChild(html, 0) + ", " + tree.getModel().getChild(html, 1));
        System.out.println("Level 2: " + tree.getModel().getChild(head, 0) + ", " + tree.getModel().getChild(head, 1)
                + ", " + tree.getModel().getChild(body, 0) + ", " + tree.getModel().getChild(body, 1) + ", "
                + tree.getModel().getChild(body, 2));
        System.out.println("Level 3: " + tree.getModel().getChild(ul, 0) + ", " + tree.getModel().getChild(ul, 1) + ", "
                + tree.getModel().getChild(h2, 0));

        System.out.println("6. Depth: ");
        System.out.println(tree.getModel().getChildCount(html) + 1);

        System.out.println("7. Degree of One-Level Subtree: ");
        System.out.println("Subtree " + tree.getModel().getRoot() + ": " + tree.getModel().getChildCount(html)); // subtree
        // root
        System.out.println("Subtree " + tree.getModel().getChild(html, 0) + ": " + tree.getModel().getChildCount(head)); // subtree
                                                                                                                         // head
        System.out.println("Subtree " + tree.getModel().getChild(html, 1) + ": " + tree.getModel().getChildCount(body)); // subtree
                                                                                                                         // body
        System.out.println("Subtree " + tree.getModel().getChild(body, 0) + ": " + tree.getModel().getChildCount(ul)); // subtree
                                                                                                                       // ul
        System.out.println("Subtree " + tree.getModel().getChild(body, 2) + ": " + tree.getModel().getChildCount(h2)); // subtree
                                                                                                                       // h2
        System.out.println("8. List of nodes based on breadth-first, preorder, and postorder: ");
        System.out.println("BREADTH-FIRST: ");
        System.out.println("html, head, body, meta, title, ul, h1, h2, li, li, a");
        System.out.println("PREORDER: ");
        System.out.println("html, head, meta, title, body, ul, li, li, h1, h2, a");
        System.out.println("POSTORDER: ");
        System.out.println("meta, title, head, li, li, ul, a, h2, h1, body, html ");
    }

    public static void main(String[] args) {
        new HtmlTree();
    }
}