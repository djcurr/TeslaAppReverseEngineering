package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f41138a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final char f41139a;

        /* renamed from: b  reason: collision with root package name */
        private final b f41140b;

        /* renamed from: c  reason: collision with root package name */
        private final b f41141c;

        /* renamed from: d  reason: collision with root package name */
        private final b f41142d;

        /* renamed from: e  reason: collision with root package name */
        private final List<net.time4j.tz.k> f41143e;

        /* JADX INFO: Access modifiers changed from: private */
        public b j(net.time4j.tz.k kVar) {
            ArrayList arrayList = new ArrayList();
            List<net.time4j.tz.k> list = this.f41143e;
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(kVar);
            return new b(this.f41139a, this.f41140b, this.f41141c, this.f41142d, arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b k(b bVar) {
            return new b(this.f41139a, bVar, this.f41141c, this.f41142d, this.f41143e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b l(b bVar) {
            return new b(this.f41139a, this.f41140b, bVar, this.f41142d, this.f41143e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b m(b bVar) {
            return new b(this.f41139a, this.f41140b, this.f41141c, bVar, this.f41143e);
        }

        private b(char c11) {
            this(c11, null, null, null, null);
        }

        private b(char c11, b bVar, b bVar2, b bVar3, List<net.time4j.tz.k> list) {
            this.f41139a = c11;
            this.f41140b = bVar;
            this.f41141c = bVar2;
            this.f41142d = bVar3;
            this.f41143e = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(b bVar) {
        this.f41138a = bVar;
    }

    private void a(b bVar, StringBuilder sb2, List<String> list) {
        if (bVar == null) {
            return;
        }
        a(bVar.f41140b, sb2, list);
        if (bVar.f41143e != null) {
            list.add(sb2.toString() + bVar.f41139a);
        }
        b bVar2 = bVar.f41141c;
        sb2.append(bVar.f41139a);
        a(bVar2, sb2, list);
        sb2.deleteCharAt(sb2.length() - 1);
        a(bVar.f41142d, sb2, list);
    }

    private static b c(b bVar, String str, int i11) {
        if (bVar == null) {
            return null;
        }
        char charAt = str.charAt(i11);
        if (charAt < bVar.f41139a) {
            return c(bVar.f41140b, str, i11);
        }
        if (charAt > bVar.f41139a) {
            return c(bVar.f41142d, str, i11);
        }
        return i11 < str.length() + (-1) ? c(bVar.f41141c, str, i11 + 1) : bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b d(b bVar, String str, net.time4j.tz.k kVar) {
        if (!str.isEmpty()) {
            Objects.requireNonNull(kVar, "Missing timezone id.");
            return e(bVar, str, kVar, 0);
        }
        throw new IllegalArgumentException("Empty key cannot be inserted.");
    }

    private static b e(b bVar, String str, net.time4j.tz.k kVar, int i11) {
        char charAt = str.charAt(i11);
        if (bVar == null) {
            bVar = new b(charAt);
        }
        if (charAt < bVar.f41139a) {
            return bVar.k(e(bVar.f41140b, str, kVar, i11));
        }
        if (charAt > bVar.f41139a) {
            return bVar.m(e(bVar.f41142d, str, kVar, i11));
        }
        return i11 < str.length() + (-1) ? bVar.l(e(bVar.f41141c, str, kVar, i11 + 1)) : bVar.j(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<net.time4j.tz.k> b(String str) {
        if (str.isEmpty()) {
            return Collections.emptyList();
        }
        b c11 = c(this.f41138a, str, 0);
        if (c11 != null) {
            return Collections.unmodifiableList(c11.f41143e);
        }
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f(CharSequence charSequence, int i11) {
        b bVar = this.f41138a;
        int length = charSequence.length();
        int i12 = i11;
        int i13 = i12;
        while (bVar != null && i12 < length) {
            char charAt = charSequence.charAt(i12);
            if (charAt < bVar.f41139a) {
                bVar = bVar.f41140b;
            } else if (charAt > bVar.f41139a) {
                bVar = bVar.f41142d;
            } else {
                i12++;
                if (bVar.f41143e != null) {
                    i13 = i12;
                }
                bVar = bVar.f41141c;
            }
        }
        return i11 >= i13 ? "" : charSequence.subSequence(i11, i13).toString();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        a(this.f41138a, new StringBuilder(), arrayList);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("count=");
        sb2.append(arrayList.size());
        sb2.append(",labels={");
        for (String str : arrayList) {
            sb2.append(str);
            sb2.append("=>");
            sb2.append(b(str));
            sb2.append(CoreConstants.COMMA_CHAR);
        }
        sb2.deleteCharAt(sb2.length() - 1).append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}