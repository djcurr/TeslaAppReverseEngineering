package uj;

import ak.k0;
import ak.l0;
import ak.o;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
public final class b extends nj.d {

    /* renamed from: o  reason: collision with root package name */
    private static final Pattern f53475o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f53476p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f53477q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f53478r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f53479s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f53480t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u  reason: collision with root package name */
    private static final C1200b f53481u = new C1200b(30.0f, 1, 1);

    /* renamed from: v  reason: collision with root package name */
    private static final a f53482v = new a(32, 15);

    /* renamed from: n  reason: collision with root package name */
    private final XmlPullParserFactory f53483n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f53484a;

        a(int i11, int i12) {
            this.f53484a = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uj.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C1200b {

        /* renamed from: a  reason: collision with root package name */
        final float f53485a;

        /* renamed from: b  reason: collision with root package name */
        final int f53486b;

        /* renamed from: c  reason: collision with root package name */
        final int f53487c;

        C1200b(float f11, int i11, int i12) {
            this.f53485a = f11;
            this.f53486b = i11;
            this.f53487c = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        final int f53488a;

        /* renamed from: b  reason: collision with root package name */
        final int f53489b;

        c(int i11, int i12) {
            this.f53488a = i11;
            this.f53489b = i12;
        }
    }

    public b() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f53483n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    private static f B(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    private static boolean C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(MessageExtension.FIELD_DATA) || str.equals("information");
    }

    private static a D(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f53480t.matcher(attributeValue);
        if (!matcher.matches()) {
            o.h("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) ak.a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) ak.a.e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Invalid cell resolution ");
            sb2.append(parseInt);
            sb2.append(" ");
            sb2.append(parseInt2);
            throw new SubtitleDecoderException(sb2.toString());
        } catch (NumberFormatException unused) {
            o.h("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
    }

    private static void E(String str, f fVar) {
        Matcher matcher;
        String[] L0 = k0.L0(str, "\\s+");
        if (L0.length == 1) {
            matcher = f53477q.matcher(str);
        } else if (L0.length == 2) {
            matcher = f53477q.matcher(L0[1]);
            o.h("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            int length = L0.length;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Invalid number of entries for fontSize: ");
            sb2.append(length);
            sb2.append(".");
            throw new SubtitleDecoderException(sb2.toString());
        }
        if (matcher.matches()) {
            String str2 = (String) ak.a.e(matcher.group(3));
            str2.hashCode();
            char c11 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    fVar.w(3);
                    break;
                case 1:
                    fVar.w(2);
                    break;
                case 2:
                    fVar.w(1);
                    break;
                default:
                    StringBuilder sb3 = new StringBuilder(str2.length() + 30);
                    sb3.append("Invalid unit for fontSize: '");
                    sb3.append(str2);
                    sb3.append("'.");
                    throw new SubtitleDecoderException(sb3.toString());
            }
            fVar.v(Float.parseFloat((String) ak.a.e(matcher.group(1))));
            return;
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 36);
        sb4.append("Invalid expression for fontSize: '");
        sb4.append(str);
        sb4.append("'.");
        throw new SubtitleDecoderException(sb4.toString());
    }

    private static C1200b F(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f11 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] L0 = k0.L0(attributeValue2, " ");
            if (L0.length == 2) {
                f11 = Integer.parseInt(L0[0]) / Integer.parseInt(L0[1]);
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C1200b c1200b = f53481u;
        int i11 = c1200b.f53486b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = c1200b.f53487c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new C1200b(parseInt * f11, i11, i12);
    }

    private static Map<String, f> G(XmlPullParser xmlPullParser, Map<String, f> map, a aVar, c cVar, Map<String, d> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "style")) {
                String a11 = l0.a(xmlPullParser, "style");
                f K = K(xmlPullParser, new f());
                if (a11 != null) {
                    for (String str : L(a11)) {
                        K.a(map.get(str));
                    }
                }
                String g11 = K.g();
                if (g11 != null) {
                    map.put(g11, K);
                }
            } else if (l0.f(xmlPullParser, "region")) {
                d J = J(xmlPullParser, aVar, cVar);
                if (J != null) {
                    map2.put(J.f53503a, J);
                }
            } else if (l0.f(xmlPullParser, "metadata")) {
                H(xmlPullParser, map3);
            }
        } while (!l0.d(xmlPullParser, "head"));
        return map;
    }

    private static void H(XmlPullParser xmlPullParser, Map<String, String> map) {
        String a11;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "image") && (a11 = l0.a(xmlPullParser, "id")) != null) {
                map.put(a11, xmlPullParser.nextText());
            }
        } while (!l0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static uj.c I(XmlPullParser xmlPullParser, uj.c cVar, Map<String, d> map, C1200b c1200b) {
        long j11;
        long j12;
        char c11;
        int attributeCount = xmlPullParser.getAttributeCount();
        f K = K(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        long j15 = -9223372036854775807L;
        String[] strArr = null;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c11 = 5;
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
                    if (map.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j15 = M(attributeValue, c1200b);
                    break;
                case 2:
                    j14 = M(attributeValue, c1200b);
                    break;
                case 3:
                    j13 = M(attributeValue, c1200b);
                    break;
                case 4:
                    String[] L = L(attributeValue);
                    if (L.length > 0) {
                        strArr = L;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j16 = cVar.f53493d;
            j11 = -9223372036854775807L;
            if (j16 != -9223372036854775807L) {
                if (j13 != -9223372036854775807L) {
                    j13 += j16;
                }
                if (j14 != -9223372036854775807L) {
                    j14 += j16;
                }
            }
        } else {
            j11 = -9223372036854775807L;
        }
        long j17 = j13;
        if (j14 == j11) {
            if (j15 != j11) {
                j12 = j17 + j15;
            } else if (cVar != null) {
                long j18 = cVar.f53494e;
                if (j18 != j11) {
                    j12 = j18;
                }
            }
            return uj.c.c(xmlPullParser.getName(), j17, j12, K, strArr, str2, str, cVar);
        }
        j12 = j14;
        return uj.c.c(xmlPullParser.getName(), j17, j12, K, strArr, str2, str, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ab, code lost:
        if (r0.equals("tb") == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static uj.d J(org.xmlpull.v1.XmlPullParser r17, uj.b.a r18, uj.b.c r19) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uj.b.J(org.xmlpull.v1.XmlPullParser, uj.b$a, uj.b$c):uj.d");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02a4, code lost:
        if (r3.equals("start") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019b, code lost:
        if (r3.equals(org.spongycastle.i18n.TextBundle.TEXT_ENTRY) == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static uj.f K(org.xmlpull.v1.XmlPullParser r12, uj.f r13) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uj.b.K(org.xmlpull.v1.XmlPullParser, uj.f):uj.f");
    }

    private static String[] L(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : k0.L0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long M(java.lang.String r13, uj.b.C1200b r14) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uj.b.M(java.lang.String, uj.b$b):long");
    }

    private static c N(XmlPullParser xmlPullParser) {
        String a11 = l0.a(xmlPullParser, "extent");
        if (a11 == null) {
            return null;
        }
        Matcher matcher = f53479s.matcher(a11);
        if (!matcher.matches()) {
            o.h("TtmlDecoder", a11.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(a11) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new c(Integer.parseInt((String) ak.a.e(matcher.group(1))), Integer.parseInt((String) ak.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            o.h("TtmlDecoder", a11.length() != 0 ? "Ignoring malformed tts extent: ".concat(a11) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // nj.d
    protected nj.f A(byte[] bArr, int i11, boolean z11) {
        C1200b c1200b;
        try {
            XmlPullParser newPullParser = this.f53483n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new d(""));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C1200b c1200b2 = f53481u;
            a aVar = f53482v;
            int i12 = 0;
            g gVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                uj.c cVar2 = (uj.c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c1200b2 = F(newPullParser);
                            aVar = D(newPullParser, f53482v);
                            cVar = N(newPullParser);
                        }
                        c cVar3 = cVar;
                        C1200b c1200b3 = c1200b2;
                        a aVar2 = aVar;
                        if (!C(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            o.f("TtmlDecoder", valueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(valueOf) : new String("Ignoring unsupported tag: "));
                            i12++;
                            c1200b2 = c1200b3;
                        } else {
                            if ("head".equals(name)) {
                                c1200b = c1200b3;
                                G(newPullParser, hashMap, aVar2, cVar3, hashMap2, hashMap3);
                            } else {
                                c1200b = c1200b3;
                                try {
                                    uj.c I = I(newPullParser, cVar2, hashMap2, c1200b);
                                    arrayDeque.push(I);
                                    if (cVar2 != null) {
                                        cVar2.a(I);
                                    }
                                } catch (SubtitleDecoderException e11) {
                                    o.i("TtmlDecoder", "Suppressing parser error", e11);
                                    i12++;
                                }
                            }
                            c1200b2 = c1200b;
                        }
                        cVar = cVar3;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((uj.c) ak.a.e(cVar2)).a(uj.c.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            gVar = new g((uj.c) ak.a.e((uj.c) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                newPullParser.next();
            }
            if (gVar != null) {
                return gVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        } catch (XmlPullParserException e13) {
            throw new SubtitleDecoderException("Unable to decode source", e13);
        }
    }
}