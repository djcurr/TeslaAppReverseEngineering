package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.i;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public interface ChallengeActionHandler {
    Object submit(ChallengeAction challengeAction, d<? super ChallengeRequestResult> dVar);

    /* loaded from: classes6.dex */
    public static final class Default implements ChallengeActionHandler {
        private final ChallengeRequestExecutor challengeRequestExecutor;
        private final ChallengeRequestData creqData;
        private final ErrorReporter errorReporter;
        private final g workContext;
        public static final Companion Companion = new Companion(null);
        private static final long CREQ_DELAY = TimeUnit.SECONDS.toMillis(1);

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final long getCREQ_DELAY$3ds2sdk_release() {
                return Default.CREQ_DELAY;
            }
        }

        public Default(ChallengeRequestData creqData, ErrorReporter errorReporter, ChallengeRequestExecutor challengeRequestExecutor, g workContext) {
            s.g(creqData, "creqData");
            s.g(errorReporter, "errorReporter");
            s.g(challengeRequestExecutor, "challengeRequestExecutor");
            s.g(workContext, "workContext");
            this.creqData = creqData;
            this.errorReporter = errorReporter;
            this.challengeRequestExecutor = challengeRequestExecutor;
            this.workContext = workContext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|(1:(1:(8:10|11|12|13|14|(1:16)|17|(1:22)(2:19|20))(2:26|27))(1:28))(2:37|(1:39)(1:40))|29|30|(1:32)(6:33|13|14|(0)|17|(0)(0))))|41|6|(0)(0)|29|30|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
            r9 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
            r0 = r2;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object executeChallengeRequest(com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r8, zz.d<? super com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1
                if (r0 == 0) goto L13
                r0 = r9
                com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1 r0 = (com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1 r0 = new com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$executeChallengeRequest$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r8 = r0.L$1
                com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r8 = (com.stripe.android.stripe3ds2.transactions.ChallengeRequestData) r8
                java.lang.Object r0 = r0.L$0
                com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default r0 = (com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler.Default) r0
                vz.r.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6f
            L34:
                r9 = move-exception
                goto L78
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                java.lang.Object r8 = r0.L$1
                com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r8 = (com.stripe.android.stripe3ds2.transactions.ChallengeRequestData) r8
                java.lang.Object r2 = r0.L$0
                com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default r2 = (com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler.Default) r2
                vz.r.b(r9)
                goto L5d
            L4a:
                vz.r.b(r9)
                long r5 = com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler.Default.CREQ_DELAY
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r4
                java.lang.Object r9 = v20.y0.b(r5, r0)
                if (r9 != r1) goto L5c
                return r1
            L5c:
                r2 = r7
            L5d:
                vz.q$a r9 = vz.q.f54772b     // Catch: java.lang.Throwable -> L76
                com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor r9 = r2.challengeRequestExecutor     // Catch: java.lang.Throwable -> L76
                r0.L$0 = r2     // Catch: java.lang.Throwable -> L76
                r0.L$1 = r8     // Catch: java.lang.Throwable -> L76
                r0.label = r3     // Catch: java.lang.Throwable -> L76
                java.lang.Object r9 = r9.execute(r8, r0)     // Catch: java.lang.Throwable -> L76
                if (r9 != r1) goto L6e
                return r1
            L6e:
                r0 = r2
            L6f:
                com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult r9 = (com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult) r9     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = vz.q.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L82
            L76:
                r9 = move-exception
                r0 = r2
            L78:
                vz.q$a r1 = vz.q.f54772b
                java.lang.Object r9 = vz.r.a(r9)
                java.lang.Object r9 = vz.q.b(r9)
            L82:
                java.lang.Throwable r1 = vz.q.e(r9)
                if (r1 != 0) goto L89
                goto Lb1
            L89:
                com.stripe.android.stripe3ds2.observability.ErrorReporter r0 = r0.errorReporter
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "\n                            Failed to execute challenge request.\n\n                            CReq = "
                r3.append(r4)
                com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r8 = r8.sanitize$3ds2sdk_release()
                r3.append(r8)
                java.lang.String r8 = "\n                        "
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                java.lang.String r8 = kotlin.text.m.f(r8)
                r2.<init>(r8, r1)
                r0.reportError(r2)
            Lb1:
                java.lang.Throwable r8 = vz.q.e(r9)
                if (r8 != 0) goto Lb8
                goto Lbd
            Lb8:
                com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult$RuntimeError r9 = new com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult$RuntimeError
                r9.<init>(r8)
            Lbd:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler.Default.executeChallengeRequest(com.stripe.android.stripe3ds2.transactions.ChallengeRequestData, zz.d):java.lang.Object");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler
        public Object submit(ChallengeAction challengeAction, d<? super ChallengeRequestResult> dVar) {
            return i.g(this.workContext, new ChallengeActionHandler$Default$submit$2(this, challengeAction, null), dVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Default(ChallengeRequestData creqData, ErrorReporter errorReporter, ChallengeRequestExecutor.Factory creqExecutorFactory, g workContext) {
            this(creqData, errorReporter, creqExecutorFactory.create(errorReporter, workContext), workContext);
            s.g(creqData, "creqData");
            s.g(errorReporter, "errorReporter");
            s.g(creqExecutorFactory, "creqExecutorFactory");
            s.g(workContext, "workContext");
        }
    }
}