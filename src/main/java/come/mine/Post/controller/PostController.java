package come.mine.Post.controller;

import come.mine.Post.domain.PostDTO;
import come.mine.Post.service.PostService;
import io.swagger.models.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    /*@GetMapping("/posts/read/{id}")
    public String read(@PathVariable Long id, Model model){
        PostDTO postDTO = postService.findById(id);

    }*/
}
