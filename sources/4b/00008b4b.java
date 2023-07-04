package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class e0 implements h<net.time4j.tz.k> {

    /* renamed from: f  reason: collision with root package name */
    static final e0 f41115f = new e0();

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.format.e f41116a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f41117b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f41118c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f41119d;

    /* renamed from: e  reason: collision with root package name */
    private final net.time4j.format.g f41120e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(net.time4j.format.e eVar, boolean z11, List<String> list) {
        Objects.requireNonNull(eVar, "Missing display mode.");
        if (!list.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList(list);
            for (String str : arrayList) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("Zero offset must not be white-space-only.");
                }
            }
            this.f41116a = eVar;
            this.f41117b = z11;
            this.f41118c = Collections.unmodifiableList(arrayList);
            this.f41119d = true;
            this.f41120e = net.time4j.format.g.SMART;
            return;
        }
        throw new IllegalArgumentException("Missing zero offsets.");
    }

    private static net.time4j.tz.p a(net.time4j.engine.o oVar, net.time4j.engine.d dVar) {
        net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f40996d;
        if (dVar.c(cVar)) {
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.a(cVar);
            if (kVar instanceof net.time4j.tz.p) {
                return (net.time4j.tz.p) kVar;
            }
            if (kVar != null) {
                throw new IllegalArgumentException("Use a timezone offset instead of [" + kVar.a() + "] when formatting [" + oVar + "].");
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + oVar);
    }

    private static int b(CharSequence charSequence, int i11, net.time4j.format.g gVar) {
        int i12 = 0;
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = i11 + i13;
            char charAt = i14 >= charSequence.length() ? (char) 0 : charSequence.charAt(i14);
            if (charAt < '0' || charAt > '9') {
                if (i13 == 0 || gVar.isStrict()) {
                    return -1000;
                }
                return ~i12;
            }
            i12 = (i12 * 10) + (charAt - '0');
        }
        return i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            return this.f41116a == e0Var.f41116a && this.f41117b == e0Var.f41117b && this.f41118c.equals(e0Var.f41118c);
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<net.time4j.tz.k> getElement() {
        return b0.TIMEZONE_OFFSET;
    }

    public int hashCode() {
        return (this.f41116a.hashCode() * 7) + (this.f41118c.hashCode() * 31) + (this.f41117b ? 1 : 0);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157  */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parse(java.lang.CharSequence r17, net.time4j.format.expert.s r18, net.time4j.engine.d r19, net.time4j.format.expert.t<?> r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.e0.parse(java.lang.CharSequence, net.time4j.format.expert.s, net.time4j.engine.d, net.time4j.format.expert.t, boolean):void");
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        net.time4j.tz.p B;
        int i11;
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        net.time4j.tz.k o11 = oVar.c() ? oVar.o() : null;
        if (o11 == null) {
            B = a(oVar, dVar);
        } else if (o11 instanceof net.time4j.tz.p) {
            B = (net.time4j.tz.p) o11;
        } else if (oVar instanceof net.time4j.base.f) {
            B = net.time4j.tz.l.N(o11).B((net.time4j.base.f) oVar);
        } else {
            throw new IllegalArgumentException("Cannot extract timezone offset from: " + oVar);
        }
        int k11 = B.k();
        int i12 = B.i();
        if ((k11 | i12) == 0) {
            String str = this.f41118c.get(0);
            appendable.append(str);
            i11 = str.length();
        } else {
            int i13 = 1;
            appendable.append(k11 < 0 || i12 < 0 ? CoreConstants.DASH_CHAR : '+');
            int abs = Math.abs(k11);
            int i14 = abs / 3600;
            int i15 = (abs / 60) % 60;
            int i16 = abs % 60;
            if (i14 < 10) {
                appendable.append('0');
                i13 = 2;
            }
            String valueOf = String.valueOf(i14);
            appendable.append(valueOf);
            int length2 = i13 + valueOf.length();
            net.time4j.format.e eVar = this.f41116a;
            net.time4j.format.e eVar2 = net.time4j.format.e.SHORT;
            if (eVar != eVar2 || i15 != 0) {
                if (this.f41117b) {
                    appendable.append(CoreConstants.COLON_CHAR);
                    length2++;
                }
                if (i15 < 10) {
                    appendable.append('0');
                    length2++;
                }
                String valueOf2 = String.valueOf(i15);
                appendable.append(valueOf2);
                length2 += valueOf2.length();
                net.time4j.format.e eVar3 = this.f41116a;
                if (eVar3 != eVar2 && eVar3 != net.time4j.format.e.MEDIUM && (eVar3 == net.time4j.format.e.FULL || (i16 | i12) != 0)) {
                    if (this.f41117b) {
                        appendable.append(CoreConstants.COLON_CHAR);
                        length2++;
                    }
                    if (i16 < 10) {
                        appendable.append('0');
                        length2++;
                    }
                    String valueOf3 = String.valueOf(i16);
                    appendable.append(valueOf3);
                    int length3 = valueOf3.length() + length2;
                    if (i12 != 0) {
                        appendable.append(CoreConstants.DOT);
                        int i17 = length3 + 1;
                        String valueOf4 = String.valueOf(Math.abs(i12));
                        int length4 = 9 - valueOf4.length();
                        for (int i18 = 0; i18 < length4; i18++) {
                            appendable.append('0');
                            i17++;
                        }
                        appendable.append(valueOf4);
                        i11 = valueOf4.length() + i17;
                    } else {
                        i11 = length3;
                    }
                }
            }
            i11 = length2;
        }
        if (length != -1 && i11 > 0 && set != null) {
            set.add(new g(b0.TIMEZONE_ID, length, length + i11));
        }
        return i11;
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new e0(this.f41116a, this.f41117b, this.f41118c, ((Boolean) dVar.b(net.time4j.format.a.f41001i, Boolean.TRUE)).booleanValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f40998f, net.time4j.format.g.SMART));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(e0.class.getName());
        sb2.append("[precision=");
        sb2.append(this.f41116a);
        sb2.append(", extended=");
        sb2.append(this.f41117b);
        sb2.append(", zero-offsets=");
        sb2.append(this.f41118c);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> withElement(net.time4j.engine.p<net.time4j.tz.k> pVar) {
        return this;
    }

    private e0() {
        this.f41116a = net.time4j.format.e.LONG;
        this.f41117b = true;
        this.f41118c = Collections.emptyList();
        this.f41119d = true;
        this.f41120e = net.time4j.format.g.SMART;
    }

    private e0(net.time4j.format.e eVar, boolean z11, List<String> list, boolean z12, net.time4j.format.g gVar) {
        this.f41116a = eVar;
        this.f41117b = z11;
        this.f41118c = list;
        this.f41119d = z12;
        this.f41120e = gVar;
    }
}