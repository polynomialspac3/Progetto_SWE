import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void updateEexecute() {
        // Setup
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        Observer observer = new Observer();

        // post esempio
        VideoPost vp = new VideoPost(PostTag.RANDOM);
        vp.setLikes();

        observer.update(vp);

        observer.randomfactory = concreteFactory2;
        observer.trendingfactory = concreteFactory1;
        Post p = observer.executeStrategy();

        assertEquals(PostType.VIDEO, observer.pty);
        assertEquals(PostType.VIDEO, observer.getPostType());

        assertEquals(PostTag.RANDOM, observer.ptg);
        assertEquals(PostTag.RANDOM, observer.getPostTag());

        assertNotNull(p);
        assertEquals(PostType.VIDEO, p.getType());

    }

    @Test
    void startegy() {
        Observer observer = new Observer();
        VideoPost vp = new VideoPost(PostTag.RANDOM);
        observer.update(vp);
        assertNotNull(observer.SetStrategy(vp));

        CondividiStrategy strategy = observer.SetStrategy(vp);
        assertTrue(strategy instanceof ConcreteFactory2);

    }
};
