package ak;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.i18n.TextBundle;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<a> f511a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f512b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f513a;

        /* renamed from: b  reason: collision with root package name */
        public final String f514b;

        /* renamed from: c  reason: collision with root package name */
        public final int f515c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f516a;

        /* renamed from: b  reason: collision with root package name */
        public final int f517b;

        public b(int i11, int i12) {
            this.f516a = i11;
            this.f517b = i12;
        }
    }

    public static boolean a(String str, String str2) {
        b i11;
        int d11;
        if (str == null) {
            return false;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c11 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c11 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c11 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c11 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c11 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c11 = '\n';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (i11 = i(str2)) == null || (d11 = ei.a.d(i11.f517b)) == 0 || d11 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : k0.N0(str)) {
            String g11 = g(str2);
            if (g11 != null && p(g11)) {
                return g11;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] N0 = k0.N0(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : N0) {
            if (str2.equals(g(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    private static String e(String str) {
        int size = f511a.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = f511a.get(i11);
            if (str.startsWith(aVar.f514b)) {
                return aVar.f513a;
            }
        }
        return null;
    }

    public static int f(String str, String str2) {
        b i11;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c11 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c11 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c11 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c11 = '\b';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (i11 = i(str2)) == null) {
                    return 0;
                }
                return ei.a.d(i11.f517b);
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        b i11;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String R0 = k0.R0(str.trim());
        if (R0.startsWith("avc1") || R0.startsWith("avc3")) {
            return "video/avc";
        }
        if (R0.startsWith("hev1") || R0.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (R0.startsWith("dvav") || R0.startsWith("dva1") || R0.startsWith("dvhe") || R0.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (R0.startsWith("av01")) {
            return "video/av01";
        }
        if (R0.startsWith("vp9") || R0.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (R0.startsWith("vp8") || R0.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!R0.startsWith("mp4a")) {
            return (R0.startsWith("ac-3") || R0.startsWith("dac3")) ? "audio/ac3" : (R0.startsWith("ec-3") || R0.startsWith("dec3")) ? "audio/eac3" : R0.startsWith("ec+3") ? "audio/eac3-joc" : (R0.startsWith("ac-4") || R0.startsWith("dac4")) ? "audio/ac4" : (R0.startsWith("dtsc") || R0.startsWith("dtse")) ? "audio/vnd.dts" : (R0.startsWith("dtsh") || R0.startsWith("dtsl")) ? "audio/vnd.dts.hd" : R0.startsWith("opus") ? "audio/opus" : R0.startsWith("vorbis") ? "audio/vorbis" : R0.startsWith("flac") ? "audio/flac" : R0.startsWith("stpp") ? "application/ttml+xml" : R0.startsWith("wvtt") ? "text/vtt" : R0.contains("cea708") ? "application/cea-708" : (R0.contains("eia608") || R0.contains("cea608")) ? "application/cea-608" : e(R0);
        }
        if (R0.startsWith("mp4a.") && (i11 = i(R0)) != null) {
            str2 = h(i11.f516a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    public static String h(int i11) {
        if (i11 != 32) {
            if (i11 != 33) {
                if (i11 != 35) {
                    if (i11 != 64) {
                        if (i11 != 163) {
                            if (i11 != 177) {
                                if (i11 != 165) {
                                    if (i11 != 166) {
                                        switch (i11) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i11) {
                                                    case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                                                        return "audio/vnd.dts";
                                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                                                        return "audio/vnd.dts.hd";
                                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                                                        return "audio/opus";
                                                    case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    static b i(String str) {
        Matcher matcher = f512b.matcher(str);
        if (matcher.matches()) {
            String str2 = (String) ak.a.e(matcher.group(1));
            String group = matcher.group(2);
            try {
                return new b(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : k0.N0(str)) {
            String g11 = g(str2);
            if (g11 != null && r(g11)) {
                return g11;
            }
        }
        return null;
    }

    private static String k(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (p(str)) {
            return 1;
        }
        if (s(str)) {
            return 2;
        }
        if (r(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m(str);
    }

    private static int m(String str) {
        int size = f511a.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = f511a.get(i11);
            if (str.equals(aVar.f513a)) {
                return aVar.f515c;
            }
        }
        return -1;
    }

    public static int n(String str) {
        return l(g(str));
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : k0.N0(str)) {
            String g11 = g(str2);
            if (g11 != null && s(g11)) {
                return g11;
            }
        }
        return null;
    }

    public static boolean p(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(k(str));
    }

    public static boolean q(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean r(String str) {
        return TextBundle.TEXT_ENTRY.equals(k(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean s(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(k(str));
    }

    public static String t(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c11 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c11 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}