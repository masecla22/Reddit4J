package masecla.reddit4j.objects.list;

import java.util.List;

import lombok.Getter;
import masecla.reddit4j.objects.KindObject;
import masecla.reddit4j.objects.RedditTrophy;

@KindObject
@Getter
public class TrophyList {

    private List<RedditTrophy> trophies;
}
