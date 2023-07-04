package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: g  reason: collision with root package name */
    private String f3385g = null;

    /* renamed from: h  reason: collision with root package name */
    private int f3386h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f3387i = -1;

    /* renamed from: j  reason: collision with root package name */
    private String f3388j = null;

    /* renamed from: k  reason: collision with root package name */
    private float f3389k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    private float f3390l = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: m  reason: collision with root package name */
    private float f3391m = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: n  reason: collision with root package name */
    private float f3392n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    private int f3393o = -1;

    /* renamed from: p  reason: collision with root package name */
    private float f3394p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    private float f3395q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    private float f3396r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    private float f3397s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    private float f3398t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    private float f3399u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    private float f3400v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    private float f3401w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    private float f3402x = Float.NaN;

    /* renamed from: y  reason: collision with root package name */
    private float f3403y = Float.NaN;

    /* renamed from: z  reason: collision with root package name */
    private float f3404z = Float.NaN;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f3405a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3405a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.W4, 1);
            f3405a.append(androidx.constraintlayout.widget.i.U4, 2);
            f3405a.append(androidx.constraintlayout.widget.i.X4, 3);
            f3405a.append(androidx.constraintlayout.widget.i.T4, 4);
            f3405a.append(androidx.constraintlayout.widget.i.f3956c5, 5);
            f3405a.append(androidx.constraintlayout.widget.i.f3934a5, 6);
            f3405a.append(androidx.constraintlayout.widget.i.Z4, 7);
            f3405a.append(androidx.constraintlayout.widget.i.f3967d5, 8);
            f3405a.append(androidx.constraintlayout.widget.i.J4, 9);
            f3405a.append(androidx.constraintlayout.widget.i.S4, 10);
            f3405a.append(androidx.constraintlayout.widget.i.O4, 11);
            f3405a.append(androidx.constraintlayout.widget.i.P4, 12);
            f3405a.append(androidx.constraintlayout.widget.i.Q4, 13);
            f3405a.append(androidx.constraintlayout.widget.i.Y4, 14);
            f3405a.append(androidx.constraintlayout.widget.i.M4, 15);
            f3405a.append(androidx.constraintlayout.widget.i.N4, 16);
            f3405a.append(androidx.constraintlayout.widget.i.K4, 17);
            f3405a.append(androidx.constraintlayout.widget.i.L4, 18);
            f3405a.append(androidx.constraintlayout.widget.i.R4, 19);
            f3405a.append(androidx.constraintlayout.widget.i.V4, 20);
            f3405a.append(androidx.constraintlayout.widget.i.f3945b5, 21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f3405a.get(index)) {
                    case 1:
                        if (p.f3510y3) {
                            int resourceId = typedArray.getResourceId(index, fVar.f3363b);
                            fVar.f3363b = resourceId;
                            if (resourceId == -1) {
                                fVar.f3364c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            fVar.f3364c = typedArray.getString(index);
                            break;
                        } else {
                            fVar.f3363b = typedArray.getResourceId(index, fVar.f3363b);
                            break;
                        }
                    case 2:
                        fVar.f3362a = typedArray.getInt(index, fVar.f3362a);
                        break;
                    case 3:
                        fVar.f3385g = typedArray.getString(index);
                        break;
                    case 4:
                        fVar.f3386h = typedArray.getInteger(index, fVar.f3386h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            fVar.f3388j = typedArray.getString(index);
                            fVar.f3387i = 7;
                            break;
                        } else {
                            fVar.f3387i = typedArray.getInt(index, fVar.f3387i);
                            break;
                        }
                    case 6:
                        fVar.f3389k = typedArray.getFloat(index, fVar.f3389k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            fVar.f3390l = typedArray.getDimension(index, fVar.f3390l);
                            break;
                        } else {
                            fVar.f3390l = typedArray.getFloat(index, fVar.f3390l);
                            break;
                        }
                    case 8:
                        fVar.f3393o = typedArray.getInt(index, fVar.f3393o);
                        break;
                    case 9:
                        fVar.f3394p = typedArray.getFloat(index, fVar.f3394p);
                        break;
                    case 10:
                        fVar.f3395q = typedArray.getDimension(index, fVar.f3395q);
                        break;
                    case 11:
                        fVar.f3396r = typedArray.getFloat(index, fVar.f3396r);
                        break;
                    case 12:
                        fVar.f3398t = typedArray.getFloat(index, fVar.f3398t);
                        break;
                    case 13:
                        fVar.f3399u = typedArray.getFloat(index, fVar.f3399u);
                        break;
                    case 14:
                        fVar.f3397s = typedArray.getFloat(index, fVar.f3397s);
                        break;
                    case 15:
                        fVar.f3400v = typedArray.getFloat(index, fVar.f3400v);
                        break;
                    case 16:
                        fVar.f3401w = typedArray.getFloat(index, fVar.f3401w);
                        break;
                    case 17:
                        fVar.f3402x = typedArray.getDimension(index, fVar.f3402x);
                        break;
                    case 18:
                        fVar.f3403y = typedArray.getDimension(index, fVar.f3403y);
                        break;
                    case 19:
                        if (Build.VERSION.SDK_INT >= 21) {
                            fVar.f3404z = typedArray.getDimension(index, fVar.f3404z);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        fVar.f3392n = typedArray.getFloat(index, fVar.f3392n);
                        break;
                    case 21:
                        fVar.f3391m = typedArray.getFloat(index, fVar.f3391m) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3405a.get(index));
                        break;
                }
            }
        }
    }

    public f() {
        this.f3365d = 4;
        this.f3366e = new HashMap<>();
    }

    public void T(HashMap<String, h3.c> hashMap) {
        h3.c cVar;
        h3.c cVar2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.f3366e.get(str.substring(7));
                if (aVar != null && aVar.d() == a.b.FLOAT_TYPE && (cVar = hashMap.get(str)) != null) {
                    cVar.d(this.f3362a, this.f3387i, this.f3388j, this.f3393o, this.f3389k, this.f3390l, this.f3391m, aVar.e(), aVar);
                }
            } else {
                float U = U(str);
                if (!Float.isNaN(U) && (cVar2 = hashMap.get(str)) != null) {
                    cVar2.c(this.f3362a, this.f3387i, this.f3388j, this.f3393o, this.f3389k, this.f3390l, this.f3391m, U);
                }
            }
        }
    }

    public float U(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c11 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c11 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c11 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c11 = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = 11;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c11 = '\r';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return this.f3398t;
            case 1:
                return this.f3399u;
            case 2:
                return this.f3402x;
            case 3:
                return this.f3403y;
            case 4:
                return this.f3404z;
            case 5:
                return this.f3392n;
            case 6:
                return this.f3400v;
            case 7:
                return this.f3401w;
            case '\b':
                return this.f3396r;
            case '\t':
                return this.f3395q;
            case '\n':
                return this.f3397s;
            case 11:
                return this.f3394p;
            case '\f':
                return this.f3390l;
            case '\r':
                return this.f3391m;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap<String, h3.d> hashMap) {
        androidx.constraintlayout.motion.widget.a.f("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            h3.d dVar = hashMap.get(str);
            if (dVar != null) {
                str.hashCode();
                char c11 = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c11 = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c11 = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c11 = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c11 = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c11 = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c11 = '\r';
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        dVar.b(this.f3362a, this.f3398t);
                        continue;
                    case 1:
                        dVar.b(this.f3362a, this.f3399u);
                        continue;
                    case 2:
                        dVar.b(this.f3362a, this.f3402x);
                        continue;
                    case 3:
                        dVar.b(this.f3362a, this.f3403y);
                        continue;
                    case 4:
                        dVar.b(this.f3362a, this.f3404z);
                        continue;
                    case 5:
                        dVar.b(this.f3362a, this.f3392n);
                        continue;
                    case 6:
                        dVar.b(this.f3362a, this.f3400v);
                        continue;
                    case 7:
                        dVar.b(this.f3362a, this.f3401w);
                        continue;
                    case '\b':
                        dVar.b(this.f3362a, this.f3396r);
                        continue;
                    case '\t':
                        dVar.b(this.f3362a, this.f3395q);
                        continue;
                    case '\n':
                        dVar.b(this.f3362a, this.f3397s);
                        continue;
                    case 11:
                        dVar.b(this.f3362a, this.f3394p);
                        continue;
                    case '\f':
                        dVar.b(this.f3362a, this.f3390l);
                        continue;
                    case '\r':
                        dVar.b(this.f3362a, this.f3391m);
                        continue;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* renamed from: b */
    public d clone() {
        return new f().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        f fVar = (f) dVar;
        this.f3385g = fVar.f3385g;
        this.f3386h = fVar.f3386h;
        this.f3387i = fVar.f3387i;
        this.f3388j = fVar.f3388j;
        this.f3389k = fVar.f3389k;
        this.f3390l = fVar.f3390l;
        this.f3391m = fVar.f3391m;
        this.f3392n = fVar.f3392n;
        this.f3393o = fVar.f3393o;
        this.f3394p = fVar.f3394p;
        this.f3395q = fVar.f3395q;
        this.f3396r = fVar.f3396r;
        this.f3397s = fVar.f3397s;
        this.f3398t = fVar.f3398t;
        this.f3399u = fVar.f3399u;
        this.f3400v = fVar.f3400v;
        this.f3401w = fVar.f3401w;
        this.f3402x = fVar.f3402x;
        this.f3403y = fVar.f3403y;
        this.f3404z = fVar.f3404z;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f3394p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f3395q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f3396r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f3398t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f3399u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f3400v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f3401w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f3397s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f3402x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f3403y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f3404z)) {
            hashSet.add("translationZ");
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
        a.b(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.I4));
    }
}