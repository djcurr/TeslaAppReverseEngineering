package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import ak.k0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.a;
import com.google.android.exoplayer2.upstream.h;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.spongycastle.i18n.TextBundle;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import qi.l;
import qi.p;

/* loaded from: classes3.dex */
public class SsManifestParser implements h.a<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f14272a;

    /* loaded from: classes3.dex */
    public static class MissingFieldException extends ParserException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public MissingFieldException(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "Missing required field: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.MissingFieldException.<init>(java.lang.String):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f14273a;

        /* renamed from: b  reason: collision with root package name */
        private final String f14274b;

        /* renamed from: c  reason: collision with root package name */
        private final a f14275c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Pair<String, Object>> f14276d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f14275c = aVar;
            this.f14273a = str;
            this.f14274b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new c(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new b(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new e(aVar, str2);
            }
            return null;
        }

        protected void a(Object obj) {
        }

        protected abstract Object b();

        protected final Object c(String str) {
            for (int i11 = 0; i11 < this.f14276d.size(); i11++) {
                Pair<String, Object> pair = this.f14276d.get(i11);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f14275c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        protected boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f14274b.equals(name)) {
                        n(xmlPullParser);
                        z11 = true;
                    } else if (z11) {
                        if (i11 > 0) {
                            i11++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e11 = e(this, name, this.f14273a);
                            if (e11 == null) {
                                i11 = 1;
                            } else {
                                a(e11.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z11 && i11 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z11) {
                    continue;
                } else if (i11 > 0) {
                    i11--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        protected final boolean g(XmlPullParser xmlPullParser, String str, boolean z11) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z11;
        }

        protected void h(XmlPullParser xmlPullParser) {
        }

        protected final int i(XmlPullParser xmlPullParser, String str, int i11) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e11) {
                    throw new ParserException(e11);
                }
            }
            return i11;
        }

        protected final long j(XmlPullParser xmlPullParser, String str, long j11) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e11) {
                    throw new ParserException(e11);
                }
            }
            return j11;
        }

        protected final int k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e11) {
                    throw new ParserException(e11);
                }
            }
            throw new MissingFieldException(str);
        }

        protected final long l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e11) {
                    throw new ParserException(e11);
                }
            }
            throw new MissingFieldException(str);
        }

        protected final String m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        protected abstract void n(XmlPullParser xmlPullParser);

        protected void o(XmlPullParser xmlPullParser) {
        }

        protected final void p(String str, Object obj) {
            this.f14276d.add(Pair.create(str, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b extends a {

        /* renamed from: e  reason: collision with root package name */
        private boolean f14277e;

        /* renamed from: f  reason: collision with root package name */
        private UUID f14278f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f14279g;

        public b(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static p[] q(byte[] bArr) {
            return new p[]{new p(true, null, 8, r(bArr), 0, 0, null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < bArr.length; i11 += 2) {
                sb2.append((char) bArr[i11]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i11, int i12) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[i12];
            bArr[i12] = b11;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            UUID uuid = this.f14278f;
            return new a.C0255a(uuid, l.a(uuid, this.f14279g), q(this.f14279g));
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f14277e = false;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f14277e = true;
                this.f14278f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f14277e) {
                this.f14279g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends a {

        /* renamed from: e  reason: collision with root package name */
        private i f14280e;

        public c(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] I = k0.I(str);
                byte[][] i11 = ak.c.i(I);
                if (i11 == null) {
                    arrayList.add(I);
                } else {
                    Collections.addAll(arrayList, i11);
                }
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            return this.f14280e;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            i.b bVar = new i.b();
            String r11 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.K("video/mp4").j0(k(xmlPullParser, "MaxWidth")).Q(k(xmlPullParser, "MaxHeight")).T(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r11 == null) {
                    r11 = "audio/mp4a-latm";
                }
                int k11 = k(xmlPullParser, "Channels");
                int k12 = k(xmlPullParser, "SamplingRate");
                List<byte[]> q11 = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q11.isEmpty() && "audio/mp4a-latm".equals(r11)) {
                    q11 = Collections.singletonList(ei.a.a(k12, k11));
                }
                bVar.K("audio/mp4").H(k11).f0(k12).T(q11);
            } else if (intValue == 3) {
                int i11 = 0;
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i11 = 64;
                    } else if (str.equals("DESC")) {
                        i11 = 1024;
                    }
                }
                bVar.K("application/mp4").c0(i11);
            } else {
                bVar.K("application/mp4");
            }
            this.f14280e = bVar.S(xmlPullParser.getAttributeValue(null, "Index")).U((String) c("Name")).e0(r11).G(k(xmlPullParser, "Bitrate")).V((String) c("Language")).E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class d extends a {

        /* renamed from: e  reason: collision with root package name */
        private final List<a.b> f14281e;

        /* renamed from: f  reason: collision with root package name */
        private int f14282f;

        /* renamed from: g  reason: collision with root package name */
        private int f14283g;

        /* renamed from: h  reason: collision with root package name */
        private long f14284h;

        /* renamed from: i  reason: collision with root package name */
        private long f14285i;

        /* renamed from: j  reason: collision with root package name */
        private long f14286j;

        /* renamed from: k  reason: collision with root package name */
        private int f14287k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f14288l;

        /* renamed from: m  reason: collision with root package name */
        private a.C0255a f14289m;

        public d(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f14287k = -1;
            this.f14289m = null;
            this.f14281e = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f14281e.add((a.b) obj);
            } else if (obj instanceof a.C0255a) {
                ak.a.f(this.f14289m == null);
                this.f14289m = (a.C0255a) obj;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            int size = this.f14281e.size();
            a.b[] bVarArr = new a.b[size];
            this.f14281e.toArray(bVarArr);
            if (this.f14289m != null) {
                a.C0255a c0255a = this.f14289m;
                com.google.android.exoplayer2.drm.e eVar = new com.google.android.exoplayer2.drm.e(new e.b(c0255a.f14312a, "video/mp4", c0255a.f14313b));
                for (int i11 = 0; i11 < size; i11++) {
                    a.b bVar = bVarArr[i11];
                    int i12 = bVar.f14315a;
                    if (i12 == 2 || i12 == 1) {
                        i[] iVarArr = bVar.f14324j;
                        for (int i13 = 0; i13 < iVarArr.length; i13++) {
                            iVarArr[i13] = iVarArr[i13].a().L(eVar).E();
                        }
                    }
                }
            }
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a(this.f14282f, this.f14283g, this.f14284h, this.f14285i, this.f14286j, this.f14287k, this.f14288l, this.f14289m, bVarArr);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            this.f14282f = k(xmlPullParser, "MajorVersion");
            this.f14283g = k(xmlPullParser, "MinorVersion");
            this.f14284h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f14285i = l(xmlPullParser, "Duration");
            this.f14286j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f14287k = i(xmlPullParser, "LookaheadCount", -1);
            this.f14288l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f14284h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class e extends a {

        /* renamed from: e  reason: collision with root package name */
        private final String f14290e;

        /* renamed from: f  reason: collision with root package name */
        private final List<i> f14291f;

        /* renamed from: g  reason: collision with root package name */
        private int f14292g;

        /* renamed from: h  reason: collision with root package name */
        private String f14293h;

        /* renamed from: i  reason: collision with root package name */
        private long f14294i;

        /* renamed from: j  reason: collision with root package name */
        private String f14295j;

        /* renamed from: k  reason: collision with root package name */
        private String f14296k;

        /* renamed from: l  reason: collision with root package name */
        private int f14297l;

        /* renamed from: m  reason: collision with root package name */
        private int f14298m;

        /* renamed from: n  reason: collision with root package name */
        private int f14299n;

        /* renamed from: o  reason: collision with root package name */
        private int f14300o;

        /* renamed from: p  reason: collision with root package name */
        private String f14301p;

        /* renamed from: q  reason: collision with root package name */
        private ArrayList<Long> f14302q;

        /* renamed from: r  reason: collision with root package name */
        private long f14303r;

        public e(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f14290e = str;
            this.f14291f = new LinkedList();
        }

        private void q(XmlPullParser xmlPullParser) {
            int s11 = s(xmlPullParser);
            this.f14292g = s11;
            p("Type", Integer.valueOf(s11));
            if (this.f14292g == 3) {
                this.f14293h = m(xmlPullParser, "Subtype");
            } else {
                this.f14293h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.f14293h);
            this.f14295j = xmlPullParser.getAttributeValue(null, "Name");
            this.f14296k = m(xmlPullParser, "Url");
            this.f14297l = i(xmlPullParser, "MaxWidth", -1);
            this.f14298m = i(xmlPullParser, "MaxHeight", -1);
            this.f14299n = i(xmlPullParser, "DisplayWidth", -1);
            this.f14300o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Language");
            this.f14301p = attributeValue;
            p("Language", attributeValue);
            long i11 = i(xmlPullParser, "TimeScale", -1);
            this.f14294i = i11;
            if (i11 == -1) {
                this.f14294i = ((Long) c("TimeScale")).longValue();
            }
            this.f14302q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) {
            int size = this.f14302q.size();
            long j11 = j(xmlPullParser, "t", -9223372036854775807L);
            int i11 = 1;
            if (j11 == -9223372036854775807L) {
                if (size == 0) {
                    j11 = 0;
                } else if (this.f14303r != -1) {
                    j11 = this.f14303r + this.f14302q.get(size - 1).longValue();
                } else {
                    throw new ParserException("Unable to infer start time");
                }
            }
            this.f14302q.add(Long.valueOf(j11));
            this.f14303r = j(xmlPullParser, "d", -9223372036854775807L);
            long j12 = j(xmlPullParser, "r", 1L);
            if (j12 > 1 && this.f14303r == -9223372036854775807L) {
                throw new ParserException("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j13 = i11;
                if (j13 >= j12) {
                    return;
                }
                this.f14302q.add(Long.valueOf((this.f14303r * j13) + j11));
                i11++;
            }
        }

        private int s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if (MediaStreamTrack.AUDIO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                    return 1;
                }
                if (MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if (TextBundle.TEXT_ENTRY.equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                StringBuilder sb2 = new StringBuilder(attributeValue.length() + 19);
                sb2.append("Invalid key value[");
                sb2.append(attributeValue);
                sb2.append("]");
                throw new ParserException(sb2.toString());
            }
            throw new MissingFieldException("Type");
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof i) {
                this.f14291f.add((i) obj);
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            i[] iVarArr = new i[this.f14291f.size()];
            this.f14291f.toArray(iVarArr);
            return new a.b(this.f14290e, this.f14296k, this.f14292g, this.f14293h, this.f14294i, this.f14295j, this.f14297l, this.f14298m, this.f14299n, this.f14300o, this.f14301p, iVarArr, this.f14302q, this.f14303r);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return cg.c.f9084i.equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            if (cg.c.f9084i.equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public SsManifestParser() {
        try {
            this.f14272a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.h.a
    /* renamed from: b */
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f14272a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (com.google.android.exoplayer2.source.smoothstreaming.manifest.a) new d(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e11) {
            throw new ParserException(e11);
        }
    }
}