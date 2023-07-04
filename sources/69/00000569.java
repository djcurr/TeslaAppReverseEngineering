package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h3.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l implements Comparable<l> {

    /* renamed from: c  reason: collision with root package name */
    int f3464c;

    /* renamed from: o  reason: collision with root package name */
    private float f3476o;

    /* renamed from: a  reason: collision with root package name */
    private float f3462a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    int f3463b = 0;

    /* renamed from: d  reason: collision with root package name */
    private float f3465d = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: e  reason: collision with root package name */
    private float f3466e = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: f  reason: collision with root package name */
    private float f3467f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: g  reason: collision with root package name */
    public float f3468g = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: h  reason: collision with root package name */
    private float f3469h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    private float f3470i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    private float f3471j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    private float f3472k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    private float f3473l = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: m  reason: collision with root package name */
    private float f3474m = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: n  reason: collision with root package name */
    private float f3475n = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: p  reason: collision with root package name */
    private float f3477p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    private float f3478q = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f3479t = new LinkedHashMap<>();

    private boolean d(float f11, float f12) {
        return (Float.isNaN(f11) || Float.isNaN(f12)) ? Float.isNaN(f11) != Float.isNaN(f12) : Math.abs(f11 - f12) > 1.0E-6f;
    }

    public void a(HashMap<String, h3.d> hashMap, int i11) {
        for (String str : hashMap.keySet()) {
            h3.d dVar = hashMap.get(str);
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
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c11 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c11 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c11 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c11 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c11 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c11 = '\r';
                        break;
                    }
                    break;
            }
            float f11 = BitmapDescriptorFactory.HUE_RED;
            switch (c11) {
                case 0:
                    if (!Float.isNaN(this.f3467f)) {
                        f11 = this.f3467f;
                    }
                    dVar.b(i11, f11);
                    break;
                case 1:
                    if (!Float.isNaN(this.f3468g)) {
                        f11 = this.f3468g;
                    }
                    dVar.b(i11, f11);
                    break;
                case 2:
                    if (!Float.isNaN(this.f3473l)) {
                        f11 = this.f3473l;
                    }
                    dVar.b(i11, f11);
                    break;
                case 3:
                    if (!Float.isNaN(this.f3474m)) {
                        f11 = this.f3474m;
                    }
                    dVar.b(i11, f11);
                    break;
                case 4:
                    if (!Float.isNaN(this.f3475n)) {
                        f11 = this.f3475n;
                    }
                    dVar.b(i11, f11);
                    break;
                case 5:
                    if (!Float.isNaN(this.f3478q)) {
                        f11 = this.f3478q;
                    }
                    dVar.b(i11, f11);
                    break;
                case 6:
                    dVar.b(i11, Float.isNaN(this.f3469h) ? 1.0f : this.f3469h);
                    break;
                case 7:
                    dVar.b(i11, Float.isNaN(this.f3470i) ? 1.0f : this.f3470i);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f3471j)) {
                        f11 = this.f3471j;
                    }
                    dVar.b(i11, f11);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f3472k)) {
                        f11 = this.f3472k;
                    }
                    dVar.b(i11, f11);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f3466e)) {
                        f11 = this.f3466e;
                    }
                    dVar.b(i11, f11);
                    break;
                case 11:
                    if (!Float.isNaN(this.f3465d)) {
                        f11 = this.f3465d;
                    }
                    dVar.b(i11, f11);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f3477p)) {
                        f11 = this.f3477p;
                    }
                    dVar.b(i11, f11);
                    break;
                case '\r':
                    dVar.b(i11, Float.isNaN(this.f3462a) ? 1.0f : this.f3462a);
                    break;
                default:
                    if (!str.startsWith("CUSTOM")) {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    } else {
                        String str2 = str.split(",")[1];
                        if (this.f3479t.containsKey(str2)) {
                            androidx.constraintlayout.widget.a aVar = this.f3479t.get(str2);
                            if (dVar instanceof d.b) {
                                ((d.b) dVar).h(i11, aVar);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i11 + ", value" + aVar.e() + dVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
            }
        }
    }

    public void b(View view) {
        this.f3464c = view.getVisibility();
        this.f3462a = view.getVisibility() != 0 ? BitmapDescriptorFactory.HUE_RED : view.getAlpha();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            this.f3465d = view.getElevation();
        }
        this.f3466e = view.getRotation();
        this.f3467f = view.getRotationX();
        this.f3468g = view.getRotationY();
        this.f3469h = view.getScaleX();
        this.f3470i = view.getScaleY();
        this.f3471j = view.getPivotX();
        this.f3472k = view.getPivotY();
        this.f3473l = view.getTranslationX();
        this.f3474m = view.getTranslationY();
        if (i11 >= 21) {
            this.f3475n = view.getTranslationZ();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(l lVar) {
        return Float.compare(this.f3476o, lVar.f3476o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(l lVar, HashSet<String> hashSet) {
        if (d(this.f3462a, lVar.f3462a)) {
            hashSet.add("alpha");
        }
        if (d(this.f3465d, lVar.f3465d)) {
            hashSet.add("elevation");
        }
        int i11 = this.f3464c;
        int i12 = lVar.f3464c;
        if (i11 != i12 && this.f3463b == 0 && (i11 == 0 || i12 == 0)) {
            hashSet.add("alpha");
        }
        if (d(this.f3466e, lVar.f3466e)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f3477p) || !Float.isNaN(lVar.f3477p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f3478q) || !Float.isNaN(lVar.f3478q)) {
            hashSet.add("progress");
        }
        if (d(this.f3467f, lVar.f3467f)) {
            hashSet.add("rotationX");
        }
        if (d(this.f3468g, lVar.f3468g)) {
            hashSet.add("rotationY");
        }
        if (d(this.f3471j, lVar.f3471j)) {
            hashSet.add("transformPivotX");
        }
        if (d(this.f3472k, lVar.f3472k)) {
            hashSet.add("transformPivotY");
        }
        if (d(this.f3469h, lVar.f3469h)) {
            hashSet.add("scaleX");
        }
        if (d(this.f3470i, lVar.f3470i)) {
            hashSet.add("scaleY");
        }
        if (d(this.f3473l, lVar.f3473l)) {
            hashSet.add("translationX");
        }
        if (d(this.f3474m, lVar.f3474m)) {
            hashSet.add("translationY");
        }
        if (d(this.f3475n, lVar.f3475n)) {
            hashSet.add("translationZ");
        }
    }

    void f(float f11, float f12, float f13, float f14) {
    }

    public void g(View view) {
        f(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }
}