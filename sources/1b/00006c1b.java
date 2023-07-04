package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* loaded from: classes5.dex */
public class VCardParameter {

    /* renamed from: a  reason: collision with root package name */
    protected final String f25404a;

    public VCardParameter(String str) {
        this(str, false);
    }

    public VCardVersion[] a() {
        Field[] fields;
        for (Field field : getClass().getFields()) {
            if (Modifier.isStatic(field.getModifiers())) {
                try {
                    if (field.get(null) == this) {
                        vw.b bVar = (vw.b) field.getAnnotation(vw.b.class);
                        return bVar == null ? VCardVersion.values() : bVar.value();
                    }
                } catch (IllegalAccessException | IllegalArgumentException unused) {
                    continue;
                }
            }
        }
        return VCardVersion.values();
    }

    public String b() {
        return this.f25404a;
    }

    public boolean c(VCardVersion vCardVersion) {
        for (VCardVersion vCardVersion2 : a()) {
            if (vCardVersion2 == vCardVersion) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VCardParameter vCardParameter = (VCardParameter) obj;
            String str = this.f25404a;
            if (str == null) {
                if (vCardParameter.f25404a != null) {
                    return false;
                }
            } else if (!str.equals(vCardParameter.f25404a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f25404a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return this.f25404a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VCardParameter(String str, boolean z11) {
        if (str != null && !z11) {
            str = str.toLowerCase();
        }
        this.f25404a = str;
    }
}