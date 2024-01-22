import javax.naming.Context;

public class Observer implements ObserverInterface {
    private CondividiStrategy strategy;
    protected ConcreteFactory2 randomfactory;
    protected ConcreteFactory1 trendingfactory;
    private Post post, newpost;
    protected PostTag ptg;
    protected PostType pty;

    @Override
    public void update(Post post) {
        // il post ha ricevuto più di un numero di like o views quindi creo post simili
        this.post = post;
        this.strategy = SetStrategy(post);

    }

    public Post executeStrategy(){
        pty = getPostType();
        this.newpost = strategy.share(pty);
        return newpost;
    }

    public CondividiStrategy SetStrategy(Post post) {
        ptg = getPostTag();
        //System.out.println(ptg);

        if (ptg == PostTag.RANDOM) {
            this.randomfactory = new ConcreteFactory2();
            return randomfactory;
        } else if(ptg== PostTag.TRENDING) {
            this.trendingfactory = new ConcreteFactory1();
            return trendingfactory;
        }
        return null;
    }

    public PostTag getPostTag(){
        return post.getTag();
    }

    public PostType getPostType(){
        return post.getType();
    }




    }


