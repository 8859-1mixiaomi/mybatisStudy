package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
   private int sid;
   private String id;
   private String title;
   private String author;
   private Date  createTime;
   private int views;

}
