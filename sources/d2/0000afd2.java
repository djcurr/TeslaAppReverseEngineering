package r1;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public enum x implements w {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f49021a;

        static {
            int[] iArr = new int[x.values().length];
            iArr[x.Captured.ordinal()] = 1;
            iArr[x.Active.ordinal()] = 2;
            iArr[x.ActiveParent.ordinal()] = 3;
            iArr[x.Deactivated.ordinal()] = 4;
            iArr[x.DeactivatedParent.ordinal()] = 5;
            iArr[x.Inactive.ordinal()] = 6;
            f49021a = iArr;
        }
    }

    @Override // r1.w
    public boolean getHasFocus() {
        switch (a.f49021a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 4:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean isCaptured() {
        switch (a.f49021a[ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isDeactivated() {
        switch (a.f49021a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // r1.w
    public boolean isFocused() {
        switch (a.f49021a[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}