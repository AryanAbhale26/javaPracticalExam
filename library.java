
import java.util.ArrayList;
import java.util.List;

// import java.util.ArrayList;
// import java.util.List;

// class Book{
//   String name;
//   String auth;
//  public  Book(String name,String auth){
//   this.name=name;
//   this.auth=auth;
//  }
// }
// class bookRepo{
//   List<Book> books=new ArrayList<>();
//   public void addBook(Book b){
//     books.add(b);
//   }

//   List<Book> getbook(){
//     return books;
//   }
  
// }

// interface search{
//   List<Book> findOne(List<Book>books,String keywords);
  
// }
// class titleSearch implements search{
// List<Book>result=new ArrayList<>();
//    public List<Book> findOne(List<Book>books,String keywords){
//  for(Book b:books){
//   if(b.name.toLowerCase().contains(keywords.toLowerCase())){
//     result.add(b);
//   }

//  }
//  return  result;
//    }
  
// }


// public class library {
//   public static void main(String[] args) {
//     bookRepo bk=new bookRepo();
//     bk.addBook(new Book("java","aryan"));
//     search searchByName=new titleSearch();
//     for(Book b:searchByName.findOne(bk.getbook(),"pk")){
//       System.out.print(b.name+"by"+b.auth);
//     }
//   }
// }


class Book{
  String name,auth;
  public Book(String name,String auth){
    this.name=name;
    this.auth=auth;
  }
}
class bookRepo{
  List<Book> books=new ArrayList<>();
  void addBook(Book b){
    books.add(b);
  }
  List<Book>getAll(){
  return books;
  }
}
interface search{
  List<Book>findOne(List<Book>book,String keyword);
}

class searchByName implements search{
  List<Book> result=new ArrayList<>();
     public List<Book>findOne(List<Book>book,String keyword){
 for(Book b:book){
  if(b.name.toLowerCase().contains(keyword.toLowerCase())){
    result.add(b);
  };
 }
 return result;
    }
}
class library{
  public static void main(String[] args) {
      bookRepo b=new bookRepo();
    b.addBook(new Book("Java","aryan"));
    search searchByName=new searchByName();
    for(Book b1:searchByName.findOne(b.getAll(), "aryuan")){
      System.out.println(b1.name +"by"+b1.auth);
    }
  }
}