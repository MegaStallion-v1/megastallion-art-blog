package com.megastallion.Megastallion.controllers;

import com.megastallion.Megastallion.payLoad.PostDto;
import com.megastallion.Megastallion.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/post")
@RequiredArgsConstructor
public class PostController {
@Autowired
    final PostService postService;


    @PostMapping("/create-post")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postRequestDto){
        return new ResponseEntity<>(postService.createPost(postRequestDto),HttpStatus.CREATED);
    }
}
