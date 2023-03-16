package com.cydeo;

import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cydeo.model.Comment;

@SpringBootApplication
public class CydeoDemoApplication {

    public static void main(String[] args) {

        Comment comment  = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext container = SpringApplication.run(CydeoDemoApplication.class, args);

        CommentService commentService = container.getBean(CommentService.class);
        commentService.publishComment(comment);
        commentService.printConfigData();

        commentService.printDBConfigData();
    }

}
