package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    int f4193a = -1;

    /* renamed from: b  reason: collision with root package name */
    int f4194b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f4195c = -1;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray<a> f4196d = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f4197a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b> f4198b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f4199c;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f4199c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f3959c8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == i.f3970d8) {
                    this.f4197a = obtainStyledAttributes.getResourceId(index, this.f4197a);
                } else if (index == i.f3981e8) {
                    this.f4199c = obtainStyledAttributes.getResourceId(index, this.f4199c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4199c);
                    context.getResources().getResourceName(this.f4199c);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f4198b.add(bVar);
        }

        public int b(float f11, float f12) {
            for (int i11 = 0; i11 < this.f4198b.size(); i11++) {
                if (this.f4198b.get(i11).a(f11, f12)) {
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
        float f4200a;

        /* renamed from: b  reason: collision with root package name */
        float f4201b;

        /* renamed from: c  reason: collision with root package name */
        float f4202c;

        /* renamed from: d  reason: collision with root package name */
        float f4203d;

        /* renamed from: e  reason: collision with root package name */
        int f4204e;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f4200a = Float.NaN;
            this.f4201b = Float.NaN;
            this.f4202c = Float.NaN;
            this.f4203d = Float.NaN;
            this.f4204e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.G8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == i.H8) {
                    this.f4204e = obtainStyledAttributes.getResourceId(index, this.f4204e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4204e);
                    context.getResources().getResourceName(this.f4204e);
                    "layout".equals(resourceTypeName);
                } else if (index == i.I8) {
                    this.f4203d = obtainStyledAttributes.getDimension(index, this.f4203d);
                } else if (index == i.J8) {
                    this.f4201b = obtainStyledAttributes.getDimension(index, this.f4201b);
                } else if (index == i.K8) {
                    this.f4202c = obtainStyledAttributes.getDimension(index, this.f4202c);
                } else if (index == i.L8) {
                    this.f4200a = obtainStyledAttributes.getDimension(index, this.f4200a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f11, float f12) {
            if (Float.isNaN(this.f4200a) || f11 >= this.f4200a) {
                if (Float.isNaN(this.f4201b) || f12 >= this.f4201b) {
                    if (Float.isNaN(this.f4202c) || f11 <= this.f4202c) {
                        return Float.isNaN(this.f4203d) || f12 <= this.f4203d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public k(Context context, XmlPullParser xmlPullParser) {
        new SparseArray();
        b(context, xmlPullParser);
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f3991f8);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == i.f4001g8) {
                this.f4193a = obtainStyledAttributes.getResourceId(index, this.f4193a);
            }
        }
        obtainStyledAttributes.recycle();
        a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (true) {
                boolean z11 = true;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                z11 = false;
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
                        aVar = new a(context, xmlPullParser);
                        this.f4196d.put(aVar.f4197a, aVar);
                    } else if (z11) {
                        b bVar = new b(context, xmlPullParser);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    public int a(int i11, int i12, float f11, float f12) {
        a aVar = this.f4196d.get(i12);
        if (aVar == null) {
            return i12;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            b bVar = null;
            Iterator<b> it2 = aVar.f4198b.iterator();
            while (it2.hasNext()) {
                b next = it2.next();
                if (next.a(f11, f12)) {
                    if (i11 == next.f4204e) {
                        return i11;
                    }
                    bVar = next;
                }
            }
            if (bVar != null) {
                return bVar.f4204e;
            }
            return aVar.f4199c;
        } else if (aVar.f4199c == i11) {
            return i11;
        } else {
            Iterator<b> it3 = aVar.f4198b.iterator();
            while (it3.hasNext()) {
                if (i11 == it3.next().f4204e) {
                    return i11;
                }
            }
            return aVar.f4199c;
        }
    }

    public int c(int i11, int i12, int i13) {
        return d(-1, i11, i12, i13);
    }

    public int d(int i11, int i12, float f11, float f12) {
        a aVar;
        int b11;
        if (i11 != i12) {
            a aVar2 = this.f4196d.get(i12);
            if (aVar2 == null) {
                return -1;
            }
            int b12 = aVar2.b(f11, f12);
            return b12 == -1 ? aVar2.f4199c : aVar2.f4198b.get(b12).f4204e;
        }
        if (i12 == -1) {
            aVar = this.f4196d.valueAt(0);
        } else {
            aVar = this.f4196d.get(this.f4194b);
        }
        if (aVar == null) {
            return -1;
        }
        return ((this.f4195c == -1 || !aVar.f4198b.get(i11).a(f11, f12)) && i11 != (b11 = aVar.b(f11, f12))) ? b11 == -1 ? aVar.f4199c : aVar.f4198b.get(b11).f4204e : i11;
    }
}