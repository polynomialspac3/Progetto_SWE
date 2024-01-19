
// abstract product a
public abstract class AbstractVideoPost implements Post {
    int views;
    int likes;
    @Override
    public int getLikes() {
        //System.out.println("likes" +likes);
        return likes;
    }

    @Override
    public void setLikes(){
        this.likes = (int)(Math.random()*1000-1);
        /*System.out.println("likes" + likes);
        if (likes > 300){
            this.notifyObserver(o);
        }*/
    }

    public int getViews() {
        return views;
    }

    public void setViews() {
        this.views = (int)(Math.random()*1000-1);
        /*System.out.println("views" + views);
        if (views > 500){
            this.notifyObserver(o);
        }*/
    }

}
