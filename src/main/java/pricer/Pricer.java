package pricer;


import java.io.FileNotFoundException;

/**
 * Assignment description
 * This assignment should take around four hours,use more time if needed.
 * Please keep in mind that you should solve the task using good engineering practices.
 * Make assumptions accordingly. In the future there might be more file types than json and xml.
 *  1. Parse the file.
 *  2. Sort according to name. Sort order should be either ascending or descending.
 *  3. Print menu with details to console.
 * Run examples
 *  java –jar menu.jar menu.xml asc
 *  java –jar menu.jar menu.json desc
 * Deliverables
 * The source code and an executable jar that takes a file name and sort order as arguments.
 */
public class Pricer {

  private void ParseFile(){

  }
  private void SortByNameAscending(){

  }
  private void SortByNameDescending(){

  }

  public static void main(String[] args) throws FileNotFoundException {
      /**
       * 1. relative path of the file
       * 2. skip
       * 3. read with switch based on name or price or ...
       * 4. before that store in the array then construct the object
       */
      String path="C:\\Users\\eyuel\\Documents\\project\\java\\IdeaProjects\\Interviews\\Leetcode\\src\\main\\java\\pricer\\menu.json";
        

  }

  private static class Menu{
      private String name;
      private String price;
      private String description;
      private String calories;

      public Menu(String name,String price,String description,String calories){
          this.name=name;
          this.price=price;
          this.description=description;
          this.calories=calories;
      }
      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public String getPrice() {
          return price;
      }

      public void setPrice(String price) {
          this.price = price;
      }

      public String getDescription() {
          return description;
      }

      public void setDescription(String description) {
          this.description = description;
      }

      public String getCalories() {
          return calories;
      }

      public void setCalories(String calories) {
          this.calories = calories;
      }
  }
}

