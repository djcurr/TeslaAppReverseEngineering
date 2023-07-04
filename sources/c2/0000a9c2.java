package p4;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p4.b0;

@b0.b("activity")
/* loaded from: classes.dex */
public class a extends b0<b> {

    /* renamed from: c  reason: collision with root package name */
    private final Context f45962c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f45963d;

    /* renamed from: p4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0979a {
        private C0979a() {
        }

        public /* synthetic */ C0979a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends p {

        /* renamed from: k  reason: collision with root package name */
        private Intent f45964k;

        /* renamed from: l  reason: collision with root package name */
        private String f45965l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0<? extends b> activityNavigator) {
            super(activityNavigator);
            kotlin.jvm.internal.s.g(activityNavigator, "activityNavigator");
        }

        public final Intent A() {
            return this.f45964k;
        }

        @Override // p4.p
        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof b) && super.equals(obj)) {
                Intent intent = this.f45964k;
                Boolean valueOf = intent == null ? null : Boolean.valueOf(intent.filterEquals(((b) obj).f45964k));
                return (valueOf == null ? ((b) obj).f45964k == null : valueOf.booleanValue()) && kotlin.jvm.internal.s.c(this.f45965l, ((b) obj).f45965l);
            }
            return false;
        }

        @Override // p4.p
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f45964k;
            int filterHashCode = (hashCode + (intent == null ? 0 : intent.filterHashCode())) * 31;
            String str = this.f45965l;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // p4.p
        public String toString() {
            ComponentName y11 = y();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (y11 != null) {
                sb2.append(" class=");
                sb2.append(y11.getClassName());
            } else {
                String x11 = x();
                if (x11 != null) {
                    sb2.append(" action=");
                    sb2.append(x11);
                }
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.s.f(sb3, "sb.toString()");
            return sb3;
        }

        @Override // p4.p
        public boolean w() {
            return false;
        }

        public final String x() {
            Intent intent = this.f45964k;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        public final ComponentName y() {
            Intent intent = this.f45964k;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        public final String z() {
            return this.f45965l;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements b0.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f45966a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.app.b f45967b;

        public final androidx.core.app.b a() {
            return this.f45967b;
        }

        public final int b() {
            return this.f45966a;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<Context, Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f45968a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Context invoke(Context it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            if (it2 instanceof ContextWrapper) {
                return ((ContextWrapper) it2).getBaseContext();
            }
            return null;
        }
    }

    static {
        new C0979a(null);
    }

    public a(Context context) {
        u20.h k11;
        Object obj;
        kotlin.jvm.internal.s.g(context, "context");
        this.f45962c = context;
        k11 = u20.n.k(context, d.f45968a);
        Iterator it2 = k11.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f45963d = (Activity) obj;
    }

    @Override // p4.b0
    public boolean k() {
        Activity activity = this.f45963d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    @Override // p4.b0
    /* renamed from: l */
    public b a() {
        return new b(this);
    }

    @Override // p4.b0
    /* renamed from: m */
    public p d(b destination, Bundle bundle, w wVar, b0.a aVar) {
        int d11;
        int d12;
        Intent intent;
        int intExtra;
        kotlin.jvm.internal.s.g(destination, "destination");
        if (destination.A() != null) {
            Intent intent2 = new Intent(destination.A());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String z11 = destination.z();
                if (!(z11 == null || z11.length() == 0)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(z11);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + ((Object) group) + " in " + bundle + " to fill data pattern " + ((Object) z11));
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z12 = aVar instanceof c;
            if (z12) {
                intent2.addFlags(((c) aVar).b());
            }
            if (this.f45963d == null) {
                intent2.addFlags(268435456);
            }
            if (wVar != null && wVar.g()) {
                intent2.addFlags(PKIFailureInfo.duplicateCertReq);
            }
            Activity activity = this.f45963d;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.m());
            Resources resources = this.f45962c.getResources();
            if (wVar != null) {
                int c11 = wVar.c();
                int d13 = wVar.d();
                if ((c11 > 0 && kotlin.jvm.internal.s.c(resources.getResourceTypeName(c11), "animator")) || (d13 > 0 && kotlin.jvm.internal.s.c(resources.getResourceTypeName(d13), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + ((Object) resources.getResourceName(c11)) + " and popExit resource " + ((Object) resources.getResourceName(d13)) + " when launching " + destination);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c11);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d13);
                }
            }
            if (z12) {
                androidx.core.app.b a11 = ((c) aVar).a();
                if (a11 != null) {
                    androidx.core.content.b.startActivity(this.f45962c, intent2, a11.b());
                } else {
                    this.f45962c.startActivity(intent2);
                }
            } else {
                this.f45962c.startActivity(intent2);
            }
            if (wVar == null || this.f45963d == null) {
                return null;
            }
            int a12 = wVar.a();
            int b11 = wVar.b();
            if ((a12 <= 0 || !kotlin.jvm.internal.s.c(resources.getResourceTypeName(a12), "animator")) && (b11 <= 0 || !kotlin.jvm.internal.s.c(resources.getResourceTypeName(b11), "animator"))) {
                if (a12 >= 0 || b11 >= 0) {
                    d11 = m00.l.d(a12, 0);
                    d12 = m00.l.d(b11, 0);
                    this.f45963d.overridePendingTransition(d11, d12);
                    return null;
                }
                return null;
            }
            Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + ((Object) resources.getResourceName(a12)) + " and exit resource " + ((Object) resources.getResourceName(b11)) + "when launching " + destination);
            return null;
        }
        throw new IllegalStateException(("Destination " + destination.m() + " does not have an Intent set.").toString());
    }
}