package ik;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes3.dex */
public interface d {

    /* loaded from: classes3.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f30448b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f30449a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public e evaluate(float f11, e eVar, e eVar2) {
            this.f30449a.a(pk.a.c(eVar.f30452a, eVar2.f30452a, f11), pk.a.c(eVar.f30453b, eVar2.f30453b, f11), pk.a.c(eVar.f30454c, eVar2.f30454c, f11));
            return this.f30449a;
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f30450a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: ik.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0582d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f30451a = new C0582d("circularRevealScrimColor");

        private C0582d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f30452a;

        /* renamed from: b  reason: collision with root package name */
        public float f30453b;

        /* renamed from: c  reason: collision with root package name */
        public float f30454c;

        public void a(float f11, float f12, float f13) {
            this.f30452a = f11;
            this.f30453b = f12;
            this.f30454c = f13;
        }

        private e() {
        }

        public e(float f11, float f12, float f13) {
            this.f30452a = f11;
            this.f30453b = f12;
            this.f30454c = f13;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i11);

    void setRevealInfo(e eVar);
}