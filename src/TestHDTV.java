import java.util.*;
public class TestHDTV {
	public static void main(String args[]){
		HDTV h=new HDTV("Toshiba",34);
		HDTV h1=new HDTV("Videocon",35);
		HDTV h2=new HDTV("Samsung",36);
		ArrayList<HDTV>a=new ArrayList<HDTV>();
		a.add(h);
		a.add(h1);
		a.add(h2);
		Iterator<HDTV> itr= a.iterator();
		
		while(itr.hasNext()){
			HDTV HD=(HDTV)itr.next();
			System.out.println("TV Name:"+HD.BName+"  Size :"+" "+HD.Size);
		}
		
		
	}

}
