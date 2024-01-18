import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImagePostTest {

    @Test
    void getTag() {
        ImagePost im = new ImagePost(PostTag.TRENDING);
        assertEquals(PostTag.TRENDING, im.getTag());
    }

}