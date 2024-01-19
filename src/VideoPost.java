

public class VideoPost extends AbstractVideoPost{
    PostTag tag;
    PostType type;

    public VideoPost(PostTag tag) {
        this.tag = tag;
        this.type = PostType.VIDEO;
        this.setLikes();
        this.likes = this.getLikes();
        this.setViews();
        this.views = this.getViews();
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
