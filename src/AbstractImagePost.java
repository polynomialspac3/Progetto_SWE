
//abstract product b

public abstract class AbstractImagePost implements Post{
    protected int likes;
    @Override
    public int getLikes() {
        return likes;
    }

    public void setLikes(){
        this.likes = (int)(Math.random()*(1000-1));
        /*System.out.println("likes" + likes);
        if(likes > 300){
            this.notifyObserver(o);
        }*/
    }

}
