package pv;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.camera.core.g0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import go.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mo.e;
import oo.a;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final vz.k f46978a;

    /* renamed from: b  reason: collision with root package name */
    private final vz.k f46979b;

    /* renamed from: c  reason: collision with root package name */
    private final vz.k f46980c;

    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: pv.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1008a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final b f46981a;

            /* renamed from: b  reason: collision with root package name */
            private final String f46982b;

            /* renamed from: c  reason: collision with root package name */
            private final Bitmap f46983c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1008a(b extractionType, String extractionRawPayload, Bitmap bitmap) {
                super(null);
                kotlin.jvm.internal.s.g(extractionType, "extractionType");
                kotlin.jvm.internal.s.g(extractionRawPayload, "extractionRawPayload");
                kotlin.jvm.internal.s.g(bitmap, "bitmap");
                this.f46981a = extractionType;
                this.f46982b = extractionRawPayload;
                this.f46983c = bitmap;
            }

            public final Bitmap a() {
                return this.f46983c;
            }

            public final String b() {
                return this.f46982b;
            }

            public final b c() {
                return this.f46981a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C1008a) {
                    C1008a c1008a = (C1008a) obj;
                    return this.f46981a == c1008a.f46981a && kotlin.jvm.internal.s.c(this.f46982b, c1008a.f46982b) && kotlin.jvm.internal.s.c(this.f46983c, c1008a.f46983c);
                }
                return false;
            }

            public int hashCode() {
                return (((this.f46981a.hashCode() * 31) + this.f46982b.hashCode()) * 31) + this.f46983c.hashCode();
            }

            public String toString() {
                return "Back(extractionType=" + this.f46981a + ", extractionRawPayload=" + this.f46982b + ", bitmap=" + this.f46983c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes2.dex */
        public enum b {
            MRZ("mrz"),
            PDF417("pdf417");
            
            private final String value;

            b(String str) {
                this.value = str;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Bitmap f46984a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Bitmap bitmap) {
                super(null);
                kotlin.jvm.internal.s.g(bitmap, "bitmap");
                this.f46984a = bitmap;
            }

            public final Bitmap a() {
                return this.f46984a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.s.c(this.f46984a, ((c) obj).f46984a);
            }

            public int hashCode() {
                return this.f46984a.hashCode();
            }

            public String toString() {
                return "Front(bitmap=" + this.f46984a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f46985a;

            /* renamed from: b  reason: collision with root package name */
            private final Bitmap f46986b;

            /* renamed from: c  reason: collision with root package name */
            private final b f46987c;

            public final Bitmap a() {
                return this.f46986b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return kotlin.jvm.internal.s.c(this.f46985a, dVar.f46985a) && kotlin.jvm.internal.s.c(this.f46986b, dVar.f46986b) && this.f46987c == dVar.f46987c;
                }
                return false;
            }

            public int hashCode() {
                return (((this.f46985a.hashCode() * 31) + this.f46986b.hashCode()) * 31) + this.f46987c.hashCode();
            }

            public String toString() {
                return "Mrz(extractionRawPayload=" + this.f46985a + ", bitmap=" + this.f46986b + ", extractionType=" + this.f46987c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes2.dex */
        public static final class e extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f46988a = new e();

            private e() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<go.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f46989a = new b();

        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final go.a invoke() {
            go.a a11 = go.c.a(new b.a().b(2048, new int[0]).a());
            kotlin.jvm.internal.s.f(a11, "getClient(\n      Barcode…7)\n        .build()\n    )");
            return a11;
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<mo.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f46990a = new c();

        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final mo.d invoke() {
            mo.d a11 = mo.c.a(new e.a().b(0.1f).a());
            kotlin.jvm.internal.s.f(a11, "getClient(\n      FaceDet…f)\n        .build()\n    )");
            return a11;
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.a<oo.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f46991a = new d();

        d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final oo.c invoke() {
            oo.c a11 = oo.b.a(qo.a.f48375c);
            kotlin.jvm.internal.s.f(a11, "getClient(TextRecognizerOptions.DEFAULT_OPTIONS)");
            return a11;
        }
    }

    public r() {
        vz.k a11;
        vz.k a12;
        vz.k a13;
        a11 = vz.m.a(d.f46991a);
        this.f46978a = a11;
        a12 = vz.m.a(c.f46990a);
        this.f46979b = a12;
        a13 = vz.m.a(b.f46989a);
        this.f46980c = a13;
    }

    private final go.a b() {
        return (go.a) this.f46980c.getValue();
    }

    private final mo.d c() {
        return (mo.d) this.f46979b.getValue();
    }

    private final oo.c d() {
        return (oo.c) this.f46978a.getValue();
    }

    public final a a(g0 image) {
        int t11;
        List v11;
        int t12;
        kotlin.jvm.internal.s.g(image, "image");
        ko.a b11 = t.b(image);
        if (b11 == null) {
            return a.e.f46988a;
        }
        Task<List<mo.a>> c11 = c().c(b11);
        kotlin.jvm.internal.s.f(c11, "faceDetector.process(inputImage)");
        Task<oo.a> c12 = d().c(b11);
        kotlin.jvm.internal.s.f(c12, "textDetector.process(inputImage)");
        Task<List<ho.a>> c13 = b().c(b11);
        kotlin.jvm.internal.s.f(c13, "barcodeDetector.process(inputImage)");
        try {
            Tasks.await(Tasks.whenAll(c11, c12, c13));
            List<ho.a> result = c13.getResult();
            ho.a aVar = result == null ? null : (ho.a) wz.u.e0(result, 0);
            if (aVar != null) {
                Bitmap d11 = t.d(b11);
                if (d11 == null) {
                    return a.e.f46988a;
                }
                Rect rect = new Rect(0, 0, d11.getWidth(), d11.getHeight());
                if (aVar.b() == 2048) {
                    a.b bVar = a.b.PDF417;
                    Rect a11 = aVar.a();
                    if (a11 == null) {
                        return a.e.f46988a;
                    }
                    if (rect.contains(a11)) {
                        String c14 = aVar.c();
                        return c14 == null ? a.e.f46988a : new a.C1008a(bVar, c14, d11);
                    }
                    return a.e.f46988a;
                }
                return a.e.f46988a;
            }
            List<mo.a> result2 = c11.getResult();
            mo.a aVar2 = result2 == null ? null : (mo.a) wz.u.e0(result2, 0);
            if (aVar2 == null) {
                return a.e.f46988a;
            }
            oo.a result3 = c12.getResult();
            List<a.e> a12 = result3 != null ? result3.a() : null;
            if (a12 == null) {
                a12 = wz.w.i();
            }
            t11 = wz.x.t(a12, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (a.e eVar : a12) {
                List<a.b> c15 = eVar.c();
                kotlin.jvm.internal.s.f(c15, "it.lines");
                t12 = wz.x.t(c15, 10);
                ArrayList arrayList2 = new ArrayList(t12);
                for (a.b bVar2 : c15) {
                    arrayList2.add(bVar2.c());
                }
                arrayList.add(arrayList2);
            }
            v11 = wz.x.v(arrayList);
            if (v11.size() < 5) {
                return a.e.f46988a;
            }
            Bitmap d12 = t.d(b11);
            if (d12 == null) {
                return a.e.f46988a;
            }
            if (new Rect(0, 0, d12.getWidth(), d12.getHeight()).contains(aVar2.a())) {
                return new a.c(d12);
            }
            return a.e.f46988a;
        } catch (ExecutionException unused) {
            return a.e.f46988a;
        }
    }

    public final a e(g0 image) {
        kotlin.jvm.internal.s.g(image, "image");
        ko.a b11 = t.b(image);
        if (b11 == null) {
            return a.e.f46988a;
        }
        Task<List<ho.a>> c11 = b().c(b11);
        kotlin.jvm.internal.s.f(c11, "barcodeDetector.process(inputImage)");
        try {
            Tasks.await(c11);
            List<ho.a> result = c11.getResult();
            ho.a aVar = result == null ? null : (ho.a) wz.u.e0(result, 0);
            if (aVar == null) {
                return a.e.f46988a;
            }
            if (aVar.b() == 2048) {
                a.b bVar = a.b.PDF417;
                Bitmap d11 = t.d(b11);
                if (d11 == null) {
                    return a.e.f46988a;
                }
                Rect rect = new Rect(0, 0, d11.getWidth(), d11.getHeight());
                Rect a11 = aVar.a();
                if (a11 == null) {
                    return a.e.f46988a;
                }
                if (rect.contains(a11)) {
                    String c12 = aVar.c();
                    return c12 == null ? a.e.f46988a : new a.C1008a(bVar, c12, d11);
                }
                return a.e.f46988a;
            }
            return a.e.f46988a;
        } catch (ExecutionException unused) {
            return a.e.f46988a;
        }
    }

    public final a f(g0 image) {
        int t11;
        List v11;
        int t12;
        kotlin.jvm.internal.s.g(image, "image");
        ko.a b11 = t.b(image);
        if (b11 == null) {
            return a.e.f46988a;
        }
        Task<List<mo.a>> c11 = c().c(b11);
        kotlin.jvm.internal.s.f(c11, "faceDetector.process(inputImage)");
        Task<oo.a> c12 = d().c(b11);
        kotlin.jvm.internal.s.f(c12, "textDetector.process(inputImage)");
        try {
            Tasks.await(Tasks.whenAll(c11, c12));
            List<mo.a> result = c11.getResult();
            mo.a aVar = result == null ? null : (mo.a) wz.u.e0(result, 0);
            if (aVar == null) {
                return a.e.f46988a;
            }
            oo.a result2 = c12.getResult();
            List<a.e> a11 = result2 != null ? result2.a() : null;
            if (a11 == null) {
                a11 = wz.w.i();
            }
            t11 = wz.x.t(a11, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (a.e eVar : a11) {
                List<a.b> c13 = eVar.c();
                kotlin.jvm.internal.s.f(c13, "it.lines");
                t12 = wz.x.t(c13, 10);
                ArrayList arrayList2 = new ArrayList(t12);
                for (a.b bVar : c13) {
                    arrayList2.add(bVar.c());
                }
                arrayList.add(arrayList2);
            }
            v11 = wz.x.v(arrayList);
            if (v11.size() < 5) {
                return a.e.f46988a;
            }
            Bitmap d11 = t.d(b11);
            if (d11 == null) {
                return a.e.f46988a;
            }
            if (new Rect(0, 0, d11.getWidth(), d11.getHeight()).contains(aVar.a())) {
                return new a.c(d11);
            }
            return a.e.f46988a;
        } catch (ExecutionException unused) {
            return a.e.f46988a;
        }
    }
}