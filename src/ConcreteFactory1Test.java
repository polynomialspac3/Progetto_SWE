import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteFactory1Test {

    @Test
    void creaVideoPost() {
        ConcreteFactory1 cf1 = new ConcreteFactory1();
        assertNotNull(cf1.creaVideoPost());
    }

    @Test
    void creaImagePost() {
        ConcreteFactory1 cf1 = new ConcreteFactory1();
        assertNotNull(cf1.creaImagePost());
    }

    @Test
    void share() {
        ConcreteFactory1 cf1 = new ConcreteFactory1();

        Post vp = cf1.share(PostType.VIDEO);
        assertNotNull(vp);
        assertEquals(PostType.VIDEO,vp.getType());
        assertEquals(PostTag.TRENDING, vp.getTag());

        Post ip = cf1.share(PostType.IMAGE);
        assertNotNull(ip);
        assertEquals(PostType.IMAGE,ip.getType());
        assertEquals(PostTag.TRENDING, ip.getTag());

        PostType pty = PostType.VIDEO;
        assertNotNull(cf1.share(pty));

        pty = PostType.IMAGE;
        assertNotNull(cf1.share(pty));

    }
}