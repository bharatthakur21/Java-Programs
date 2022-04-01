public class SheShellsCount {
    public static void main(String[] args) {
        String str = "SHESHELLSONTHESEASHORE";
        int ecount = 0;
        int scount = 0;
        for ( int i = 0;i <= str.length()-1;i++) {
            if ( str.charAt(i)=='E' || str.charAt(i)=='S'){
            } if (str.charAt(i)=='E'){
                ecount++;
            }else if( str.charAt(i)=='S'){
                scount++;
            }




        }

        System.out.println("No of words E: " + ecount);
        System.out.println("No of words S: " + scount);
    }

}


