public class BlogPost {
  String authorname;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String authorname, String title, String text, String publicationDate) {
    this.authorname = authorname;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public BlogPost() {
    this.authorname = "A.A";
    this.title = "Title";
    this.text = "Text";
    this.publicationDate = "5555.5.55";
  }
}