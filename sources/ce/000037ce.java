package com.google.common.util.concurrent;

import com.google.common.collect.a0;
import com.google.common.collect.v;
import com.google.common.collect.z;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class CycleDetectingLockFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f16177a;

    /* loaded from: classes3.dex */
    public static final class PotentialDeadlockException extends b {

        /* renamed from: a  reason: collision with root package name */
        private final b f16178a;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable th2 = this.f16178a; th2 != null; th2 = th2.getCause()) {
                sb2.append(", ");
                sb2.append(th2.getMessage());
            }
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    class a extends ThreadLocal<ArrayList<c>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<c> initialValue() {
            return z.h(3);
        }
    }

    /* loaded from: classes3.dex */
    private static class b extends IllegalStateException {
        static {
            v.r(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
        }
    }

    /* loaded from: classes3.dex */
    private static class c {
    }

    static {
        new a0().h().f();
        f16177a = Logger.getLogger(CycleDetectingLockFactory.class.getName());
        new a();
    }
}