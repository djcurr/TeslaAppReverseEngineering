package hl;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList<m> f29325a = new CopyOnWriteArrayList<>();

    public static m a(String str) {
        Iterator<m> it2 = f29325a.iterator();
        while (it2.hasNext()) {
            m next = it2.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}