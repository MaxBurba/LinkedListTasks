public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        LinkedList.Node nodeForLoop = new LinkedList.Node(3); //Node to create a loop further

        list.add(new LinkedList.Node(1));
        list.add(new LinkedList.Node(2));
        list.add(nodeForLoop);
        list.add(new LinkedList.Node(4));
        list.add(new LinkedList.Node(5));
        list.add(new LinkedList.Node(6));
        list.add(new LinkedList.Node(7));

        list.outputList(); // 1 2 3 4 5 6 7

        LinkedList.Node middle = list.findMiddle(); //Finds middle element - 4. For 6 elements mid is the same

        list.setToStart(middle); //Sets desired element to the beginning of the list

        list.outputList(); //Output restructured list - 4 1 2 3 5 6 7

        // That's where the loop is created
        list.add(nodeForLoop);

        // Test for loop existence
        if(list.containsLoop()){
            System.out.println("Watch out, there is a loop!");
        } else {
            System.out.println("The is NO LOOP");
        }
        //list.outputList(); /*Uncomment this to make sure there's actually a loop*/
    }
}
