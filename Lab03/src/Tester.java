
/*
 * Written by Christopher Moyer
 */
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDoList list = new ToDoList();
		
		//Add Items & Print
		System.out.println("To Do List Tester!"
				+ "\nAdding Five Tasks To Do");
		list.addItem("Buy Ground Beef");
		list.addItem("Buy Cheese");
		list.addItem("Buy Taco Shells");
		list.addItem("Make Tacos");
		list.addItem("Eat Tacos");
		list.showList();
		
		//Move current & Add Item in the middle
		System.out.println("I forgot to get salsa. Let me add that after step 2.");
		list.goToNext();
		list.insertAfterCurrent("Buy Salsa");
		list.showList();
		
		//Set data at current
		System.out.println("On second thought I’m in a spicy mood so let’s change salsa to hot sauce");
		list.goToNext();
		list.setDataAtCurrent("Buy Hot Sauce");
		list.showList();
		
		//Insert after current
		System.out.println("Do people put guacamole on tacos? I’ll add it after step 3");
		list.insertAfterCurrent("Buy Guacamole");
		list.showList();
		
		//Delete
		System.out.println("On second thought I don't think they do let me take that out");
		list.goToNext();
		list.deleteCurrentNode();
		list.showList();
		
		//Go to previous and delete
		list.goToPrevious();
		list.deleteCurrentNode();
		list.showList();
	}

}
