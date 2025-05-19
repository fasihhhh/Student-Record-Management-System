import java.util.*;

class WholeRecordLinkedList {
    private static class Node{           //each student
        String studentName;
        int rollNumber;
        double cgpa;
        String department;
        Node next;
        
        Node(String studentName,int rollNumber,double cgpa,String department){
            this.rollNumber = rollNumber;
            this.studentName = studentName;
            this.cgpa = cgpa;
            this.department = department;
            next = null;
        }
    }
    Node head;
    WholeRecordLinkedList(){ 
        head = null;
    }

    void addNewStudent(String studentName,int rollNumber,double cgpa,String department){  //inserting new node i.e students

        Node newNode = new Node(studentName,rollNumber,cgpa,department);
        if(head==null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
                System.out.println("-----Record Added-----");

    }

    void printingList(){    //printing whole list 

    System.out.println("-------------------------------------------------------------------------------------");
        int numberOfRecords = 0;
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Node current = head;
            while(current != null){
                System.out.println("| Roll no. : " + current.rollNumber + " | Department : " + current.department + " | CGPA : " + current.cgpa + "  | Name : " + current.studentName   );
                current = current.next;
                numberOfRecords++;
            }
            System.out.println("List Ends here");

        }
        System.out.println("Total Records : " + numberOfRecords);
                    System.out.println("-------------------------------------------------------------------------------------");


    }

    void searchingStudentByRollnoMethod(int searchingRollNumber){   //------
        
        int searchingRollNumberLocal = searchingRollNumber;
        if(head==null){
            System.out.println("List is Empty cannot perfrom search");
        }
        else{

            Node current = head;
            boolean searchStatusBool = false;
            while(current != null){
            if(current.rollNumber == searchingRollNumberLocal)
            {
                System.out.println("Search result [ Name : " + current.studentName + " | Roll no. : " + current.rollNumber + " | Department : " + current.department + " | CGPA : " + current.cgpa + " ]" );
                searchStatusBool = true;
                // break;
            }
            current = current.next;
           
            }
            if(!searchStatusBool){
                System.out.println("No Record found!");
            }


        }
        
        // System.out.println("Record Added");
        
    }
     
    void deletingStudentByRollno(int deletingRollno){

        int deletingRollnoLocal = deletingRollno;
        boolean statusCheck = false;

        if(head==null){
            System.out.println("List is Empty");
        }
    
        if(head.rollNumber == deletingRollnoLocal){
            System.out.println("Deleted :  [ "+"Name : " + head.studentName + " Roll no. : " + head.rollNumber + " Department : " + head.department + "CGPA : " + head.cgpa + "]" );
            head = head.next;
            return;
        }


        Node prev = head;
        Node current = head.next;
        while(current != null){
        if(current.rollNumber == deletingRollnoLocal){
            System.out.println("Deleted :  [ "+"Name : " + current.studentName + " Roll no. : " + current.rollNumber + " Department : " + current.department + "CGPA : " + current.cgpa + "]" );
            prev.next = current.next;
            return;
        }
        prev = current;
        current = current.next;
        }
        System.out.println("No Record found for this Roll number.");



    }
    
    boolean traversingMethod(int rollNumber){    //to check if roll no. already exuist
        int enteredRollno = rollNumber;
        boolean statuss = true;
        Node current = head;
        while(current!=null){
            // System.out.println(current.rollNumber);
            if(current.rollNumber==enteredRollno)
            {
                statuss = true;
                break;
            }
            else{
                statuss = false;
                current = current.next;
                // break;
            }
        }
        return statuss;
        
    }

//--
}

public class main{


     public static void main(String[] args) {

        int searchingRollNumber = 0;
        int deletingRollno = 0;

            Scanner sc = new Scanner(System.in);
            WholeRecordLinkedList studentRecordList = new WholeRecordLinkedList();
            studentRecordList.addNewStudent("Fasih",1052,3.59,"Computer science");
            studentRecordList.addNewStudent("Abdullah",1043,1.6,"Computer science");
            studentRecordList.addNewStudent("Ali",1044,1.9,"Biotechnology");
            studentRecordList.addNewStudent("Irtaza",1057,3.9,"Computer science");
            studentRecordList.addNewStudent("Basim",1019,3.29,"Biomedical Engineering");
            studentRecordList.addNewStudent("Jawad",1023,2.5,"Artificial Intelligence");
            studentRecordList.addNewStudent("Ehsan",1067,3.5,"Computer science");
            studentRecordList.addNewStudent("Johar",1017,3.6,"Bs Nursing");
            studentRecordList.addNewStudent("Khizer",1233,3.5,"Computer science");


            int userChoise=0;
            System.out.println("-------Welcome to Student Records Management System-------");
            System.out.println("-> Press 1 to VIEW existing students Record");
            System.out.println("-> Press 2 to ADD new student in Record");
            System.out.println("-> Press 3 to SEARCH for a student in the Record");
            System.out.println("-> Press 4 to DELETE any Record");
            System.out.println("-> Press 5 to EXIT any Record");


                
            do { 
                    // userChoise = 0; 
                    System.out.print("Enter choice : ");
                    userChoise = sc.nextInt();

                switch (userChoise) {
                case 1:
                    studentRecordList.printingList();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Enter Name : ");
                    String studentName = sc.nextLine();
                    // sc.nextLine();
                    int rollNumber=0;
                    while (rollNumber<1) {
                            System.out.print("Enter Roll no. ( > 0) : ");
                            rollNumber = sc.nextInt(); 
                            boolean resultOfTraverse = studentRecordList.traversingMethod(rollNumber);
                            if(resultOfTraverse){
                                System.out.println("Roll number already exists!");
                                System.out.print("Exited!");
                                return;
                            }
                            // else{
                            //     // continue;
                            // }
                            // studentRecordList.traversingMethod(rollNumber);
                    }
                    System.out.print("Enter Cgpa : ");
                    double cgpa = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Department : ");
                    String department = sc.nextLine();
                    // System.out.println("Record Added");
                    studentRecordList.addNewStudent(studentName, rollNumber, cgpa, department);
                    break;
                case 3:
                    System.out.print("Enter Roll number to find Record : ");
                    searchingRollNumber = sc.nextInt();
                    studentRecordList.searchingStudentByRollnoMethod(searchingRollNumber);
                    break;
                case 4:
                    System.out.print("Enter Roll number to Delete Record : ");
                    deletingRollno = sc.nextInt();
                    studentRecordList.deletingStudentByRollno(deletingRollno);
                    break;
                case 5:
                    System.out.print("Exited!");
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
         } while (userChoise!=5);
            

     }
}
