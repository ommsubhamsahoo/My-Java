package MyFunInterface;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;

/*
class Movie{
	String name;
	String review;
	String collection;
	
	public Movie(String name,String review,String collection) {
		this.name=name;
		this.review=review;
		this.collection=collection;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", review=" + review + ", collection=" + collection + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(collection, name, review);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(collection, other.collection) && Objects.equals(name, other.name)
				&& Objects.equals(review, other.review);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	
 
}*/
record Movie(String name,String review,String collection) {
// record is java14 feature that already override the hashcode,equals,tostring and field constructor,getter & setter.
}
public class MyMovieConsumer {
public static void main(String[] args) {
	ArrayList<Movie> al = new ArrayList<>();
			al.add( new Movie("Dangal","9","Hit"));
			al.add( new Movie("KGF2","8","Hit"));
			al.add( new Movie("OMG2","3","Flop"));
			al.add( new Movie("Tiger Zinda HAi","8","Hit"));
			al.add( new Movie("Chhote miaan Bade miaan","4","Flop"));
			
			Consumer<Movie> c=m->{
				if(m.collection().toLowerCase().equals("hit")) {
					System.out.println(m.name()+" is Hit.");
				}else {
					System.out.println(m.name()+" is Flop.");
				}
			};
			for(Movie e:al)
			{ 
				c.accept(e);
			}
}
}
