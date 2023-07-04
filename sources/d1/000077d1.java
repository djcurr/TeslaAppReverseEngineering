package io.grpc;

import ch.qos.logback.core.CoreConstants;
import io.grpc.l;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    static final com.google.common.base.n f31666c = com.google.common.base.n.f(CoreConstants.COMMA_CHAR);

    /* renamed from: d  reason: collision with root package name */
    private static final v f31667d = a().f(new l.a(), true).f(l.b.f31488a, false);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f31668a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f31669b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final u f31670a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f31671b;

        a(u uVar, boolean z11) {
            this.f31670a = (u) com.google.common.base.u.p(uVar, "decompressor");
            this.f31671b = z11;
        }
    }

    private v(u uVar, boolean z11, v vVar) {
        String a11 = uVar.a();
        com.google.common.base.u.e(!a11.contains(","), "Comma is currently not allowed in message encoding");
        int size = vVar.f31668a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(vVar.f31668a.containsKey(uVar.a()) ? size : size + 1);
        for (a aVar : vVar.f31668a.values()) {
            String a12 = aVar.f31670a.a();
            if (!a12.equals(a11)) {
                linkedHashMap.put(a12, new a(aVar.f31670a, aVar.f31671b));
            }
        }
        linkedHashMap.put(a11, new a(uVar, z11));
        this.f31668a = Collections.unmodifiableMap(linkedHashMap);
        this.f31669b = f31666c.d(b()).getBytes(Charset.forName("US-ASCII"));
    }

    public static v a() {
        return new v();
    }

    public static v c() {
        return f31667d;
    }

    public Set<String> b() {
        HashSet hashSet = new HashSet(this.f31668a.size());
        for (Map.Entry<String, a> entry : this.f31668a.entrySet()) {
            if (entry.getValue().f31671b) {
                hashSet.add(entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] d() {
        return this.f31669b;
    }

    public u e(String str) {
        a aVar = this.f31668a.get(str);
        if (aVar != null) {
            return aVar.f31670a;
        }
        return null;
    }

    public v f(u uVar, boolean z11) {
        return new v(uVar, z11, this);
    }

    private v() {
        this.f31668a = new LinkedHashMap(0);
        this.f31669b = new byte[0];
    }
}