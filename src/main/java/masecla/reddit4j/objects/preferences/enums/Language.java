package masecla.reddit4j.objects.preferences.enums;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public enum Language {
	AFRIKAANS("af"), ALBANIAN("sq"), ALSATIAN("gsw"), AMHARIC("am"), ARABIC("ar"), ARMENIAN("hy"), ASSAMESE("as"),
	AZERI("az"), BASHKIR("ba"), BASQUE("eu"), BELARUSIAN("be"), BENGALI("bn"), BOSNIAN("bs"), BRETON("br"),
	BULGARIAN("bg"), CATALAN("ca"), CHINESE("zh"), CORSICAN("co"), CROATIAN("hr"), CZECH("cs"), DANISH("da"),
	DARI("prs"), DIVEHI("dv"), DUTCH("nl"), ENGLISH("en"), ESTONIAN("et"), FAROESE("fo"), FILIPINO("fil"),
	FINNISH("fi"), FRENCH("fr"), FRISIAN("fy"), GALICIAN("gl"), GEORGIAN("ka"), GERMAN("de"), GREEK("el"),
	GREENLANDIC("kl"), GUJARATI("gu"), HAUSA("ha"), HEBREW("he"), HINDI("hi"), HUNGARIAN("hu"), ICELANDIC("is"),
	IGBO("ig"), INDONESIAN("id"), INUKTITUT("iu"), INVARIANT("iv"), IRISH("ga"), ISIXHOSA("xh"), ISIZULU("zu"),
	ITALIAN("it"), JAPANESE("ja"), KICHE("qut"), KANNADA("kn"), KAZAKH("kk"), KHMER("km"), KINYARWANDA("rw"),
	KISWAHILI("sw"), KONKANI("kok"), KOREAN("ko"), KYRGYZ("ky"), LAO("lo"), LATVIAN("lv"), LITHUANIAN("lt"),
	LOWER("dsb"), LUXEMBOURGISH("lb"), MACEDONIAN("mk"), MALAY("ms"), MALAYALAM("ml"), MALTESE("mt"), MAORI("mi"),
	MAPUDUNGUN("arn"), MARATHI("mr"), MOHAWK("moh"), MONGOLIAN("mn"), NEPALI("ne"), NORWEGIAN("no"), OCCITAN("oc"),
	ORIYA("or"), PASHTO("ps"), PERSIAN("fa"), POLISH("pl"), PORTUGUESE("pt"), PUNJABI("pa"), QUECHUA("quz"),
	ROMANIAN("ro"), ROMANSH("rm"), RUSSIAN("ru"), SAMI("se"), SANSKRIT("sa"), SCOTTISH("gd"), SERBIAN("sr"),
	SESOTHO("nso"), SETSWANA("tn"), SINHALA("si"), SLOVAK("sk"), SLOVENIAN("sl"), SPANISH("es"), SWEDISH("sv"),
	SYRIAC("syr"), TAJIK("tg"), TAMAZIGHT("tzm"), TAMIL("ta"), TATAR("tt"), TELUGU("te"), THAI("th"), TIBETAN("bo"),
	TURKISH("tr"), TURKMEN("tk"), UKRAINIAN("uk"), UPPER("hsb"), URDU("ur"), UYGHUR("ug"), UZBEK("uz"),
	VIETNAMESE("vi"), WELSH("cy"), WOLOF("wo"), YAKUT("sah"), YI("ii"), YORUBA("yo");

	private String code;

	private Language(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public static Language matchByCode(String code) {
		if (code == null)
			return null;
		code = code.toLowerCase();
		for (Language cr : Language.values())
			if (cr.code.equals(code))
				return cr;
		return null;
	}

	public static TypeAdapter<Language> getAdapter() {
		return new TypeAdapter<Language>() {

			@Override
			public void write(JsonWriter out, Language value) throws IOException {
				out.value(value.getCode());
			}

			@Override
			public Language read(JsonReader in) throws IOException {
				JsonToken token = in.peek();
				try {
					if (token.equals(JsonToken.STRING))
						return Language.matchByCode(in.nextString());
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
				return null;
			}
		};
	}

}
