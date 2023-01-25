class RedBlackTree {
    private static final boolean RED   = true;
    private static final boolean BLACK = false;

    private class Node {
        int key;
        Node left, right;
        boolean color;

        Node(int key, boolean color) {
            this.key = key;
            this.color = color;
        }
    }

    private Node root;

    private boolean isRed(Node x) {
        if (x == null) return false;
        return x.color == RED;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColors(Node h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public void put(int key) {
        root = put(root, key);
        root.color = BLACK;
    }

    private Node put(Node h, int key) {
        if (h == null) return new Node(key, RED);
        if (key < h.key) h.left  = put(h.left, key);
        else if (key > h.key) h.right = put(h.right, key);
        else h.key = key;

        if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
        if (isRed(h.left)  &&  isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left)  &&  isRed(h.right)) flipColors(h);

        return h;
    }
    //中序遍历
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node x) {
        if (x == null) return;
        inOrder(x.left);
        System.out.print(x.key + " ");
        inOrder(x.right);
    }
    //前序遍历
    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node x) {
        if (x == null) return;
        System.out.print(x.key + " ");
        preOrder(x.left);
        preOrder(x.right);
    }
        //后序遍历
        public void postOrder() {
            postOrder(root);
        }
        private void postOrder(Node x) {
            if (x == null) return;
            postOrder(x.left);
            postOrder(x.right);
            System.out.print(x.key + " ");
        }
        public static void main(String[] args) {
            RedBlackTree tree = new RedBlackTree();
            tree.put(50);
            tree.put(30);
            tree.put(20);
            tree.put(40);
            tree.put(70);
            tree.put(60);
            tree.put(80);
            System.out.println("Inorder traversal:");
            tree.inOrder();
            System.out.println("\nPreorder traversal:");
            tree.preOrder();
            System.out.println("\nPostorder traversal:");
            tree.postOrder();
        }
    }
    
