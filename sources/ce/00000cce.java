package bm;

import am.a0;
import am.b0;
import android.util.Base64;
import android.util.JsonReader;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.modules.appstate.AppStateModule;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.networking.FraudDetectionData;
import expo.modules.constants.ExponentInstallationId;
import ezvcard.property.Kind;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a */
    private static final lm.a f7888a = new nm.d().i(am.a.f574a).j(true).h();

    /* loaded from: classes3.dex */
    public interface a<T> {
        T a(JsonReader jsonReader);
    }

    private static a0 A(JsonReader jsonReader) {
        a0.b b11 = a0.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c11 = 7;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    b11.f(y(jsonReader));
                    break;
                case 1:
                    b11.h(jsonReader.nextString());
                    break;
                case 2:
                    b11.b(jsonReader.nextString());
                    break;
                case 3:
                    b11.d(jsonReader.nextString());
                    break;
                case 4:
                    b11.e(jsonReader.nextString());
                    break;
                case 5:
                    b11.g(jsonReader.nextInt());
                    break;
                case 6:
                    b11.c(jsonReader.nextString());
                    break;
                case 7:
                    b11.i(B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b11.a();
    }

    private static a0.e B(JsonReader jsonReader) {
        a0.e.b a11 = a0.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals(Kind.DEVICE)) {
                        c11 = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(Stripe3ds2AuthParams.FIELD_APP)) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c11 = '\b';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c11 = '\t';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c11 = '\n';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.l(jsonReader.nextLong());
                    break;
                case 1:
                    a11.j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a11.e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a11.d(m(jsonReader));
                    break;
                case 4:
                    a11.f(k(jsonReader, new a() { // from class: bm.a
                        @Override // bm.g.a
                        public final Object a(JsonReader jsonReader2) {
                            return g.a(jsonReader2);
                        }
                    }));
                    break;
                case 5:
                    a11.k(z(jsonReader));
                    break;
                case 6:
                    a11.b(i(jsonReader));
                    break;
                case 7:
                    a11.m(C(jsonReader));
                    break;
                case '\b':
                    a11.g(jsonReader.nextString());
                    break;
                case '\t':
                    a11.c(jsonReader.nextBoolean());
                    break;
                case '\n':
                    a11.h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.e.f C(JsonReader jsonReader) {
        a0.e.f.a a11 = a0.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a11.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    public static /* synthetic */ a0.e.d a(JsonReader jsonReader) {
        return n(jsonReader);
    }

    public static /* synthetic */ a0.e.d.a.b.AbstractC0023e c(JsonReader jsonReader) {
        return w(jsonReader);
    }

    public static /* synthetic */ a0.d.b d(JsonReader jsonReader) {
        return x(jsonReader);
    }

    public static /* synthetic */ a0.e.d.a.b.AbstractC0017a e(JsonReader jsonReader) {
        return p(jsonReader);
    }

    public static /* synthetic */ a0.c f(JsonReader jsonReader) {
        return l(jsonReader);
    }

    private static a0.e.a i(JsonReader jsonReader) {
        a0.e.a.AbstractC0015a a11 = a0.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c11 = 5;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.e(jsonReader.nextString());
                    break;
                case 1:
                    a11.b(jsonReader.nextString());
                    break;
                case 2:
                    a11.c(jsonReader.nextString());
                    break;
                case 3:
                    a11.g(jsonReader.nextString());
                    break;
                case 4:
                    a11.f(jsonReader.nextString());
                    break;
                case 5:
                    a11.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.a j(JsonReader jsonReader) {
        a0.a.AbstractC0014a a11 = a0.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(FraudDetectionData.KEY_TIMESTAMP)) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c11 = 7;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.c(jsonReader.nextInt());
                    break;
                case 1:
                    a11.e(jsonReader.nextLong());
                    break;
                case 2:
                    a11.g(jsonReader.nextLong());
                    break;
                case 3:
                    a11.h(jsonReader.nextLong());
                    break;
                case 4:
                    a11.d(jsonReader.nextString());
                    break;
                case 5:
                    a11.f(jsonReader.nextInt());
                    break;
                case 6:
                    a11.i(jsonReader.nextString());
                    break;
                case 7:
                    a11.b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static <T> b0<T> k(JsonReader jsonReader, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return b0.b(arrayList);
    }

    public static a0.c l(JsonReader jsonReader) {
        a0.c.a a11 = a0.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals(Action.KEY_ATTRIBUTE)) {
                a11.b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a11.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.e.c m(JsonReader jsonReader) {
        a0.e.c.a a11 = a0.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c11 = '\b';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a11.e(jsonReader.nextString());
                    break;
                case 2:
                    a11.h(jsonReader.nextLong());
                    break;
                case 3:
                    a11.b(jsonReader.nextInt());
                    break;
                case 4:
                    a11.d(jsonReader.nextLong());
                    break;
                case 5:
                    a11.c(jsonReader.nextInt());
                    break;
                case 6:
                    a11.f(jsonReader.nextString());
                    break;
                case 7:
                    a11.j(jsonReader.nextInt());
                    break;
                case '\b':
                    a11.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    public static a0.e.d n(JsonReader jsonReader) {
        a0.e.d.b a11 = a0.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals(Kind.DEVICE)) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(Stripe3ds2AuthParams.FIELD_APP)) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(FraudDetectionData.KEY_TIMESTAMP)) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.c(q(jsonReader));
                    break;
                case 1:
                    a11.b(o(jsonReader));
                    break;
                case 2:
                    a11.d(u(jsonReader));
                    break;
                case 3:
                    a11.f(jsonReader.nextString());
                    break;
                case 4:
                    a11.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.e.d.a o(JsonReader jsonReader) {
        a0.e.d.a.AbstractC0016a a11 = a0.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals(AppStateModule.APP_STATE_BACKGROUND)) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a11.d(r(jsonReader));
                    break;
                case 2:
                    a11.e(k(jsonReader, new a() { // from class: bm.f
                        @Override // bm.g.a
                        public final Object a(JsonReader jsonReader2) {
                            return g.f(jsonReader2);
                        }
                    }));
                    break;
                case 3:
                    a11.c(k(jsonReader, new a() { // from class: bm.f
                        @Override // bm.g.a
                        public final Object a(JsonReader jsonReader2) {
                            return g.f(jsonReader2);
                        }
                    }));
                    break;
                case 4:
                    a11.f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    public static a0.e.d.a.b.AbstractC0017a p(JsonReader jsonReader) {
        a0.e.d.a.b.AbstractC0017a.AbstractC0018a a11 = a0.e.d.a.b.AbstractC0017a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals(ExponentInstallationId.LEGACY_UUID_KEY)) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.c(jsonReader.nextString());
                    break;
                case 1:
                    a11.d(jsonReader.nextLong());
                    break;
                case 2:
                    a11.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a11.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.e.d.c q(JsonReader jsonReader) {
        a0.e.d.c.a a11 = a0.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c11 = 5;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a11.c(jsonReader.nextInt());
                    break;
                case 2:
                    a11.e(jsonReader.nextInt());
                    break;
                case 3:
                    a11.d(jsonReader.nextLong());
                    break;
                case 4:
                    a11.g(jsonReader.nextLong());
                    break;
                case 5:
                    a11.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.e.d.a.b r(JsonReader jsonReader) {
        a0.e.d.a.b.AbstractC0019b a11 = a0.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.b(j(jsonReader));
                    break;
                case 1:
                    a11.f(k(jsonReader, new a() { // from class: bm.c
                        @Override // bm.g.a
                        public final Object a(JsonReader jsonReader2) {
                            return g.c(jsonReader2);
                        }
                    }));
                    break;
                case 2:
                    a11.e(v(jsonReader));
                    break;
                case 3:
                    a11.c(k(jsonReader, new a() { // from class: bm.e
                        @Override // bm.g.a
                        public final Object a(JsonReader jsonReader2) {
                            return g.e(jsonReader2);
                        }
                    }));
                    break;
                case 4:
                    a11.d(s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.e.d.a.b.c s(JsonReader jsonReader) {
        a0.e.d.a.b.c.AbstractC0020a a11 = a0.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.c(k(jsonReader, b.f7883a));
                    break;
                case 1:
                    a11.e(jsonReader.nextString());
                    break;
                case 2:
                    a11.f(jsonReader.nextString());
                    break;
                case 3:
                    a11.b(s(jsonReader));
                    break;
                case 4:
                    a11.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    public static a0.e.d.a.b.AbstractC0023e.AbstractC0025b t(JsonReader jsonReader) {
        a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a a11 = a0.e.d.a.b.AbstractC0023e.AbstractC0025b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals(Action.FILE_ATTRIBUTE)) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.d(jsonReader.nextLong());
                    break;
                case 1:
                    a11.f(jsonReader.nextString());
                    break;
                case 2:
                    a11.e(jsonReader.nextLong());
                    break;
                case 3:
                    a11.b(jsonReader.nextString());
                    break;
                case 4:
                    a11.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.e.d.AbstractC0027d u(JsonReader jsonReader) {
        a0.e.d.AbstractC0027d.a a11 = a0.e.d.AbstractC0027d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                a11.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.e.d.a.b.AbstractC0021d v(JsonReader jsonReader) {
        a0.e.d.a.b.AbstractC0021d.AbstractC0022a a11 = a0.e.d.a.b.AbstractC0021d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals(PaymentMethodOptionsParams.Blik.PARAM_CODE)) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.b(jsonReader.nextLong());
                    break;
                case 1:
                    a11.c(jsonReader.nextString());
                    break;
                case 2:
                    a11.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    public static a0.e.d.a.b.AbstractC0023e w(JsonReader jsonReader) {
        a0.e.d.a.b.AbstractC0023e.AbstractC0024a a11 = a0.e.d.a.b.AbstractC0023e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.b(k(jsonReader, b.f7883a));
                    break;
                case 1:
                    a11.d(jsonReader.nextString());
                    break;
                case 2:
                    a11.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    public static a0.d.b x(JsonReader jsonReader) {
        a0.d.b.a a11 = a0.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a11.c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a11.b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.d y(JsonReader jsonReader) {
        a0.d.a a11 = a0.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a11.b(k(jsonReader, new a() { // from class: bm.d
                    @Override // bm.g.a
                    public final Object a(JsonReader jsonReader2) {
                        return g.d(jsonReader2);
                    }
                }));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a11.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    private static a0.e.AbstractC0028e z(JsonReader jsonReader) {
        a0.e.AbstractC0028e.a a11 = a0.e.AbstractC0028e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    a11.b(jsonReader.nextString());
                    break;
                case 1:
                    a11.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a11.e(jsonReader.nextString());
                    break;
                case 3:
                    a11.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a11.a();
    }

    public a0 D(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            a0 A = A(jsonReader);
            jsonReader.close();
            return A;
        } catch (IllegalStateException e11) {
            throw new IOException(e11);
        }
    }

    public String E(a0 a0Var) {
        return f7888a.encode(a0Var);
    }

    public a0.e.d g(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            a0.e.d n11 = n(jsonReader);
            jsonReader.close();
            return n11;
        } catch (IllegalStateException e11) {
            throw new IOException(e11);
        }
    }

    public String h(a0.e.d dVar) {
        return f7888a.encode(dVar);
    }
}