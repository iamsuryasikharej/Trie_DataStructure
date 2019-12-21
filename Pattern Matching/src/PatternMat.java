
public class PatternMat {

	String text="My name is surya and my full name is as s s s  surya sikha rej siu suryaewf";
	String pattern="surya";
	char [] t= text.toCharArray();
	char [] p= pattern.toCharArray();
	int found[];
	int val;
	int counter=0;
	public int check()
	{
//		System.out.println(t);
		for(int i=0;i<t.length;i++)
		{
			if(t.length-i<p.length)
			{
				break;
			}
//			System.out.println("I="+i);
			int x=i;
			for (int j=0;j<p.length;j++)
			{
				
				
//				System.out.println("j="+j);
				if(t[x]==p[j])
				{
					x=x+1;
					decide(j,x);
					
				}
				else{
//					System.out.println("kk");
				break;}

			}
		}
		return counter;
	}
	private void decide(int j,int x) {
//		System.out.println("enter j="+j+" x = "+x);
		if(j==p.length-1)
		{
			System.out.println("fount at index="+(x-p.length));
			counter++;
		}
		
		
	}

}
