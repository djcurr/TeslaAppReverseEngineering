package l3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final c[] f36529a;

        public b(c[] cVarArr) {
            this.f36529a = cVarArr;
        }

        public c[] a() {
            return this.f36529a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f36530a;

        /* renamed from: b  reason: collision with root package name */
        private int f36531b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f36532c;

        /* renamed from: d  reason: collision with root package name */
        private String f36533d;

        /* renamed from: e  reason: collision with root package name */
        private int f36534e;

        /* renamed from: f  reason: collision with root package name */
        private int f36535f;

        public c(String str, int i11, boolean z11, String str2, int i12, int i13) {
            this.f36530a = str;
            this.f36531b = i11;
            this.f36532c = z11;
            this.f36533d = str2;
            this.f36534e = i12;
            this.f36535f = i13;
        }

        public String a() {
            return this.f36530a;
        }

        public int b() {
            return this.f36535f;
        }

        public int c() {
            return this.f36534e;
        }

        public String d() {
            return this.f36533d;
        }

        public int e() {
            return this.f36531b;
        }

        public boolean f() {
            return this.f36532c;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        private final s3.d f36536a;

        /* renamed from: b  reason: collision with root package name */
        private final int f36537b;

        /* renamed from: c  reason: collision with root package name */
        private final int f36538c;

        /* renamed from: d  reason: collision with root package name */
        private final String f36539d;

        public d(s3.d dVar, int i11, int i12, String str) {
            this.f36536a = dVar;
            this.f36538c = i11;
            this.f36537b = i12;
            this.f36539d = str;
        }

        public int a() {
            return this.f36538c;
        }

        public s3.d b() {
            return this.f36536a;
        }

        public String c() {
            return this.f36539d;
        }

        public int d() {
            return this.f36537b;
        }
    }

    private static int a(TypedArray typedArray, int i11) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i11);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i11, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i11) {
        if (i11 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i11);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i12 = 0; i12 < obtainTypedArray.length(); i12++) {
                    int resourceId = obtainTypedArray.getResourceId(i12, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i11)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), j3.d.f33184g);
        String string = obtainAttributes.getString(j3.d.f33185h);
        String string2 = obtainAttributes.getString(j3.d.f33189l);
        String string3 = obtainAttributes.getString(j3.d.f33190m);
        int resourceId = obtainAttributes.getResourceId(j3.d.f33186i, 0);
        int integer = obtainAttributes.getInteger(j3.d.f33187j, 1);
        int integer2 = obtainAttributes.getInteger(j3.d.f33188k, 500);
        String string4 = obtainAttributes.getString(j3.d.f33191n);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new s3.d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(PaymentSheetEvent.FIELD_FONT)) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    private static c f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), j3.d.f33192o);
        int i11 = j3.d.f33201x;
        if (!obtainAttributes.hasValue(i11)) {
            i11 = j3.d.f33194q;
        }
        int i12 = obtainAttributes.getInt(i11, 400);
        int i13 = j3.d.f33199v;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = j3.d.f33195r;
        }
        boolean z11 = 1 == obtainAttributes.getInt(i13, 0);
        int i14 = j3.d.f33202y;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = j3.d.f33196s;
        }
        int i15 = j3.d.f33200w;
        if (!obtainAttributes.hasValue(i15)) {
            i15 = j3.d.f33197t;
        }
        String string = obtainAttributes.getString(i15);
        int i16 = obtainAttributes.getInt(i14, 0);
        int i17 = j3.d.f33198u;
        if (!obtainAttributes.hasValue(i17)) {
            i17 = j3.d.f33193p;
        }
        int resourceId = obtainAttributes.getResourceId(i17, 0);
        String string2 = obtainAttributes.getString(i17);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new c(string2, i12, z11, string, i16, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i11 = 1;
        while (i11 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i11++;
            } else if (next == 3) {
                i11--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}