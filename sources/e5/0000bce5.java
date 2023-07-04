package wk;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f56066a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f56067b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f56068c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f56069d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f56070e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f56071f;

    /* renamed from: g  reason: collision with root package name */
    private final List<f> f56072g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<g> f56073h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f56074i;

    /* loaded from: classes3.dex */
    class a extends g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f56075b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Matrix f56076c;

        a(m mVar, List list, Matrix matrix) {
            this.f56075b = list;
            this.f56076c = matrix;
        }

        @Override // wk.m.g
        public void a(Matrix matrix, vk.a aVar, int i11, Canvas canvas) {
            for (g gVar : this.f56075b) {
                gVar.a(this.f56076c, aVar, i11, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b extends g {

        /* renamed from: b  reason: collision with root package name */
        private final d f56077b;

        public b(d dVar) {
            this.f56077b = dVar;
        }

        @Override // wk.m.g
        public void a(Matrix matrix, vk.a aVar, int i11, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f56077b.k(), this.f56077b.o(), this.f56077b.l(), this.f56077b.j()), i11, this.f56077b.m(), this.f56077b.n());
        }
    }

    /* loaded from: classes3.dex */
    static class c extends g {

        /* renamed from: b  reason: collision with root package name */
        private final e f56078b;

        /* renamed from: c  reason: collision with root package name */
        private final float f56079c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56080d;

        public c(e eVar, float f11, float f12) {
            this.f56078b = eVar;
            this.f56079c = f11;
            this.f56080d = f12;
        }

        @Override // wk.m.g
        public void a(Matrix matrix, vk.a aVar, int i11, Canvas canvas) {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) Math.hypot(this.f56078b.f56089c - this.f56080d, this.f56078b.f56088b - this.f56079c), BitmapDescriptorFactory.HUE_RED);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f56079c, this.f56080d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i11);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f56078b.f56089c - this.f56080d) / (this.f56078b.f56088b - this.f56079c)));
        }
    }

    /* loaded from: classes3.dex */
    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f56081h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f56082b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f56083c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f56084d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f56085e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f56086f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f56087g;

        public d(float f11, float f12, float f13, float f14) {
            q(f11);
            u(f12);
            r(f13);
            p(f14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f56085e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f56082b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f56084d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f56086f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f56087g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f56083c;
        }

        private void p(float f11) {
            this.f56085e = f11;
        }

        private void q(float f11) {
            this.f56082b = f11;
        }

        private void r(float f11) {
            this.f56084d = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f11) {
            this.f56086f = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f11) {
            this.f56087g = f11;
        }

        private void u(float f11) {
            this.f56083c = f11;
        }

        @Override // wk.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f56090a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f56081h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        private float f56088b;

        /* renamed from: c  reason: collision with root package name */
        private float f56089c;

        @Override // wk.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f56090a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f56088b, this.f56089c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f56090a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        static final Matrix f56091a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, vk.a aVar, int i11, Canvas canvas);

        public final void b(vk.a aVar, int i11, Canvas canvas) {
            a(f56091a, aVar, i11, canvas);
        }
    }

    public m() {
        n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    private void b(float f11) {
        if (g() == f11) {
            return;
        }
        float g11 = ((f11 - g()) + 360.0f) % 360.0f;
        if (g11 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g11);
        this.f56073h.add(new b(dVar));
        p(f11);
    }

    private void c(g gVar, float f11, float f12) {
        b(f11);
        this.f56073h.add(gVar);
        p(f12);
    }

    private float g() {
        return this.f56070e;
    }

    private float h() {
        return this.f56071f;
    }

    private void p(float f11) {
        this.f56070e = f11;
    }

    private void q(float f11) {
        this.f56071f = f11;
    }

    private void r(float f11) {
        this.f56068c = f11;
    }

    private void s(float f11) {
        this.f56069d = f11;
    }

    private void t(float f11) {
        this.f56066a = f11;
    }

    private void u(float f11) {
        this.f56067b = f11;
    }

    public void a(float f11, float f12, float f13, float f14, float f15, float f16) {
        d dVar = new d(f11, f12, f13, f14);
        dVar.s(f15);
        dVar.t(f16);
        this.f56072g.add(dVar);
        b bVar = new b(dVar);
        float f17 = f15 + f16;
        boolean z11 = f16 < BitmapDescriptorFactory.HUE_RED;
        if (z11) {
            f15 = (f15 + 180.0f) % 360.0f;
        }
        c(bVar, f15, z11 ? (180.0f + f17) % 360.0f : f17);
        double d11 = f17;
        r(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.cos(Math.toRadians(d11)))));
        s(((f12 + f14) * 0.5f) + (((f14 - f12) / 2.0f) * ((float) Math.sin(Math.toRadians(d11)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f56072g.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f56072g.get(i11).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f56074i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(this, new ArrayList(this.f56073h), new Matrix(matrix));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f56068c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f56069d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        return this.f56066a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.f56067b;
    }

    public void m(float f11, float f12) {
        e eVar = new e();
        eVar.f56088b = f11;
        eVar.f56089c = f12;
        this.f56072g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f11);
        s(f12);
    }

    public void n(float f11, float f12) {
        o(f11, f12, 270.0f, BitmapDescriptorFactory.HUE_RED);
    }

    public void o(float f11, float f12, float f13, float f14) {
        t(f11);
        u(f12);
        r(f11);
        s(f12);
        p(f13);
        q((f13 + f14) % 360.0f);
        this.f56072g.clear();
        this.f56073h.clear();
        this.f56074i = false;
    }
}