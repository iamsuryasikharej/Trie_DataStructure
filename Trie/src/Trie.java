import java.util.LinkedHashMap;

public class Trie {
Node rootNode;
public void add(String s)
{
	if (rootNode==null)
	{
//		System.out.println("enter1");
		rootNode=new Node();
		rootNode.child=new LinkedHashMap<Character, Node>();
		addWhenRootNodeEmpty(rootNode,s,0);
	}
	else
	{
		System.out.println("enter");
		
		addElem(rootNode,s,0);
	}
	
}
private void addElem(Node node, String s, int i) {
	while(i<s.length()) {
	if(node.child.containsKey(s.charAt(i)))
	{
		Node temp=node.child.get(s.charAt(i));
		i++;
		addElem(temp,s,i);
	}
	else
	{
		Node temp=new Node();
		temp.child=new LinkedHashMap<Character, Node>();
		if(i==s.length()-1)
		{
			temp.isword=true;
		}
		node.child.put(s.charAt(i), temp);	
		addElem(temp, s, i+1);
		
	}
	}
	
}




private void addWhenRootNodeEmpty(Node node, String s,int j) {
	while(j<s.length())
	{
		Node temp=new Node();
		temp.child=new LinkedHashMap<Character, Node>();
		node.child.put(s.charAt(j), temp);
		j=j+1;
		addWhenRootNodeEmpty(temp, s, j);  
		if(j==s.length())
		{
			temp.isword=true;
		}
		
	}
	
	
	

	
}
}
