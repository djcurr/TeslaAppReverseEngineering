package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f3792a;

    /* renamed from: b  reason: collision with root package name */
    d f3793b;

    /* renamed from: c  reason: collision with root package name */
    int f3794c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f3795d = -1;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<a> f3796e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<d> f3797f = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f3798a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b> f3799b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f3800c;

        /* renamed from: d  reason: collision with root package name */
        d f3801d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f3800c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f3959c8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == i.f3970d8) {
                    this.f3798a = obtainStyledAttributes.getResourceId(index, this.f3798a);
                } else if (index == i.f3981e8) {
                    this.f3800c = obtainStyledAttributes.getResourceId(index, this.f3800c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3800c);
                    context.getResources().getResourceName(this.f3800c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f3801d = dVar;
                        dVar.m(context, this.f3800c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f3799b.add(bVar);
        }

        public int b(float f11, float f12) {
            for (int i11 = 0; i11 < this.f3799b.size(); i11++) {
                if (this.f3799b.get(i11).a(f11, f12)) {
                    return i11;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        float f3802a;

        /* renamed from: b  reason: collision with root package name */
        float f3803b;

        /* renamed from: c  reason: collision with root package name */
        float f3804c;

        /* renamed from: d  reason: collision with root package name */
        float f3805d;

        /* renamed from: e  reason: collision with root package name */
        int f3806e;

        /* renamed from: f  reason: collision with root package name */
        d f3807f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f3802a = Float.NaN;
            this.f3803b = Float.NaN;
            this.f3804c = Float.NaN;
            this.f3805d = Float.NaN;
            this.f3806e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.G8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == i.H8) {
                    this.f3806e = obtainStyledAttributes.getResourceId(index, this.f3806e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3806e);
                    context.getResources().getResourceName(this.f3806e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f3807f = dVar;
                        dVar.m(context, this.f3806e);
                    }
                } else if (index == i.I8) {
                    this.f3805d = obtainStyledAttributes.getDimension(index, this.f3805d);
                } else if (index == i.J8) {
                    this.f3803b = obtainStyledAttributes.getDimension(index, this.f3803b);
                } else if (index == i.K8) {
                    this.f3804c = obtainStyledAttributes.getDimension(index, this.f3804c);
                } else if (index == i.L8) {
                    this.f3802a = obtainStyledAttributes.getDimension(index, this.f3802a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f11, float f12) {
            if (Float.isNaN(this.f3802a) || f11 >= this.f3802a) {
                if (Float.isNaN(this.f3803b) || f12 >= this.f3803b) {
                    if (Float.isNaN(this.f3804c) || f11 <= this.f3804c) {
                        return Float.isNaN(this.f3805d) || f12 <= this.f3805d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, ConstraintLayout constraintLayout, int i11) {
        this.f3792a = constraintLayout;
        a(context, i11);
    }

    private void a(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        a aVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                boolean z11 = true;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            z11 = true;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                z11 = false;
                                break;
                            }
                            z11 = true;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            break;
                        default:
                            z11 = true;
                            break;
                    }
                    if (z11) {
                        aVar = new a(context, xml);
                        this.f3796e.put(aVar.f3798a, aVar);
                        continue;
                    } else if (z11) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                            continue;
                        } else {
                            continue;
                        }
                    } else if (!z11) {
                        continue;
                    } else {
                        b(context, xml);
                        continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.w(context, xmlPullParser);
                this.f3797f.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }

    public void d(int i11, float f11, float f12) {
        d dVar;
        a aVar;
        int b11;
        d dVar2;
        int i12 = this.f3794c;
        if (i12 == i11) {
            if (i11 == -1) {
                aVar = this.f3796e.valueAt(0);
            } else {
                aVar = this.f3796e.get(i12);
            }
            int i13 = this.f3795d;
            if ((i13 == -1 || !aVar.f3799b.get(i13).a(f11, f12)) && this.f3795d != (b11 = aVar.b(f11, f12))) {
                if (b11 == -1) {
                    dVar2 = this.f3793b;
                } else {
                    dVar2 = aVar.f3799b.get(b11).f3807f;
                }
                if (b11 != -1) {
                    int i14 = aVar.f3799b.get(b11).f3806e;
                }
                if (dVar2 == null) {
                    return;
                }
                this.f3795d = b11;
                dVar2.i(this.f3792a);
                return;
            }
            return;
        }
        this.f3794c = i11;
        a aVar2 = this.f3796e.get(i11);
        int b12 = aVar2.b(f11, f12);
        if (b12 == -1) {
            dVar = aVar2.f3801d;
        } else {
            dVar = aVar2.f3799b.get(b12).f3807f;
        }
        if (b12 != -1) {
            int i15 = aVar2.f3799b.get(b12).f3806e;
        }
        if (dVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i11 + ", dim =" + f11 + ", " + f12);
            return;
        }
        this.f3795d = b12;
        dVar.i(this.f3792a);
    }
}