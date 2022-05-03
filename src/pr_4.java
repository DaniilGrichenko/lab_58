public class pr_4 {
    public static void main(String[] args) {
        int Yes = 1;
        int Ok = 2;
        //-------------//
        int No = 3;
        int NO = 4;
        char da = '1';
        switch (da) {
            case 'Y':
            case '+':
            case '1':
            case '2':
                System.out.println("Я погоджуюсь!");
                break;
            default:
                System.out.println("Невірно");
                char net = 'N';
                switch (net) {
                    case 'N':
                    case '-':
                    case '3':
                    case '4':
                        System.out.println("Я не погоджуюсь!");
                        break;

                }


        }
    }
}