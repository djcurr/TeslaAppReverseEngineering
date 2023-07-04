package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public class h extends i {

    /* renamed from: h  reason: collision with root package name */
    String f3408h = null;

    /* renamed from: i  reason: collision with root package name */
    int f3409i = d.f3361f;

    /* renamed from: j  reason: collision with root package name */
    int f3410j = 0;

    /* renamed from: k  reason: collision with root package name */
    float f3411k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    float f3412l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    float f3413m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    float f3414n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    float f3415o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    float f3416p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    int f3417q = 0;

    /* renamed from: r  reason: collision with root package name */
    private float f3418r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    private float f3419s = Float.NaN;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f3420a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3420a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.f4028j5, 1);
            f3420a.append(androidx.constraintlayout.widget.i.f4008h5, 2);
            f3420a.append(androidx.constraintlayout.widget.i.f4098q5, 3);
            f3420a.append(androidx.constraintlayout.widget.i.f3988f5, 4);
            f3420a.append(androidx.constraintlayout.widget.i.f3998g5, 5);
            f3420a.append(androidx.constraintlayout.widget.i.f4068n5, 6);
            f3420a.append(androidx.constraintlayout.widget.i.f4078o5, 7);
            f3420a.append(androidx.constraintlayout.widget.i.f4018i5, 9);
            f3420a.append(androidx.constraintlayout.widget.i.f4088p5, 8);
            f3420a.append(androidx.constraintlayout.widget.i.f4058m5, 11);
            f3420a.append(androidx.constraintlayout.widget.i.f4048l5, 12);
            f3420a.append(androidx.constraintlayout.widget.i.f4038k5, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f3420a.get(index)) {
                    case 1:
                        if (p.f3510y3) {
                            int resourceId = typedArray.getResourceId(index, hVar.f3363b);
                            hVar.f3363b = resourceId;
                            if (resourceId == -1) {
                                hVar.f3364c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hVar.f3364c = typedArray.getString(index);
                            break;
                        } else {
                            hVar.f3363b = typedArray.getResourceId(index, hVar.f3363b);
                            break;
                        }
                    case 2:
                        hVar.f3362a = typedArray.getInt(index, hVar.f3362a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            hVar.f3408h = typedArray.getString(index);
                            break;
                        } else {
                            hVar.f3408h = c3.c.f8792c[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        hVar.f3421g = typedArray.getInteger(index, hVar.f3421g);
                        break;
                    case 5:
                        hVar.f3410j = typedArray.getInt(index, hVar.f3410j);
                        break;
                    case 6:
                        hVar.f3413m = typedArray.getFloat(index, hVar.f3413m);
                        break;
                    case 7:
                        hVar.f3414n = typedArray.getFloat(index, hVar.f3414n);
                        break;
                    case 8:
                        float f11 = typedArray.getFloat(index, hVar.f3412l);
                        hVar.f3411k = f11;
                        hVar.f3412l = f11;
                        break;
                    case 9:
                        hVar.f3417q = typedArray.getInt(index, hVar.f3417q);
                        break;
                    case 10:
                        hVar.f3409i = typedArray.getInt(index, hVar.f3409i);
                        break;
                    case 11:
                        hVar.f3411k = typedArray.getFloat(index, hVar.f3411k);
                        break;
                    case 12:
                        hVar.f3412l = typedArray.getFloat(index, hVar.f3412l);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3420a.get(index));
                        break;
                }
            }
            if (hVar.f3362a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public h() {
        this.f3365d = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap<String, h3.d> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* renamed from: b */
    public d clone() {
        return new h().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        h hVar = (h) dVar;
        this.f3408h = hVar.f3408h;
        this.f3409i = hVar.f3409i;
        this.f3410j = hVar.f3410j;
        this.f3411k = hVar.f3411k;
        this.f3412l = Float.NaN;
        this.f3413m = hVar.f3413m;
        this.f3414n = hVar.f3414n;
        this.f3415o = hVar.f3415o;
        this.f3416p = hVar.f3416p;
        this.f3418r = hVar.f3418r;
        this.f3419s = hVar.f3419s;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f3978e5));
    }
}