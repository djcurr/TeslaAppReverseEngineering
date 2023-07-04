package io.realm;

import io.realm.internal.TableQuery;
import io.realm.internal.objectstore.OsKeyPathMapping;

/* loaded from: classes5.dex */
public class c0 {
    public void a(TableQuery tableQuery, OsKeyPathMapping osKeyPathMapping, String str, b0... b0VarArr) {
        long[] jArr = new long[b0VarArr.length];
        for (int i11 = 0; i11 < b0VarArr.length; i11++) {
            try {
                jArr[i11] = b0VarArr[i11].a();
            } catch (IllegalStateException e11) {
                throw new IllegalArgumentException("Unmanaged Realm objects are not valid query arguments", e11);
            }
        }
        tableQuery.o(osKeyPathMapping, str, jArr);
    }
}