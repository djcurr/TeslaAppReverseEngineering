package com.tesla.messagedecoding;

import androidx.annotation.Keep;
import com.tesla.logging.g;
import com.tesla.messagedecoding.RoutableMessageDecoder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okio.i;
import org.json.JSONObject;
import qt.c;
import yt.f;

/* loaded from: classes6.dex */
public final class CommandMessageDecoder {

    /* renamed from: a  reason: collision with root package name */
    public static final CommandMessageDecoder f21892a = new CommandMessageDecoder();

    /* renamed from: b  reason: collision with root package name */
    private static final g f21893b = g.f21878b.a("CommandMessageDecoder");

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "", "<init>", "()V", "a", "b", cg.c.f9084i, "d", "e", "f", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$c;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$f;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$d;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$e;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$a;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "messagedecoding_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static abstract class Result {

        /* loaded from: classes6.dex */
        public static final class a extends Result {

            /* renamed from: a  reason: collision with root package name */
            public static final a f21894a = new a();

            private a() {
                super(null);
            }

            public String toString() {
                return "APPLICATION ACK";
            }
        }

        /* loaded from: classes6.dex */
        public static abstract class b extends Result {

            /* loaded from: classes6.dex */
            public static final class a extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final a f21895a = new a();

                private a() {
                    super(null);
                }

                public String toString() {
                    return "ApplicationError";
                }
            }

            /* renamed from: com.tesla.messagedecoding.CommandMessageDecoder$Result$b$b  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0396b extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final C0396b f21896a = new C0396b();

                private C0396b() {
                    super(null);
                }

                public String toString() {
                    return "HermesInternalError";
                }
            }

            /* loaded from: classes6.dex */
            public static final class c extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final c f21897a = new c();

                private c() {
                    super(null);
                }

                public String toString() {
                    return "InvalidMessageError";
                }
            }

            /* loaded from: classes6.dex */
            public static final class d extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final d f21898a = new d();

                private d() {
                    super(null);
                }

                public String toString() {
                    return "InvalidUserTokenError";
                }
            }

            /* loaded from: classes6.dex */
            public static final class e extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final e f21899a = new e();

                private e() {
                    super(null);
                }

                public String toString() {
                    return "InvalidVehicleTokenError";
                }
            }

            /* loaded from: classes6.dex */
            public static final class f extends b {

                /* renamed from: a  reason: collision with root package name */
                private final Exception f21900a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(Exception exception) {
                    super(null);
                    s.g(exception, "exception");
                    this.f21900a = exception;
                }

                public final Exception a() {
                    return this.f21900a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && s.c(this.f21900a, ((f) obj).f21900a);
                }

                public int hashCode() {
                    return this.f21900a.hashCode();
                }

                public String toString() {
                    String message = this.f21900a.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    return "exception error: " + message;
                }
            }

            /* loaded from: classes6.dex */
            public static final class g extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final g f21901a = new g();

                private g() {
                    super(null);
                }

                public String toString() {
                    return "TooManyRequestsError";
                }
            }

            /* loaded from: classes6.dex */
            public static final class h extends b {

                /* renamed from: a  reason: collision with root package name */
                private final qt.a f21902a;

                public h(qt.a aVar) {
                    super(null);
                    this.f21902a = aVar;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof h) && this.f21902a == ((h) obj).f21902a;
                }

                public int hashCode() {
                    qt.a aVar = this.f21902a;
                    if (aVar == null) {
                        return 0;
                    }
                    return aVar.hashCode();
                }

                public String toString() {
                    qt.a aVar = this.f21902a;
                    return "unsupported command type: " + aVar;
                }
            }

            /* loaded from: classes6.dex */
            public static final class i extends b {

                /* renamed from: a  reason: collision with root package name */
                private final qt.g f21903a;

                public i(qt.g gVar) {
                    super(null);
                    this.f21903a = gVar;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof i) && this.f21903a == ((i) obj).f21903a;
                }

                public int hashCode() {
                    qt.g gVar = this.f21903a;
                    if (gVar == null) {
                        return 0;
                    }
                    return gVar.hashCode();
                }

                public String toString() {
                    qt.g gVar = this.f21903a;
                    return "unsupported ok: " + gVar;
                }
            }

            /* loaded from: classes6.dex */
            public static final class j extends b {

                /* renamed from: a  reason: collision with root package name */
                private final qt.g f21904a;

                public j(qt.g gVar) {
                    super(null);
                    this.f21904a = gVar;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof j) && this.f21904a == ((j) obj).f21904a;
                }

                public int hashCode() {
                    qt.g gVar = this.f21904a;
                    if (gVar == null) {
                        return 0;
                    }
                    return gVar.hashCode();
                }

                public String toString() {
                    qt.g gVar = this.f21904a;
                    return "unsupported signed command error: " + gVar;
                }
            }

            /* loaded from: classes6.dex */
            public static final class k extends b {

                /* renamed from: a  reason: collision with root package name */
                private final qt.g f21905a;

                public k(qt.g gVar) {
                    super(null);
                    this.f21905a = gVar;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof k) && this.f21905a == ((k) obj).f21905a;
                }

                public int hashCode() {
                    qt.g gVar = this.f21905a;
                    if (gVar == null) {
                        return 0;
                    }
                    return gVar.hashCode();
                }

                public String toString() {
                    qt.g gVar = this.f21905a;
                    return "unsupported signed command: " + gVar;
                }
            }

            /* loaded from: classes6.dex */
            public static final class l extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final l f21906a = new l();

                private l() {
                    super(null);
                }

                public String toString() {
                    return "VehicleNotConnectedError";
                }
            }

            private b() {
                super(null);
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends Result {

            /* renamed from: a  reason: collision with root package name */
            public static final c f21907a = new c();

            private c() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class d extends Result {

            /* renamed from: a  reason: collision with root package name */
            private final RoutableMessageDecoder.Result f21908a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(RoutableMessageDecoder.Result result) {
                super(null);
                s.g(result, "result");
                this.f21908a = result;
            }

            public final RoutableMessageDecoder.Result a() {
                return this.f21908a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && s.c(this.f21908a, ((d) obj).f21908a);
            }

            public int hashCode() {
                return this.f21908a.hashCode();
            }

            public String toString() {
                RoutableMessageDecoder.Result result = this.f21908a;
                return "routable success: [" + result + "]";
            }
        }

        /* loaded from: classes6.dex */
        public static final class e extends Result {

            /* renamed from: a  reason: collision with root package name */
            public static final e f21909a = new e();

            private e() {
                super(null);
            }

            public String toString() {
                return "SERVER ACK";
            }
        }

        /* loaded from: classes6.dex */
        public static final class f extends Result {

            /* renamed from: a  reason: collision with root package name */
            private final JSONObject f21910a;

            public f() {
                this(null, 1, null);
            }

            public f(JSONObject jSONObject) {
                super(null);
                this.f21910a = jSONObject;
            }

            public final JSONObject a() {
                return this.f21910a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && s.c(this.f21910a, ((f) obj).f21910a);
            }

            public int hashCode() {
                JSONObject jSONObject = this.f21910a;
                if (jSONObject == null) {
                    return 0;
                }
                return jSONObject.hashCode();
            }

            public String toString() {
                String str = this.f21910a == null ? "" : " ice config";
                return "success" + str;
            }

            public /* synthetic */ f(JSONObject jSONObject, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : jSONObject);
            }
        }

        private Result() {
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21911a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21912b;

        static {
            int[] iArr = new int[qt.a.values().length];
            iArr[qt.a.COMMAND_TYPE_OK.ordinal()] = 1;
            iArr[qt.a.COMMAND_TYPE_STREAMING_CONFIG.ordinal()] = 2;
            iArr[qt.a.COMMAND_TYPE_SIGNED_COMMAND.ordinal()] = 3;
            iArr[qt.a.COMMAND_TYPE_SIGNED_COMMAND_RESPONSE.ordinal()] = 4;
            iArr[qt.a.COMMAND_TYPE_SIGNED_COMMAND_ERROR.ordinal()] = 5;
            iArr[qt.a.COMMAND_TYPE_ERROR_RESPONSE.ordinal()] = 6;
            iArr[qt.a.COMMAND_TYPE_GET_VAULT.ordinal()] = 7;
            iArr[qt.a.COMMAND_TYPE_SAVE_VAULT.ordinal()] = 8;
            iArr[qt.a.COMMAND_TYPE_DEVICE_CONNECTED.ordinal()] = 9;
            iArr[qt.a.COMMAND_TYPE_DEVICE_DISCONNECTED.ordinal()] = 10;
            f21911a = iArr;
            int[] iArr2 = new int[qt.g.values().length];
            iArr2[qt.g.STATUS_CODE_OK.ordinal()] = 1;
            iArr2[qt.g.STATUS_CODE_INVALID_TOKEN.ordinal()] = 2;
            iArr2[qt.g.STATUS_CODE_PERMISSION_DENIED_NO_TOKEN.ordinal()] = 3;
            iArr2[qt.g.STATUS_CODE_PERMISSION_DENIED_EXPIRED_TOKEN.ordinal()] = 4;
            iArr2[qt.g.STATUS_CODE_TOO_MANY_REQUESTS.ordinal()] = 5;
            iArr2[qt.g.STATUS_CODE_APPLICATION_ERROR.ordinal()] = 6;
            iArr2[qt.g.STATUS_CODE_INVALID_MESSAGE.ordinal()] = 7;
            iArr2[qt.g.STATUS_CODE_PUBLISH_FAILED.ordinal()] = 8;
            iArr2[qt.g.STATUS_CODE_PUBLISH_FAILED_NOT_CONNECTED.ordinal()] = 9;
            iArr2[qt.g.STATUS_CODE_SERVER_ACK.ordinal()] = 10;
            iArr2[qt.g.STATUS_CODE_CLIENT_ACK.ordinal()] = 11;
            iArr2[qt.g.STATUS_CODE_INTERNAL_ERROR.ordinal()] = 12;
            iArr2[qt.g.STATUS_CODE_APPLICATION_OK.ordinal()] = 13;
            iArr2[qt.g.STATUS_CODE_APPLICATION_ACK.ordinal()] = 14;
            f21912b = iArr2;
        }
    }

    private CommandMessageDecoder() {
    }

    private final Result b(c cVar) {
        qt.g a11 = qt.g.Companion.a(cVar.l());
        switch (a11 == null ? -1 : a.f21912b[a11.ordinal()]) {
            case -1:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return new Result.b.i(a11);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return Result.c.f21907a;
            case 2:
            case 3:
            case 4:
                if (s.c(cVar.i(), i.f42656d)) {
                    return Result.b.d.f21898a;
                }
                return Result.b.e.f21899a;
            case 5:
                return Result.b.g.f21901a;
            case 6:
                return Result.b.a.f21895a;
            case 7:
                return Result.b.c.f21897a;
            case 8:
                return Result.b.C0396b.f21896a;
            case 9:
                return Result.b.l.f21906a;
        }
    }

    private final Result c(c cVar) {
        qt.g a11 = qt.g.Companion.a(cVar.l());
        switch (a11 == null ? -1 : a.f21912b[a11.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                return new Result.b.j(a11);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 12:
                return Result.b.C0396b.f21896a;
        }
    }

    private final Result d(c cVar) {
        Result fVar;
        qt.g a11 = qt.g.Companion.a(cVar.l());
        switch (a11 == null ? -1 : a.f21912b[a11.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
                return new Result.b.k(a11);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 10:
                return Result.e.f21909a;
            case 13:
                try {
                    fVar = new Result.d(RoutableMessageDecoder.f21913a.a(f.f59754k.decode(cVar.h())));
                } catch (Exception e11) {
                    f21893b.d("exception occurred decoding application response", e11);
                    fVar = new Result.b.f(e11);
                }
                return fVar;
            case 14:
                return Result.a.f21894a;
        }
    }

    private final Result e(c cVar) {
        try {
            return new Result.f(new JSONObject(cVar.h().F()));
        } catch (Exception e11) {
            return new Result.b.f(e11);
        }
    }

    public final Result a(c commandMessage) {
        s.g(commandMessage, "commandMessage");
        qt.a a11 = qt.a.Companion.a(commandMessage.c());
        switch (a11 == null ? -1 : a.f21911a[a11.ordinal()]) {
            case -1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return new Result.b.h(a11);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return b(commandMessage);
            case 2:
                return e(commandMessage);
            case 3:
            case 4:
                return d(commandMessage);
            case 5:
                return c(commandMessage);
        }
    }
}