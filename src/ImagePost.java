public class ImagePost extends AbstractImagePost{
    private PostTag tag;
    private PostType type;

    public ImagePost(PostTag tag) {
        this.tag = tag;
        this.type = PostType.IMAGE;
        setLikes();
        this.likes = this.getLikes();
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
