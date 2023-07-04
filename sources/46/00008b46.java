package net.time4j.format.expert;

import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public enum c0 implements h<net.time4j.tz.k> {
    INSTANCE;

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<net.time4j.tz.k> getElement() {
        return b0.TIMEZONE_ID;
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        char charAt;
        char charAt2;
        int length = charSequence.length();
        int f11 = sVar.f();
        if (f11 >= length) {
            sVar.k(f11, "Missing timezone name.");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = f11;
        while (i11 < length && (((charAt2 = charSequence.charAt(i11)) >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '-' || charAt2 == '_' || charAt2 == '/'))) {
            sb2.append(charAt2);
            i11++;
        }
        if (!Character.isLetter(sb2.charAt(sb2.length() - 1))) {
            sb2.deleteCharAt(sb2.length() - 1);
            i11--;
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            sVar.k(f11, "Missing valid timezone id.");
        } else if (sb3.startsWith("Etc/GMT")) {
            sVar.k(f11, "Inverse Etc/GMT-Offsets are not supported, use UTC-Offsets instead.");
        } else if (sb3.equals("Z")) {
            tVar.E(b0.TIMEZONE_OFFSET, net.time4j.tz.p.f41597k);
            sVar.l(i11);
        } else if (sb3.equals("UTC") || sb3.equals("GMT") || sb3.equals("UT")) {
            if (length > i11 && ((charAt = charSequence.charAt(i11)) == '+' || charAt == '-')) {
                sVar.l(i11);
                e0.f41115f.parse(charSequence, sVar, dVar, tVar, z11);
                return;
            }
            tVar.E(b0.TIMEZONE_OFFSET, net.time4j.tz.p.f41597k);
            sVar.l(i11);
        } else {
            List<net.time4j.tz.k> u11 = net.time4j.tz.l.u("INCLUDE_ALIAS");
            int i12 = 0;
            int size = u11.size() - 1;
            while (i12 <= size) {
                int i13 = (i12 + size) >>> 1;
                net.time4j.tz.k kVar = u11.get(i13);
                int compareTo = kVar.a().compareTo(sb3);
                if (compareTo < 0) {
                    i12 = i13 + 1;
                } else if (compareTo <= 0) {
                    tVar.E(b0.TIMEZONE_ID, kVar);
                    sVar.l(i11);
                    return;
                } else {
                    size = i13 - 1;
                }
            }
            sVar.k(f11, "Cannot parse to timezone id: " + sb3);
        }
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        if (oVar.c()) {
            int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
            String a11 = oVar.o().a();
            appendable.append(a11);
            int length2 = a11.length();
            if (length != -1 && length2 > 0 && set != null) {
                set.add(new g(b0.TIMEZONE_ID, length, length + length2));
            }
            return length2;
        }
        throw new IllegalArgumentException("Cannot extract timezone id from: " + oVar);
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return INSTANCE;
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> withElement(net.time4j.engine.p<net.time4j.tz.k> pVar) {
        return INSTANCE;
    }
}