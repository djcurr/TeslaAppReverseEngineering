package nr;

import kotlin.jvm.internal.m0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class b0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.a<String> {
        a(c cVar) {
            super(0, cVar, c.class, "describeRealIdentifier", "describeRealIdentifier()Ljava/lang/String;", 0);
        }

        @Override // h00.a
        /* renamed from: d */
        public final String invoke() {
            return ((c) this.receiver).a();
        }
    }

    public static final r a(p<?, ?, ?> pVar) {
        kotlin.jvm.internal.s.g(pVar, "<this>");
        c cVar = pVar instanceof c ? (c) pVar : null;
        return new r(m0.b(pVar.getClass()), cVar == null ? null : cVar.c(), cVar != null ? new a(cVar) : null);
    }

    public static final r b(n00.p type) {
        kotlin.jvm.internal.s.g(type, "type");
        return new r(type, null, null, 6, null);
    }
}