public class IdNumberCheck {

    /**
     * @param idNum check a student ID is valid or invalid @return boolean
     */
    public boolean IdCheck(String idNum) {
        if (idNum.length() == 7) {
            char[] number = {'0','1','2','3','4','5','6','7','8','9'};
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 10; j++) {
                    if (idNum.charAt(i) == number[j]) {
                        break;
                    } else if (j + 1 == 10) {
                        System.out.println("This student ID is not valid");
                        return false;
                    }
                }
            }
            return true;
        }
        System.out.println("This student ID is not valid");
        return false;
    }

}
