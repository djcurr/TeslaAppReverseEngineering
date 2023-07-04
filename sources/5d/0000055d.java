package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: g  reason: collision with root package name */
    private String f3367g;

    /* renamed from: h  reason: collision with root package name */
    private int f3368h = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3369i = false;

    /* renamed from: j  reason: collision with root package name */
    private float f3370j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    private float f3371k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    private float f3372l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    private float f3373m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    private float f3374n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    private float f3375o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    private float f3376p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    private float f3377q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    private float f3378r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    private float f3379s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    private float f3380t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    private float f3381u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    private float f3382v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    private float f3383w = Float.NaN;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f3384a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3384a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.f4097q4, 1);
            f3384a.append(androidx.constraintlayout.widget.i.B4, 2);
            f3384a.append(androidx.constraintlayout.widget.i.f4167x4, 4);
            f3384a.append(androidx.constraintlayout.widget.i.f4177y4, 5);
            f3384a.append(androidx.constraintlayout.widget.i.f4187z4, 6);
            f3384a.append(androidx.constraintlayout.widget.i.f4107r4, 19);
            f3384a.append(androidx.constraintlayout.widget.i.f4117s4, 20);
            f3384a.append(androidx.constraintlayout.widget.i.f4147v4, 7);
            f3384a.append(androidx.constraintlayout.widget.i.H4, 8);
            f3384a.append(androidx.constraintlayout.widget.i.G4, 9);
            f3384a.append(androidx.constraintlayout.widget.i.F4, 10);
            f3384a.append(androidx.constraintlayout.widget.i.D4, 12);
            f3384a.append(androidx.constraintlayout.widget.i.C4, 13);
            f3384a.append(androidx.constraintlayout.widget.i.f4157w4, 14);
            f3384a.append(androidx.constraintlayout.widget.i.f4127t4, 15);
            f3384a.append(androidx.constraintlayout.widget.i.f4137u4, 16);
            f3384a.append(androidx.constraintlayout.widget.i.A4, 17);
            f3384a.append(androidx.constraintlayout.widget.i.E4, 18);
        }

        public static void a(e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f3384a.get(index)) {
                    case 1:
                        eVar.f3370j = typedArray.getFloat(index, eVar.f3370j);
                        break;
                    case 2:
                        eVar.f3371k = typedArray.getDimension(index, eVar.f3371k);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3384a.get(index));
                        break;
                    case 4:
                        eVar.f3372l = typedArray.getFloat(index, eVar.f3372l);
                        break;
                    case 5:
                        eVar.f3373m = typedArray.getFloat(index, eVar.f3373m);
                        break;
                    case 6:
                        eVar.f3374n = typedArray.getFloat(index, eVar.f3374n);
                        break;
                    case 7:
                        eVar.f3378r = typedArray.getFloat(index, eVar.f3378r);
                        break;
                    case 8:
                        eVar.f3377q = typedArray.getFloat(index, eVar.f3377q);
                        break;
                    case 9:
                        eVar.f3367g = typedArray.getString(index);
                        break;
                    case 10:
                        if (p.f3510y3) {
                            int resourceId = typedArray.getResourceId(index, eVar.f3363b);
                            eVar.f3363b = resourceId;
                            if (resourceId == -1) {
                                eVar.f3364c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            eVar.f3364c = typedArray.getString(index);
                            break;
                        } else {
                            eVar.f3363b = typedArray.getResourceId(index, eVar.f3363b);
                            break;
                        }
                    case 12:
                        eVar.f3362a = typedArray.getInt(index, eVar.f3362a);
                        break;
                    case 13:
                        eVar.f3368h = typedArray.getInteger(index, eVar.f3368h);
                        break;
                    case 14:
                        eVar.f3379s = typedArray.getFloat(index, eVar.f3379s);
                        break;
                    case 15:
                        eVar.f3380t = typedArray.getDimension(index, eVar.f3380t);
                        break;
                    case 16:
                        eVar.f3381u = typedArray.getDimension(index, eVar.f3381u);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            eVar.f3382v = typedArray.getDimension(index, eVar.f3382v);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        eVar.f3383w = typedArray.getFloat(index, eVar.f3383w);
                        break;
                    case 19:
                        eVar.f3375o = typedArray.getDimension(index, eVar.f3375o);
                        break;
                    case 20:
                        eVar.f3376p = typedArray.getDimension(index, eVar.f3376p);
                        break;
                }
            }
        }
    }

    public e() {
        this.f3365d = 1;
        this.f3366e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // androidx.constraintlayout.motion.widget.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.HashMap<java.lang.String, h3.d> r7) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.e.a(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* renamed from: b */
    public d clone() {
        return new e().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        e eVar = (e) dVar;
        this.f3368h = eVar.f3368h;
        this.f3369i = eVar.f3369i;
        this.f3370j = eVar.f3370j;
        this.f3371k = eVar.f3371k;
        this.f3372l = eVar.f3372l;
        this.f3373m = eVar.f3373m;
        this.f3374n = eVar.f3374n;
        this.f3375o = eVar.f3375o;
        this.f3376p = eVar.f3376p;
        this.f3377q = eVar.f3377q;
        this.f3378r = eVar.f3378r;
        this.f3379s = eVar.f3379s;
        this.f3380t = eVar.f3380t;
        this.f3381u = eVar.f3381u;
        this.f3382v = eVar.f3382v;
        this.f3383w = eVar.f3383w;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f3370j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f3371k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f3372l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f3373m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f3374n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f3375o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f3376p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f3380t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f3381u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f3382v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f3377q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f3378r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f3379s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f3383w)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f4087p4));
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void f(HashMap<String, Integer> hashMap) {
        if (this.f3368h == -1) {
            return;
        }
        if (!Float.isNaN(this.f3370j)) {
            hashMap.put("alpha", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3371k)) {
            hashMap.put("elevation", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3372l)) {
            hashMap.put("rotation", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3373m)) {
            hashMap.put("rotationX", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3374n)) {
            hashMap.put("rotationY", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3375o)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3376p)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3380t)) {
            hashMap.put("translationX", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3381u)) {
            hashMap.put("translationY", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3382v)) {
            hashMap.put("translationZ", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3377q)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3378r)) {
            hashMap.put("scaleX", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3379s)) {
            hashMap.put("scaleY", Integer.valueOf(this.f3368h));
        }
        if (!Float.isNaN(this.f3383w)) {
            hashMap.put("progress", Integer.valueOf(this.f3368h));
        }
        if (this.f3366e.size() > 0) {
            Iterator<String> it2 = this.f3366e.keySet().iterator();
            while (it2.hasNext()) {
                hashMap.put("CUSTOM," + it2.next(), Integer.valueOf(this.f3368h));
            }
        }
    }
}