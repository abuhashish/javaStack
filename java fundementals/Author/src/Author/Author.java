package Author;

public class Author implements Comparable<Author> {
protected String first_name;
protected String last_name;
protected String book_name;



public Author() {
	super();
}


public Author(String x, String last_name, String book_name) {
	first_name = x;
	this.last_name = last_name;
	this.book_name = book_name;
}


@Override
public int compareTo(Author auth) {
	if(first_name.compareTo(auth.first_name)==0)
		return 0;
	else if(first_name.compareTo(auth.first_name)>0)  
		return 1;  
	else  
		return -1;  
}

}
