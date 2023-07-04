package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class k extends d {
    HashMap<String, Method> A;

    /* renamed from: g  reason: collision with root package name */
    private int f3441g = -1;

    /* renamed from: h  reason: collision with root package name */
    private String f3442h = null;

    /* renamed from: i  reason: collision with root package name */
    private int f3443i;

    /* renamed from: j  reason: collision with root package name */
    private String f3444j;

    /* renamed from: k  reason: collision with root package name */
    private String f3445k;

    /* renamed from: l  reason: collision with root package name */
    private int f3446l;

    /* renamed from: m  reason: collision with root package name */
    private int f3447m;

    /* renamed from: n  reason: collision with root package name */
    private View f3448n;

    /* renamed from: o  reason: collision with root package name */
    float f3449o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3450p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3451q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3452r;

    /* renamed from: s  reason: collision with root package name */
    private float f3453s;

    /* renamed from: t  reason: collision with root package name */
    private float f3454t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3455u;

    /* renamed from: v  reason: collision with root package name */
    int f3456v;

    /* renamed from: w  reason: collision with root package name */
    int f3457w;

    /* renamed from: x  reason: collision with root package name */
    int f3458x;

    /* renamed from: y  reason: collision with root package name */
    RectF f3459y;

    /* renamed from: z  reason: collision with root package name */
    RectF f3460z;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f3461a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3461a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.M5, 8);
            f3461a.append(androidx.constraintlayout.widget.i.Q5, 4);
            f3461a.append(androidx.constraintlayout.widget.i.R5, 1);
            f3461a.append(androidx.constraintlayout.widget.i.S5, 2);
            f3461a.append(androidx.constraintlayout.widget.i.N5, 7);
            f3461a.append(androidx.constraintlayout.widget.i.T5, 6);
            f3461a.append(androidx.constraintlayout.widget.i.V5, 5);
            f3461a.append(androidx.constraintlayout.widget.i.P5, 9);
            f3461a.append(androidx.constraintlayout.widget.i.O5, 10);
            f3461a.append(androidx.constraintlayout.widget.i.U5, 11);
            f3461a.append(androidx.constraintlayout.widget.i.W5, 12);
            f3461a.append(androidx.constraintlayout.widget.i.X5, 13);
            f3461a.append(androidx.constraintlayout.widget.i.Y5, 14);
        }

        public static void a(k kVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f3461a.get(index)) {
                    case 1:
                        kVar.f3444j = typedArray.getString(index);
                        break;
                    case 2:
                        kVar.f3445k = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3461a.get(index));
                        break;
                    case 4:
                        kVar.f3442h = typedArray.getString(index);
                        break;
                    case 5:
                        kVar.f3449o = typedArray.getFloat(index, kVar.f3449o);
                        break;
                    case 6:
                        kVar.f3446l = typedArray.getResourceId(index, kVar.f3446l);
                        break;
                    case 7:
                        if (p.f3510y3) {
                            int resourceId = typedArray.getResourceId(index, kVar.f3363b);
                            kVar.f3363b = resourceId;
                            if (resourceId == -1) {
                                kVar.f3364c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            kVar.f3364c = typedArray.getString(index);
                            break;
                        } else {
                            kVar.f3363b = typedArray.getResourceId(index, kVar.f3363b);
                            break;
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, kVar.f3362a);
                        kVar.f3362a = integer;
                        kVar.f3453s = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        kVar.f3447m = typedArray.getResourceId(index, kVar.f3447m);
                        break;
                    case 10:
                        kVar.f3455u = typedArray.getBoolean(index, kVar.f3455u);
                        break;
                    case 11:
                        kVar.f3443i = typedArray.getResourceId(index, kVar.f3443i);
                        break;
                    case 12:
                        kVar.f3458x = typedArray.getResourceId(index, kVar.f3458x);
                        break;
                    case 13:
                        kVar.f3456v = typedArray.getResourceId(index, kVar.f3456v);
                        break;
                    case 14:
                        kVar.f3457w = typedArray.getResourceId(index, kVar.f3457w);
                        break;
                }
            }
        }
    }

    public k() {
        int i11 = d.f3361f;
        this.f3443i = i11;
        this.f3444j = null;
        this.f3445k = null;
        this.f3446l = i11;
        this.f3447m = i11;
        this.f3448n = null;
        this.f3449o = 0.1f;
        this.f3450p = true;
        this.f3451q = true;
        this.f3452r = true;
        this.f3453s = Float.NaN;
        this.f3455u = false;
        this.f3456v = i11;
        this.f3457w = i11;
        this.f3458x = i11;
        this.f3459y = new RectF();
        this.f3460z = new RectF();
        this.A = new HashMap<>();
        this.f3365d = 5;
        this.f3366e = new HashMap<>();
    }

    private void u(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            v(str, view);
            return;
        }
        if (this.A.containsKey(str)) {
            method = this.A.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.A.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.A.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.a.c(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f3442h + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.a.c(view));
        }
    }

    private void v(String str, View view) {
        boolean z11 = str.length() == 1;
        if (!z11) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f3366e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z11 || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.f3366e.get(str2);
                if (aVar != null) {
                    aVar.a(view);
                }
            }
        }
    }

    private void w(RectF rectF, View view, boolean z11) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z11) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap<String, h3.d> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* renamed from: b */
    public d clone() {
        return new k().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        k kVar = (k) dVar;
        this.f3441g = kVar.f3441g;
        this.f3442h = kVar.f3442h;
        this.f3443i = kVar.f3443i;
        this.f3444j = kVar.f3444j;
        this.f3445k = kVar.f3445k;
        this.f3446l = kVar.f3446l;
        this.f3447m = kVar.f3447m;
        this.f3448n = kVar.f3448n;
        this.f3449o = kVar.f3449o;
        this.f3450p = kVar.f3450p;
        this.f3451q = kVar.f3451q;
        this.f3452r = kVar.f3452r;
        this.f3453s = kVar.f3453s;
        this.f3454t = kVar.f3454t;
        this.f3455u = kVar.f3455u;
        this.f3459y = kVar.f3459y;
        this.f3460z = kVar.f3460z;
        this.A = kVar.A;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.L5), context);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(float r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.k.t(float, android.view.View):void");
    }
}