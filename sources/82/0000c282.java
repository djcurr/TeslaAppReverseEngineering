package yh;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import yh.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    static final e f59514a = a().f(SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE).d(200).b(10000).c(CoreConstants.MILLIS_IN_ONE_WEEK).e(81920).a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class a {
        abstract e a();

        abstract a b(int i11);

        abstract a c(long j11);

        abstract a d(int i11);

        abstract a e(int i11);

        abstract a f(long j11);
    }

    static a a() {
        return new a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long f();
}