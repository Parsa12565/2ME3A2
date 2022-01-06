import java.util.*;

public class Mystery1 
{
	private class X
	{
		String x;
		String y;
		X(String x, String y)
		{
			this.x=x;
			this.y=y;
		}
	}
	
	Set<String> S1=new HashSet<String>();
	Set<X> S2=new HashSet<X>();
	
	int f1()
	{
		return S1.size();
	}
	
	void f2(String s)
	{
		S1.add(s);
	}
	
	void f3(String s1, String s2)
	{
		S2.add(new X(s1,s2));
	}
	
	Boolean f4(String s1, String s2)
	{
		Set<String> gset1=g(s1);
		Iterator<String> i=gset1.iterator();
		Set<String> gset2=new HashSet<String>();
		while (i.hasNext()) 
		{
			gset2.addAll(g(i.next()));
        }
		if(gset2.contains(s2) && (!(g(s1).contains(s2))))
		{
			return true;
		}
		return false;
	}
	
	Set<String> g(String s)
	{
		Iterator<X> i=S2.iterator();
		Set<String> gset=new HashSet<String>();
		while (i.hasNext()) 
		{
			X t=i.next();
            if(t.x==s)
            {
            	gset.add(t.y);
            }
        }
		return gset;
	}
	
}
