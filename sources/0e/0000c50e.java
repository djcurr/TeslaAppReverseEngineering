package zp;

import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class a implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f60565b = new a(PermissionsResponse.SCOPE_NONE, com.nimbusds.jose.d.REQUIRED);

    /* renamed from: a  reason: collision with root package name */
    private final String f60566a;

    public a(String str, com.nimbusds.jose.d dVar) {
        if (str != null) {
            this.f60566a = str;
            return;
        }
        throw new IllegalArgumentException("The algorithm name must not be null");
    }

    public static a a(String str) {
        if (str == null) {
            return null;
        }
        return new a(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && toString().equals(obj.toString());
    }

    public final String getName() {
        return this.f60566a;
    }

    public final int hashCode() {
        return this.f60566a.hashCode();
    }

    public final String toString() {
        return this.f60566a;
    }

    public a(String str) {
        this(str, null);
    }
}