class CourseCreditManagement {
    String code;
    String title;
    int credits;
    int labCredits;

    public CourseCreditManagement(String code, String title, int credits, int labCredits) {
        this.code=code;
        this.title=title;
        this.credits=credits;
        this.labCredits=labCredits;
    }

    public CourseCreditManagement(String code, String title, int credits) {
        this.code=code;
        this.title=title;
        this.credits=credits;
        this.labCredits=0;
    } 
    public int totalCredit(){
        return credits+labCredits;
    }

    public static void main(String[] args) {
        CourseCreditManagement c = new CourseCreditManagement("21CSC205L", "DSA Lab", 3, 1);
        CourseCreditManagement c1 = new CourseCreditManagement("21CSC201J", "Data Structures", 4);
        System.out.println("Total Credit for DSA LAB:" + c.totalCredit());
        System.out.println("Total Credit for DSA Thoery:" + c1.totalCredit());
    }

}



