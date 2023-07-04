package com.tesla.widget;

import av.h;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public enum b {
    EXECUTING,
    SUCCESS,
    FAIL,
    NONE;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22014a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.EXECUTING.ordinal()] = 1;
            iArr[b.SUCCESS.ordinal()] = 2;
            iArr[b.FAIL.ordinal()] = 3;
            iArr[b.NONE.ordinal()] = 4;
            f22014a = iArr;
        }
    }

    public final int getExecutionLabel() {
        int i11 = a.f22014a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return 0;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return h.f6987i;
            }
            return h.f6988j;
        }
        return h.f6986h;
    }
}