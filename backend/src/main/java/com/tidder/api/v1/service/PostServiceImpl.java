package com.tidder.api.v1.service;

import com.tidder.api.v1.model.PostCreationDto;
import com.tidder.api.v1.model.PostDto;
import com.tidder.api.v1.model.PostUpdationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Override
    public List<PostDto> getAllPosts() {
        return null;
    }

    @Override
    public List<PostDto> getAllPostsForBoardId(Long boardId) {
        return null;
    }

    @Override
    public PostDto getPostById(Long postId) {
        return null;
    }

    @Override
    public PostDto createPost(PostCreationDto postCreationDto) {
        return null;
    }

    @Override
    public PostDto updatePost(PostUpdationDto postUpdationDto) {
        return null;
    }

}
