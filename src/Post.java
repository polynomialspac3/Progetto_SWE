// postInterface &egrave; il subject dell'observer
public interface Post {

    public default void notifyObserver(Observer o) {
        o.update(this);
    }
    
    public int getLikes();

    public void setLikes();

    public PostTag getTag();
    public PostType getType();


}
