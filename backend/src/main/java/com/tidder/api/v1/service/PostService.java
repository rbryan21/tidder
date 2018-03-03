package com.tidder.api.v1.service;

import com.tidder.api.v1.model.PostCreationDto;
import com.tidder.api.v1.model.PostDto;
import com.tidder.api.v1.model.PostUpdationDto;

import java.util.List;

public interface PostService {
    List<PostDto> getAllPosts();
    List<PostDto> getAllPostsForBoardId(Long boardId);
    PostDto getPostById(Long postId);
    PostDto createPost(PostCreationDto postCreationDto);
    PostDto updatePost(PostUpdationDto postUpdationDto);
}
