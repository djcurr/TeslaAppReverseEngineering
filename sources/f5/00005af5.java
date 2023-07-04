package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ui.core.elements.PhoneNumberFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import m00.c;
import n2.a;
import org.slf4j.Marker;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import s2.i0;
import s2.k0;
import s2.t;
import wz.w;

/* loaded from: classes6.dex */
public abstract class PhoneNumberFormatter {
    public static final int E164_MAX_DIGITS = 15;
    private static final List<Metadata> allMetadata;
    public static final Companion Companion = new Companion(null);
    private static final c VALID_INPUT_RANGE = new c('0', '9');

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PhoneNumberFormatter forCountry(String countryCode) {
            Object obj;
            s.g(countryCode, "countryCode");
            Iterator it2 = PhoneNumberFormatter.allMetadata.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                String upperCase = countryCode.toUpperCase(Locale.ROOT);
                s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (s.c(upperCase, ((Metadata) obj).getRegionCode())) {
                    break;
                }
            }
            Metadata metadata = (Metadata) obj;
            WithRegion withRegion = metadata != null ? new WithRegion(metadata) : null;
            return withRegion == null ? new UnknownRegion(countryCode) : withRegion;
        }

        public final c getVALID_INPUT_RANGE() {
            return PhoneNumberFormatter.VALID_INPUT_RANGE;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Metadata {
        public static final int $stable = 0;
        private final String pattern;
        private final String prefix;
        private final String regionCode;

        public Metadata(String prefix, String regionCode, String pattern) {
            s.g(prefix, "prefix");
            s.g(regionCode, "regionCode");
            s.g(pattern, "pattern");
            this.prefix = prefix;
            this.regionCode = regionCode;
            this.pattern = pattern;
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = metadata.prefix;
            }
            if ((i11 & 2) != 0) {
                str2 = metadata.regionCode;
            }
            if ((i11 & 4) != 0) {
                str3 = metadata.pattern;
            }
            return metadata.copy(str, str2, str3);
        }

        public final String component1() {
            return this.prefix;
        }

        public final String component2() {
            return this.regionCode;
        }

        public final String component3() {
            return this.pattern;
        }

        public final Metadata copy(String prefix, String regionCode, String pattern) {
            s.g(prefix, "prefix");
            s.g(regionCode, "regionCode");
            s.g(pattern, "pattern");
            return new Metadata(prefix, regionCode, pattern);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Metadata) {
                Metadata metadata = (Metadata) obj;
                return s.c(this.prefix, metadata.prefix) && s.c(this.regionCode, metadata.regionCode) && s.c(this.pattern, metadata.pattern);
            }
            return false;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public final String getPrefix() {
            return this.prefix;
        }

        public final String getRegionCode() {
            return this.regionCode;
        }

        public int hashCode() {
            return (((this.prefix.hashCode() * 31) + this.regionCode.hashCode()) * 31) + this.pattern.hashCode();
        }

        public String toString() {
            return "Metadata(prefix=" + this.prefix + ", regionCode=" + this.regionCode + ", pattern=" + this.pattern + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static final class UnknownRegion extends PhoneNumberFormatter {
        public static final int $stable = 0;
        private final String countryCode;
        private final String placeholder;
        private final String prefix;
        private final k0 visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownRegion(String countryCode) {
            super(null);
            s.g(countryCode, "countryCode");
            this.countryCode = countryCode;
            this.prefix = "";
            this.placeholder = "+############";
            this.visualTransformation = new k0() { // from class: com.stripe.android.ui.core.elements.PhoneNumberFormatter$UnknownRegion$visualTransformation$1
                @Override // s2.k0
                public final i0 filter(a text) {
                    s.g(text, "text");
                    return new i0(new a(s.p(Marker.ANY_NON_NULL_MARKER, text.g()), null, null, 6, null), new t() { // from class: com.stripe.android.ui.core.elements.PhoneNumberFormatter$UnknownRegion$visualTransformation$1$filter$1
                        @Override // s2.t
                        public int originalToTransformed(int i11) {
                            return i11 + 1;
                        }

                        @Override // s2.t
                        public int transformedToOriginal(int i11) {
                            return Math.max(i11 - 1, 0);
                        }
                    });
                }
            };
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public String getPrefix() {
            return this.prefix;
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public k0 getVisualTransformation() {
            return this.visualTransformation;
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public String toE164Format(String input) {
            s.g(input, "input");
            return s.p(Marker.ANY_NON_NULL_MARKER, userInputFilter(input));
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public String userInputFilter(String input) {
            s.g(input, "input");
            StringBuilder sb2 = new StringBuilder();
            int length = input.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = input.charAt(i11);
                if (PhoneNumberFormatter.Companion.getVALID_INPUT_RANGE().h(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
            String substring = sb3.substring(0, Math.min(sb3.length(), 15));
            s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    /* loaded from: classes6.dex */
    public static final class WithRegion extends PhoneNumberFormatter {
        public static final int $stable = 0;
        private final String countryCode;
        private final int maxSubscriberDigits;
        private final Metadata metadata;
        private final String placeholder;
        private final String prefix;
        private final k0 visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithRegion(Metadata metadata) {
            super(null);
            String C;
            s.g(metadata, "metadata");
            this.metadata = metadata;
            this.prefix = metadata.getPrefix();
            C = v.C(metadata.getPattern(), '#', '5', false, 4, null);
            this.placeholder = C;
            this.countryCode = metadata.getRegionCode();
            this.maxSubscriberDigits = 15 - (getPrefix().length() - 1);
            this.visualTransformation = new k0() { // from class: com.stripe.android.ui.core.elements.PhoneNumberFormatter$WithRegion$visualTransformation$1
                @Override // s2.k0
                public i0 filter(a text) {
                    s.g(text, "text");
                    a aVar = new a(PhoneNumberFormatter.WithRegion.this.formatNumberNational(text.g()), null, null, 6, null);
                    final PhoneNumberFormatter.WithRegion withRegion = PhoneNumberFormatter.WithRegion.this;
                    return new i0(aVar, new t() { // from class: com.stripe.android.ui.core.elements.PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1
                        @Override // s2.t
                        public int originalToTransformed(int i11) {
                            PhoneNumberFormatter.Metadata metadata2;
                            metadata2 = PhoneNumberFormatter.WithRegion.this.metadata;
                            String pattern = metadata2.getPattern();
                            if (i11 == 0) {
                                return 0;
                            }
                            int i12 = 0;
                            int i13 = 0;
                            int i14 = -1;
                            for (int i15 = 0; i15 < pattern.length(); i15++) {
                                i12++;
                                if (pattern.charAt(i15) == '#' && (i13 = i13 + 1) == i11) {
                                    i14 = i12;
                                }
                            }
                            return i14 == -1 ? pattern.length() + 1 + (i11 - i13) : i14;
                        }

                        @Override // s2.t
                        public int transformedToOriginal(int i11) {
                            PhoneNumberFormatter.Metadata metadata2;
                            if (i11 == 0) {
                                return 0;
                            }
                            metadata2 = PhoneNumberFormatter.WithRegion.this.metadata;
                            String pattern = metadata2.getPattern();
                            String substring = pattern.substring(0, Math.min(i11, pattern.length()));
                            s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            StringBuilder sb2 = new StringBuilder();
                            int length = substring.length();
                            for (int i12 = 0; i12 < length; i12++) {
                                char charAt = substring.charAt(i12);
                                if (charAt != '#') {
                                    sb2.append(charAt);
                                }
                            }
                            String sb3 = sb2.toString();
                            s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
                            int length2 = sb3.length();
                            if (i11 > pattern.length()) {
                                length2++;
                            }
                            return i11 - length2;
                        }
                    });
                }
            };
        }

        public final String formatNumberNational(String filteredInput) {
            s.g(filteredInput, "filteredInput");
            StringBuilder sb2 = new StringBuilder();
            String pattern = this.metadata.getPattern();
            int i11 = 0;
            for (int i12 = 0; i12 < pattern.length(); i12++) {
                char charAt = pattern.charAt(i12);
                if (i11 < filteredInput.length()) {
                    if (charAt == '#') {
                        charAt = filteredInput.charAt(i11);
                        i11++;
                    }
                    sb2.append(charAt);
                }
            }
            if (i11 < filteredInput.length()) {
                sb2.append(' ');
                String substring = filteredInput.substring(i11);
                s.f(substring, "this as java.lang.String).substring(startIndex)");
                char[] charArray = substring.toCharArray();
                s.f(charArray, "this as java.lang.String).toCharArray()");
                sb2.append(charArray);
            }
            String sb3 = sb2.toString();
            s.f(sb3, "formatted.toString()");
            return sb3;
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public String getPrefix() {
            return this.prefix;
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public k0 getVisualTransformation() {
            return this.visualTransformation;
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public String toE164Format(String input) {
            s.g(input, "input");
            return s.p(getPrefix(), userInputFilter(input));
        }

        @Override // com.stripe.android.ui.core.elements.PhoneNumberFormatter
        public String userInputFilter(String input) {
            s.g(input, "input");
            StringBuilder sb2 = new StringBuilder();
            int length = input.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = input.charAt(i11);
                if (PhoneNumberFormatter.Companion.getVALID_INPUT_RANGE().h(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
            String substring = sb3.substring(0, Math.min(sb3.length(), this.maxSubscriberDigits));
            s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    static {
        List<Metadata> l11;
        l11 = w.l(new Metadata("+1", "US", "(###) ###-####"), new Metadata("+1", "CA", "(###) ###-####"), new Metadata("+1", "AG", "(###) ###-####"), new Metadata("+1", "AS", "(###) ###-####"), new Metadata("+1", "AI", "(###) ###-####"), new Metadata("+1", "BB", "(###) ###-####"), new Metadata("+1", "BM", "(###) ###-####"), new Metadata("+1", "BS", "(###) ###-####"), new Metadata("+1", "DM", "(###) ###-####"), new Metadata("+1", "DO", "(###) ###-####"), new Metadata("+1", "GD", "(###) ###-####"), new Metadata("+1", "GU", "(###) ###-####"), new Metadata("+1", "JM", "(###) ###-####"), new Metadata("+1", "KN", "(###) ###-####"), new Metadata("+1", "KY", "(###) ###-####"), new Metadata("+1", "LC", "(###) ###-####"), new Metadata("+1", "MP", "(###) ###-####"), new Metadata("+1", "MS", "(###) ###-####"), new Metadata("+1", "PR", "(###) ###-####"), new Metadata("+1", "SX", "(###) ###-####"), new Metadata("+1", "TC", "(###) ###-####"), new Metadata("+1", "TT", "(###) ###-####"), new Metadata("+1", "VC", "(###) ###-####"), new Metadata("+1", "VG", "(###) ###-####"), new Metadata("+1", "VI", "(###) ###-####"), new Metadata("+20", "EG", "### ### ####"), new Metadata("+211", "SS", "### ### ###"), new Metadata("+212", "MA", "###-######"), new Metadata("+212", "EH", "###-######"), new Metadata("+213", "DZ", "### ## ## ##"), new Metadata("+216", "TN", "## ### ###"), new Metadata("+218", "LY", "##-#######"), new Metadata("+220", "GM", "### ####"), new Metadata("+221", "SN", "## ### ## ##"), new Metadata("+222", "MR", "## ## ## ##"), new Metadata("+223", "ML", "## ## ## ##"), new Metadata("+224", "GN", "### ## ## ##"), new Metadata("+225", "CI", "## ## ## ##"), new Metadata("+226", "BF", "## ## ## ##"), new Metadata("+227", "NE", "## ## ## ##"), new Metadata("+228", "TG", "## ## ## ##"), new Metadata("+229", "BJ", "## ## ## ##"), new Metadata("+230", "MU", "#### ####"), new Metadata("+231", "LR", "### ### ###"), new Metadata("+232", "SL", "## ######"), new Metadata("+233", "GH", "## ### ####"), new Metadata("+234", "NG", "### ### ####"), new Metadata("+235", "TD", "## ## ## ##"), new Metadata("+236", "CF", "## ## ## ##"), new Metadata("+237", "CM", "## ## ## ##"), new Metadata("+238", "CV", "### ## ##"), new Metadata("+239", "ST", "### ####"), new Metadata("+240", "GQ", "### ### ###"), new Metadata("+241", "GA", "## ## ## ##"), new Metadata("+242", "CG", "## ### ####"), new Metadata("+243", "CD", "### ### ###"), new Metadata("+244", "AO", "### ### ###"), new Metadata("+245", "GW", "### ####"), new Metadata("+246", "IO", "### ####"), new Metadata("+247", "AC", ""), new Metadata("+248", BouncyCastleProvider.PROVIDER_NAME, "# ### ###"), new Metadata("+250", "RW", "### ### ###"), new Metadata("+251", "ET", "## ### ####"), new Metadata("+252", "SO", "## #######"), new Metadata("+253", "DJ", "## ## ## ##"), new Metadata("+254", "KE", "## #######"), new Metadata("+255", "TZ", "### ### ###"), new Metadata("+256", "UG", "### ######"), new Metadata("+257", "BI", "## ## ## ##"), new Metadata("+258", "MZ", "## ### ####"), new Metadata("+260", "ZM", "## #######"), new Metadata("+261", "MG", "## ## ### ##"), new Metadata("+262", "RE", ""), new Metadata("+262", "TF", ""), new Metadata("+262", "YT", "### ## ## ##"), new Metadata("+263", "ZW", "## ### ####"), new Metadata("+264", "NA", "## ### ####"), new Metadata("+265", "MW", "### ## ## ##"), new Metadata("+266", "LS", "#### ####"), new Metadata("+267", "BW", "## ### ###"), new Metadata("+268", "SZ", "#### ####"), new Metadata("+269", "KM", "### ## ##"), new Metadata("+27", "ZA", "## ### ####"), new Metadata("+290", "SH", ""), new Metadata("+290", "TA", ""), new Metadata("+291", "ER", "# ### ###"), new Metadata("+297", "AW", "### ####"), new Metadata("+298", "FO", "######"), new Metadata("+299", "GL", "## ## ##"), new Metadata("+30", "GR", "### ### ####"), new Metadata("+31", "NL", "# ########"), new Metadata("+32", "BE", "### ## ## ##"), new Metadata("+33", "FR", "# ## ## ## ##"), new Metadata("+34", "ES", "### ## ## ##"), new Metadata("+350", "GI", "### #####"), new Metadata("+351", "PT", "### ### ###"), new Metadata("+352", "LU", "## ## ## ###"), new Metadata("+353", "IE", "## ### ####"), new Metadata("+354", "IS", "### ####"), new Metadata("+355", "AL", "## ### ####"), new Metadata("+356", "MT", "#### ####"), new Metadata("+357", "CY", "## ######"), new Metadata("+358", "FI", "## ### ## ##"), new Metadata("+358", "AX", ""), new Metadata("+359", "BG", "### ### ##"), new Metadata("+36", "HU", "## ### ####"), new Metadata("+370", "LT", "### #####"), new Metadata("+371", "LV", "## ### ###"), new Metadata("+372", "EE", "#### ####"), new Metadata("+373", "MD", "### ## ###"), new Metadata("+374", "AM", "## ######"), new Metadata("+375", "BY", "## ###-##-##"), new Metadata("+376", "AD", "### ###"), new Metadata("+377", "MC", "# ## ## ## ##"), new Metadata("+378", "SM", "## ## ## ##"), new Metadata("+379", "VA", ""), new Metadata("+380", "UA", "## ### ####"), new Metadata("+381", "RS", "## #######"), new Metadata("+382", "ME", "## ### ###"), new Metadata("+383", "XK", "## ### ###"), new Metadata("+385", "HR", "## ### ####"), new Metadata("+386", "SI", "## ### ###"), new Metadata("+387", "BA", "## ###-###"), new Metadata("+389", "MK", "## ### ###"), new Metadata("+39", "IT", "## #### ####"), new Metadata("+40", "RO", "## ### ####"), new Metadata("+41", "CH", "## ### ## ##"), new Metadata("+420", "CZ", "### ### ###"), new Metadata("+421", "SK", "### ### ###"), new Metadata("+423", "LI", "### ### ###"), new Metadata("+43", "AT", "### ######"), new Metadata("+44", "GB", "#### ######"), new Metadata("+44", "GG", "#### ######"), new Metadata("+44", "JE", "#### ######"), new Metadata("+44", "IM", "#### ######"), new Metadata("+45", "DK", "## ## ## ##"), new Metadata("+46", "SE", "##-### ## ##"), new Metadata("+47", "NO", "### ## ###"), new Metadata("+47", "BV", ""), new Metadata("+47", "SJ", "## ## ## ##"), new Metadata("+48", "PL", "## ### ## ##"), new Metadata("+49", "DE", "### #######"), new Metadata("+500", "FK", ""), new Metadata("+500", "GS", ""), new Metadata("+501", "BZ", "###-####"), new Metadata("+502", "GT", "#### ####"), new Metadata("+503", "SV", "#### ####"), new Metadata("+504", "HN", "####-####"), new Metadata("+505", "NI", "#### ####"), new Metadata("+506", "CR", "#### ####"), new Metadata("+507", "PA", "####-####"), new Metadata("+508", "PM", "## ## ##"), new Metadata("+509", "HT", "## ## ####"), new Metadata("+51", "PE", "### ### ###"), new Metadata("+52", "MX", "### ### ### ####"), new Metadata("+537", "CY", ""), new Metadata("+54", "AR", "## ##-####-####"), new Metadata("+55", "BR", "## #####-####"), new Metadata("+56", "CL", "# #### ####"), new Metadata("+57", "CO", "### #######"), new Metadata("+58", "VE", "###-#######"), new Metadata("+590", "BL", "### ## ## ##"), new Metadata("+590", "MF", ""), new Metadata("+590", "GP", "### ## ## ##"), new Metadata("+591", "BO", "########"), new Metadata("+592", "GY", "### ####"), new Metadata("+593", "EC", "## ### ####"), new Metadata("+594", "GF", "### ## ## ##"), new Metadata("+595", "PY", "## #######"), new Metadata("+596", "MQ", "### ## ## ##"), new Metadata("+597", "SR", "###-####"), new Metadata("+598", "UY", "#### ####"), new Metadata("+599", "CW", "# ### ####"), new Metadata("+599", "BQ", "### ####"), new Metadata("+60", "MY", "##-### ####"), new Metadata("+61", "AU", "### ### ###"), new Metadata("+62", "ID", "###-###-###"), new Metadata("+63", "PH", "#### ######"), new Metadata("+64", "NZ", "## ### ####"), new Metadata("+65", "SG", "#### ####"), new Metadata("+66", "TH", "## ### ####"), new Metadata("+670", "TL", "#### ####"), new Metadata("+672", "AQ", "## ####"), new Metadata("+673", "BN", "### ####"), new Metadata("+674", "NR", "### ####"), new Metadata("+675", "PG", "### ####"), new Metadata("+676", "TO", "### ####"), new Metadata("+677", "SB", "### ####"), new Metadata("+678", "VU", "### ####"), new Metadata("+679", "FJ", "### ####"), new Metadata("+681", "WF", "## ## ##"), new Metadata("+682", "CK", "## ###"), new Metadata("+683", "NU", ""), new Metadata("+685", "WS", ""), new Metadata("+686", "KI", ""), new Metadata("+687", "NC", "########"), new Metadata("+688", "TV", ""), new Metadata("+689", "PF", "## ## ##"), new Metadata("+690", "TK", ""), new Metadata("+7", "RU", "### ###-##-##"), new Metadata("+7", "KZ", ""), new Metadata("+81", "JP", "##-####-####"), new Metadata("+82", "KR", "##-####-####"), new Metadata("+84", "VN", "## ### ## ##"), new Metadata("+852", "HK", "#### ####"), new Metadata("+853", "MO", "#### ####"), new Metadata("+855", "KH", "## ### ###"), new Metadata("+856", "LA", "## ## ### ###"), new Metadata("+86", "CN", "### #### ####"), new Metadata("+872", "PN", ""), new Metadata("+880", "BD", "####-######"), new Metadata("+886", "TW", "### ### ###"), new Metadata("+90", "TR", "### ### ####"), new Metadata("+91", "IN", "## ## ######"), new Metadata("+92", "PK", "### #######"), new Metadata("+93", "AF", "## ### ####"), new Metadata("+94", "LK", "## # ######"), new Metadata("+95", "MM", "# ### ####"), new Metadata("+960", "MV", "###-####"), new Metadata("+961", "LB", "## ### ###"), new Metadata("+962", "JO", "# #### ####"), new Metadata("+964", "IQ", "### ### ####"), new Metadata("+965", "KW", "### #####"), new Metadata("+966", "SA", "## ### ####"), new Metadata("+967", "YE", "### ### ###"), new Metadata("+968", "OM", "#### ####"), new Metadata("+970", "PS", "### ### ###"), new Metadata("+971", "AE", "## ### ####"), new Metadata("+972", "IL", "##-###-####"), new Metadata("+973", "BH", "#### ####"), new Metadata("+974", "QA", "#### ####"), new Metadata("+975", "BT", "## ## ## ##"), new Metadata("+976", "MN", "#### ####"), new Metadata("+977", "NP", "###-#######"), new Metadata("+992", "TJ", "### ## ####"), new Metadata("+993", "TM", "## ##-##-##"), new Metadata("+994", "AZ", "## ### ## ##"), new Metadata("+995", "GE", "### ## ## ##"), new Metadata("+996", "KG", "### ### ###"), new Metadata("+998", "UZ", "## ### ## ##"));
        allMetadata = l11;
    }

    private PhoneNumberFormatter() {
    }

    public /* synthetic */ PhoneNumberFormatter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getCountryCode();

    public abstract String getPlaceholder();

    public abstract String getPrefix();

    public abstract k0 getVisualTransformation();

    public abstract String toE164Format(String str);

    public abstract String userInputFilter(String str);
}