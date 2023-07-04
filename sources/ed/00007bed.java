package jj;

import ak.i0;
import ak.k0;
import ak.l0;
import ak.o;
import ak.r;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.upstream.h;
import com.stripe.android.model.AlipayAuthResult;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jj.j;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import org.spongycastle.i18n.TextBundle;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes3.dex */
public class c extends DefaultHandler implements h.a<b> {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f33814b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f33815c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f33816d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f33817e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f33818a;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ci.i f33819a;

        /* renamed from: b  reason: collision with root package name */
        public final String f33820b;

        /* renamed from: c  reason: collision with root package name */
        public final j f33821c;

        /* renamed from: d  reason: collision with root package name */
        public final String f33822d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<e.b> f33823e;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList<d> f33824f;

        /* renamed from: g  reason: collision with root package name */
        public final long f33825g;

        public a(ci.i iVar, String str, j jVar, String str2, ArrayList<e.b> arrayList, ArrayList<d> arrayList2, long j11) {
            this.f33819a = iVar;
            this.f33820b = str;
            this.f33821c = jVar;
            this.f33822d = str2;
            this.f33823e = arrayList;
            this.f33824f = arrayList2;
            this.f33825g = j11;
        }
    }

    public c() {
        try {
            this.f33818a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    protected static int B(List<d> list) {
        String str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = list.get(i11);
            if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f33826a) && (str = dVar.f33827b) != null) {
                Matcher matcher = f33815c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String valueOf = String.valueOf(dVar.f33827b);
                o.h("MpdParser", valueOf.length() != 0 ? "Unable to parse CEA-608 channel number from: ".concat(valueOf) : new String("Unable to parse CEA-608 channel number from: "));
            }
        }
        return -1;
    }

    protected static int C(List<d> list) {
        String str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = list.get(i11);
            if ("urn:scte:dash:cc:cea-708:2015".equals(dVar.f33826a) && (str = dVar.f33827b) != null) {
                Matcher matcher = f33816d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String valueOf = String.valueOf(dVar.f33827b);
                o.h("MpdParser", valueOf.length() != 0 ? "Unable to parse CEA-708 service block number from: ".concat(valueOf) : new String("Unable to parse CEA-708 service block number from: "));
            }
        }
        return -1;
    }

    protected static long G(XmlPullParser xmlPullParser, String str, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j11 : k0.D0(attributeValue);
    }

    protected static d H(XmlPullParser xmlPullParser, String str) {
        String l02 = l0(xmlPullParser, "schemeIdUri", "");
        String l03 = l0(xmlPullParser, "value", null);
        String l04 = l0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!l0.d(xmlPullParser, str));
        return new d(l02, l03, l04);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected static int I(XmlPullParser xmlPullParser) {
        char c11;
        String R0 = k0.R0(xmlPullParser.getAttributeValue(null, "value"));
        if (R0 == null) {
            return -1;
        }
        switch (R0.hashCode()) {
            case 1596796:
                if (R0.equals(AlipayAuthResult.RESULT_CODE_FAILED)) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 2937391:
                if (R0.equals("a000")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 3094035:
                if (R0.equals("f801")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 3133436:
                if (R0.equals("fa01")) {
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
                return 1;
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return -1;
        }
    }

    protected static long J(XmlPullParser xmlPullParser, String str, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j11 : k0.E0(attributeValue);
    }

    protected static String K(List<d> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = list.get(i11);
            String str = dVar.f33826a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(dVar.f33827b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(dVar.f33827b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float O(XmlPullParser xmlPullParser, String str, float f11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f11 : Float.parseFloat(attributeValue);
    }

    protected static float P(XmlPullParser xmlPullParser, float f11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f33814b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                return !TextUtils.isEmpty(group) ? parseInt / Integer.parseInt(group) : parseInt;
            }
            return f11;
        }
        return f11;
    }

    protected static int R(XmlPullParser xmlPullParser, String str, int i11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i11 : Integer.parseInt(attributeValue);
    }

    protected static long T(List<d> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = list.get(i11);
            if ("http://dashif.org/guidelines/last-segment-number".equalsIgnoreCase(dVar.f33826a)) {
                return Long.parseLong(dVar.f33827b);
            }
        }
        return -1L;
    }

    protected static long U(XmlPullParser xmlPullParser, String str, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j11 : Long.parseLong(attributeValue);
    }

    protected static int W(XmlPullParser xmlPullParser) {
        int R = R(xmlPullParser, "value", -1);
        if (R >= 0) {
            int[] iArr = f33817e;
            if (R < iArr.length) {
                return iArr[R];
            }
            return -1;
        }
        return -1;
    }

    private long b(List<j.d> list, long j11, long j12, int i11, long j13) {
        int m11 = i11 >= 0 ? i11 + 1 : (int) k0.m(j13 - j11, j12);
        for (int i12 = 0; i12 < m11; i12++) {
            list.add(m(j11, j12));
            j11 += j12;
        }
        return j11;
    }

    protected static String l0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    protected static String m0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                u(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, str));
        return str2;
    }

    private static int p(int i11, int i12) {
        if (i11 == -1) {
            return i12;
        }
        if (i12 == -1) {
            return i11;
        }
        ak.a.f(i11 == i12);
        return i11;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        ak.a.f(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<e.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e.b bVar = arrayList.get(size);
            if (!bVar.c()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i11).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
    }

    private static long s(long j11, long j12) {
        if (j12 != -9223372036854775807L) {
            j11 = j12;
        }
        if (j11 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j11;
    }

    private static String t(String str, String str2) {
        if (r.p(str)) {
            return r.c(str2);
        }
        if (r.s(str)) {
            return r.o(str2);
        }
        if (r.r(str)) {
            return "application/x-rawcc".equals(str) ? r.j(str2) : str;
        } else if ("application/mp4".equals(str)) {
            String g11 = r.g(str2);
            return "text/vtt".equals(g11) ? "application/x-mp4-vtt" : g11;
        } else {
            return null;
        }
    }

    public static void u(XmlPullParser xmlPullParser) {
        if (l0.e(xmlPullParser)) {
            int i11 = 1;
            while (i11 != 0) {
                xmlPullParser.next();
                if (l0.e(xmlPullParser)) {
                    i11++;
                } else if (l0.c(xmlPullParser)) {
                    i11--;
                }
            }
        }
    }

    protected String A(XmlPullParser xmlPullParser, String str) {
        return i0.c(str, m0(xmlPullParser, "BaseURL"));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.e.b> D(org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.c.D(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    protected int E(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, CMSAttributeTableGenerator.CONTENT_TYPE);
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        return TextBundle.TEXT_ENTRY.equals(attributeValue) ? 3 : -1;
    }

    protected int F(String str) {
        if (str == null) {
            return 0;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c11 = 3;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c11 = 4;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c11 = 5;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c11 = 6;
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c11 = 7;
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c11 = '\n';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 3:
                return 2;
            case 4:
                return 16;
            case 5:
                return 1;
            case 6:
                return 256;
            case 7:
                return 64;
            case '\b':
                return 8;
            case '\t':
                return 32;
            case '\n':
                return 4;
            default:
                return 0;
        }
    }

    protected Pair<Long, yi.a> L(XmlPullParser xmlPullParser, String str, String str2, long j11, ByteArrayOutputStream byteArrayOutputStream) {
        long U = U(xmlPullParser, "id", 0L);
        long U2 = U(xmlPullParser, "duration", -9223372036854775807L);
        long U3 = U(xmlPullParser, "presentationTime", 0L);
        long I0 = k0.I0(U2, 1000L, j11);
        long I02 = k0.I0(U3, 1000000L, j11);
        String l02 = l0(xmlPullParser, "messageData", null);
        byte[] M = M(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(I02);
        if (l02 != null) {
            M = k0.l0(l02);
        }
        return Pair.create(valueOf, d(str, str2, U, I0, M));
    }

    protected byte[] M(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, com.google.common.base.f.f15920c.name());
        xmlPullParser.nextToken();
        while (!l0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i11 = 0; i11 < xmlPullParser.getAttributeCount(); i11++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i11), xmlPullParser.getAttributeName(i11), xmlPullParser.getAttributeValue(i11));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected e N(XmlPullParser xmlPullParser) {
        String l02 = l0(xmlPullParser, "schemeIdUri", "");
        String l03 = l0(xmlPullParser, "value", "");
        long U = U(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Event")) {
                arrayList.add(L(xmlPullParser, l02, l03, U, byteArrayOutputStream));
            } else {
                u(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        yi.a[] aVarArr = new yi.a[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Pair pair = (Pair) arrayList.get(i11);
            jArr[i11] = ((Long) pair.first).longValue();
            aVarArr[i11] = (yi.a) pair.second;
        }
        return e(l02, l03, U, jArr, aVarArr);
    }

    protected h Q(XmlPullParser xmlPullParser) {
        return Z(xmlPullParser, "sourceURL", "range");
    }

    protected String S(XmlPullParser xmlPullParser) {
        return m0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected jj.b V(org.xmlpull.v1.XmlPullParser r43, java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.c.V(org.xmlpull.v1.XmlPullParser, java.lang.String):jj.b");
    }

    protected Pair<f, Long> X(XmlPullParser xmlPullParser, String str, long j11, long j12, long j13, long j14) {
        long j15;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        long j16;
        j g02;
        c cVar = this;
        Object obj2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long J = J(xmlPullParser, "start", j11);
        long j17 = -9223372036854775807L;
        long j18 = j13 != -9223372036854775807L ? j13 + J : -9223372036854775807L;
        long J2 = J(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String str3 = str;
        long j19 = j12;
        boolean z11 = false;
        long j21 = -9223372036854775807L;
        j.e eVar = null;
        d dVar = null;
        while (true) {
            xmlPullParser.next();
            if (!l0.f(xmlPullParser, "BaseURL")) {
                if (l0.f(xmlPullParser, "AdaptationSet")) {
                    j15 = j19;
                    str2 = str3;
                    arrayList = arrayList3;
                    arrayList.add(w(xmlPullParser, str3, eVar, J2, j19, j21, j18, j14));
                    arrayList2 = arrayList4;
                } else {
                    j15 = j19;
                    ArrayList arrayList5 = arrayList4;
                    str2 = str3;
                    arrayList = arrayList3;
                    if (l0.f(xmlPullParser, "EventStream")) {
                        arrayList5.add(N(xmlPullParser));
                        arrayList2 = arrayList5;
                    } else if (l0.f(xmlPullParser, "SegmentBase")) {
                        arrayList2 = arrayList5;
                        eVar = e0(xmlPullParser, null);
                        obj = null;
                        j19 = j15;
                        str3 = str2;
                        j16 = -9223372036854775807L;
                    } else {
                        arrayList2 = arrayList5;
                        if (l0.f(xmlPullParser, "SegmentList")) {
                            long z12 = z(xmlPullParser, -9223372036854775807L);
                            obj = null;
                            g02 = f0(xmlPullParser, null, j18, J2, j15, z12, j14);
                            j21 = z12;
                            j19 = j15;
                            str3 = str2;
                            j16 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (l0.f(xmlPullParser, "SegmentTemplate")) {
                                long z13 = z(xmlPullParser, -9223372036854775807L);
                                j16 = -9223372036854775807L;
                                g02 = g0(xmlPullParser, null, com.google.common.collect.r.r(), j18, J2, j15, z13, j14);
                                j21 = z13;
                                j19 = j15;
                                str3 = str2;
                            } else {
                                j16 = -9223372036854775807L;
                                if (l0.f(xmlPullParser, "AssetIdentifier")) {
                                    dVar = H(xmlPullParser, "AssetIdentifier");
                                } else {
                                    u(xmlPullParser);
                                }
                                j19 = j15;
                                str3 = str2;
                            }
                        }
                        eVar = g02;
                    }
                }
                obj = null;
                j16 = -9223372036854775807L;
                j19 = j15;
                str3 = str2;
            } else if (z11) {
                j15 = j19;
                arrayList2 = arrayList4;
                str2 = str3;
                j16 = j17;
                obj = obj2;
                arrayList = arrayList3;
                j19 = j15;
                str3 = str2;
            } else {
                j19 = cVar.z(xmlPullParser, j19);
                str3 = cVar.A(xmlPullParser, str3);
                z11 = true;
                arrayList2 = arrayList4;
                j16 = j17;
                obj = obj2;
                arrayList = arrayList3;
            }
            if (l0.d(xmlPullParser, "Period")) {
                return Pair.create(h(attributeValue, J, arrayList, arrayList2, dVar), Long.valueOf(J2));
            }
            arrayList3 = arrayList;
            obj2 = obj;
            arrayList4 = arrayList2;
            j17 = j16;
            cVar = this;
        }
    }

    protected g Y(XmlPullParser xmlPullParser) {
        String str = null;
        String l02 = l0(xmlPullParser, "moreInformationURL", null);
        String l03 = l0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (l0.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (l0.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                u(xmlPullParser);
            }
            String str4 = str3;
            if (l0.d(xmlPullParser, "ProgramInformation")) {
                return new g(str, str2, str4, l02, l03);
            }
            str3 = str4;
        }
    }

    protected h Z(XmlPullParser xmlPullParser, String str, String str2) {
        long j11;
        long j12;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j11 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j12 = (Long.parseLong(split[1]) - j11) + 1;
                return i(attributeValue, j11, j12);
            }
        } else {
            j11 = 0;
        }
        j12 = -1;
        return i(attributeValue, j11, j12);
    }

    protected a a0(XmlPullParser xmlPullParser, String str, String str2, String str3, int i11, int i12, float f11, int i13, int i14, String str4, List<d> list, List<d> list2, List<d> list3, List<d> list4, j jVar, long j11, long j12, long j13, long j14, long j15) {
        long j16;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i15;
        long z11;
        j.e eVar;
        c cVar = this;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int R = R(xmlPullParser, "bandwidth", -1);
        String l02 = l0(xmlPullParser, "mimeType", str2);
        String l03 = l0(xmlPullParser, "codecs", str3);
        int R2 = R(xmlPullParser, Snapshot.WIDTH, i11);
        int R3 = R(xmlPullParser, Snapshot.HEIGHT, i12);
        float P = P(xmlPullParser, f11);
        int R4 = R(xmlPullParser, "audioSamplingRate", i14);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList(list3);
        ArrayList arrayList10 = new ArrayList(list4);
        String str6 = str;
        int i16 = i13;
        long j17 = j13;
        String str7 = null;
        boolean z12 = false;
        j jVar2 = jVar;
        long j18 = j14;
        while (true) {
            xmlPullParser.next();
            if (!l0.f(xmlPullParser, "BaseURL")) {
                if (l0.f(xmlPullParser, "AudioChannelConfiguration")) {
                    eVar = jVar2;
                    str5 = str6;
                    arrayList4 = arrayList7;
                    i15 = y(xmlPullParser);
                } else if (l0.f(xmlPullParser, "SegmentBase")) {
                    j.e e02 = cVar.e0(xmlPullParser, (j.e) jVar2);
                    str5 = str6;
                    arrayList4 = arrayList7;
                    i15 = i16;
                    eVar = e02;
                } else {
                    if (l0.f(xmlPullParser, "SegmentList")) {
                        z11 = cVar.z(xmlPullParser, j18);
                        j16 = j17;
                        str5 = str6;
                        arrayList = arrayList10;
                        arrayList2 = arrayList8;
                        arrayList3 = arrayList9;
                        jVar2 = f0(xmlPullParser, (j.b) jVar2, j11, j12, j16, z11, j15);
                        arrayList4 = arrayList7;
                    } else {
                        j16 = j17;
                        str5 = str6;
                        arrayList = arrayList10;
                        arrayList2 = arrayList8;
                        arrayList3 = arrayList9;
                        if (l0.f(xmlPullParser, "SegmentTemplate")) {
                            z11 = cVar.z(xmlPullParser, j18);
                            arrayList4 = arrayList7;
                            jVar2 = g0(xmlPullParser, (j.c) jVar2, list4, j11, j12, j16, z11, j15);
                        } else {
                            arrayList4 = arrayList7;
                            if (l0.f(xmlPullParser, "ContentProtection")) {
                                Pair<String, e.b> D = D(xmlPullParser);
                                Object obj = D.first;
                                if (obj != null) {
                                    str7 = (String) obj;
                                }
                                Object obj2 = D.second;
                                if (obj2 != null) {
                                    arrayList4.add((e.b) obj2);
                                }
                                i15 = i16;
                                j17 = j16;
                                arrayList6 = arrayList;
                                arrayList5 = arrayList2;
                                arrayList9 = arrayList3;
                                eVar = jVar2;
                            } else {
                                if (l0.f(xmlPullParser, "InbandEventStream")) {
                                    arrayList5 = arrayList2;
                                    arrayList5.add(H(xmlPullParser, "InbandEventStream"));
                                    arrayList6 = arrayList;
                                    arrayList9 = arrayList3;
                                } else {
                                    arrayList5 = arrayList2;
                                    if (l0.f(xmlPullParser, "EssentialProperty")) {
                                        arrayList9 = arrayList3;
                                        arrayList9.add(H(xmlPullParser, "EssentialProperty"));
                                        arrayList6 = arrayList;
                                    } else {
                                        arrayList9 = arrayList3;
                                        if (l0.f(xmlPullParser, "SupplementalProperty")) {
                                            arrayList6 = arrayList;
                                            arrayList6.add(H(xmlPullParser, "SupplementalProperty"));
                                        } else {
                                            arrayList6 = arrayList;
                                            u(xmlPullParser);
                                        }
                                    }
                                }
                                i15 = i16;
                                j17 = j16;
                                eVar = jVar2;
                            }
                        }
                    }
                    i15 = i16;
                    j18 = z11;
                    j17 = j16;
                    arrayList6 = arrayList;
                    arrayList5 = arrayList2;
                    arrayList9 = arrayList3;
                    eVar = jVar2;
                }
                arrayList5 = arrayList8;
                arrayList6 = arrayList10;
            } else if (z12) {
                j16 = j17;
                str5 = str6;
                arrayList4 = arrayList7;
                arrayList5 = arrayList8;
                arrayList6 = arrayList10;
                i15 = i16;
                j17 = j16;
                eVar = jVar2;
            } else {
                long z13 = cVar.z(xmlPullParser, j17);
                str5 = cVar.A(xmlPullParser, str6);
                z12 = true;
                arrayList4 = arrayList7;
                i15 = i16;
                eVar = jVar2;
                j17 = z13;
                arrayList5 = arrayList8;
                arrayList6 = arrayList10;
            }
            if (l0.d(xmlPullParser, "Representation")) {
                break;
            }
            arrayList10 = arrayList6;
            arrayList8 = arrayList5;
            arrayList7 = arrayList4;
            jVar2 = eVar;
            cVar = this;
            i16 = i15;
            str6 = str5;
        }
        ArrayList arrayList11 = arrayList5;
        ci.i f12 = f(attributeValue, l02, R2, R3, P, i15, R4, R, str4, list, list2, l03, arrayList9, arrayList6);
        if (eVar == null) {
            eVar = new j.e();
        }
        return new a(f12, str5, eVar, str7, arrayList4, arrayList11, -1L);
    }

    protected int b0(List<d> list) {
        int n02;
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            d dVar = list.get(i12);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(dVar.f33826a)) {
                n02 = F(dVar.f33827b);
            } else if ("urn:tva:metadata:cs:AudioPurposeCS:2007".equalsIgnoreCase(dVar.f33826a)) {
                n02 = n0(dVar.f33827b);
            }
            i11 |= n02;
        }
        return i11;
    }

    protected jj.a c(int i11, int i12, List<i> list, List<d> list2, List<d> list3, List<d> list4) {
        return new jj.a(i11, i12, list, list2, list3, list4);
    }

    protected int c0(List<d> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            if ("http://dashif.org/guidelines/trickmode".equalsIgnoreCase(list.get(i12).f33826a)) {
                i11 |= 16384;
            }
        }
        return i11;
    }

    protected yi.a d(String str, String str2, long j11, long j12, byte[] bArr) {
        return new yi.a(str, str2, j12, j11, bArr);
    }

    protected int d0(List<d> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            d dVar = list.get(i12);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(dVar.f33826a)) {
                i11 |= F(dVar.f33827b);
            }
        }
        return i11;
    }

    protected e e(String str, String str2, long j11, long[] jArr, yi.a[] aVarArr) {
        return new e(str, str2, j11, jArr, aVarArr);
    }

    protected j.e e0(XmlPullParser xmlPullParser, j.e eVar) {
        long j11;
        long j12;
        long U = U(xmlPullParser, "timescale", eVar != null ? eVar.f33856b : 1L);
        long U2 = U(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f33857c : 0L);
        long j13 = eVar != null ? eVar.f33870d : 0L;
        long j14 = eVar != null ? eVar.f33871e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j11 = (Long.parseLong(split[1]) - parseLong) + 1;
            j12 = parseLong;
        } else {
            j11 = j14;
            j12 = j13;
        }
        h hVar = eVar != null ? eVar.f33855a : null;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Initialization")) {
                hVar = Q(xmlPullParser);
            } else {
                u(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, "SegmentBase"));
        return n(hVar, U, U2, j12, j11);
    }

    protected ci.i f(String str, String str2, int i11, int i12, float f11, int i13, int i14, int i15, String str3, List<d> list, List<d> list2, String str4, List<d> list3, List<d> list4) {
        String t11 = t(str2, str4);
        if ("audio/eac3".equals(t11)) {
            t11 = K(list4);
        }
        int j02 = j0(list);
        i.b V = new i.b().S(str).K(str2).e0(t11).I(str4).Z(i15).g0(j02).c0(d0(list) | b0(list2) | c0(list3) | c0(list4)).V(str3);
        if (r.s(t11)) {
            V.j0(i11).Q(i12).P(f11);
        } else if (r.p(t11)) {
            V.H(i13).f0(i14);
        } else if (r.r(t11)) {
            int i16 = -1;
            if ("application/cea-608".equals(t11)) {
                i16 = B(list2);
            } else if ("application/cea-708".equals(t11)) {
                i16 = C(list2);
            }
            V.F(i16);
        }
        return V.E();
    }

    protected j.b f0(XmlPullParser xmlPullParser, j.b bVar, long j11, long j12, long j13, long j14, long j15) {
        long U = U(xmlPullParser, "timescale", bVar != null ? bVar.f33856b : 1L);
        long U2 = U(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f33857c : 0L);
        long U3 = U(xmlPullParser, "duration", bVar != null ? bVar.f33859e : -9223372036854775807L);
        long U4 = U(xmlPullParser, "startNumber", bVar != null ? bVar.f33858d : 1L);
        long s11 = s(j13, j14);
        List<j.d> list = null;
        List<h> list2 = null;
        h hVar = null;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Initialization")) {
                hVar = Q(xmlPullParser);
            } else if (l0.f(xmlPullParser, "SegmentTimeline")) {
                list = h0(xmlPullParser, U, j12);
            } else if (l0.f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(i0(xmlPullParser));
            } else {
                u(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (hVar == null) {
                hVar = bVar.f33855a;
            }
            if (list == null) {
                list = bVar.f33860f;
            }
            if (list2 == null) {
                list2 = bVar.f33864j;
            }
        }
        return k(hVar, U, U2, U4, U3, list, s11, list2, j15, j11);
    }

    protected b g(long j11, long j12, long j13, boolean z11, long j14, long j15, long j16, long j17, g gVar, n nVar, k kVar, Uri uri, List<f> list) {
        return new b(j11, j12, j13, z11, j14, j15, j16, j17, gVar, nVar, kVar, uri, list);
    }

    protected j.c g0(XmlPullParser xmlPullParser, j.c cVar, List<d> list, long j11, long j12, long j13, long j14, long j15) {
        long U = U(xmlPullParser, "timescale", cVar != null ? cVar.f33856b : 1L);
        long U2 = U(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f33857c : 0L);
        long U3 = U(xmlPullParser, "duration", cVar != null ? cVar.f33859e : -9223372036854775807L);
        long U4 = U(xmlPullParser, "startNumber", cVar != null ? cVar.f33858d : 1L);
        long T = T(list);
        long s11 = s(j13, j14);
        List<j.d> list2 = null;
        m o02 = o0(xmlPullParser, "media", cVar != null ? cVar.f33866k : null);
        m o03 = o0(xmlPullParser, "initialization", cVar != null ? cVar.f33865j : null);
        h hVar = null;
        while (true) {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Initialization")) {
                hVar = Q(xmlPullParser);
            } else if (l0.f(xmlPullParser, "SegmentTimeline")) {
                list2 = h0(xmlPullParser, U, j12);
            } else {
                u(xmlPullParser);
            }
            if (l0.d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
        }
        if (cVar != null) {
            if (hVar == null) {
                hVar = cVar.f33855a;
            }
            if (list2 == null) {
                list2 = cVar.f33860f;
            }
        }
        return l(hVar, U, U2, U4, T, U3, list2, s11, o03, o02, j15, j11);
    }

    protected f h(String str, long j11, List<jj.a> list, List<e> list2, d dVar) {
        return new f(str, j11, list, list2, dVar);
    }

    protected List<j.d> h0(XmlPullParser xmlPullParser, long j11, long j12) {
        ArrayList arrayList = new ArrayList();
        long j13 = 0;
        boolean z11 = false;
        int i11 = 0;
        long j14 = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "S")) {
                long U = U(xmlPullParser, "t", -9223372036854775807L);
                if (z11) {
                    j13 = b(arrayList, j13, j14, i11, U);
                }
                if (U == -9223372036854775807L) {
                    U = j13;
                }
                j14 = U(xmlPullParser, "d", -9223372036854775807L);
                i11 = R(xmlPullParser, "r", 0);
                z11 = true;
                j13 = U;
            } else {
                u(xmlPullParser);
            }
        } while (!l0.d(xmlPullParser, "SegmentTimeline"));
        if (z11) {
            b(arrayList, j13, j14, i11, k0.I0(j12, j11, 1000L));
        }
        return arrayList;
    }

    protected h i(String str, long j11, long j12) {
        return new h(str, j11, j12);
    }

    protected h i0(XmlPullParser xmlPullParser) {
        return Z(xmlPullParser, "media", "mediaRange");
    }

    protected i j(a aVar, String str, String str2, ArrayList<e.b> arrayList, ArrayList<d> arrayList2) {
        i.b a11 = aVar.f33819a.a();
        if (str != null) {
            a11.U(str);
        }
        String str3 = aVar.f33822d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<e.b> arrayList3 = aVar.f33823e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            a11.L(new com.google.android.exoplayer2.drm.e(str2, arrayList3));
        }
        ArrayList<d> arrayList4 = aVar.f33824f;
        arrayList4.addAll(arrayList2);
        return i.o(aVar.f33825g, a11.E(), aVar.f33820b, aVar.f33821c, arrayList4);
    }

    protected int j0(List<d> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = list.get(i11);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(dVar.f33826a) && "main".equals(dVar.f33827b)) {
                return 1;
            }
        }
        return 0;
    }

    protected j.b k(h hVar, long j11, long j12, long j13, long j14, List<j.d> list, long j15, List<h> list2, long j16, long j17) {
        return new j.b(hVar, j11, j12, j13, j14, list, j15, list2, ci.b.c(j16), ci.b.c(j17));
    }

    protected k k0(XmlPullParser xmlPullParser) {
        float f11 = -3.4028235E38f;
        float f12 = -3.4028235E38f;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        while (true) {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Latency")) {
                j11 = U(xmlPullParser, "target", -9223372036854775807L);
                j12 = U(xmlPullParser, "min", -9223372036854775807L);
                j13 = U(xmlPullParser, "max", -9223372036854775807L);
            } else if (l0.f(xmlPullParser, "PlaybackRate")) {
                f11 = O(xmlPullParser, "min", -3.4028235E38f);
                f12 = O(xmlPullParser, "max", -3.4028235E38f);
            }
            long j14 = j11;
            long j15 = j12;
            long j16 = j13;
            float f13 = f11;
            float f14 = f12;
            if (l0.d(xmlPullParser, "ServiceDescription")) {
                return new k(j14, j15, j16, f13, f14);
            }
            j11 = j14;
            j12 = j15;
            j13 = j16;
            f11 = f13;
            f12 = f14;
        }
    }

    protected j.c l(h hVar, long j11, long j12, long j13, long j14, long j15, List<j.d> list, long j16, m mVar, m mVar2, long j17, long j18) {
        return new j.c(hVar, j11, j12, j13, j14, j15, list, j16, mVar, mVar2, ci.b.c(j17), ci.b.c(j18));
    }

    protected j.d m(long j11, long j12) {
        return new j.d(j11, j12);
    }

    protected j.e n(h hVar, long j11, long j12, long j13, long j14) {
        return new j.e(hVar, j11, j12, j13, j14);
    }

    protected int n0(String str) {
        if (str == null) {
            return 0;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c11 = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c11 = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c11 = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c11 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c11 = 4;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    protected n o(String str, String str2) {
        return new n(str, str2);
    }

    protected m o0(XmlPullParser xmlPullParser, String str, m mVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? m.b(attributeValue) : mVar;
    }

    protected n p0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // com.google.android.exoplayer2.upstream.h.a
    /* renamed from: v */
    public b a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f33818a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return V(newPullParser, uri.toString());
            }
            throw new ParserException("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e11) {
            throw new ParserException(e11);
        }
    }

    protected jj.a w(XmlPullParser xmlPullParser, String str, j jVar, long j11, long j12, long j13, long j14, long j15) {
        String str2;
        long j16;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList<e.b> arrayList5;
        String str4;
        Object obj;
        ArrayList arrayList6;
        int i11;
        ArrayList<d> arrayList7;
        long z11;
        c cVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int R = R(xmlPullParser2, "id", -1);
        int E = E(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int R2 = R(xmlPullParser2, Snapshot.WIDTH, -1);
        int R3 = R(xmlPullParser2, Snapshot.HEIGHT, -1);
        float P = P(xmlPullParser2, -1.0f);
        int R4 = R(xmlPullParser2, "audioSamplingRate", -1);
        String str5 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList<e.b> arrayList8 = new ArrayList<>();
        ArrayList<d> arrayList9 = new ArrayList<>();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        String str6 = str;
        j.e eVar = jVar;
        int i12 = E;
        int i13 = -1;
        String str7 = attributeValue3;
        String str8 = attributeValue4;
        String str9 = null;
        boolean z12 = false;
        long j17 = j12;
        long j18 = j13;
        while (true) {
            xmlPullParser.next();
            if (l0.f(xmlPullParser2, "BaseURL")) {
                if (z12) {
                    j16 = j17;
                    arrayList6 = arrayList14;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    i11 = i12;
                    str2 = str7;
                    obj = null;
                    str3 = str6;
                    str6 = str3;
                    str7 = str2;
                    i12 = i11;
                } else {
                    j17 = cVar.z(xmlPullParser2, j17);
                    str6 = cVar.A(xmlPullParser2, str6);
                    z12 = true;
                    j16 = j17;
                    arrayList6 = arrayList14;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    obj = null;
                }
            } else if (l0.f(xmlPullParser2, "ContentProtection")) {
                Pair<String, e.b> D = D(xmlPullParser);
                long j19 = j18;
                Object obj2 = D.first;
                if (obj2 != null) {
                    str9 = (String) obj2;
                }
                Object obj3 = D.second;
                if (obj3 != null) {
                    arrayList8.add((e.b) obj3);
                }
                j18 = j19;
                j16 = j17;
                arrayList6 = arrayList14;
                arrayList = arrayList13;
                arrayList2 = arrayList12;
                arrayList3 = arrayList11;
                arrayList4 = arrayList10;
                arrayList7 = arrayList9;
                arrayList5 = arrayList8;
                str4 = str5;
                obj = null;
            } else {
                long j21 = j18;
                if (l0.f(xmlPullParser2, "ContentComponent")) {
                    str7 = q(str7, xmlPullParser2.getAttributeValue(null, str5));
                    i12 = p(i12, E(xmlPullParser));
                    j16 = j17;
                    arrayList6 = arrayList14;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    obj = null;
                    j18 = j21;
                } else {
                    int i14 = i12;
                    String str10 = str7;
                    if (l0.f(xmlPullParser2, "Role")) {
                        arrayList11.add(H(xmlPullParser2, "Role"));
                    } else if (l0.f(xmlPullParser2, "AudioChannelConfiguration")) {
                        i13 = y(xmlPullParser);
                        str7 = str10;
                        j16 = j17;
                        arrayList = arrayList13;
                        arrayList2 = arrayList12;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                        arrayList7 = arrayList9;
                        arrayList5 = arrayList8;
                        str4 = str5;
                        obj = null;
                        i12 = i14;
                        j18 = j21;
                        arrayList6 = arrayList14;
                    } else if (l0.f(xmlPullParser2, "Accessibility")) {
                        arrayList10.add(H(xmlPullParser2, "Accessibility"));
                    } else if (l0.f(xmlPullParser2, "EssentialProperty")) {
                        arrayList12.add(H(xmlPullParser2, "EssentialProperty"));
                    } else if (l0.f(xmlPullParser2, "SupplementalProperty")) {
                        arrayList13.add(H(xmlPullParser2, "SupplementalProperty"));
                    } else if (l0.f(xmlPullParser2, "Representation")) {
                        j16 = j17;
                        arrayList = arrayList13;
                        arrayList2 = arrayList12;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                        arrayList5 = arrayList8;
                        str4 = str5;
                        obj = null;
                        a a02 = a0(xmlPullParser, str6, attributeValue, attributeValue2, R2, R3, P, i13, R4, str10, arrayList3, arrayList4, arrayList2, arrayList, eVar, j14, j11, j16, j21, j15);
                        int p11 = p(i14, r.l(a02.f33819a.f9205l));
                        arrayList6 = arrayList14;
                        arrayList6.add(a02);
                        xmlPullParser2 = xmlPullParser;
                        str6 = str6;
                        arrayList7 = arrayList9;
                        str7 = str10;
                        i12 = p11;
                        j18 = j21;
                    } else {
                        str2 = str10;
                        j16 = j17;
                        str3 = str6;
                        arrayList = arrayList13;
                        arrayList2 = arrayList12;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                        ArrayList<d> arrayList15 = arrayList9;
                        arrayList5 = arrayList8;
                        str4 = str5;
                        obj = null;
                        arrayList6 = arrayList14;
                        if (l0.f(xmlPullParser, "SegmentBase")) {
                            eVar = e0(xmlPullParser, (j.e) eVar);
                            str6 = str3;
                            arrayList7 = arrayList15;
                            j18 = j21;
                            str7 = str2;
                            i12 = i14;
                            xmlPullParser2 = xmlPullParser;
                        } else {
                            if (l0.f(xmlPullParser, "SegmentList")) {
                                z11 = z(xmlPullParser, j21);
                                i11 = i14;
                                eVar = f0(xmlPullParser, (j.b) eVar, j14, j11, j16, z11, j15);
                                xmlPullParser2 = xmlPullParser;
                            } else {
                                j18 = j21;
                                i11 = i14;
                                if (l0.f(xmlPullParser, "SegmentTemplate")) {
                                    z11 = z(xmlPullParser, j18);
                                    xmlPullParser2 = xmlPullParser;
                                    eVar = g0(xmlPullParser, (j.c) eVar, arrayList, j14, j11, j16, z11, j15);
                                } else {
                                    xmlPullParser2 = xmlPullParser;
                                    if (l0.f(xmlPullParser2, "InbandEventStream")) {
                                        arrayList7 = arrayList15;
                                        arrayList7.add(H(xmlPullParser2, "InbandEventStream"));
                                    } else {
                                        arrayList7 = arrayList15;
                                        if (l0.f(xmlPullParser2, "Label")) {
                                            str8 = S(xmlPullParser);
                                        } else if (l0.e(xmlPullParser)) {
                                            x(xmlPullParser);
                                        }
                                    }
                                    str6 = str3;
                                    str7 = str2;
                                    i12 = i11;
                                }
                            }
                            j18 = z11;
                            str6 = str3;
                            arrayList7 = arrayList15;
                            str7 = str2;
                            i12 = i11;
                        }
                    }
                    str2 = str10;
                    j16 = j17;
                    str3 = str6;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    obj = null;
                    i11 = i14;
                    j18 = j21;
                    arrayList6 = arrayList14;
                    str6 = str3;
                    str7 = str2;
                    i12 = i11;
                }
            }
            if (l0.d(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            arrayList9 = arrayList7;
            arrayList14 = arrayList6;
            j17 = j16;
            arrayList13 = arrayList;
            arrayList12 = arrayList2;
            arrayList11 = arrayList3;
            arrayList10 = arrayList4;
            arrayList8 = arrayList5;
            str5 = str4;
            cVar = this;
        }
        ArrayList arrayList16 = new ArrayList(arrayList6.size());
        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
            arrayList16.add(j((a) arrayList6.get(i15), str8, str9, arrayList5, arrayList7));
        }
        return c(R, i12, arrayList16, arrayList4, arrayList2, arrayList);
    }

    protected void x(XmlPullParser xmlPullParser) {
        u(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected int y(XmlPullParser xmlPullParser) {
        char c11;
        String l02 = l0(xmlPullParser, "schemeIdUri", null);
        l02.hashCode();
        int i11 = -1;
        switch (l02.hashCode()) {
            case -1352850286:
                if (l02.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1138141449:
                if (l02.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -986633423:
                if (l02.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 2036691300:
                if (l02.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
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
                i11 = R(xmlPullParser, "value", -1);
                break;
            case 1:
            case 3:
                i11 = I(xmlPullParser);
                break;
            case 2:
                i11 = W(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!l0.d(xmlPullParser, "AudioChannelConfiguration"));
        return i11;
    }

    protected long z(XmlPullParser xmlPullParser, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j11;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }
}