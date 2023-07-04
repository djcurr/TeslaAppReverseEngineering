package ezvcard;

import com.stripe.android.networking.FraudDetectionData;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import org.spongycastle.i18n.TextBundle;
import vw.b;

/* loaded from: classes5.dex */
public class VCardDataType {

    /* renamed from: b  reason: collision with root package name */
    private static final ezvcard.util.a<VCardDataType, String> f25375b = new a(VCardDataType.class);
    @b({VCardVersion.V2_1})

    /* renamed from: c  reason: collision with root package name */
    public static final VCardDataType f25376c = new VCardDataType("url");
    @b({VCardVersion.V3_0, VCardVersion.V4_0})

    /* renamed from: d  reason: collision with root package name */
    public static final VCardDataType f25377d;

    /* renamed from: e  reason: collision with root package name */
    public static final VCardDataType f25378e;
    @b({VCardVersion.V4_0})

    /* renamed from: f  reason: collision with root package name */
    public static final VCardDataType f25379f;
    @b({VCardVersion.V4_0})

    /* renamed from: g  reason: collision with root package name */
    public static final VCardDataType f25380g;
    @b({VCardVersion.V4_0})

    /* renamed from: h  reason: collision with root package name */
    public static final VCardDataType f25381h;
    @b({VCardVersion.V4_0})

    /* renamed from: i  reason: collision with root package name */
    public static final VCardDataType f25382i;

    /* renamed from: a  reason: collision with root package name */
    private final String f25383a;

    /* loaded from: classes5.dex */
    static class a extends ezvcard.util.a<VCardDataType, String> {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.util.a
        /* renamed from: i */
        public VCardDataType c(String str) {
            return new VCardDataType(str, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.util.a
        /* renamed from: j */
        public boolean h(VCardDataType vCardDataType, String str) {
            return vCardDataType.f25383a.equalsIgnoreCase(str);
        }
    }

    static {
        new VCardDataType("content-id");
        new VCardDataType("binary");
        f25377d = new VCardDataType("uri");
        f25378e = new VCardDataType(TextBundle.TEXT_ENTRY);
        new VCardDataType("date");
        new VCardDataType("time");
        new VCardDataType("date-time");
        f25379f = new VCardDataType("date-and-or-time");
        f25380g = new VCardDataType(FraudDetectionData.KEY_TIMESTAMP);
        new VCardDataType("boolean");
        new VCardDataType("integer");
        new VCardDataType("float");
        f25381h = new VCardDataType("utc-offset");
        f25382i = new VCardDataType("language-tag");
    }

    /* synthetic */ VCardDataType(String str, a aVar) {
        this(str);
    }

    public static Collection<VCardDataType> b() {
        return f25375b.a();
    }

    public static VCardDataType c(String str) {
        return f25375b.d(str);
    }

    public static VCardDataType d(String str) {
        return f25375b.e(str);
    }

    public String e() {
        return this.f25383a;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public VCardVersion[] f() {
        Field[] fields;
        for (Field field : getClass().getFields()) {
            if (Modifier.isStatic(field.getModifiers())) {
                try {
                    if (field.get(null) == this) {
                        b bVar = (b) field.getAnnotation(b.class);
                        return bVar == null ? VCardVersion.values() : bVar.value();
                    }
                } catch (IllegalAccessException | IllegalArgumentException unused) {
                    continue;
                }
            }
        }
        return VCardVersion.values();
    }

    public boolean g(VCardVersion vCardVersion) {
        for (VCardVersion vCardVersion2 : f()) {
            if (vCardVersion2 == vCardVersion) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return this.f25383a;
    }

    private VCardDataType(String str) {
        this.f25383a = str;
    }
}