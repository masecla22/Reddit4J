package masecla.reddit4j;

import java.awt.Color;
import java.awt.Dimension;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import masecla.reddit4j.json.RedditDataTypeAdapterFactory;
import masecla.reddit4j.json.adapters.ColorAdapter;
import masecla.reddit4j.json.adapters.DimensionAdapter;
import masecla.reddit4j.json.adapters.UUIDAdapter;
import masecla.reddit4j.objects.preferences.enums.BadCommentAutocollapse;
import masecla.reddit4j.objects.preferences.enums.CountryCode;
import masecla.reddit4j.objects.preferences.enums.DefaultCommentSort;
import masecla.reddit4j.objects.preferences.enums.Language;
import masecla.reddit4j.objects.preferences.enums.MediaStyle;
import masecla.reddit4j.objects.preferences.enums.PrivateMessagePolicy;
import masecla.reddit4j.objects.subreddit.UserFlairRichText;
import masecla.reddit4j.objects.subreddit.enums.DisplayLayout;

public class RedditUtils {

    public static final Gson gson = new GsonBuilder()
            //.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .registerTypeAdapter(Language.class, Language.getAdapter())
            .registerTypeAdapter(MediaStyle.class, MediaStyle.getAdapter())
            .registerTypeAdapter(PrivateMessagePolicy.class, PrivateMessagePolicy.getAdapter())
            .registerTypeAdapter(CountryCode.class, CountryCode.getAdapter())
            .registerTypeAdapter(DefaultCommentSort.class, DefaultCommentSort.getAdapter())
            .registerTypeAdapter(BadCommentAutocollapse.class, BadCommentAutocollapse.getAdapter())
            .registerTypeAdapter(DisplayLayout.class, DisplayLayout.getAdapter())
            .registerTypeAdapter(UserFlairRichText.class, UserFlairRichText.getAdapter())
            .registerTypeAdapter(Color.class, new ColorAdapter())
            .registerTypeAdapter(Dimension.class, new DimensionAdapter())
            .registerTypeAdapter(UUID.class, new UUIDAdapter())
            .registerTypeAdapterFactory(new RedditDataTypeAdapterFactory())
            .create();
}
