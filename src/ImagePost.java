public class ImagePost extends AbstractImagePost{
    PostTag tag;
    PostType type;

    public ImagePost(PostTag tag) {
        this.tag = tag;
        this.type = PostType.IMAGE;
        //System.out.println("ho creato un immmmpost");
    }


    @Override
    public PostTag getTag() {
        return this.tag;
    }

    @Override
    public PostType getType() {
        return this.type;
    }
}
