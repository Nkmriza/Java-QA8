package hw8;

public class TreeMainTask2 {
    public static void main(String[] args) {
        Tree tree1 = new Tree("Липа",30);
        Tree tree2 = new Tree (90, 139, "Зелена" );
        Tree tree3 = new Tree ("Яблуня");
        Tree tree4 = new Tree("Груша");
        tree1.treeInfo();
        tree2.treeInfo();
        tree3.treeInfo();
        tree4.treeInfo();
    }
}
