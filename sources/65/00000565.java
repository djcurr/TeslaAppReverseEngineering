package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j extends d {

    /* renamed from: g  reason: collision with root package name */
    private String f3422g;

    /* renamed from: v  reason: collision with root package name */
    private String f3437v;

    /* renamed from: h  reason: collision with root package name */
    private int f3423h = -1;

    /* renamed from: i  reason: collision with root package name */
    private float f3424i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    private float f3425j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    private float f3426k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    private float f3427l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    private float f3428m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    private float f3429n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    private float f3430o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    private float f3431p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    private float f3432q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    private float f3433r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    private float f3434s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    private float f3435t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    private int f3436u = 0;

    /* renamed from: w  reason: collision with root package name */
    private float f3438w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    private float f3439x = BitmapDescriptorFactory.HUE_RED;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f3440a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3440a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.f4118s5, 1);
            f3440a.append(androidx.constraintlayout.widget.i.B5, 2);
            f3440a.append(androidx.constraintlayout.widget.i.f4168x5, 4);
            f3440a.append(androidx.constraintlayout.widget.i.f4178y5, 5);
            f3440a.append(androidx.constraintlayout.widget.i.f4188z5, 6);
            f3440a.append(androidx.constraintlayout.widget.i.f4148v5, 7);
            f3440a.append(androidx.constraintlayout.widget.i.H5, 8);
            f3440a.append(androidx.constraintlayout.widget.i.G5, 9);
            f3440a.append(androidx.constraintlayout.widget.i.F5, 10);
            f3440a.append(androidx.constraintlayout.widget.i.D5, 12);
            f3440a.append(androidx.constraintlayout.widget.i.C5, 13);
            f3440a.append(androidx.constraintlayout.widget.i.f4158w5, 14);
            f3440a.append(androidx.constraintlayout.widget.i.f4128t5, 15);
            f3440a.append(androidx.constraintlayout.widget.i.f4138u5, 16);
            f3440a.append(androidx.constraintlayout.widget.i.A5, 17);
            f3440a.append(androidx.constraintlayout.widget.i.E5, 18);
            f3440a.append(androidx.constraintlayout.widget.i.J5, 20);
            f3440a.append(androidx.constraintlayout.widget.i.I5, 21);
            f3440a.append(androidx.constraintlayout.widget.i.K5, 19);
        }

        public static void a(j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f3440a.get(index)) {
                    case 1:
                        jVar.f3424i = typedArray.getFloat(index, jVar.f3424i);
                        break;
                    case 2:
                        jVar.f3425j = typedArray.getDimension(index, jVar.f3425j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3440a.get(index));
                        break;
                    case 4:
                        jVar.f3426k = typedArray.getFloat(index, jVar.f3426k);
                        break;
                    case 5:
                        jVar.f3427l = typedArray.getFloat(index, jVar.f3427l);
                        break;
                    case 6:
                        jVar.f3428m = typedArray.getFloat(index, jVar.f3428m);
                        break;
                    case 7:
                        jVar.f3430o = typedArray.getFloat(index, jVar.f3430o);
                        break;
                    case 8:
                        jVar.f3429n = typedArray.getFloat(index, jVar.f3429n);
                        break;
                    case 9:
                        jVar.f3422g = typedArray.getString(index);
                        break;
                    case 10:
                        if (p.f3510y3) {
                            int resourceId = typedArray.getResourceId(index, jVar.f3363b);
                            jVar.f3363b = resourceId;
                            if (resourceId == -1) {
                                jVar.f3364c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            jVar.f3364c = typedArray.getString(index);
                            break;
                        } else {
                            jVar.f3363b = typedArray.getResourceId(index, jVar.f3363b);
                            break;
                        }
                    case 12:
                        jVar.f3362a = typedArray.getInt(index, jVar.f3362a);
                        break;
                    case 13:
                        jVar.f3423h = typedArray.getInteger(index, jVar.f3423h);
                        break;
                    case 14:
                        jVar.f3431p = typedArray.getFloat(index, jVar.f3431p);
                        break;
                    case 15:
                        jVar.f3432q = typedArray.getDimension(index, jVar.f3432q);
                        break;
                    case 16:
                        jVar.f3433r = typedArray.getDimension(index, jVar.f3433r);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            jVar.f3434s = typedArray.getDimension(index, jVar.f3434s);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        jVar.f3435t = typedArray.getFloat(index, jVar.f3435t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            jVar.f3437v = typedArray.getString(index);
                            jVar.f3436u = 7;
                            break;
                        } else {
                            jVar.f3436u = typedArray.getInt(index, jVar.f3436u);
                            break;
                        }
                    case 20:
                        jVar.f3438w = typedArray.getFloat(index, jVar.f3438w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            jVar.f3439x = typedArray.getDimension(index, jVar.f3439x);
                            break;
                        } else {
                            jVar.f3439x = typedArray.getFloat(index, jVar.f3439x);
                            break;
                        }
                }
            }
        }
    }

    public j() {
        this.f3365d = 3;
        this.f3366e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P(java.util.HashMap<java.lang.String, h3.e> r11) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.P(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap<String, h3.d> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* renamed from: b */
    public d clone() {
        return new j().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        j jVar = (j) dVar;
        this.f3422g = jVar.f3422g;
        this.f3423h = jVar.f3423h;
        this.f3436u = jVar.f3436u;
        this.f3438w = jVar.f3438w;
        this.f3439x = jVar.f3439x;
        this.f3435t = jVar.f3435t;
        this.f3424i = jVar.f3424i;
        this.f3425j = jVar.f3425j;
        this.f3426k = jVar.f3426k;
        this.f3429n = jVar.f3429n;
        this.f3427l = jVar.f3427l;
        this.f3428m = jVar.f3428m;
        this.f3430o = jVar.f3430o;
        this.f3431p = jVar.f3431p;
        this.f3432q = jVar.f3432q;
        this.f3433r = jVar.f3433r;
        this.f3434s = jVar.f3434s;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f3424i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f3425j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f3426k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f3427l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f3428m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f3432q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f3433r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f3434s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f3429n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f3430o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f3431p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f3435t)) {
            hashSet.add("progress");
        }
        if (this.f3366e.size() > 0) {
            Iterator<String> it2 = this.f3366e.keySet().iterator();
            while (it2.hasNext()) {
                hashSet.add("CUSTOM," + it2.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f4108r5));
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void f(HashMap<String, Integer> hashMap) {
        if (this.f3423h == -1) {
            return;
        }
        if (!Float.isNaN(this.f3424i)) {
            hashMap.put("alpha", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3425j)) {
            hashMap.put("elevation", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3426k)) {
            hashMap.put("rotation", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3427l)) {
            hashMap.put("rotationX", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3428m)) {
            hashMap.put("rotationY", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3432q)) {
            hashMap.put("translationX", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3433r)) {
            hashMap.put("translationY", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3434s)) {
            hashMap.put("translationZ", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3429n)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3430o)) {
            hashMap.put("scaleX", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3430o)) {
            hashMap.put("scaleY", Integer.valueOf(this.f3423h));
        }
        if (!Float.isNaN(this.f3435t)) {
            hashMap.put("progress", Integer.valueOf(this.f3423h));
        }
        if (this.f3366e.size() > 0) {
            Iterator<String> it2 = this.f3366e.keySet().iterator();
            while (it2.hasNext()) {
                hashMap.put("CUSTOM," + it2.next(), Integer.valueOf(this.f3423h));
            }
        }
    }
}