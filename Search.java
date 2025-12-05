package placement1;
public class Search {
	    public static void main(String[] args) {
	        int[] arr = {5, 10, 15, 20, 25};
	        int x = 15;
	        boolean found = false;

	        for (int n : arr) {
	            if (n == x) {
	                found = true;
	                break;
	            }
	        }

	        System.out.println(found ? "Found" : "Not Found");
	    }
	}

