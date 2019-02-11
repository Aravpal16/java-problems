import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner kan = new Scanner(System.in);
        while (kan.hasNext())
        {
            int N =kan.nextInt();
            if (N == 0)
            {
                break;
            }
            boolean br = true;
            while (br) 
            {
                Stack<Integer> st = new Stack<Integer>();
                int j = 0;
                for (int i = 0; i < N; i++) 
                {
                    int x = kan.nextInt();
                    if (x == 0) 
                    {
                        br = false;
                        break;
                    }
                    while (j < N && j != x) 
                    {
                        if (st.size() > 0 && st.peek() == x)
                        {
                            break;
                        }
                        j++;
                        st.push(j);
                    }
                    if (st.peek() == x) 
                    {
                        st.pop();
                    }
                }
                if (br)
                {
                    if (st.size() == 0) 
                    {
                        System.out.println("Yes");
                    } else
                    {
                        System.out.println("No");
                    }
                }
            }
            System.out.println();
        }
    }
}
