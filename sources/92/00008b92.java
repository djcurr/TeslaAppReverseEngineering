package net.time4j.format;

import ch.qos.logback.core.CoreConstants;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f41261a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(String[] strArr) {
        this.f41261a = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    private boolean a(char c11, char c12) {
        if (c11 >= 'a' && c11 <= 'z') {
            if (c12 >= 'A' && c12 <= 'Z') {
                c12 = (char) ((c12 + 'a') - 65);
            }
            return c11 == c12;
        } else if (c11 < 'A' || c11 > 'Z') {
            return Character.toUpperCase(c11) == Character.toUpperCase(c12) || Character.toLowerCase(c11) == Character.toLowerCase(c12);
        } else {
            char c13 = (char) ((c11 + 'a') - 65);
            if (c12 >= 'A' && c12 <= 'Z') {
                c12 = (char) ((c12 + 'a') - 65);
            }
            return c13 == c12;
        }
    }

    private <V extends Enum<V>> V f(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        String str;
        V v11;
        V[] enumConstants = cls.getEnumConstants();
        int size = this.f41261a.size();
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        String str2 = "";
        String str3 = "";
        int i13 = 0;
        V v12 = null;
        int i14 = 0;
        while (i13 < enumConstants.length) {
            boolean isEmpty = str3.isEmpty();
            if (isEmpty) {
                str3 = i13 >= size ? enumConstants[i13].name() : this.f41261a.get(i13);
            }
            int length2 = str3.length();
            int i15 = index;
            int i16 = 0;
            boolean z14 = true;
            while (z14 && i16 < length2) {
                int i17 = size;
                int i18 = index + i16;
                if (i18 >= length) {
                    str = str2;
                    v11 = v12;
                    z14 = false;
                } else {
                    char charAt = charSequence.charAt(i18);
                    str = str2;
                    char charAt2 = str3.charAt(i16);
                    v11 = v12;
                    if (z13) {
                        if (charAt == 160) {
                            charAt = ' ';
                        }
                        if (charAt2 == 160) {
                            charAt2 = ' ';
                        }
                    }
                    boolean z15 = !z11 ? charAt != charAt2 : !(charAt == charAt2 || a(charAt, charAt2));
                    if (z15) {
                        i15++;
                    }
                    z14 = z15;
                }
                i16++;
                size = i17;
                str2 = str;
                v12 = v11;
            }
            int i19 = size;
            String str4 = str2;
            V v13 = v12;
            if (z13 && isEmpty && length2 == 5 && str3.charAt(4) == '.' && i15 == (i12 = index + 3) && i12 < length && charSequence.charAt(i12) == '.') {
                i13--;
                str3 = ((Object) str3.subSequence(index, i12)) + ".";
            } else {
                if (z12 || length2 == 1) {
                    int i21 = i15 - index;
                    if (i14 < i21) {
                        v12 = enumConstants[i13];
                        i14 = i21;
                        str3 = str4;
                        i11 = 1;
                        i13 += i11;
                        size = i19;
                        str2 = str4;
                    } else if (i14 == i21) {
                        str3 = str4;
                        i11 = 1;
                        v12 = null;
                        i13 += i11;
                        size = i19;
                        str2 = str4;
                    }
                } else if (z14) {
                    parsePosition.setIndex(i15);
                    return enumConstants[i13];
                }
                str3 = str4;
            }
            v12 = v13;
            i11 = 1;
            i13 += i11;
            size = i19;
            str2 = str4;
        }
        V v14 = v12;
        if (v14 == null) {
            parsePosition.setErrorIndex(index);
        } else {
            parsePosition.setIndex(index + i14);
        }
        return v14;
    }

    public List<String> b() {
        return this.f41261a;
    }

    public <V extends Enum<V>> V c(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls) {
        return (V) f(charSequence, parsePosition, cls, true, false, true);
    }

    public <V extends Enum<V>> V d(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, net.time4j.engine.d dVar) {
        net.time4j.engine.c<Boolean> cVar = a.f41001i;
        Boolean bool = Boolean.TRUE;
        return (V) f(charSequence, parsePosition, cls, ((Boolean) dVar.b(cVar, bool)).booleanValue(), ((Boolean) dVar.b(a.f41002j, Boolean.FALSE)).booleanValue(), ((Boolean) dVar.b(a.f41003k, bool)).booleanValue());
    }

    public <V extends Enum<V>> V e(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, g gVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (gVar == g.STRICT) {
            z12 = false;
        } else if (gVar != g.LAX) {
            z11 = false;
            z12 = true;
            z13 = true;
            return (V) f(charSequence, parsePosition, cls, z12, z11, z13);
        } else {
            z12 = true;
        }
        z11 = z12;
        z13 = z11;
        return (V) f(charSequence, parsePosition, cls, z12, z11, z13);
    }

    public String g(Enum<?> r32) {
        int ordinal = r32.ordinal();
        if (this.f41261a.size() <= ordinal) {
            return r32.name();
        }
        return this.f41261a.get(ordinal);
    }

    public String toString() {
        int size = this.f41261a.size();
        StringBuilder sb2 = new StringBuilder((size * 16) + 2);
        sb2.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.append(this.f41261a.get(i11));
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}