package o10;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.l;
import t10.e;
import wz.o;
import wz.r0;
import wz.w;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final EnumC0828a f42105a;

    /* renamed from: b  reason: collision with root package name */
    private final e f42106b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f42107c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f42108d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f42109e;

    /* renamed from: f  reason: collision with root package name */
    private final String f42110f;

    /* renamed from: g  reason: collision with root package name */
    private final int f42111g;

    /* renamed from: o10.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC0828a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final C0829a Companion = new C0829a(null);
        private static final Map<Integer, EnumC0828a> entryById;

        /* renamed from: id  reason: collision with root package name */
        private final int f42112id;

        /* renamed from: o10.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0829a {
            private C0829a() {
            }

            public /* synthetic */ C0829a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0828a a(int i11) {
                EnumC0828a enumC0828a = (EnumC0828a) EnumC0828a.entryById.get(Integer.valueOf(i11));
                return enumC0828a == null ? EnumC0828a.UNKNOWN : enumC0828a;
            }
        }

        static {
            int e11;
            int d11;
            EnumC0828a[] values = values();
            e11 = r0.e(values.length);
            d11 = l.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (EnumC0828a enumC0828a : values) {
                linkedHashMap.put(Integer.valueOf(enumC0828a.getId()), enumC0828a);
            }
            entryById = linkedHashMap;
        }

        EnumC0828a(int i11) {
            this.f42112id = i11;
        }

        public static final EnumC0828a getById(int i11) {
            return Companion.a(i11);
        }

        public final int getId() {
            return this.f42112id;
        }
    }

    public a(EnumC0828a kind, e metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i11, String str2) {
        s.g(kind, "kind");
        s.g(metadataVersion, "metadataVersion");
        this.f42105a = kind;
        this.f42106b = metadataVersion;
        this.f42107c = strArr;
        this.f42108d = strArr2;
        this.f42109e = strArr3;
        this.f42110f = str;
        this.f42111g = i11;
    }

    private final boolean h(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    public final String[] a() {
        return this.f42107c;
    }

    public final String[] b() {
        return this.f42108d;
    }

    public final EnumC0828a c() {
        return this.f42105a;
    }

    public final e d() {
        return this.f42106b;
    }

    public final String e() {
        String str = this.f42110f;
        if (c() == EnumC0828a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List<String> f() {
        List<String> i11;
        String[] strArr = this.f42107c;
        if (!(c() == EnumC0828a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        List<String> e11 = strArr != null ? o.e(strArr) : null;
        if (e11 != null) {
            return e11;
        }
        i11 = w.i();
        return i11;
    }

    public final String[] g() {
        return this.f42109e;
    }

    public final boolean i() {
        return h(this.f42111g, 2);
    }

    public final boolean j() {
        return h(this.f42111g, 64) && !h(this.f42111g, 32);
    }

    public final boolean k() {
        return h(this.f42111g, 16) && !h(this.f42111g, 32);
    }

    public String toString() {
        return this.f42105a + " version=" + this.f42106b;
    }
}