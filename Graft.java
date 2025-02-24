package suanfa;

import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Graft {
	public static void main(String[] args) {
        int t=1;
        for(int i=1;i<=t;i++){
            solve();
        }
        out.flush();
    }
    
 
	static int zu;
	static int N = (int)(1e5+10);
	static int a[] = new int[N];
	static int b[] = new int[N];
    //所有的程序都在solve中完成
    static void solve(){
    	Map<Integer, Integer> map = new TreeMap<>();
    	int n = in.nextInt();
    	for(int i =1;i<=n;i++) {
    		a[i]=in.nextInt();
    		map.put(a[i], 0);
    	}
    	int cnt = 1;
    	for(int key:map.keySet()) {
    		map.put(key, cnt);
    		cnt=cnt+1;
    	}
    	for(int i=1;i<=n;i++) {
    		a[i] = map.get(a[i]);
    	}
    	for(int i =1;i<=n;i++) {
    		out.print(a[i]+" ");
    	}
    }

    static FastReader in = new FastReader();
    static PrintWriter out=new PrintWriter(System.out);
    static class FastReader{
        static BufferedReader br;
        static StringTokenizer st;
        FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            String str="";
            while(st==null||!st.hasMoreElements()){
                try {
                    str=br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                st=new StringTokenizer(str);
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
    }
}
	


