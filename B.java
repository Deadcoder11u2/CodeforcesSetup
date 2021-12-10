import java.util.*;
import java.io.*;

public class B {
	static boolean DEBUG = false;
    public static void main(String args[]) throws IOException{
        if (args.length == 2) {
			System.setIn(new FileInputStream(new File("input.txt")));
			System.setOut(new PrintStream(new File("output.txt")));
			DEBUG = true;
		}
        Reader fs = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        int t = fs.nextInt();
        for(int tt = 1 ; tt <= t ; tt++) {
            pw.println(tt);
        }
		pw.close();
    }
    static void log(Object o) {
		System.err.println(o);
	}
 
	static <T> void log(T a[]) {
		if (DEBUG) {
			System.err.print("[");
			for (T x : a)
				System.err.print(x + " ");
			System.err.println("]");
		}
	}
 
	static <T> void log(ArrayList<T> a) {
		if (DEBUG) {
			System.err.print("[");
			for (T x : a) {
				System.err.print(x + " ");
			}
			System.err.println("]");
		}
	}
 
	static <T, V> void log(Map<T, V> mp) {
		if (DEBUG) {
			System.err.print(mp);
		}
	}
 
	public static void print(long a, long b, long c, PrintWriter pw) {
		pw.println(a + " " + b + " " + c);
		return;
	}
 
	static class Reader {
		BufferedReader br;
		StringTokenizer st;
 
		public Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
 
		int[] readArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		int[][] read2Array(int n, int m) {
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = nextInt();
				}
			}
			return a;
		}
	}

}