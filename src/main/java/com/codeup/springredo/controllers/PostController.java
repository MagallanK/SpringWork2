package com.codeup.springredo.controllers;

import com.codeup.springredo.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController{

    @GetMapping("/posts")
    public String indexPosts(Model viewModel) {

        Post newPost1 = new Post("Post1", "Welcome to Codeup! Body 1");
        Post newPost2 = new Post("Post2", "Welcome to Codeup! Body 2");

        ArrayList<Post> posts = new ArrayList<>();

        posts.add(newPost1);
        posts.add(newPost2);

        viewModel.addAttribute("posts", posts);

        return "posts/index";
    }

    @GetMapping("/posts/show")
    public String individualPost(Model viewModel) {
        Post newPost = new Post("Hello World", "Welcome to Codeup!");
        viewModel.addAttribute("post", newPost);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewCreatePost() {
        return "Placeholder for the create post form!";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "";
    }
}
