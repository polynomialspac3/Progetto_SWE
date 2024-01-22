import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Observer o = new Observer();
        //VideoPost vp = new VideoPost(PostTag.RANDOM);
        //ImagePost ip = new ImagePost(PostTag.RANDOM);
        Post liked, viewed;
        int nuovi = 2;
        int post_iniziali = 20;
        int totali = post_iniziali + nuovi;


        Post[] archive = new Post[totali];

        //creaiamo i primi 20 post di tutte le 4 tipologie

        for(int i=0; i<post_iniziali; i++){
            if (i < post_iniziali/4) {
                VideoPost videop = new VideoPost((PostTag.TRENDING));
                archive[i] = videop;
            }else if(i < post_iniziali/2){
                VideoPost videop = new VideoPost((PostTag.RANDOM));
                archive[i] = videop;
            } else if(i <(post_iniziali/4)*3){
                ImagePost imagep = new ImagePost((PostTag.RANDOM));
                archive[i] = imagep;
            } else if (i<post_iniziali) {
                ImagePost imagep = new ImagePost((PostTag.TRENDING));
                archive[i] = imagep;
            }
        }


        //ORDINA IN BASE AI LIKE
        Post mostliked = archive[0];
        VideoPost mostviewed = (VideoPost)archive[0];

        for(int i=0; i<post_iniziali; i++){
            if(archive[i].getType()==PostType.VIDEO){
                if ( ((VideoPost)archive[i]).getViews() > mostviewed.getViews()){
                    mostviewed = (VideoPost) archive[i];
                }
            }
            if (archive[i].getLikes() > mostliked.getLikes()){
                mostliked = archive[i];

            }
        }


        mostliked.notifyObserver(o);
        liked = o.executeStrategy();


        mostviewed.notifyObserver(o);
        viewed = o.executeStrategy();


        archive[post_iniziali] = liked;
        archive[post_iniziali+1] = viewed;



        for(int i=0; i<totali; i++){
            String tag = String.valueOf(archive[i].getTag());
            if(archive[i].getType()==PostType.VIDEO){
                int v = ((VideoPost)archive[i]).getViews();
                System.out.println("post numero " + i  + "   " + archive[i] +" tags " + tag + " likes  " + archive[i].getLikes() + "  views " + v);
            }else {
                System.out.println("post numero " + i + "  " + archive[i]  +" tags " + tag + " likes  " + archive[i].getLikes());
            }
        }

    }


}