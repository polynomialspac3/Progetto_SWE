
// crea post trending

public class ConcreteFactory1 extends AbstractPostFactory implements CondividiStrategy{

    @Override
    public VideoPost creaVideoPost() {
        return new VideoPost(PostTag.TRENDING);
    }

    @Override
    public ImagePost creaImagePost() {
        return new ImagePost(PostTag.TRENDING);
    }

    @Override
    public Post share(PostType pty) {
        switch (pty){
            case IMAGE:
               return creaImagePost();
            case VIDEO:
               return creaVideoPost();
        }
        return null;
    }
}
