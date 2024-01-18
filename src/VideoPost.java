

public class VideoPost extends AbstractVideoPost{
    PostTag tag;
    PostType type;

    public VideoPost(PostTag tag) {
        this.tag = tag;
        this.type = PostType.VIDEO;
        //System.out.println("ho creato un video");
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
