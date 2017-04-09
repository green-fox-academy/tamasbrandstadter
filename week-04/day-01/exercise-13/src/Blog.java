import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> list;

  public Blog() {
    this.list = new ArrayList<>();
  }

  public void delete(int index) {
    list.remove(index);
  }

  public void update(int index, BlogPost blogPost) {
    list.set(index, blogPost);
  }
}