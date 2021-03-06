package com.tidder.api.bootstrap;

import com.tidder.api.domain.Board;
import com.tidder.api.domain.Post;
import com.tidder.api.domain.Subtidder;
import com.tidder.api.domain.User;
import com.tidder.api.domain.associative.UserBoard;
import com.tidder.api.domain.associative.UserPost;
import com.tidder.api.domain.associative.UserSubtidder;
import com.tidder.api.domain.associative.key.UserBoardId;
import com.tidder.api.domain.associative.key.UserPostId;
import com.tidder.api.domain.associative.key.UserSubtidderId;
import com.tidder.api.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class Bootstrap implements CommandLineRunner {

    private final PostRepository postRepository;
    private final SubtidderRepository subtidderRepository;
    private final BoardRepository boardRepository;
    private final UserPostRepository userPostRepository;
    private final UserRepository userRepository;
    private final UserSubtidderRepository userSubtidderRepository;
    private final UserBoardRepository userBoardRepository;
    private final PasswordEncoder passwordEncoder;

    private User user;
    private Subtidder subtidder;
    private Board board;
    private Post post;
    private UserPost userPost;
    private UserBoard userBoard;

    public Bootstrap(PostRepository postRepository, SubtidderRepository subtidderRepository, BoardRepository boardRepository, UserPostRepository userPostRepository, UserRepository userRepository, UserSubtidderRepository userSubtidderRepository, UserBoardRepository userBoardRepository, PasswordEncoder passwordEncoder) {
        this.postRepository = postRepository;
        this.subtidderRepository = subtidderRepository;
        this.boardRepository = boardRepository;
        this.userPostRepository = userPostRepository;
        this.userRepository = userRepository;
        this.userSubtidderRepository = userSubtidderRepository;
        this.userBoardRepository = userBoardRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        loadUser();
        loadSubtidder();
        loadUserSubtidder();
        loadBoard();
        loadUserBoard();
        loadPost();
        loadUserPost();
    }

    private void loadUser() {
        String hashedPass = passwordEncoder.encode("password");
        user = new User.UserBuilder()
                .setId(1L)
                .setUsername("rbryan21")
                .setEmail("rbryan21@gmail.com")
                .setPassword(hashedPass)
                .build();
        userRepository.save(user);
    }

    private void loadBoard() {
        board = new Board.BoardBuilder()
                .setId(1L)
                .setTitle("Board Title")
                .setCreatedDate(new Date(System.currentTimeMillis()))
                .setUser(user)
                .setSubtidder(subtidder)
                .build();
        boardRepository.save(board);
    }

    private void loadPost() {
        post = new Post.PostBuilder()
                .setId(1L)
                .setContent("Example Content")
                .setCreatedDate(new Date(System.currentTimeMillis()))
                .setUser(user)
                .setBoard(board)
                .build();
        postRepository.save(post);
    }

    private void loadUserPost() {
        userPost = new UserPost.UserPostBuilder()
                .setId(new UserPostId(user.getId(), post.getId()))
                .setUser(user)
                .setPost(post)
                .setUpvote(true)
                .build();
        userPostRepository.save(userPost);
    }

    private void loadUserBoard() {
        userBoard = new UserBoard.UserBoardBuilder()
                .setId(new UserBoardId(user.getId(), board.getId()))
                .setUser(user)
                .setBoard(board)
                .setUpvote(false)
                .build();
        userBoardRepository.save(userBoard);
    }

    private void loadSubtidder() {
        subtidder = new Subtidder.SubtidderBuilder()
                .setId(1L)
                .setName("Braves")
                .setUser(user)
                .build();
        subtidderRepository.save(subtidder);
    }

    private void loadUserSubtidder() {
        UserSubtidder userSubtidder = new UserSubtidder.UserSubtidderBuilder()
                .setId(new UserSubtidderId(user.getId(), subtidder.getId()))
                .setSubtidder(subtidder)
                .setUser(user)
                .build();
        userSubtidderRepository.save(userSubtidder);
    }

}
