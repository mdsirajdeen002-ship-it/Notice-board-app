package com.noticeboard.noticeboard;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Data.*;
@Entity
@Data
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String postedBy;

}
