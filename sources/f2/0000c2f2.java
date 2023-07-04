package ys;

import com.tesla.command.usecase.CommandSigningRequirement;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f59731c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final ys.a f59732a;

    /* renamed from: b  reason: collision with root package name */
    private final yu.e f59733b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(ys.a getCommandSigningRequirement, yu.e getVehicleData) {
            s.g(getCommandSigningRequirement, "getCommandSigningRequirement");
            s.g(getVehicleData, "getVehicleData");
            return new j(getCommandSigningRequirement, getVehicleData);
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59734a;

        static {
            int[] iArr = new int[CommandSigningRequirement.values().length];
            iArr[CommandSigningRequirement.OFF.ordinal()] = 1;
            iArr[CommandSigningRequirement.ALLOWED.ordinal()] = 2;
            iArr[CommandSigningRequirement.REQUIRED.ordinal()] = 3;
            f59734a = iArr;
        }
    }

    public j(ys.a getCommandSigningRequirement, yu.e getVehicleData) {
        s.g(getCommandSigningRequirement, "getCommandSigningRequirement");
        s.g(getVehicleData, "getVehicleData");
        this.f59732a = getCommandSigningRequirement;
        this.f59733b = getVehicleData;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ot.m> a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "vehicleId"
            kotlin.jvm.internal.s.g(r8, r0)
            yu.e r0 = r7.f59733b
            lt.w2 r0 = r0.a(r8)
            yu.e r1 = r7.f59733b
            org.json.JSONObject r1 = r1.b(r8)
            r2 = 0
            if (r1 != 0) goto L16
            r1 = r2
            goto L20
        L16:
            java.lang.String r3 = "phone_key_authorized"
            boolean r1 = r1.optBoolean(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L20:
            r3 = 0
            if (r0 != 0) goto L25
        L23:
            r4 = r3
            goto L30
        L25:
            java.lang.Integer r4 = et.a.f(r0)
            if (r4 != 0) goto L2c
            goto L23
        L2c:
            int r4 = r4.intValue()
        L30:
            r5 = 20
            r6 = 1
            if (r4 < r5) goto L5b
            if (r0 != 0) goto L39
        L37:
            r4 = r3
            goto L40
        L39:
            boolean r4 = et.a.S(r0)
            if (r4 != r6) goto L37
            r4 = r6
        L40:
            if (r4 != 0) goto L5b
            if (r0 != 0) goto L46
        L44:
            r0 = r3
            goto L57
        L46:
            mt.v r0 = r0.o()
            if (r0 != 0) goto L4d
            goto L44
        L4d:
            java.lang.Boolean r0 = r0.d()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.s.c(r0, r4)
        L57:
            if (r0 == 0) goto L5b
            r0 = r6
            goto L5c
        L5b:
            r0 = r3
        L5c:
            ys.a r4 = r7.f59732a
            com.tesla.command.usecase.CommandSigningRequirement r8 = r4.a(r8)
            int[] r4 = ys.j.b.f59734a
            int r8 = r8.ordinal()
            r8 = r4[r8]
            r4 = 2
            if (r8 == r6) goto La6
            r5 = 3
            if (r8 == r4) goto L87
            if (r8 != r5) goto L81
            ot.m[] r8 = new ot.m[r4]
            ot.m r0 = ot.m.TRANSPORT_BLUETOOTH
            r8[r3] = r0
            ot.m r0 = ot.m.TRANSPORT_HERMES
            r8[r6] = r0
            java.util.List r8 = wz.u.l(r8)
            goto Lb4
        L81:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L87:
            ot.m[] r8 = new ot.m[r5]
            ot.m r5 = ot.m.TRANSPORT_BLUETOOTH
            r8[r3] = r5
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.s.c(r1, r3)
            if (r1 == 0) goto L98
            ot.m r1 = ot.m.TRANSPORT_HERMES
            goto L99
        L98:
            r1 = r2
        L99:
            r8[r6] = r1
            if (r0 != 0) goto L9f
            ot.m r2 = ot.m.TRANSPORT_OWNER_API
        L9f:
            r8[r4] = r2
            java.util.List r8 = wz.u.n(r8)
            goto Lb4
        La6:
            ot.m[] r8 = new ot.m[r4]
            ot.m r0 = ot.m.TRANSPORT_BLUETOOTH
            r8[r3] = r0
            ot.m r0 = ot.m.TRANSPORT_OWNER_API
            r8[r6] = r0
            java.util.List r8 = wz.u.l(r8)
        Lb4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ys.j.a(java.lang.String):java.util.List");
    }
}