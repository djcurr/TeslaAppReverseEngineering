package io.realm;

import io.realm.internal.Table;
import java.util.Locale;

/* loaded from: classes5.dex */
class r extends r0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r(a aVar) {
        super(aVar, null);
    }

    @Override // io.realm.r0
    public p0 c(String str) {
        b(str, "Null or empty class names are not allowed");
        String q11 = Table.q(str);
        int length = str.length();
        int i11 = Table.f31894e;
        if (length <= i11) {
            a aVar = this.f31981f;
            return new q(aVar, this, aVar.R().createTable(q11));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", Integer.valueOf(i11), Integer.valueOf(str.length())));
    }
}