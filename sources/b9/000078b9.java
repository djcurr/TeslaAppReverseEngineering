package io.realm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class n extends r0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(a aVar, io.realm.internal.b bVar) {
        super(aVar, bVar);
    }

    @Override // io.realm.r0
    public p0 c(String str) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
}