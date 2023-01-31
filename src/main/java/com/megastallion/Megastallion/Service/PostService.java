package com.megastallion.Megastallion.Service;

import com.megastallion.Megastallion.entities.Category;
import com.megastallion.Megastallion.payLoad.PostDto;
import com.megastallion.Megastallion.entities.Post;
import com.megastallion.Megastallion.payLoad.PostUpdateDto;

public interface PostService {


    PostDto createPost(PostDto postRequestDto,Long categoryId);

    String deletePost(Long postId);

    PostDto fetchPost(Long postId);

    PostDto updatePost(Long postId, PostUpdateDto request);
}
