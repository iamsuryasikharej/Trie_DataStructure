
public class Runner {
public static void main(String[] args) {
	
	Trie t=new Trie();
	t.add("surya");
	t.add("si");
//	t.add("sude");
//	t.add("zhg");
	Node temp=t.rootNode;

	
		System.out.println(temp.child.get('s').child.get('i').isword);
//	System.out.println(temp.child.keySet());
//	System.out.println(temp.child.get('z').child.get('h').child.get('g').isword);
	
}
}
