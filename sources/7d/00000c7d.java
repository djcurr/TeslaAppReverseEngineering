package bh;

import ah.c;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class a implements c, Serializable {

    /* renamed from: a  reason: collision with root package name */
    protected final String f7665a;

    public a(String str) {
        if (str != null) {
            this.f7665a = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != a.class) {
            return false;
        }
        return this.f7665a.equals(((a) obj).f7665a);
    }

    public final int hashCode() {
        return this.f7665a.hashCode();
    }

    public final String toString() {
        return this.f7665a;
    }
}