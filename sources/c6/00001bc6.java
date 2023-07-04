package com.google.android.exoplayer2.mediacodec;

import ak.k0;
import ak.r;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class MediaCodecUtil {

    /* renamed from: a */
    private static final Pattern f13642a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<b, List<i>> f13643b = new HashMap<>();

    /* renamed from: c */
    private static int f13644c = -1;

    /* loaded from: classes3.dex */
    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public final String f13645a;

        /* renamed from: b */
        public final boolean f13646b;

        /* renamed from: c */
        public final boolean f13647c;

        public b(String str, boolean z11, boolean z12) {
            this.f13645a = str;
            this.f13646b = z11;
            this.f13647c = z12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f13645a, bVar.f13645a) && this.f13646b == bVar.f13646b && this.f13647c == bVar.f13647c;
        }

        public int hashCode() {
            return ((((this.f13645a.hashCode() + 31) * 31) + (this.f13646b ? 1231 : 1237)) * 31) + (this.f13647c ? 1231 : 1237);
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        MediaCodecInfo a(int i11);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* loaded from: classes3.dex */
    public static final class d implements c {
        private d() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i11) {
            return MediaCodecList.getCodecInfoAt(i11);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements c {

        /* renamed from: a */
        private final int f13648a;

        /* renamed from: b */
        private MediaCodecInfo[] f13649b;

        public e(boolean z11, boolean z12) {
            this.f13648a = (z11 || z12) ? 1 : 0;
        }

        private void f() {
            if (this.f13649b == null) {
                this.f13649b = new MediaCodecList(this.f13648a).getCodecInfos();
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i11) {
            f();
            return this.f13649b[i11];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            f();
            return this.f13649b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface f<T> {
        int a(T t11);
    }

    private static boolean A(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean B(MediaCodecInfo mediaCodecInfo, String str, boolean z11, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z11 && str.endsWith(".secure"))) {
            return false;
        }
        int i11 = k0.f477a;
        if (i11 >= 21 || !("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            if (i11 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                String str3 = k0.f478b;
                if ("a70".equals(str3) || ("Xiaomi".equals(k0.f479c) && str3.startsWith("HM"))) {
                    return false;
                }
            }
            if (i11 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                String str4 = k0.f478b;
                if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                    return false;
                }
            }
            if (i11 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                String str5 = k0.f478b;
                if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                    return false;
                }
            }
            if (i11 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(k0.f479c))) {
                String str6 = k0.f478b;
                if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                    return false;
                }
            }
            if (i11 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(k0.f479c)) {
                String str7 = k0.f478b;
                if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                    return false;
                }
            }
            if (i11 <= 19 && k0.f478b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
                return false;
            }
            return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
        }
        return false;
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo) {
        if (k0.f477a >= 29) {
            return D(mediaCodecInfo);
        }
        return !E(mediaCodecInfo);
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean E(MediaCodecInfo mediaCodecInfo) {
        if (k0.f477a >= 29) {
            return F(mediaCodecInfo);
        }
        String R0 = k0.R0(mediaCodecInfo.getName());
        if (R0.startsWith("arc.")) {
            return false;
        }
        return R0.startsWith("omx.google.") || R0.startsWith("omx.ffmpeg.") || (R0.startsWith("omx.sec.") && R0.contains(".sw.")) || R0.equals("omx.qcom.video.decoder.hevcswvdec") || R0.startsWith("c2.android.") || R0.startsWith("c2.google.") || !(R0.startsWith("omx.") || R0.startsWith("c2."));
    }

    private static boolean F(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean G(MediaCodecInfo mediaCodecInfo) {
        if (k0.f477a >= 29) {
            return H(mediaCodecInfo);
        }
        String R0 = k0.R0(mediaCodecInfo.getName());
        return (R0.startsWith("omx.google.") || R0.startsWith("c2.android.") || R0.startsWith("c2.google.")) ? false : true;
    }

    private static boolean H(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* synthetic */ int I(i iVar) {
        String str = iVar.f13700a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (k0.f477a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int J(i iVar) {
        return iVar.f13700a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int K(ci.i iVar, i iVar2) {
        try {
            return iVar2.m(iVar) ? 1 : 0;
        } catch (DecoderQueryException unused) {
            return -1;
        }
    }

    public static /* synthetic */ int L(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static int M() {
        if (f13644c == -1) {
            int i11 = 0;
            i q11 = q("video/avc", false, false);
            if (q11 != null) {
                MediaCodecInfo.CodecProfileLevel[] g11 = q11.g();
                int length = g11.length;
                int i12 = 0;
                while (i11 < length) {
                    i12 = Math.max(h(g11[i11].level), i12);
                    i11++;
                }
                i11 = Math.max(i12, k0.f477a >= 21 ? 345600 : 172800);
            }
            f13644c = i11;
        }
        return f13644c;
    }

    private static int N(int i11) {
        int i12 = 17;
        if (i11 != 17) {
            i12 = 20;
            if (i11 != 20) {
                i12 = 23;
                if (i11 != 23) {
                    i12 = 29;
                    if (i11 != 29) {
                        i12 = 39;
                        if (i11 != 39) {
                            i12 = 42;
                            if (i11 != 42) {
                                switch (i11) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i12;
    }

    private static <T> void O(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.d(fVar, obj, obj2);
            }
        });
    }

    private static int P(int i11) {
        if (i11 != 10) {
            if (i11 != 11) {
                if (i11 != 20) {
                    if (i11 != 21) {
                        if (i11 != 30) {
                            if (i11 != 31) {
                                if (i11 != 40) {
                                    if (i11 != 41) {
                                        if (i11 != 50) {
                                            if (i11 != 51) {
                                                switch (i11) {
                                                    case 60:
                                                        return 2048;
                                                    case 61:
                                                        return 4096;
                                                    case 62:
                                                        return PKIFailureInfo.certRevoked;
                                                    default:
                                                        return -1;
                                                }
                                            }
                                            return 512;
                                        }
                                        return 256;
                                    }
                                    return 128;
                                }
                                return 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int Q(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return i11 != 3 ? -1 : 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ int d(f fVar, Object obj, Object obj2) {
        return L(fVar, obj, obj2);
    }

    private static void e(String str, List<i> list) {
        if ("audio/raw".equals(str)) {
            if (k0.f477a < 26 && k0.f478b.equals("R9") && list.size() == 1 && list.get(0).f13700a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(i.A("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            O(list, new f() { // from class: com.google.android.exoplayer2.mediacodec.l
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    int I;
                    I = MediaCodecUtil.I((i) obj);
                    return I;
                }
            });
        }
        int i11 = k0.f477a;
        if (i11 < 21 && list.size() > 1) {
            String str2 = list.get(0).f13700a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                O(list, new f() { // from class: com.google.android.exoplayer2.mediacodec.m
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                    public final int a(Object obj) {
                        int J;
                        J = MediaCodecUtil.J((i) obj);
                        return J;
                    }
                });
            }
        }
        if (i11 >= 30 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f13700a)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int f(int i11) {
        switch (i11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return PKIFailureInfo.certRevoked;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return PKIFailureInfo.signerNotTrusted;
            case 20:
                return PKIFailureInfo.badCertTemplate;
            case 21:
                return PKIFailureInfo.badSenderNonce;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i11) {
        switch (i11) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i11) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i11) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i11) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return PKIFailureInfo.certRevoked;
                                    default:
                                        switch (i11) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int h(int i11) {
        if (i11 == 1 || i11 == 2) {
            return 25344;
        }
        switch (i11) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return PKIFailureInfo.badSenderNonce;
            case PKIFailureInfo.certRevoked /* 8192 */:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    private static int i(int i11) {
        if (i11 != 66) {
            if (i11 != 77) {
                if (i11 != 88) {
                    if (i11 != 100) {
                        if (i11 != 110) {
                            if (i11 != 122) {
                                return i11 != 244 ? -1 : 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c11 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c11 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c11 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c11 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c11 = '\f';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            case '\n':
                return 1024;
            case 11:
                return 2048;
            case '\f':
                return 4096;
            default:
                return null;
        }
    }

    private static Integer k(String str) {
        if (str == null) {
            return null;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c11 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c11 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c11 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c11 = '\t';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> l(String str, String[] strArr) {
        int N;
        if (strArr.length != 3) {
            String valueOf = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(r.h(Integer.parseInt(strArr[1], 16))) && (N = N(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(N), 0);
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    private static Pair<Integer, Integer> m(String str, String[] strArr, bk.b bVar) {
        int i11;
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i12 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AV1 profile: ");
                sb2.append(parseInt);
                ak.o.h("MediaCodecUtil", sb2.toString());
                return null;
            } else if (parseInt3 != 8 && parseInt3 != 10) {
                StringBuilder sb3 = new StringBuilder(34);
                sb3.append("Unknown AV1 bit depth: ");
                sb3.append(parseInt3);
                ak.o.h("MediaCodecUtil", sb3.toString());
                return null;
            } else {
                if (parseInt3 != 8) {
                    i12 = (bVar == null || !(bVar.f7721d != null || (i11 = bVar.f7720c) == 7 || i11 == 6)) ? 2 : 4096;
                }
                int f11 = f(parseInt2);
                if (f11 == -1) {
                    StringBuilder sb4 = new StringBuilder(30);
                    sb4.append("Unknown AV1 level: ");
                    sb4.append(parseInt2);
                    ak.o.h("MediaCodecUtil", sb4.toString());
                    return null;
                }
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(f11));
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    private static Pair<Integer, Integer> n(String str, String[] strArr) {
        int parseInt;
        int i11;
        if (strArr.length < 2) {
            String valueOf = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i11 = parseInt2;
            } else {
                String valueOf2 = String.valueOf(str);
                ak.o.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            int i12 = i(i11);
            if (i12 == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AVC profile: ");
                sb2.append(i11);
                ak.o.h("MediaCodecUtil", sb2.toString());
                return null;
            }
            int g11 = g(parseInt);
            if (g11 == -1) {
                StringBuilder sb3 = new StringBuilder(30);
                sb3.append("Unknown AVC level: ");
                sb3.append(parseInt);
                ak.o.h("MediaCodecUtil", sb3.toString());
                return null;
            }
            return new Pair<>(Integer.valueOf(i12), Integer.valueOf(g11));
        } catch (NumberFormatException unused) {
            String valueOf3 = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    private static String o(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0075, code lost:
        if (r3.equals("av01") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> p(ci.i r6) {
        /*
            java.lang.String r0 = r6.f9202i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f9205l
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.f9202i
            android.util.Pair r6 = v(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r2 = r4
            goto L78
        L2d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L2b
        L36:
            r2 = 6
            goto L78
        L38:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto L2b
        L41:
            r2 = 5
            goto L78
        L43:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            goto L2b
        L4c:
            r2 = 4
            goto L78
        L4e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L57
            goto L2b
        L57:
            r2 = 3
            goto L78
        L59:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L2b
        L62:
            r2 = 2
            goto L78
        L64:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6d
            goto L2b
        L6d:
            r2 = 1
            goto L78
        L6f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r2) {
                case 0: goto L98;
                case 1: goto L91;
                case 2: goto L91;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r1
        L7c:
            java.lang.String r6 = r6.f9202i
            android.util.Pair r6 = x(r6, r0)
            return r6
        L83:
            java.lang.String r6 = r6.f9202i
            android.util.Pair r6 = l(r6, r0)
            return r6
        L8a:
            java.lang.String r6 = r6.f9202i
            android.util.Pair r6 = w(r6, r0)
            return r6
        L91:
            java.lang.String r6 = r6.f9202i
            android.util.Pair r6 = n(r6, r0)
            return r6
        L98:
            java.lang.String r1 = r6.f9202i
            bk.b r6 = r6.B
            android.util.Pair r6 = m(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.p(ci.i):android.util.Pair");
    }

    public static i q(String str, boolean z11, boolean z12) {
        List<i> r11 = r(str, z11, z12);
        if (r11.isEmpty()) {
            return null;
        }
        return r11.get(0);
    }

    public static synchronized List<i> r(String str, boolean z11, boolean z12) {
        c dVar;
        synchronized (MediaCodecUtil.class) {
            b bVar = new b(str, z11, z12);
            HashMap<b, List<i>> hashMap = f13643b;
            List<i> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i11 = k0.f477a;
            if (i11 >= 21) {
                dVar = new e(z11, z12);
            } else {
                dVar = new d();
            }
            ArrayList<i> s11 = s(bVar, dVar);
            if (z11 && s11.isEmpty() && 21 <= i11 && i11 <= 23) {
                s11 = s(bVar, new d());
                if (!s11.isEmpty()) {
                    String str2 = s11.get(0).f13700a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    ak.o.h("MediaCodecUtil", sb2.toString());
                }
            }
            e(str, s11);
            List<i> unmodifiableList = Collections.unmodifiableList(s11);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    private static ArrayList<i> s(b bVar, c cVar) {
        String o11;
        String str;
        String str2;
        int i11;
        boolean z11;
        int i12;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean b11;
        boolean c11;
        boolean z12;
        try {
            ArrayList<i> arrayList = new ArrayList<>();
            String str3 = bVar.f13645a;
            int d11 = cVar.d();
            boolean e11 = cVar.e();
            int i13 = 0;
            while (i13 < d11) {
                MediaCodecInfo a11 = cVar.a(i13);
                if (!z(a11)) {
                    String name = a11.getName();
                    if (B(a11, name, e11, str3) && (o11 = o(a11, name, str3)) != null) {
                        try {
                            capabilitiesForType = a11.getCapabilitiesForType(o11);
                            b11 = cVar.b("tunneled-playback", o11, capabilitiesForType);
                            c11 = cVar.c("tunneled-playback", o11, capabilitiesForType);
                            z12 = bVar.f13647c;
                        } catch (Exception e12) {
                            e = e12;
                            str = o11;
                            str2 = name;
                            i11 = i13;
                            z11 = e11;
                            i12 = d11;
                        }
                        if ((z12 || !c11) && (!z12 || b11)) {
                            boolean b12 = cVar.b("secure-playback", o11, capabilitiesForType);
                            boolean c12 = cVar.c("secure-playback", o11, capabilitiesForType);
                            boolean z13 = bVar.f13646b;
                            if ((z13 || !c12) && (!z13 || b12)) {
                                boolean C = C(a11);
                                boolean E = E(a11);
                                boolean G = G(a11);
                                if (!(e11 && bVar.f13646b == b12) && (e11 || bVar.f13646b)) {
                                    str = o11;
                                    str2 = name;
                                    i11 = i13;
                                    z11 = e11;
                                    i12 = d11;
                                    if (!z11 && b12) {
                                        arrayList.add(i.A(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, C, E, G, false, true));
                                        return arrayList;
                                    }
                                    i13 = i11 + 1;
                                    d11 = i12;
                                    e11 = z11;
                                } else {
                                    str = o11;
                                    str2 = name;
                                    i11 = i13;
                                    z11 = e11;
                                    i12 = d11;
                                    try {
                                        arrayList.add(i.A(name, str3, o11, capabilitiesForType, C, E, G, false, false));
                                    } catch (Exception e13) {
                                        e = e13;
                                        if (k0.f477a <= 23 && !arrayList.isEmpty()) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 46);
                                            sb2.append("Skipping codec ");
                                            sb2.append(str2);
                                            sb2.append(" (failed to query capabilities)");
                                            ak.o.c("MediaCodecUtil", sb2.toString());
                                            i13 = i11 + 1;
                                            d11 = i12;
                                            e11 = z11;
                                        } else {
                                            String str4 = str2;
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 25 + str.length());
                                            sb3.append("Failed to query codec ");
                                            sb3.append(str4);
                                            sb3.append(" (");
                                            sb3.append(str);
                                            sb3.append(")");
                                            ak.o.c("MediaCodecUtil", sb3.toString());
                                            throw e;
                                        }
                                    }
                                    i13 = i11 + 1;
                                    d11 = i12;
                                    e11 = z11;
                                }
                            }
                        }
                    }
                }
                i11 = i13;
                z11 = e11;
                i12 = d11;
                i13 = i11 + 1;
                d11 = i12;
                e11 = z11;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new DecoderQueryException(e14);
        }
    }

    public static List<i> t(List<i> list, final ci.i iVar) {
        ArrayList arrayList = new ArrayList(list);
        O(arrayList, new f() { // from class: com.google.android.exoplayer2.mediacodec.k
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                int K;
                K = MediaCodecUtil.K(ci.i.this, (i) obj);
                return K;
            }
        });
        return arrayList;
    }

    public static i u() {
        return q("audio/raw", false, false);
    }

    private static Pair<Integer, Integer> v(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = f13642a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String group = matcher.group(1);
        Integer k11 = k(group);
        if (k11 == null) {
            String valueOf3 = String.valueOf(group);
            ak.o.h("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(valueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str2 = strArr[2];
        Integer j11 = j(str2);
        if (j11 == null) {
            String valueOf4 = String.valueOf(str2);
            ak.o.h("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(valueOf4) : new String("Unknown Dolby Vision level string: "));
            return null;
        }
        return new Pair<>(k11, j11);
    }

    private static Pair<Integer, Integer> w(String str, String[] strArr) {
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i11 = 1;
        Matcher matcher = f13642a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!"2".equals(group)) {
                String valueOf3 = String.valueOf(group);
                ak.o.h("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(valueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            i11 = 2;
        }
        String str2 = strArr[3];
        Integer y11 = y(str2);
        if (y11 == null) {
            String valueOf4 = String.valueOf(str2);
            ak.o.h("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(valueOf4) : new String("Unknown HEVC level string: "));
            return null;
        }
        return new Pair<>(Integer.valueOf(i11), y11);
    }

    private static Pair<Integer, Integer> x(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int Q = Q(parseInt);
            if (Q == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown VP9 profile: ");
                sb2.append(parseInt);
                ak.o.h("MediaCodecUtil", sb2.toString());
                return null;
            }
            int P = P(parseInt2);
            if (P == -1) {
                StringBuilder sb3 = new StringBuilder(30);
                sb3.append("Unknown VP9 level: ");
                sb3.append(parseInt2);
                ak.o.h("MediaCodecUtil", sb3.toString());
                return null;
            }
            return new Pair<>(Integer.valueOf(Q), Integer.valueOf(P));
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            ak.o.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    private static Integer y(String str) {
        if (str == null) {
            return null;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c11 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c11 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c11 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c11 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c11 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c11 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c11 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c11 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c11 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c11 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c11 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c11 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c11 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c11 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c11 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c11 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c11 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c11 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c11 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c11 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c11 = 25;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return 256;
            case '\n':
                return 2048;
            case 11:
                return Integer.valueOf((int) PKIFailureInfo.certRevoked);
            case '\f':
                return 32768;
            case '\r':
                return 131072;
            case 14:
                return Integer.valueOf((int) PKIFailureInfo.signerNotTrusted);
            case 15:
                return Integer.valueOf((int) PKIFailureInfo.badSenderNonce);
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return Integer.valueOf((int) PKIFailureInfo.badCertTemplate);
            case 24:
                return 4194304;
            case 25:
                return Integer.valueOf((int) Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            default:
                return null;
        }
    }

    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        return k0.f477a >= 29 && A(mediaCodecInfo);
    }
}