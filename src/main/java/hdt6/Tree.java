package hdt6;

public class Tree {
    private Node root;

    public void push(String category,String product){
        if(root==null){
            Node nodeCategory = new Node(0,category,this.root,null);
            Node nodeProduct = new Node(0,product,nodeCategory,null);
            this.root = new Node(0,"",null, nodeCategory);
            nodeProduct.addChild(nodeCategory);
        } else {
            int i = 0;
            while(i < root.getChild().size()){
                if(category==root.getChild().get(i).getValue()){
                    Node nodeProduct = new Node(root.getChild().get(i).getChild().size(),product,root.getChild().get(i),null);
                    root.getChild().get(i).addChild(nodeProduct);
                    break;
                }
                i++;
            }
            if(i==root.getChild().size()){
                Node nodeCategory = new Node(root.getChild().size(),category,this.root,null);
                Node nodeProduct = new Node(0,product,nodeCategory,null);
                this.root = new Node(0,"",null, nodeCategory);
                nodeCategory.addChild(nodeProduct);
            }
        }
    }

    public boolean isEmpty(){
        boolean empty=true;
        if (root==null){
            empty=true;
        }else{
            empty=false;
        }
        return empty;
    }
}
