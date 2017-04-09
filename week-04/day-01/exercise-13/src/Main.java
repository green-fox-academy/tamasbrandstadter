public class Main {
  public static void main(String[] args) {
    Blog blog = new Blog();
    BlogPost blogPost = new BlogPost();
    BlogPost blogPost2 = new BlogPost("BB", "Title2", "Texttext", "4444.4.44");
    BlogPost blogPost3 = new BlogPost("CC", "This is the title", "text", "3333.3.33");
    BlogPost blogPost4 = new BlogPost();

    blog.list.add(blogPost);
    blog.list.add(blogPost2);
    blog.list.add(blogPost4);

    blog.delete(1);
    blog.update(0, blogPost3);

    for (int i = 0; i < blog.list.size(); i++) {
      System.out.println(blog.list.get(i).authorname);
      System.out.println(blog.list.get(i).text);
    }
  }
}