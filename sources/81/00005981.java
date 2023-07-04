package com.stripe.android.ui.core;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.a0;

/* loaded from: classes6.dex */
public final class PrimaryButtonColors {
    public static final int $stable = 0;
    private final long background;
    private final long border;
    private final long onBackground;

    private PrimaryButtonColors(long j11, long j12, long j13) {
        this.background = j11;
        this.onBackground = j12;
        this.border = j13;
    }

    public /* synthetic */ PrimaryButtonColors(long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13);
    }

    /* renamed from: copy-ysEtTa8$default  reason: not valid java name */
    public static /* synthetic */ PrimaryButtonColors m411copyysEtTa8$default(PrimaryButtonColors primaryButtonColors, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = primaryButtonColors.background;
        }
        long j14 = j11;
        if ((i11 & 2) != 0) {
            j12 = primaryButtonColors.onBackground;
        }
        long j15 = j12;
        if ((i11 & 4) != 0) {
            j13 = primaryButtonColors.border;
        }
        return primaryButtonColors.m415copyysEtTa8(j14, j15, j13);
    }

    /* renamed from: component1-0d7_KjU  reason: not valid java name */
    public final long m412component10d7_KjU() {
        return this.background;
    }

    /* renamed from: component2-0d7_KjU  reason: not valid java name */
    public final long m413component20d7_KjU() {
        return this.onBackground;
    }

    /* renamed from: component3-0d7_KjU  reason: not valid java name */
    public final long m414component30d7_KjU() {
        return this.border;
    }

    /* renamed from: copy-ysEtTa8  reason: not valid java name */
    public final PrimaryButtonColors m415copyysEtTa8(long j11, long j12, long j13) {
        return new PrimaryButtonColors(j11, j12, j13, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrimaryButtonColors) {
            PrimaryButtonColors primaryButtonColors = (PrimaryButtonColors) obj;
            return a0.n(this.background, primaryButtonColors.background) && a0.n(this.onBackground, primaryButtonColors.onBackground) && a0.n(this.border, primaryButtonColors.border);
        }
        return false;
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m416getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBorder-0d7_KjU  reason: not valid java name */
    public final long m417getBorder0d7_KjU() {
        return this.border;
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m418getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    public int hashCode() {
        return (((a0.t(this.background) * 31) + a0.t(this.onBackground)) * 31) + a0.t(this.border);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + ((Object) a0.u(this.background)) + ", onBackground=" + ((Object) a0.u(this.onBackground)) + ", border=" + ((Object) a0.u(this.border)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}