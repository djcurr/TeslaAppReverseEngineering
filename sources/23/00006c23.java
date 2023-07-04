package ezvcard.parameter;

import java.util.Objects;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f25409a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f25410b;

    public c(Integer num, Integer num2) {
        Objects.requireNonNull(num, "Local ID must not be null.");
        this.f25409a = num;
        this.f25410b = num2;
    }

    public static c a(String str) {
        String substring;
        int indexOf = str.indexOf(46);
        if (indexOf < 0) {
            substring = null;
        } else {
            String substring2 = str.substring(0, indexOf);
            substring = indexOf == str.length() + (-1) ? null : str.substring(indexOf + 1);
            str = substring2;
        }
        return new c(Integer.valueOf(str), substring != null ? Integer.valueOf(substring) : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            Integer num = this.f25410b;
            if (num == null) {
                if (cVar.f25410b != null) {
                    return false;
                }
            } else if (!num.equals(cVar.f25410b)) {
                return false;
            }
            return this.f25409a.equals(cVar.f25409a);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f25410b;
        return (((num == null ? 0 : num.hashCode()) + 31) * 31) + this.f25409a.hashCode();
    }

    public String toString() {
        if (this.f25410b == null) {
            return Integer.toString(this.f25409a.intValue());
        }
        return this.f25409a + "." + this.f25410b;
    }
}