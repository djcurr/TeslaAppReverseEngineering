package kc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class f extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f34555e;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34556a;

        static {
            int[] iArr = new int[b.values().length];
            f34556a = iArr;
            try {
                iArr[b.DO_NOT_DISPOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34556a[b.INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34556a[b.NOT_SPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34556a[b.RESTORE_TO_BACKGROUND_COLOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34556a[b.RESTORE_TO_PREVIOUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34556a[b.TO_BE_DEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NOT_SPECIFIED,
        DO_NOT_DISPOSE,
        RESTORE_TO_BACKGROUND_COLOR,
        RESTORE_TO_PREVIOUS,
        TO_BE_DEFINED,
        INVALID;

        public static b typeOf(int i11) {
            switch (i11) {
                case 0:
                    return NOT_SPECIFIED;
                case 1:
                    return DO_NOT_DISPOSE;
                case 2:
                    return RESTORE_TO_BACKGROUND_COLOR;
                case 3:
                    return RESTORE_TO_PREVIOUS;
                case 4:
                case 5:
                case 6:
                case 7:
                    return TO_BE_DEFINED;
                default:
                    return INVALID;
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f34556a[ordinal()]) {
                case 1:
                    return "Don't Dispose";
                case 2:
                    return "Invalid value";
                case 3:
                    return "Not Specified";
                case 4:
                    return "Restore to Background Color";
                case 5:
                    return "Restore to Previous";
                case 6:
                    return "To Be Defined";
                default:
                    return super.toString();
            }
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f34555e = hashMap;
        hashMap.put(1, "Delay");
        hashMap.put(2, "Disposal Method");
        hashMap.put(3, "User Input Flag");
        hashMap.put(4, "Transparent Color Flag");
        hashMap.put(5, "Transparent Color Index");
    }

    public f() {
        E(new e(this));
    }

    @Override // cc.b
    public String n() {
        return "GIF Control";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f34555e;
    }
}