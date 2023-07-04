package com.google.android.exoplayer2.mediacodec;

import ak.k0;
import ak.r;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f13700a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13701b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13702c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f13703d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13704e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13705f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f13706g;

    i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f13700a = (String) ak.a.e(str);
        this.f13701b = str2;
        this.f13702c = str3;
        this.f13703d = codecCapabilities;
        this.f13704e = z14;
        this.f13705f = z16;
        this.f13706g = r.s(str2);
    }

    public static i A(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return new i(str, str2, str3, codecCapabilities, z11, z12, z13, (z14 || codecCapabilities == null || !h(codecCapabilities) || y(str)) ? false : true, codecCapabilities != null && r(codecCapabilities), z15 || (codecCapabilities != null && p(codecCapabilities)));
    }

    private static int a(String str, String str2, int i11) {
        int i12;
        if (i11 > 1 || ((k0.f477a >= 26 && i11 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i11;
        }
        if ("audio/ac3".equals(str2)) {
            i12 = 6;
        } else {
            i12 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
        sb2.append("AssumedMaxChannelAdjustment: ");
        sb2.append(str);
        sb2.append(", [");
        sb2.append(i11);
        sb2.append(" to ");
        sb2.append(i12);
        sb2.append("]");
        ak.o.h("MediaCodecInfo", sb2.toString());
        return i12;
    }

    private static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(k0.l(i11, widthAlignment) * widthAlignment, k0.l(i12, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        Point c11 = c(videoCapabilities, i11, i12);
        int i13 = c11.x;
        int i14 = c11.y;
        if (d11 != -1.0d && d11 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d11));
        }
        return videoCapabilities.isSizeSupported(i13, i14);
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i11 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i11;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f477a >= 19 && i(codecCapabilities);
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f477a >= 21 && q(codecCapabilities);
    }

    private static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f477a >= 21 && s(codecCapabilities);
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void u(String str) {
        String str2 = this.f13700a;
        String str3 = this.f13701b;
        String str4 = k0.f481e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append("AssumedSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append("]");
        ak.o.b("MediaCodecInfo", sb2.toString());
    }

    private void v(String str) {
        String str2 = this.f13700a;
        String str3 = this.f13701b;
        String str4 = k0.f481e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append("NoSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append("]");
        ak.o.b("MediaCodecInfo", sb2.toString());
    }

    private static boolean w(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean x(String str) {
        return k0.f480d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean y(String str) {
        if (k0.f477a <= 22) {
            String str2 = k0.f480d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean z(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(k0.f478b)) ? false : true;
    }

    public Point b(int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13703d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i11, i12);
    }

    public fi.e e(ci.i iVar, ci.i iVar2) {
        int i11 = !k0.c(iVar.f9205l, iVar2.f9205l) ? 8 : 0;
        if (this.f13706g) {
            if (iVar.f9213x != iVar2.f9213x) {
                i11 |= 1024;
            }
            if (!this.f13704e && (iVar.f9210q != iVar2.f9210q || iVar.f9211t != iVar2.f9211t)) {
                i11 |= 512;
            }
            if (!k0.c(iVar.B, iVar2.B)) {
                i11 |= 2048;
            }
            if (x(this.f13700a) && !iVar.e(iVar2)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new fi.e(this.f13700a, iVar, iVar2, iVar.e(iVar2) ? 3 : 2, 0);
            }
        } else {
            if (iVar.C != iVar2.C) {
                i11 |= 4096;
            }
            if (iVar.E != iVar2.E) {
                i11 |= PKIFailureInfo.certRevoked;
            }
            if (iVar.F != iVar2.F) {
                i11 |= 16384;
            }
            if (i11 == 0 && "audio/mp4a-latm".equals(this.f13701b)) {
                Pair<Integer, Integer> p11 = MediaCodecUtil.p(iVar);
                Pair<Integer, Integer> p12 = MediaCodecUtil.p(iVar2);
                if (p11 != null && p12 != null) {
                    int intValue = ((Integer) p11.first).intValue();
                    int intValue2 = ((Integer) p12.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new fi.e(this.f13700a, iVar, iVar2, 3, 0);
                    }
                }
            }
            if (!iVar.e(iVar2)) {
                i11 |= 32;
            }
            if (w(this.f13701b)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new fi.e(this.f13700a, iVar, iVar2, 1, 0);
            }
        }
        return new fi.e(this.f13700a, iVar, iVar2, 0, i11);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13703d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13703d;
        if (codecCapabilities == null) {
            v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("channelCount.aCaps");
            return false;
        } else if (a(this.f13700a, this.f13701b, audioCapabilities.getMaxInputChannelCount()) < i11) {
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("channelCount.support, ");
            sb2.append(i11);
            v(sb2.toString());
            return false;
        } else {
            return true;
        }
    }

    public boolean k(int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13703d;
        if (codecCapabilities == null) {
            v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i11)) {
            return true;
        } else {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("sampleRate.support, ");
            sb2.append(i11);
            v(sb2.toString());
            return false;
        }
    }

    public boolean l(ci.i iVar) {
        String g11;
        String str = iVar.f9202i;
        if (str == null || this.f13701b == null || (g11 = r.g(str)) == null) {
            return true;
        }
        if (!this.f13701b.equals(g11)) {
            String str2 = iVar.f9202i;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13 + g11.length());
            sb2.append("codec.mime ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(g11);
            v(sb2.toString());
            return false;
        }
        Pair<Integer, Integer> p11 = MediaCodecUtil.p(iVar);
        if (p11 == null) {
            return true;
        }
        int intValue = ((Integer) p11.first).intValue();
        int intValue2 = ((Integer) p11.second).intValue();
        if (this.f13706g || intValue == 42) {
            MediaCodecInfo.CodecProfileLevel[] g12 = g();
            if (k0.f477a <= 23 && "video/x-vnd.on2.vp9".equals(this.f13701b) && g12.length == 0) {
                g12 = f(this.f13703d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g12) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                    return true;
                }
            }
            String str3 = iVar.f9202i;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 22 + g11.length());
            sb3.append("codec.profileLevel, ");
            sb3.append(str3);
            sb3.append(", ");
            sb3.append(g11);
            v(sb3.toString());
            return false;
        }
        return true;
    }

    public boolean m(ci.i iVar) {
        int i11;
        if (l(iVar)) {
            if (this.f13706g) {
                int i12 = iVar.f9210q;
                if (i12 <= 0 || (i11 = iVar.f9211t) <= 0) {
                    return true;
                }
                if (k0.f477a >= 21) {
                    return t(i12, i11, iVar.f9212w);
                }
                boolean z11 = i12 * i11 <= MediaCodecUtil.M();
                if (!z11) {
                    int i13 = iVar.f9210q;
                    int i14 = iVar.f9211t;
                    StringBuilder sb2 = new StringBuilder(40);
                    sb2.append("legacyFrameSize, ");
                    sb2.append(i13);
                    sb2.append("x");
                    sb2.append(i14);
                    v(sb2.toString());
                }
                return z11;
            }
            if (k0.f477a >= 21) {
                int i15 = iVar.E;
                if (i15 != -1 && !k(i15)) {
                    return false;
                }
                int i16 = iVar.C;
                if (i16 != -1 && !j(i16)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean n() {
        if (k0.f477a >= 29 && "video/x-vnd.on2.vp9".equals(this.f13701b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean o(ci.i iVar) {
        if (this.f13706g) {
            return this.f13704e;
        }
        Pair<Integer, Integer> p11 = MediaCodecUtil.p(iVar);
        return p11 != null && ((Integer) p11.first).intValue() == 42;
    }

    public boolean t(int i11, int i12, double d11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13703d;
        if (codecCapabilities == null) {
            v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            v("sizeAndRate.vCaps");
            return false;
        } else if (d(videoCapabilities, i11, i12, d11)) {
            return true;
        } else {
            if (i11 < i12 && z(this.f13700a) && d(videoCapabilities, i12, i11, d11)) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("sizeAndRate.rotated, ");
                sb2.append(i11);
                sb2.append("x");
                sb2.append(i12);
                sb2.append("x");
                sb2.append(d11);
                u(sb2.toString());
                return true;
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.support, ");
            sb3.append(i11);
            sb3.append("x");
            sb3.append(i12);
            sb3.append("x");
            sb3.append(d11);
            v(sb3.toString());
            return false;
        }
    }

    public String toString() {
        return this.f13700a;
    }
}