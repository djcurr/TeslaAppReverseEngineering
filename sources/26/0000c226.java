package y7;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import y7.a;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f59300a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f59301b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f59302c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f59303d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f59304e;

    /* renamed from: f  reason: collision with root package name */
    private a<PointF, PointF> f59305f;

    /* renamed from: g  reason: collision with root package name */
    private a<?, PointF> f59306g;

    /* renamed from: h  reason: collision with root package name */
    private a<i8.d, i8.d> f59307h;

    /* renamed from: i  reason: collision with root package name */
    private a<Float, Float> f59308i;

    /* renamed from: j  reason: collision with root package name */
    private a<Integer, Integer> f59309j;

    /* renamed from: k  reason: collision with root package name */
    private d f59310k;

    /* renamed from: l  reason: collision with root package name */
    private d f59311l;

    /* renamed from: m  reason: collision with root package name */
    private a<?, Float> f59312m;

    /* renamed from: n  reason: collision with root package name */
    private a<?, Float> f59313n;

    public p(b8.l lVar) {
        this.f59305f = lVar.c() == null ? null : lVar.c().l();
        this.f59306g = lVar.f() == null ? null : lVar.f().l();
        this.f59307h = lVar.h() == null ? null : lVar.h().l();
        this.f59308i = lVar.g() == null ? null : lVar.g().l();
        d dVar = lVar.i() == null ? null : (d) lVar.i().l();
        this.f59310k = dVar;
        if (dVar != null) {
            this.f59301b = new Matrix();
            this.f59302c = new Matrix();
            this.f59303d = new Matrix();
            this.f59304e = new float[9];
        } else {
            this.f59301b = null;
            this.f59302c = null;
            this.f59303d = null;
            this.f59304e = null;
        }
        this.f59311l = lVar.j() == null ? null : (d) lVar.j().l();
        if (lVar.e() != null) {
            this.f59309j = lVar.e().l();
        }
        if (lVar.k() != null) {
            this.f59312m = lVar.k().l();
        } else {
            this.f59312m = null;
        }
        if (lVar.d() != null) {
            this.f59313n = lVar.d().l();
        } else {
            this.f59313n = null;
        }
    }

    private void d() {
        for (int i11 = 0; i11 < 9; i11++) {
            this.f59304e[i11] = 0.0f;
        }
    }

    public void a(d8.b bVar) {
        bVar.h(this.f59309j);
        bVar.h(this.f59312m);
        bVar.h(this.f59313n);
        bVar.h(this.f59305f);
        bVar.h(this.f59306g);
        bVar.h(this.f59307h);
        bVar.h(this.f59308i);
        bVar.h(this.f59310k);
        bVar.h(this.f59311l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f59309j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f59312m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f59313n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f59305f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f59306g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<i8.d, i8.d> aVar6 = this.f59307h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f59308i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f59310k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f59311l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t11, i8.c<T> cVar) {
        if (t11 == v7.j.f54285f) {
            a<PointF, PointF> aVar = this.f59305f;
            if (aVar == null) {
                this.f59305f = new q(cVar, new PointF());
                return true;
            }
            aVar.n(cVar);
            return true;
        } else if (t11 == v7.j.f54286g) {
            a<?, PointF> aVar2 = this.f59306g;
            if (aVar2 == null) {
                this.f59306g = new q(cVar, new PointF());
                return true;
            }
            aVar2.n(cVar);
            return true;
        } else {
            if (t11 == v7.j.f54287h) {
                a<?, PointF> aVar3 = this.f59306g;
                if (aVar3 instanceof n) {
                    ((n) aVar3).r(cVar);
                    return true;
                }
            }
            if (t11 == v7.j.f54288i) {
                a<?, PointF> aVar4 = this.f59306g;
                if (aVar4 instanceof n) {
                    ((n) aVar4).s(cVar);
                    return true;
                }
            }
            if (t11 == v7.j.f54294o) {
                a<i8.d, i8.d> aVar5 = this.f59307h;
                if (aVar5 == null) {
                    this.f59307h = new q(cVar, new i8.d());
                    return true;
                }
                aVar5.n(cVar);
                return true;
            } else if (t11 == v7.j.f54295p) {
                a<Float, Float> aVar6 = this.f59308i;
                if (aVar6 == null) {
                    this.f59308i = new q(cVar, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
                    return true;
                }
                aVar6.n(cVar);
                return true;
            } else if (t11 == v7.j.f54282c) {
                a<Integer, Integer> aVar7 = this.f59309j;
                if (aVar7 == null) {
                    this.f59309j = new q(cVar, 100);
                    return true;
                }
                aVar7.n(cVar);
                return true;
            } else if (t11 == v7.j.C) {
                a<?, Float> aVar8 = this.f59312m;
                if (aVar8 == null) {
                    this.f59312m = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.n(cVar);
                return true;
            } else if (t11 == v7.j.D) {
                a<?, Float> aVar9 = this.f59313n;
                if (aVar9 == null) {
                    this.f59313n = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.n(cVar);
                return true;
            } else if (t11 == v7.j.f54296q) {
                if (this.f59310k == null) {
                    this.f59310k = new d(Collections.singletonList(new i8.a(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED))));
                }
                this.f59310k.n(cVar);
                return true;
            } else if (t11 == v7.j.f54297r) {
                if (this.f59311l == null) {
                    this.f59311l = new d(Collections.singletonList(new i8.a(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED))));
                }
                this.f59311l.n(cVar);
                return true;
            } else {
                return false;
            }
        }
    }

    public a<?, Float> e() {
        return this.f59313n;
    }

    public Matrix f() {
        float p11;
        PointF h11;
        this.f59300a.reset();
        a<?, PointF> aVar = this.f59306g;
        if (aVar != null && (h11 = aVar.h()) != null) {
            float f11 = h11.x;
            if (f11 != BitmapDescriptorFactory.HUE_RED || h11.y != BitmapDescriptorFactory.HUE_RED) {
                this.f59300a.preTranslate(f11, h11.y);
            }
        }
        a<Float, Float> aVar2 = this.f59308i;
        if (aVar2 != null) {
            if (aVar2 instanceof q) {
                p11 = aVar2.h().floatValue();
            } else {
                p11 = ((d) aVar2).p();
            }
            if (p11 != BitmapDescriptorFactory.HUE_RED) {
                this.f59300a.preRotate(p11);
            }
        }
        d dVar = this.f59310k;
        if (dVar != null) {
            d dVar2 = this.f59311l;
            float cos = dVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar2.p()) + 90.0f));
            d dVar3 = this.f59311l;
            float sin = dVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar3.p()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(dVar.p()));
            d();
            float[] fArr = this.f59304e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f12 = -sin;
            fArr[3] = f12;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f59301b.setValues(fArr);
            d();
            float[] fArr2 = this.f59304e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f59302c.setValues(fArr2);
            d();
            float[] fArr3 = this.f59304e;
            fArr3[0] = cos;
            fArr3[1] = f12;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f59303d.setValues(fArr3);
            this.f59302c.preConcat(this.f59301b);
            this.f59303d.preConcat(this.f59302c);
            this.f59300a.preConcat(this.f59303d);
        }
        a<i8.d, i8.d> aVar3 = this.f59307h;
        if (aVar3 != null) {
            i8.d h12 = aVar3.h();
            if (h12.b() != 1.0f || h12.c() != 1.0f) {
                this.f59300a.preScale(h12.b(), h12.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f59305f;
        if (aVar4 != null) {
            PointF h13 = aVar4.h();
            float f13 = h13.x;
            if (f13 != BitmapDescriptorFactory.HUE_RED || h13.y != BitmapDescriptorFactory.HUE_RED) {
                this.f59300a.preTranslate(-f13, -h13.y);
            }
        }
        return this.f59300a;
    }

    public Matrix g(float f11) {
        a<?, PointF> aVar = this.f59306g;
        PointF h11 = aVar == null ? null : aVar.h();
        a<i8.d, i8.d> aVar2 = this.f59307h;
        i8.d h12 = aVar2 == null ? null : aVar2.h();
        this.f59300a.reset();
        if (h11 != null) {
            this.f59300a.preTranslate(h11.x * f11, h11.y * f11);
        }
        if (h12 != null) {
            double d11 = f11;
            this.f59300a.preScale((float) Math.pow(h12.b(), d11), (float) Math.pow(h12.c(), d11));
        }
        a<Float, Float> aVar3 = this.f59308i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f59305f;
            PointF h13 = aVar4 != null ? aVar4.h() : null;
            Matrix matrix = this.f59300a;
            float f12 = floatValue * f11;
            float f13 = BitmapDescriptorFactory.HUE_RED;
            float f14 = h13 == null ? 0.0f : h13.x;
            if (h13 != null) {
                f13 = h13.y;
            }
            matrix.preRotate(f12, f14, f13);
        }
        return this.f59300a;
    }

    public a<?, Integer> h() {
        return this.f59309j;
    }

    public a<?, Float> i() {
        return this.f59312m;
    }

    public void j(float f11) {
        a<Integer, Integer> aVar = this.f59309j;
        if (aVar != null) {
            aVar.m(f11);
        }
        a<?, Float> aVar2 = this.f59312m;
        if (aVar2 != null) {
            aVar2.m(f11);
        }
        a<?, Float> aVar3 = this.f59313n;
        if (aVar3 != null) {
            aVar3.m(f11);
        }
        a<PointF, PointF> aVar4 = this.f59305f;
        if (aVar4 != null) {
            aVar4.m(f11);
        }
        a<?, PointF> aVar5 = this.f59306g;
        if (aVar5 != null) {
            aVar5.m(f11);
        }
        a<i8.d, i8.d> aVar6 = this.f59307h;
        if (aVar6 != null) {
            aVar6.m(f11);
        }
        a<Float, Float> aVar7 = this.f59308i;
        if (aVar7 != null) {
            aVar7.m(f11);
        }
        d dVar = this.f59310k;
        if (dVar != null) {
            dVar.m(f11);
        }
        d dVar2 = this.f59311l;
        if (dVar2 != null) {
            dVar2.m(f11);
        }
    }
}