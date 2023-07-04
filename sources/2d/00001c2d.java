package com.google.android.exoplayer2.source.hls.playlist;

import ak.i0;
import ak.k0;
import ak.o;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.h;
import com.google.common.collect.w;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kj.r;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import qi.l;

/* loaded from: classes3.dex */
public final class HlsPlaylistParser implements h.a<lj.d> {

    /* renamed from: a  reason: collision with root package name */
    private final c f14029a;

    /* renamed from: b  reason: collision with root package name */
    private final d f14030b;

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f13998c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f13999d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f14000e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f14001f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f14002g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f14005h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f14006i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f14008j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f14010k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f14012l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f14013m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n  reason: collision with root package name */
    private static final Pattern f14014n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o  reason: collision with root package name */
    private static final Pattern f14015o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f14016p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f14019q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f14020t = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: w  reason: collision with root package name */
    private static final Pattern f14021w = c("CAN-SKIP-DATERANGES");

    /* renamed from: x  reason: collision with root package name */
    private static final Pattern f14022x = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: y  reason: collision with root package name */
    private static final Pattern f14025y = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: z  reason: collision with root package name */
    private static final Pattern f14028z = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern A = c("CAN-BLOCK-RELOAD");
    private static final Pattern B = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern C = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern E = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern F = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern G = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern H = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern K = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern L = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern O = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern P = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern Q = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern R = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern T = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern Y = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: b1  reason: collision with root package name */
    private static final Pattern f13996b1 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: g1  reason: collision with root package name */
    private static final Pattern f14003g1 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: p1  reason: collision with root package name */
    private static final Pattern f14017p1 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: x1  reason: collision with root package name */
    private static final Pattern f14023x1 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: y1  reason: collision with root package name */
    private static final Pattern f14026y1 = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern Q1 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern V1 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: b2  reason: collision with root package name */
    private static final Pattern f13997b2 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: g2  reason: collision with root package name */
    private static final Pattern f14004g2 = c("AUTOSELECT");

    /* renamed from: p2  reason: collision with root package name */
    private static final Pattern f14018p2 = c("DEFAULT");

    /* renamed from: x2  reason: collision with root package name */
    private static final Pattern f14024x2 = c("FORCED");

    /* renamed from: y2  reason: collision with root package name */
    private static final Pattern f14027y2 = c("INDEPENDENT");
    private static final Pattern Q2 = c("GAP");

    /* renamed from: i3  reason: collision with root package name */
    private static final Pattern f14007i3 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: j3  reason: collision with root package name */
    private static final Pattern f14009j3 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: k3  reason: collision with root package name */
    private static final Pattern f14011k3 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* loaded from: classes3.dex */
    public static final class DeltaUpdateException extends IOException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final BufferedReader f14031a;

        /* renamed from: b  reason: collision with root package name */
        private final Queue<String> f14032b;

        /* renamed from: c  reason: collision with root package name */
        private String f14033c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f14032b = queue;
            this.f14031a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.f14033c != null) {
                return true;
            }
            if (!this.f14032b.isEmpty()) {
                this.f14033c = (String) ak.a.e(this.f14032b.poll());
                return true;
            }
            do {
                String readLine = this.f14031a.readLine();
                this.f14033c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f14033c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (a()) {
                String str = this.f14033c;
                this.f14033c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public HlsPlaylistParser() {
        this(c.f14063n, null);
    }

    private static String A(String str, Map<String, String> map) {
        Matcher matcher = f14011k3.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int B(BufferedReader bufferedReader, boolean z11, int i11) {
        while (i11 != -1 && Character.isWhitespace(i11) && (z11 || !k0.q0(i11))) {
            i11 = bufferedReader.read();
        }
        return i11;
    }

    private static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int B2 = B(bufferedReader, true, read);
        for (int i11 = 0; i11 < 7; i11++) {
            if (B2 != "#EXTM3U".charAt(i11)) {
                return false;
            }
            B2 = bufferedReader.read();
        }
        return k0.q0(B(bufferedReader, false, B2));
    }

    private static Pattern c(String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9);
        sb2.append(str);
        sb2.append("=(");
        sb2.append("NO");
        sb2.append("|");
        sb2.append("YES");
        sb2.append(")");
        return Pattern.compile(sb2.toString());
    }

    private static e d(String str, e.b[] bVarArr) {
        e.b[] bVarArr2 = new e.b[bVarArr.length];
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            bVarArr2[i11] = bVarArr[i11].b(null);
        }
        return new e(str, bVarArr2);
    }

    private static String e(long j11, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j11);
    }

    private static c.b f(ArrayList<c.b> arrayList, String str) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c.b bVar = arrayList.get(i11);
            if (str.equals(bVar.f14080d)) {
                return bVar;
            }
        }
        return null;
    }

    private static c.b g(ArrayList<c.b> arrayList, String str) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c.b bVar = arrayList.get(i11);
            if (str.equals(bVar.f14081e)) {
                return bVar;
            }
        }
        return null;
    }

    private static c.b h(ArrayList<c.b> arrayList, String str) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c.b bVar = arrayList.get(i11);
            if (str.equals(bVar.f14079c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    private static e.b k(String str, String str2, Map<String, String> map) {
        String u11 = u(str, T, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z11 = z(str, Y, map);
            return new e.b(ci.b.f9156d, "video/mp4", Base64.decode(z11.substring(z11.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new e.b(ci.b.f9156d, "hls", k0.l0(str));
        } else {
            if ("com.microsoft.playready".equals(str2) && "1".equals(u11)) {
                String z12 = z(str, Y, map);
                byte[] decode = Base64.decode(z12.substring(z12.indexOf(44)), 0);
                UUID uuid = ci.b.f9157e;
                return new e.b(uuid, "video/mp4", l.a(uuid, decode));
            }
            return null;
        }
    }

    private static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    private static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    private static c o(a aVar, String str) {
        Uri uri;
        char c11;
        i iVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        String str4;
        boolean z11;
        int i11;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i12;
        int i13;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        Uri d11;
        HashMap hashMap;
        int i14;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (aVar.a()) {
                String b11 = aVar.b();
                if (b11.startsWith("#EXT")) {
                    arrayList18.add(b11);
                }
                boolean startsWith = b11.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                boolean z14 = z12;
                if (b11.startsWith("#EXT-X-DEFINE")) {
                    hashMap3.put(z(b11, f14026y1, hashMap3), z(b11, f14007i3, hashMap3));
                } else {
                    if (b11.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                        hashMap = hashMap2;
                        arrayList10 = arrayList16;
                        arrayList9 = arrayList12;
                        arrayList8 = arrayList13;
                        arrayList7 = arrayList14;
                        arrayList5 = arrayList15;
                        arrayList6 = arrayList18;
                        arrayList4 = arrayList17;
                        z12 = true;
                    } else if (b11.startsWith("#EXT-X-MEDIA")) {
                        arrayList16.add(b11);
                    } else if (b11.startsWith("#EXT-X-SESSION-KEY")) {
                        e.b k11 = k(b11, u(b11, R, "identity", hashMap3), hashMap3);
                        if (k11 != null) {
                            arrayList17.add(new e(l(z(b11, Q, hashMap3)), k11));
                        }
                    } else if (b11.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                        boolean contains = z13 | b11.contains("CLOSED-CAPTIONS=NONE");
                        if (startsWith) {
                            i11 = 16384;
                            z11 = contains;
                        } else {
                            z11 = contains;
                            i11 = 0;
                        }
                        int m11 = m(b11, f14005h);
                        arrayList4 = arrayList17;
                        arrayList5 = arrayList15;
                        int s11 = s(b11, f13998c, -1);
                        String v11 = v(b11, f14008j, hashMap3);
                        arrayList6 = arrayList18;
                        String v12 = v(b11, f14010k, hashMap3);
                        if (v12 != null) {
                            arrayList7 = arrayList14;
                            String[] L0 = k0.L0(v12, "x");
                            int parseInt2 = Integer.parseInt(L0[0]);
                            int parseInt3 = Integer.parseInt(L0[1]);
                            if (parseInt2 <= 0 || parseInt3 <= 0) {
                                parseInt3 = -1;
                                i14 = -1;
                            } else {
                                i14 = parseInt2;
                            }
                            i13 = parseInt3;
                            i12 = i14;
                        } else {
                            arrayList7 = arrayList14;
                            i12 = -1;
                            i13 = -1;
                        }
                        arrayList8 = arrayList13;
                        String v13 = v(b11, f14012l, hashMap3);
                        arrayList9 = arrayList12;
                        float parseFloat = v13 != null ? Float.parseFloat(v13) : -1.0f;
                        String v14 = v(b11, f13999d, hashMap3);
                        arrayList10 = arrayList16;
                        String v15 = v(b11, f14000e, hashMap3);
                        HashMap hashMap4 = hashMap2;
                        String v16 = v(b11, f14001f, hashMap3);
                        String v17 = v(b11, f14002g, hashMap3);
                        if (startsWith) {
                            d11 = i0.d(str5, z(b11, Y, hashMap3));
                        } else if (aVar.a()) {
                            d11 = i0.d(str5, A(aVar.b(), hashMap3));
                        } else {
                            throw new ParserException("#EXT-X-STREAM-INF must be followed by another line");
                        }
                        arrayList11.add(new c.b(d11, new i.b().R(arrayList11.size()).K("application/x-mpegURL").I(v11).G(s11).Z(m11).j0(i12).Q(i13).P(parseFloat).c0(i11).E(), v14, v15, v16, v17));
                        hashMap = hashMap4;
                        ArrayList arrayList19 = (ArrayList) hashMap.get(d11);
                        if (arrayList19 == null) {
                            arrayList19 = new ArrayList();
                            hashMap.put(d11, arrayList19);
                        }
                        arrayList19.add(new r.b(s11, m11, v14, v15, v16, v17));
                        z12 = z14;
                        z13 = z11;
                    }
                    hashMap2 = hashMap;
                    arrayList17 = arrayList4;
                    arrayList15 = arrayList5;
                    arrayList18 = arrayList6;
                    arrayList14 = arrayList7;
                    arrayList13 = arrayList8;
                    arrayList12 = arrayList9;
                    arrayList16 = arrayList10;
                    str5 = str;
                }
                hashMap = hashMap2;
                arrayList10 = arrayList16;
                arrayList9 = arrayList12;
                arrayList8 = arrayList13;
                arrayList7 = arrayList14;
                arrayList5 = arrayList15;
                arrayList6 = arrayList18;
                arrayList4 = arrayList17;
                z12 = z14;
                hashMap2 = hashMap;
                arrayList17 = arrayList4;
                arrayList15 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                str5 = str;
            } else {
                HashMap hashMap5 = hashMap2;
                ArrayList arrayList20 = arrayList16;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList13;
                ArrayList arrayList23 = arrayList14;
                ArrayList arrayList24 = arrayList15;
                ArrayList arrayList25 = arrayList18;
                boolean z15 = z12;
                ArrayList arrayList26 = arrayList17;
                ArrayList arrayList27 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i15 = 0;
                while (true) {
                    uri = null;
                    if (i15 >= arrayList11.size()) {
                        break;
                    }
                    c.b bVar = (c.b) arrayList11.get(i15);
                    if (hashSet.add(bVar.f14077a)) {
                        ak.a.f(bVar.f14078b.f9203j == null);
                        arrayList27.add(bVar.a(bVar.f14078b.a().X(new wi.a(new r(null, null, (List) ak.a.e((ArrayList) hashMap5.get(bVar.f14077a))))).E()));
                    }
                    i15++;
                }
                ArrayList arrayList28 = null;
                i iVar2 = null;
                int i16 = 0;
                while (i16 < arrayList20.size()) {
                    ArrayList arrayList29 = arrayList20;
                    String str7 = (String) arrayList29.get(i16);
                    String z16 = z(str7, Q1, hashMap3);
                    String z17 = z(str7, f14026y1, hashMap3);
                    i.b bVar2 = new i.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(z16).length() + 1 + String.valueOf(z17).length());
                    sb2.append(z16);
                    sb2.append(":");
                    sb2.append(z17);
                    i.b V = bVar2.S(sb2.toString()).U(z17).K(str6).g0(x(str7)).c0(w(str7, hashMap3)).V(v(str7, f14023x1, hashMap3));
                    String v18 = v(str7, Y, hashMap3);
                    Uri d12 = v18 == null ? uri : i0.d(str, v18);
                    arrayList20 = arrayList29;
                    String str8 = str6;
                    wi.a aVar2 = new wi.a(new r(z16, z17, Collections.emptyList()));
                    String z18 = z(str7, f14003g1, hashMap3);
                    z18.hashCode();
                    switch (z18.hashCode()) {
                        case -959297733:
                            if (z18.equals("SUBTITLES")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -333210994:
                            if (z18.equals("CLOSED-CAPTIONS")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 62628790:
                            if (z18.equals("AUDIO")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 81665115:
                            if (z18.equals("VIDEO")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            iVar = iVar2;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            c.b g11 = g(arrayList11, z16);
                            if (g11 != null) {
                                String K2 = k0.K(g11.f14078b.f9202i, 3);
                                V.I(K2);
                                str2 = ak.r.g(K2);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            V.e0(str2).X(aVar2);
                            if (d12 != null) {
                                arrayList3 = arrayList23;
                                arrayList3.add(new c.a(d12, V.E(), z16, z17));
                                break;
                            } else {
                                arrayList3 = arrayList23;
                                o.h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            iVar = iVar2;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            String z19 = z(str7, f13997b2, hashMap3);
                            if (z19.startsWith("CC")) {
                                parseInt = Integer.parseInt(z19.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(z19.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList28 == null) {
                                arrayList28 = new ArrayList();
                            }
                            V.e0(str3).F(parseInt);
                            arrayList28.add(V.E());
                            arrayList3 = arrayList23;
                            break;
                        case 2:
                            arrayList2 = arrayList21;
                            c.b f11 = f(arrayList11, z16);
                            if (f11 != null) {
                                iVar = iVar2;
                                String K3 = k0.K(f11.f14078b.f9202i, 1);
                                V.I(K3);
                                str4 = ak.r.g(K3);
                            } else {
                                iVar = iVar2;
                                str4 = null;
                            }
                            String v19 = v(str7, f14006i, hashMap3);
                            if (v19 != null) {
                                V.H(Integer.parseInt(k0.M0(v19, "/")[0]));
                                if ("audio/eac3".equals(str4) && v19.endsWith("/JOC")) {
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            V.e0(str4);
                            if (d12 != null) {
                                V.X(aVar2);
                                arrayList = arrayList22;
                                arrayList.add(new c.a(d12, V.E(), z16, z17));
                            } else {
                                arrayList = arrayList22;
                                if (f11 != null) {
                                    iVar = V.E();
                                }
                            }
                            arrayList3 = arrayList23;
                            break;
                        case 3:
                            c.b h11 = h(arrayList11, z16);
                            if (h11 != null) {
                                i iVar3 = h11.f14078b;
                                String K4 = k0.K(iVar3.f9202i, 2);
                                V.I(K4).e0(ak.r.g(K4)).j0(iVar3.f9210q).Q(iVar3.f9211t).P(iVar3.f9212w);
                            }
                            if (d12 != null) {
                                V.X(aVar2);
                                arrayList2 = arrayList21;
                                arrayList2.add(new c.a(d12, V.E(), z16, z17));
                                iVar = iVar2;
                                arrayList3 = arrayList23;
                                arrayList = arrayList22;
                                break;
                            }
                        default:
                            iVar = iVar2;
                            arrayList3 = arrayList23;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            break;
                    }
                    i16++;
                    arrayList23 = arrayList3;
                    arrayList22 = arrayList;
                    arrayList21 = arrayList2;
                    str6 = str8;
                    iVar2 = iVar;
                    uri = null;
                }
                return new c(str, arrayList25, arrayList27, arrayList21, arrayList22, arrayList23, arrayList24, iVar2, z13 ? Collections.emptyList() : arrayList28, z15, hashMap3, arrayList26);
            }
        }
    }

    private static d p(c cVar, d dVar, a aVar, String str) {
        ArrayList arrayList;
        long j11;
        long j12;
        HashMap hashMap;
        String str2;
        String str3;
        String str4;
        HashMap hashMap2;
        String str5;
        long j13;
        int i11;
        ArrayList arrayList2;
        long j14;
        long j15;
        long j16;
        long j17;
        HashMap hashMap3;
        boolean z11;
        e eVar;
        c cVar2 = cVar;
        d dVar2 = dVar;
        boolean z12 = cVar2.f37207c;
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap6 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        d.f fVar = new d.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str6 = "";
        boolean z13 = z12;
        d.f fVar2 = fVar;
        String str7 = "";
        String str8 = null;
        String str9 = null;
        e eVar2 = null;
        e eVar3 = null;
        d.b bVar = null;
        String str10 = null;
        d.C0252d c0252d = null;
        long j18 = 0;
        long j19 = 0;
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        long j24 = 0;
        long j25 = 0;
        long j26 = 0;
        boolean z14 = false;
        int i12 = 0;
        long j27 = -9223372036854775807L;
        int i13 = 0;
        int i14 = 1;
        long j28 = -9223372036854775807L;
        long j29 = -9223372036854775807L;
        boolean z15 = false;
        boolean z16 = false;
        long j31 = -1;
        int i15 = 0;
        boolean z17 = false;
        while (aVar.a()) {
            String b11 = aVar.b();
            if (b11.startsWith("#EXT")) {
                arrayList5.add(b11);
            }
            if (b11.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z18 = z(b11, f14019q, hashMap4);
                if ("VOD".equals(z18)) {
                    i12 = 1;
                } else if ("EVENT".equals(z18)) {
                    i12 = 2;
                }
            } else if (b11.equals("#EXT-X-I-FRAMES-ONLY")) {
                z17 = true;
            } else if (b11.startsWith("#EXT-X-START")) {
                j27 = (long) (j(b11, H) * 1000000.0d);
            } else if (b11.startsWith("#EXT-X-SERVER-CONTROL")) {
                fVar2 = y(b11);
            } else if (b11.startsWith("#EXT-X-PART-INF")) {
                j29 = (long) (j(b11, f14015o) * 1000000.0d);
            } else {
                boolean z19 = z14;
                if (b11.startsWith("#EXT-X-MAP")) {
                    String z21 = z(b11, Y, hashMap4);
                    String v11 = v(b11, L, hashMap4);
                    if (v11 != null) {
                        String[] L0 = k0.L0(v11, "@");
                        long parseLong = Long.parseLong(L0[0]);
                        if (L0.length > 1) {
                            j12 = parseLong;
                            j11 = Long.parseLong(L0[1]);
                        } else {
                            j12 = parseLong;
                            j11 = j21;
                        }
                    } else {
                        j11 = j21;
                        j12 = j31;
                    }
                    if (str8 != null && str9 == null) {
                        throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                    }
                    c0252d = new d.C0252d(z21, j11, j12, str8, str9);
                    j21 = 0;
                    z14 = z19;
                    j31 = -1;
                } else {
                    if (b11.startsWith("#EXT-X-TARGETDURATION")) {
                        j28 = 1000000 * m(b11, f14013m);
                    } else if (b11.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j24 = n(b11, B);
                        j19 = j24;
                    } else if (b11.startsWith("#EXT-X-VERSION")) {
                        i14 = m(b11, f14016p);
                    } else {
                        if (b11.startsWith("#EXT-X-DEFINE")) {
                            String v12 = v(b11, f14009j3, hashMap4);
                            if (v12 != null) {
                                String str11 = cVar2.f14072l.get(v12);
                                if (str11 != null) {
                                    hashMap4.put(v12, str11);
                                }
                            } else {
                                hashMap4.put(z(b11, f14026y1, hashMap4), z(b11, f14007i3, hashMap4));
                            }
                            hashMap = hashMap4;
                            str2 = str6;
                            str3 = str8;
                            str4 = str9;
                            hashMap2 = hashMap6;
                            str5 = str10;
                            j13 = j24;
                            i11 = i12;
                            arrayList2 = arrayList5;
                        } else {
                            if (b11.startsWith("#EXTINF")) {
                                str3 = str8;
                                str7 = u(b11, E, str6, hashMap4);
                                j25 = (long) (j(b11, C) * 1000000.0d);
                                z14 = z19;
                                str9 = str9;
                            } else {
                                str3 = str8;
                                String str12 = str9;
                                if (b11.startsWith("#EXT-X-SKIP")) {
                                    int m11 = m(b11, f14022x);
                                    ak.a.f(dVar2 != null && arrayList3.isEmpty());
                                    int i16 = (int) (j19 - ((d) k0.j(dVar)).f14088i);
                                    int i17 = m11 + i16;
                                    if (i16 < 0 || i17 > dVar2.f14095p.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    str2 = str6;
                                    str8 = str3;
                                    long j32 = j23;
                                    str9 = str12;
                                    while (i16 < i17) {
                                        d.C0252d c0252d2 = dVar2.f14095p.get(i16);
                                        String str13 = str9;
                                        HashMap hashMap7 = hashMap6;
                                        if (j19 != dVar2.f14088i) {
                                            c0252d2 = c0252d2.b(j32, (dVar2.f14087h - i13) + c0252d2.f14109d);
                                        }
                                        arrayList3.add(c0252d2);
                                        j32 += c0252d2.f14108c;
                                        long j33 = c0252d2.f14115j;
                                        if (j33 != -1) {
                                            j21 = c0252d2.f14114i + j33;
                                        }
                                        int i18 = c0252d2.f14109d;
                                        d.C0252d c0252d3 = c0252d2.f14107b;
                                        e eVar4 = c0252d2.f14111f;
                                        String str14 = c0252d2.f14112g;
                                        String str15 = c0252d2.f14113h;
                                        String str16 = (str15 == null || !str15.equals(Long.toHexString(j24))) ? c0252d2.f14113h : str13;
                                        j24++;
                                        i16++;
                                        dVar2 = dVar;
                                        j22 = j32;
                                        str8 = str14;
                                        i15 = i18;
                                        c0252d = c0252d3;
                                        hashMap6 = hashMap7;
                                        eVar3 = eVar4;
                                        str9 = str16;
                                    }
                                    cVar2 = cVar;
                                    dVar2 = dVar;
                                    j23 = j32;
                                    z14 = z19;
                                    str6 = str2;
                                } else {
                                    str2 = str6;
                                    hashMap2 = hashMap6;
                                    if (b11.startsWith("#EXT-X-KEY")) {
                                        String z22 = z(b11, Q, hashMap4);
                                        String u11 = u(b11, R, "identity", hashMap4);
                                        if ("NONE".equals(z22)) {
                                            treeMap.clear();
                                            str8 = null;
                                            str9 = null;
                                            eVar3 = null;
                                        } else {
                                            String v13 = v(b11, f13996b1, hashMap4);
                                            if ("identity".equals(u11)) {
                                                if ("AES-128".equals(z22)) {
                                                    str8 = z(b11, Y, hashMap4);
                                                    str9 = v13;
                                                }
                                                str9 = v13;
                                                str8 = null;
                                            } else {
                                                String str17 = str10;
                                                str10 = str17 == null ? l(z22) : str17;
                                                e.b k11 = k(b11, u11, hashMap4);
                                                if (k11 != null) {
                                                    treeMap.put(u11, k11);
                                                    str9 = v13;
                                                    str8 = null;
                                                    eVar3 = null;
                                                }
                                                str9 = v13;
                                                str8 = null;
                                            }
                                        }
                                        cVar2 = cVar;
                                        dVar2 = dVar;
                                        z14 = z19;
                                        str6 = str2;
                                        hashMap6 = hashMap2;
                                    } else {
                                        str5 = str10;
                                        if (b11.startsWith("#EXT-X-BYTERANGE")) {
                                            String[] L02 = k0.L0(z(b11, K, hashMap4), "@");
                                            j31 = Long.parseLong(L02[0]);
                                            if (L02.length > 1) {
                                                j21 = Long.parseLong(L02[1]);
                                            }
                                        } else if (b11.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i13 = Integer.parseInt(b11.substring(b11.indexOf(58) + 1));
                                            cVar2 = cVar;
                                            dVar2 = dVar;
                                            str10 = str5;
                                            str9 = str12;
                                            str6 = str2;
                                            hashMap6 = hashMap2;
                                            z14 = true;
                                        } else if (b11.equals("#EXT-X-DISCONTINUITY")) {
                                            i15++;
                                        } else {
                                            if (b11.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j18 == 0) {
                                                    j18 = ci.b.c(k0.D0(b11.substring(b11.indexOf(58) + 1))) - j23;
                                                }
                                            } else if (b11.equals("#EXT-X-GAP")) {
                                                cVar2 = cVar;
                                                dVar2 = dVar;
                                                str10 = str5;
                                                z14 = z19;
                                                str9 = str12;
                                                str6 = str2;
                                                hashMap6 = hashMap2;
                                                z16 = true;
                                            } else if (b11.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                cVar2 = cVar;
                                                dVar2 = dVar;
                                                str10 = str5;
                                                z14 = z19;
                                                str9 = str12;
                                                str6 = str2;
                                                hashMap6 = hashMap2;
                                                z13 = true;
                                            } else if (b11.equals("#EXT-X-ENDLIST")) {
                                                cVar2 = cVar;
                                                dVar2 = dVar;
                                                str10 = str5;
                                                z14 = z19;
                                                str9 = str12;
                                                str6 = str2;
                                                hashMap6 = hashMap2;
                                                z15 = true;
                                            } else if (b11.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long t11 = t(b11, F, (j19 + arrayList3.size()) - (arrayList4.isEmpty() ? 1L : 0L));
                                                int s11 = s(b11, G, j29 != -9223372036854775807L ? (arrayList4.isEmpty() ? ((d.C0252d) w.b(arrayList3)).f14105m : arrayList4).size() - 1 : -1);
                                                Uri parse = Uri.parse(i0.c(str, z(b11, Y, hashMap4)));
                                                hashMap2.put(parse, new d.c(parse, t11, s11));
                                            } else if (b11.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                d.b bVar2 = bVar;
                                                if (bVar2 == null && "PART".equals(z(b11, f14017p1, hashMap4))) {
                                                    String z23 = z(b11, Y, hashMap4);
                                                    long t12 = t(b11, O, -1L);
                                                    long t13 = t(b11, P, -1L);
                                                    long j34 = j24;
                                                    str4 = str12;
                                                    String e11 = e(j34, str3, str4);
                                                    if (eVar3 != null || treeMap.isEmpty()) {
                                                        hashMap2 = hashMap2;
                                                    } else {
                                                        hashMap2 = hashMap2;
                                                        e.b[] bVarArr = (e.b[]) treeMap.values().toArray(new e.b[0]);
                                                        e eVar5 = new e(str5, bVarArr);
                                                        if (eVar2 == null) {
                                                            eVar2 = d(str5, bVarArr);
                                                        }
                                                        eVar3 = eVar5;
                                                    }
                                                    int i19 = (t12 > (-1L) ? 1 : (t12 == (-1L) ? 0 : -1));
                                                    if (i19 == 0 || t13 != -1) {
                                                        bVar = new d.b(z23, c0252d, 0L, i15, j22, eVar3, str3, e11, i19 != 0 ? t12 : 0L, t13, false, false, true);
                                                    } else {
                                                        bVar = bVar2;
                                                    }
                                                    cVar2 = cVar;
                                                    dVar2 = dVar;
                                                    str10 = str5;
                                                    j24 = j34;
                                                    z14 = z19;
                                                    hashMap6 = hashMap2;
                                                    str9 = str4;
                                                    str8 = str3;
                                                    str6 = str2;
                                                } else {
                                                    hashMap2 = hashMap2;
                                                    bVar = bVar2;
                                                }
                                            } else {
                                                hashMap2 = hashMap2;
                                                d.b bVar3 = bVar;
                                                j13 = j24;
                                                str4 = str12;
                                                if (b11.startsWith("#EXT-X-PART")) {
                                                    String e12 = e(j13, str3, str4);
                                                    String z24 = z(b11, Y, hashMap4);
                                                    bVar = bVar3;
                                                    long j35 = (long) (j(b11, f14014n) * 1000000.0d);
                                                    arrayList2 = arrayList5;
                                                    i11 = i12;
                                                    boolean q11 = q(b11, f14027y2, false) | (z13 && arrayList4.isEmpty());
                                                    boolean q12 = q(b11, Q2, false);
                                                    String v14 = v(b11, L, hashMap4);
                                                    if (v14 != null) {
                                                        String[] L03 = k0.L0(v14, "@");
                                                        long parseLong2 = Long.parseLong(L03[0]);
                                                        if (L03.length > 1) {
                                                            j26 = Long.parseLong(L03[1]);
                                                        }
                                                        j15 = parseLong2;
                                                        j14 = -1;
                                                    } else {
                                                        j14 = -1;
                                                        j15 = -1;
                                                    }
                                                    int i21 = (j15 > j14 ? 1 : (j15 == j14 ? 0 : -1));
                                                    if (i21 == 0) {
                                                        j26 = 0;
                                                    }
                                                    if (eVar3 == null && !treeMap.isEmpty()) {
                                                        e.b[] bVarArr2 = (e.b[]) treeMap.values().toArray(new e.b[0]);
                                                        e eVar6 = new e(str5, bVarArr2);
                                                        if (eVar2 == null) {
                                                            eVar2 = d(str5, bVarArr2);
                                                        }
                                                        eVar3 = eVar6;
                                                    }
                                                    arrayList4.add(new d.b(z24, c0252d, j35, i15, j22, eVar3, str3, e12, j26, j15, q12, q11, false));
                                                    j22 += j35;
                                                    if (i21 != 0) {
                                                        j26 += j15;
                                                    }
                                                    cVar2 = cVar;
                                                    dVar2 = dVar;
                                                    arrayList5 = arrayList2;
                                                    i12 = i11;
                                                    z14 = z19;
                                                    str10 = str5;
                                                    j24 = j13;
                                                    hashMap6 = hashMap2;
                                                    str9 = str4;
                                                    str8 = str3;
                                                    str6 = str2;
                                                } else {
                                                    bVar = bVar3;
                                                    i11 = i12;
                                                    arrayList2 = arrayList5;
                                                    if (b11.startsWith("#")) {
                                                        hashMap = hashMap4;
                                                    } else {
                                                        String e13 = e(j13, str3, str4);
                                                        long j36 = j13 + 1;
                                                        String A2 = A(b11, hashMap4);
                                                        d.C0252d c0252d4 = (d.C0252d) hashMap5.get(A2);
                                                        int i22 = (j31 > (-1L) ? 1 : (j31 == (-1L) ? 0 : -1));
                                                        if (i22 == 0) {
                                                            j16 = 0;
                                                        } else {
                                                            if (z17 && c0252d == null && c0252d4 == null) {
                                                                c0252d4 = new d.C0252d(A2, 0L, j21, null, null);
                                                                hashMap5.put(A2, c0252d4);
                                                            }
                                                            j16 = j21;
                                                        }
                                                        if (eVar3 != null || treeMap.isEmpty()) {
                                                            j17 = j36;
                                                            hashMap3 = hashMap4;
                                                            z11 = false;
                                                            eVar = eVar3;
                                                        } else {
                                                            j17 = j36;
                                                            hashMap3 = hashMap4;
                                                            z11 = false;
                                                            e.b[] bVarArr3 = (e.b[]) treeMap.values().toArray(new e.b[0]);
                                                            eVar = new e(str5, bVarArr3);
                                                            if (eVar2 == null) {
                                                                eVar2 = d(str5, bVarArr3);
                                                            }
                                                        }
                                                        arrayList3.add(new d.C0252d(A2, c0252d != null ? c0252d : c0252d4, str7, j25, i15, j23, eVar, str3, e13, j16, j31, z16, arrayList4));
                                                        j22 = j23 + j25;
                                                        arrayList4 = new ArrayList();
                                                        if (i22 != 0) {
                                                            j16 += j31;
                                                        }
                                                        j21 = j16;
                                                        cVar2 = cVar;
                                                        dVar2 = dVar;
                                                        z16 = z11;
                                                        eVar3 = eVar;
                                                        str9 = str4;
                                                        j25 = 0;
                                                        j23 = j22;
                                                        j31 = -1;
                                                        hashMap4 = hashMap3;
                                                        arrayList5 = arrayList2;
                                                        i12 = i11;
                                                        z14 = z19;
                                                        str6 = str2;
                                                        str7 = str6;
                                                        hashMap6 = hashMap2;
                                                        str10 = str5;
                                                        j24 = j17;
                                                    }
                                                }
                                            }
                                            hashMap = hashMap4;
                                            arrayList2 = arrayList5;
                                            j13 = j24;
                                            str4 = str12;
                                            i11 = i12;
                                        }
                                        cVar2 = cVar;
                                        dVar2 = dVar;
                                        str10 = str5;
                                        z14 = z19;
                                        str9 = str12;
                                        str6 = str2;
                                        hashMap6 = hashMap2;
                                    }
                                }
                            }
                            str8 = str3;
                        }
                        cVar2 = cVar;
                        dVar2 = dVar;
                        hashMap4 = hashMap;
                        arrayList5 = arrayList2;
                        i12 = i11;
                        z14 = z19;
                        str10 = str5;
                        j24 = j13;
                        hashMap6 = hashMap2;
                        str9 = str4;
                        str8 = str3;
                        str6 = str2;
                    }
                    z14 = z19;
                }
            }
        }
        boolean z25 = z14;
        int i23 = i12;
        ArrayList arrayList6 = arrayList5;
        HashMap hashMap8 = hashMap6;
        boolean z26 = false;
        if (bVar != null) {
            arrayList4.add(bVar);
        }
        if (j18 != 0) {
            arrayList = arrayList4;
            z26 = true;
        } else {
            arrayList = arrayList4;
        }
        return new d(i23, str, arrayList6, j27, j18, z25, i13, j19, i14, j28, j29, z13, z15, z26, eVar2, arrayList3, arrayList, fVar2, hashMap8);
    }

    private static boolean q(String str, Pattern pattern, boolean z11) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z11;
    }

    private static double r(String str, Pattern pattern, double d11) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) ak.a.e(matcher.group(1))) : d11;
    }

    private static int s(String str, Pattern pattern, int i11) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) ak.a.e(matcher.group(1))) : i11;
    }

    private static long t(String str, Pattern pattern, long j11) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) ak.a.e(matcher.group(1))) : j11;
    }

    private static String u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) ak.a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : A(str2, map);
    }

    private static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, null, map);
    }

    private static int w(String str, Map<String, String> map) {
        String v11 = v(str, V1, map);
        if (TextUtils.isEmpty(v11)) {
            return 0;
        }
        String[] L0 = k0.L0(v11, ",");
        int i11 = k0.t(L0, "public.accessibility.describes-video") ? 512 : 0;
        if (k0.t(L0, "public.accessibility.transcribes-spoken-dialog")) {
            i11 |= 4096;
        }
        if (k0.t(L0, "public.accessibility.describes-music-and-sound")) {
            i11 |= 1024;
        }
        return k0.t(L0, "public.easy-to-read") ? i11 | PKIFailureInfo.certRevoked : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int x(String str) {
        boolean q11 = q(str, f14018p2, false);
        ?? r02 = q11;
        if (q(str, f14024x2, false)) {
            r02 = (q11 ? 1 : 0) | true;
        }
        return q(str, f14004g2, false) ? r02 | 4 : r02;
    }

    private static d.f y(String str) {
        double r11 = r(str, f14020t, -9.223372036854776E18d);
        long j11 = r11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r11 * 1000000.0d);
        boolean q11 = q(str, f14021w, false);
        double r12 = r(str, f14025y, -9.223372036854776E18d);
        long j12 = r12 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r12 * 1000000.0d);
        double r13 = r(str, f14028z, -9.223372036854776E18d);
        return new d.f(j11, q11, j12, r13 != -9.223372036854776E18d ? (long) (r13 * 1000000.0d) : -9223372036854775807L, q(str, A, false));
    }

    private static String z(String str, Pattern pattern, Map<String, String> map) {
        String v11 = v(str, pattern, map);
        if (v11 != null) {
            return v11;
        }
        String pattern2 = pattern.pattern();
        StringBuilder sb2 = new StringBuilder(String.valueOf(pattern2).length() + 19 + String.valueOf(str).length());
        sb2.append("Couldn't match ");
        sb2.append(pattern2);
        sb2.append(" in ");
        sb2.append(str);
        throw new ParserException(sb2.toString());
    }

    @Override // com.google.android.exoplayer2.upstream.h.a
    /* renamed from: i */
    public lj.d a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (trim.startsWith("#EXT-X-STREAM-INF")) {
                                arrayDeque.add(trim);
                                return o(new a(arrayDeque, bufferedReader), uri.toString());
                            } else if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            } else {
                                arrayDeque.add(trim);
                            }
                        }
                    } else {
                        k0.o(bufferedReader);
                        throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return p(this.f14029a, this.f14030b, new a(arrayDeque, bufferedReader), uri.toString());
            }
            throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
        } finally {
            k0.o(bufferedReader);
        }
    }

    public HlsPlaylistParser(c cVar, d dVar) {
        this.f14029a = cVar;
        this.f14030b = dVar;
    }
}