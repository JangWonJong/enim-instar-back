package come.mine.Post.service;

import come.mine.Post.domain.Post;
import come.mine.Post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    public final PostRepository postRepository;
    @Override
    public int updateView(Long id) {
        return postRepository.updateView(id);
    }

    @Override
    public Optional<Post> findById(Long id) {
        return Optional.empty();
    }
}
