import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteFactory2Test {

    @Test
    void creaVideoPost() {
        ConcreteFactory2 cf2 = new ConcreteFactory2();
        assertNotNull(cf2.creaVideoPost());
    }

    @Test
    void creaImagePost() {
        ConcreteFactory2 cf2 = new ConcreteFactory2();
        assertNotNull(cf2.creaImagePost());
    }

    @Test
    void share() {
        ConcreteFactory2 cf2 = new ConcreteFactory2();

        Post vp = cf2.share(PostType.VIDEO);
        assertNotNull(vp);
        assertEquals(PostType.VIDEO,vp.getType());
        assertEquals(PostTag.RANDOM, vp.getTag());

        Post ip = cf2.share(PostType.IMAGE);
        assertNotNull(ip);
        assertEquals(PostType.IMAGE,ip.getType());
        assertEquals(PostTag.RANDOM, ip.getTag());

        PostType pty = PostType.VIDEO;
        assertNotNull(cf2.share(pty));

        pty = PostType.IMAGE;
        assertNotNull(cf2.share(pty));

    }
}