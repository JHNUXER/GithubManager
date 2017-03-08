package gitdesk.core.entities;

public class Repository {
  protected String name;
  protected URL url;
  protected User author;

  public Repository(URL url,User author) {
    String s = url.toString();
    int k = ;
    this.name = "";
    for (int i = s.lastInstanceOf("/",s.length()-1); i < s.length()-1; i++) {
      this.name += s.charAt(i);
    }
    this.author = author;
  }
  
  public String getName() {
    return name;
  }
  public URL getURL() {
    return url;
  }
  public User getAuthor() {
    return author;
  }
}
