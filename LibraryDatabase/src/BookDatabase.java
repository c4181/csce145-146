
public class BookDatabase {
	private static int BOOK_DATABASE_SIZE = 100;
    private static final String DELIM = "\t";
    private Book[] books;
    private Book[] sortedBooks;

    public BookDatabase()
    {
        books = new Book[BOOK_DATABASE_SIZE];
        sortedBooks = new Book[BOOK_DATABASE_SIZE];
    }
    public Book[] getBooks()
    {
        return sortedBooks;
    }

    public void addBook(Book aBook)
    {
        if(books[books.length-1] != null)
        {
            System.out.println("The database is full!");
            return;
        }
        for (int i = 0; i < books.length; i++)
        {
            if(books[i] == null)
            {
                books[i] = aBook;
                break;
            }
        }
        sortByTitle();
    }

    public void removeBook(String aName)
    {
        int removeIndex = -1;
        for (int i = 0; i < books.length; i++)
        {
            if(books[i]!=null && aName.equals(books[i].getName()))
            {
                removeIndex = i;
            }
        }
        if(removeIndex==-1)
        {
            System.out.println("Book not found");
        }
        else
        {
            for(int i = removeIndex;i<books.length-1;i++)
            {
                books[i] = books[i+1];
            }
            books[books.length-1] = null;
        }
    }
    public void sortByTitle()
    {
        for (int i = 0; i < books.length && books[i] != null ; i++)
        {
            sortedBooks[i] = books[i];
        }

        boolean hasSwapped = true;
        while(hasSwapped)
        {
            hasSwapped = false;
            for(int i = 0; i < books.length-1; i++)
            {
                if(sortedBooks[i] != null && sortedBooks[i+1] != null && sortedBooks[i].getName().compareToIgnoreCase(sortedBooks[i + 1].getName()) > 0) //swap
                {
                    Book temp = sortedBooks[i];
                    sortedBooks[i] = sortedBooks[i+1];
                    sortedBooks[i+1] = temp;
                    hasSwapped = true;
                }
            }
        }

        for (int i = 0; i < books.length && sortedBooks[i]!=null; i++)
        {
            System.out.println(sortedBooks[i]);
        }
    }
}
