package io.sentry;

import java.util.Date;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes5.dex */
public interface i0 {
    boolean a();

    @ApiStatus.Internal
    i0 c(String str, String str2, Date date);

    @ApiStatus.Experimental
    c4 d();

    void e(x3 x3Var);

    void finish();

    x3 getStatus();

    u3 h();
}