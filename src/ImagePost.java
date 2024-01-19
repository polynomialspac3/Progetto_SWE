public class ImagePost extends AbstractImagePost{
    PostTag tag;
    PostType type;

    public ImagePost(PostTag tag) {
        this.tag = tag;
        this.type = PostType.IMAGE;
        this.setLikes();
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
