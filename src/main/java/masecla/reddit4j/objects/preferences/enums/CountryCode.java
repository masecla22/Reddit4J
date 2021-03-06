package masecla.reddit4j.objects.preferences.enums;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public enum CountryCode {
	AFGHANISTAN("AF"), ALABAMA("AL"), ALAND_ISLANDS("AX"), ALGERIA("DZ"), AMERICAN_SAMOA("AS"), ANDORRA("AD"),
	ANGOLA("AO"), ANGUILLA("AI"), ANTARCTICA("AQ"), ANTIGUA_AND_BARBUDA("AG"), ARIZONA("AZ"), ARKANSAS("AR"),
	ARMENIA("AM"), ARUBA("AW"), AUSTRALIA("AU"), AUSTRIA("AT"), BAHAMAS("BS"), BAHRAIN("BH"), BANGLADESH("BD"),
	BARBADOS("BB"), BELARUS("BY"), BELGIUM("BE"), BELIZE("BZ"), BENIN("BJ"), BERMUDA("BM"), BHUTAN("BT"), BOLIVIA("BO"),
	BOSNIA_AND_HERZEGOVINA("BA"), BOTSWANA("BW"), BOUVET_ISLAND("BV"), BRAZIL("BR"), BRITISH_VIRGIN_ISLANDS("VG"),
	BRITISH_INDIAN_OCEAN_TERRITORY("IO"), BRUNEI("BN"), BULGARIA("BG"), BURKINA_FASO("BF"), BURUNDI("BI"),
	CALIFORNIA("CA"), CAMBODIA("KH"), CAMEROON("CM"), CAPE_VERDE("CV"), CARIBBEAN_NETHERLANDS("BQ"),
	CENTRAL_AFRICAN_REPUBLIC("CF"), CHAD("TD"), CHILE("CL"), CHINA("CN"), CHRISTMAS_ISLAND("CX"), COCOS_ISLANDS("CC"),
	COLORADO("CO"), COMOROS("KM"), CONGO("CG"), CONGO_DEMOCRATIC_REPUBLIC_OF("CD"), COOK_ISLANDS("CK"),
	COSTA_RICA("CR"), CROATIA("HR"), CUBA("CU"), CURACAO("CW"), CYPRUS("CY"), CZECH_REPUBLIC("CZ"), COTE_D_IVOIRE("CI"),
	DELAWARE("DE"), DENMARK("DK"), DJIBOUTI("DJ"), DOMINICA("DM"), DOMINICAN_REPUBLIC("DO"), EAST_TIMOR("TL"),
	ECUADOR("EC"), EGYPT("EG"), EL_SALVADOR("SV"), EQUATORIAL_GUINEA("GQ"), ERITREA("ER"), ESTONIA("EE"),
	ETHIOPIA("ET"), FALKLAND_ISLANDS("FK"), FAROE_ISLANDS("FO"), FEDERATED_STATES_OF_MICRONESIA("FM"), FIJI("FJ"),
	FINLAND("FI"), FORMER_REPUBLIC_OF_MACEDONIA("MK"), FRANCE("FR"), FRENCH_GUIANA("GF"), FRENCH_POLYNESIA("PF"),
	FRENCH_SOUTHERN_TERRITORIES("TF"), GAMBIA("GM"), GEORGIA_STATE("GA"), GEORGIA("GE"), GHANA("GH"), GIBRALTAR("GI"),
	GREECE("GR"), GREENLAND("GL"), GRENADA("GD"), GUADELUPA("GP"), GUAM("GU"), GUATEMALA("GT"), GUERNSEY("GG"),
	GUINEA("GN"), GUINEA_BISSAU("GW"), GUYANA("GY"), HAITI("HT"), HEARD_ISLAND_AND_MCDONALD_ISLANDS("HM"),
	HONDURAS("HN"), HONG_KONG("HK"), HUNGARY("HU"), ICELAND("IS"), IDAHO("ID"), ILLINOIS("IL"), INDIANA("IN"),
	INSTALLATIONS_IN_INTERNATIONAL_WATERS("XZ"), IRAN("IR"), IRAQ("IQ"), IRELAND("IE"), ISLE_OF_MAN("IM"), ITALY("IT"),
	JAMAICA("JM"), JAPAN("JP"), JERSEY("JE"), JORDAN("JO"), KAZAKHSTAN("KZ"), KENTUCKY("KY"), KENYA("KE"),
	KIRIBATI("KI"), KUWAIT("KW"), KYRGYZSTAN("KG"), LATVIA("LV"), LEBANON("LB"), LESOTHO("LS"), LIBERIA("LR"),
	LIBYA("LY"), LIECHTENSTEIN("LI"), LITHUANIA("LT"), LOUISIANA("LA"), LUXEMBOURG("LU"), MADAGASCAR("MG"), MAINE("ME"),
	MALAWI("MW"), MALAYSIA("MY"), MALDIVES("MV"), MALI("ML"), MARTINIQUE("MQ"), MARYLAND("MD"), MASSACHUSETTS("MA"),
	MAURITANIA("MR"), MAURITIUS("MU"), MAYOTTE("YT"), MEXICO("MX"), MINNESOTA("MN"), MISSISSIPPI("MS"), MISSOURI("MO"),
	MONACO("MC"), MONTANA("MT"), MOZAMBIQUE("MZ"), MYANMAR("MM"), NAMIBIA("NA"), NAURU("NR"), NEBRASKA("NE"),
	NEPAL("NP"), NETHERLANDS("NL"), NETHERLANDS_ANTILLES("AN"), NEW_ZEALAND("NZ"), NICARAGUA("NI"), NIGERIA("NG"),
	NIUE_ISLAND("NU"), NORFOLK_ISLAND("NF"), NORTHERN_MARIANA_ISLANDS("MP"), NORTH_CAROLINA("NC"), NORTH_KOREA("KP"),
	NORWAY("NO"), OCCUPIED_PALESTINIAN_TERRITORY("PS"), OMAN("OM"), PAKISTAN("PK"), PALAU("PW"), PAPUA_NEW_GUINEA("PG"),
	PARAGUAY("PY"), PENNSYLVANIA("PA"), PERU("PE"), PHILIPPINES("PH"), PITCAIRN("PN"), POLAND("PL"), PORTUGAL("PT"),
	PUERTO_RICO("PR"), QATAR("QA"), REPUBLIC_OF_THE_MARSHALL_ISLANDS("MH"), REUNION("RE"), ROMANIA("RO"),
	RUSSIAN_FEDERATION("RU"), RWANDA("RW"), SAINT_BARTHELEMY("BL"), SAINT_MARTIN("MF"), SAMOA("WS"), SAN_MARINO("SM"),
	SAUDI_ARABIA("SA"), SENEGAL("SN"), SERBIA("RS"), SIERRA_LEONE("SL"), SINGAPORE("SG"), SINT_MAARTEN("SX"),
	SLOVAKIA("SK"), SLOVENIA("SI"), SOLOMON_ISLANDS("SB"), SOMALIA("SO"), SOUTH_AFRICA("ZA"), SOUTH_CAROLINA("SC"),
	SOUTH_DAKOTA("SD"), SOUTH_GEORGIA_AND_SOUTH_SANDWICH_ISLANDS("GS"), SOUTH_KOREA("KR"), SOUTH_SUDAN("SS"),
	SPAIN("ES"), SRI_LANKA("LK"), ST_CHRISTOPHER_AND_NEVIS("KN"), ST_LUCIA("LC"), ST_HELENA_AND_DEPENDENCIES("SH"),
	ST_PIERRE_AND_MIQUELON("PM"), ST_VINCENT("VC"), SURINAM("SR"), SVALBARD("SJ"), SWAZILAND("SZ"), SWEDEN("SE"),
	SWITZERLAND("CH"), SYRIA("SY"), SAO_TOME_AND_PRINCIPE("ST"), TAIWAN("TW"), TAJIKISTAN("TJ"), TANZANIA("TZ"),
	TENNESSEE("TN"), THAILAND("TH"), TOGO("TG"), TOKELAU("TK"), TONGA("TO"), TRINIDAD_AND_TOBAGO("TT"), TURKEY("TR"),
	TURKMENISTAN("TM"), TURKS_AND_CAICOS_ISLANDS("TC"), TUVALU("TV"), UGANDA("UG"), UKRAINE("UA"),
	UNITED_ARAB_EMIRATES("AE"), UNITED_KINGDOM("GB"), UNITED_STATES_MINOR_OUTLYING_ISLANDS("UM"),
	UNITED_STATES_OF_AMERICA("US"), UNKNOWN("XX"), UNKNOWN_1("ZZ"), URUGUAY("UY"), UZBEKISTAN("UZ"), VANUATU("VU"),
	VENEZUELA("VE"), VIETNAM("VN"), VIRGINIA("VA"), VIRGIN_ISLANDS("VI"), WALLIS_AND_FUTUNA_ISLANDS("WF"),
	WESTERN_SAHARA("EH"), YEMEN("YE"), ZAMBIA("ZM"), ZIMBABWE("ZW");

	private String code;

	private CountryCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public static CountryCode matchByCode(String code) {
		if(code==null)
			return null;
		code = code.toUpperCase();
		for (CountryCode cr : CountryCode.values())
			if (cr.code.equals(code))
				return cr;
		return null;
	}

	public static TypeAdapter<CountryCode> getAdapter() {
		return new TypeAdapter<CountryCode>() {

			@Override
			public void write(JsonWriter out, CountryCode value) throws IOException {
				out.value(value.getCode());
			}

			@Override
			public CountryCode read(JsonReader in) throws IOException {
				JsonToken token = in.peek();
				try {
					if (token.equals(JsonToken.STRING))
						return CountryCode.matchByCode(in.nextString());
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
				return null;
			}
		};
	}
}
