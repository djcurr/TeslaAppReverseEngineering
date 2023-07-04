package com.tesla.widget;

import android.app.PendingIntent;
import android.content.Context;
import av.g;
import av.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public enum d {
    NORMAL,
    SQUARE;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22020a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.NORMAL.ordinal()] = 1;
            iArr[d.SQUARE.ordinal()] = 2;
            f22020a = iArr;
        }
    }

    public static /* synthetic */ PendingIntent getRefreshPendingIntent$default(d dVar, Context context, Integer num, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                num = null;
            }
            return dVar.getRefreshPendingIntent(context, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRefreshPendingIntent");
    }

    public final int getDefaultLayoutRes() {
        int i11 = a.f22020a[ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return g.vehicle_status_square_widget_default;
            }
            throw new NoWhenBranchMatchedException();
        }
        return g.vehicle_status_widget_default;
    }

    public final int getLayoutRes() {
        int i11 = a.f22020a[ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return g.vehicle_status_square_widget;
            }
            throw new NoWhenBranchMatchedException();
        }
        return g.vehicle_status_widget;
    }

    public final PendingIntent getRefreshPendingIntent(Context context, Integer num) {
        s.g(context, "context");
        int i11 = a.f22020a[ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return m.m(m.d(context, num, null, 4, null), context);
            }
            throw new NoWhenBranchMatchedException();
        }
        return m.m(m.f(context, num, null, null, 12, null), context);
    }
}