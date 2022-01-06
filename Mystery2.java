import java.util.*;

public class Mystery2<T>
{
	final int k=-1;
	
	private class X
	{
		HashSet<T> x1;
		HashSet<T> x2;
		int x3;
		private X(HashSet<T> x1, HashSet<T> x2, int x3) throws Exception
		{
			if(!x2.contains(k))
			{
				throw new Exception();
			}
			this.x1=x1;
			this.x2=x2;
			this.x3=x3;
		}
	}
	
	Set<X> gset=new HashSet<X>();
	
	void f1(T t1, T t2)
	{
		
	}
	
}
