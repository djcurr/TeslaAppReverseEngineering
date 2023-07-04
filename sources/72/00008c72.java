package ni;

import ak.l0;
import ak.o;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.r;
import java.io.StringReader;
import ni.b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f41683a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f41684b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f41685c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            o.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (l0.f(newPullParser, "x:xmpmeta")) {
            long j11 = -9223372036854775807L;
            r<b.a> r11 = r.r();
            do {
                newPullParser.next();
                if (l0.f(newPullParser, "rdf:Description")) {
                    if (!d(newPullParser)) {
                        return null;
                    }
                    j11 = e(newPullParser);
                    r11 = c(newPullParser);
                } else if (l0.f(newPullParser, "Container:Directory")) {
                    r11 = f(newPullParser);
                }
            } while (!l0.d(newPullParser, "x:xmpmeta"));
            if (r11.isEmpty()) {
                return null;
            }
            return new b(j11, r11);
        }
        throw new ParserException("Couldn't find xmp metadata");
    }

    private static r<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f41685c) {
            String a11 = l0.a(xmlPullParser, str);
            if (a11 != null) {
                return r.t(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(a11), 0L));
            }
        }
        return r.r();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f41683a) {
            String a11 = l0.a(xmlPullParser, str);
            if (a11 != null) {
                return Integer.parseInt(a11) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f41684b) {
            String a11 = l0.a(xmlPullParser, str);
            if (a11 != null) {
                long parseLong = Long.parseLong(a11);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static r<b.a> f(XmlPullParser xmlPullParser) {
        r.a m11 = r.m();
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "Container:Item")) {
                String a11 = l0.a(xmlPullParser, "Item:Mime");
                String a12 = l0.a(xmlPullParser, "Item:Semantic");
                String a13 = l0.a(xmlPullParser, "Item:Length");
                String a14 = l0.a(xmlPullParser, "Item:Padding");
                if (a11 != null && a12 != null) {
                    m11.d(new b.a(a11, a12, a13 != null ? Long.parseLong(a13) : 0L, a14 != null ? Long.parseLong(a14) : 0L));
                } else {
                    return r.r();
                }
            }
        } while (!l0.d(xmlPullParser, "Container:Directory"));
        return m11.e();
    }
}