package com.withpersona.sdk.inquiry.governmentid.network;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.l;
import vz.p;
import vz.v;
import wv.g0;
import wv.j0;
import wz.r0;
import wz.s0;
import wz.x;

/* loaded from: classes6.dex */
public enum b {
    DriverLicense,
    StateID,
    Keypass,
    KTPCard,
    MilitaryID,
    MyNumberCard,
    NRIC,
    OFWID,
    Passport,
    PermanentResidentCard,
    ResidencyPermit,
    StudentPermit,
    SocialSecurityID,
    UMID,
    VoterID,
    PassportCard,
    PostalID,
    Visa,
    WorkPermit,
    UNKNOWN;
    
    public static final a Companion = new a(null);
    private static final Map<String, b> codes;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String abbr) {
            s.g(abbr, "abbr");
            b bVar = (b) b.codes.get(abbr);
            return bVar == null ? b.UNKNOWN : bVar;
        }
    }

    /* renamed from: com.withpersona.sdk.inquiry.governmentid.network.b$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C0431b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22561a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.DriverLicense.ordinal()] = 1;
            iArr[b.StateID.ordinal()] = 2;
            iArr[b.Keypass.ordinal()] = 3;
            iArr[b.KTPCard.ordinal()] = 4;
            iArr[b.MilitaryID.ordinal()] = 5;
            iArr[b.MyNumberCard.ordinal()] = 6;
            iArr[b.NRIC.ordinal()] = 7;
            iArr[b.OFWID.ordinal()] = 8;
            iArr[b.Passport.ordinal()] = 9;
            iArr[b.PermanentResidentCard.ordinal()] = 10;
            iArr[b.ResidencyPermit.ordinal()] = 11;
            iArr[b.StudentPermit.ordinal()] = 12;
            iArr[b.SocialSecurityID.ordinal()] = 13;
            iArr[b.UMID.ordinal()] = 14;
            iArr[b.VoterID.ordinal()] = 15;
            iArr[b.PassportCard.ordinal()] = 16;
            iArr[b.PostalID.ordinal()] = 17;
            iArr[b.Visa.ordinal()] = 18;
            iArr[b.WorkPermit.ordinal()] = 19;
            iArr[b.UNKNOWN.ordinal()] = 20;
            f22561a = iArr;
        }
    }

    static {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        b bVar6;
        b bVar7;
        b bVar8;
        b bVar9;
        b bVar10;
        b bVar11;
        b bVar12;
        b bVar13;
        b bVar14;
        b bVar15;
        b bVar16;
        b bVar17;
        b bVar18;
        b bVar19;
        Map<String, b> l11;
        l11 = s0.l(v.a("dl", bVar), v.a("id", bVar2), v.a("keyp", bVar3), v.a("ktp", bVar4), v.a("mid", bVar5), v.a("myn", bVar6), v.a("nric", bVar7), v.a("ofw", bVar8), v.a("pp", bVar9), v.a("pr", bVar10), v.a("rp", bVar11), v.a("sp", bVar12), v.a("sss", bVar13), v.a("umid", bVar14), v.a("vid", bVar15), v.a("ppc", bVar16), v.a("pid", bVar17), v.a("visa", bVar18), v.a("wp", bVar19));
        codes = l11;
    }

    public final String toAbbreviation() {
        int t11;
        int e11;
        int d11;
        Set<Map.Entry<String, b>> entrySet = codes.entrySet();
        t11 = x.t(entrySet, 10);
        e11 = r0.e(t11);
        d11 = l.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        Iterator<T> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            p a11 = v.a((b) entry.getValue(), (String) entry.getKey());
            linkedHashMap.put(a11.c(), a11.d());
        }
        String str = (String) linkedHashMap.get(this);
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(("Abbreviations for " + this + " missing.").toString());
    }

    public final int toIcon() {
        switch (C0431b.f22561a[ordinal()]) {
            case 1:
                return g0.f56259a;
            case 2:
                return g0.f56260b;
            case 3:
                return g0.f56259a;
            case 4:
                return g0.f56259a;
            case 5:
                return g0.f56259a;
            case 6:
                return g0.f56259a;
            case 7:
                return g0.f56259a;
            case 8:
                return g0.f56259a;
            case 9:
                return g0.f56262d;
            case 10:
                return g0.f56261c;
            case 11:
                return g0.f56261c;
            case 12:
                return g0.f56259a;
            case 13:
                return g0.f56259a;
            case 14:
                return g0.f56259a;
            case 15:
                return g0.f56259a;
            case 16:
                return g0.f56262d;
            case 17:
                return g0.f56259a;
            case 18:
                return g0.f56262d;
            case 19:
                return g0.f56259a;
            case 20:
                throw new RuntimeException("IdClass is 'UNKNOWN'.");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int toLabel() {
        switch (C0431b.f22561a[ordinal()]) {
            case 1:
                return j0.f56347v;
            case 2:
                return j0.f56348w;
            case 3:
                return j0.f56349x;
            case 4:
                return j0.f56350y;
            case 5:
                return j0.f56351z;
            case 6:
                return j0.A;
            case 7:
                return j0.B;
            case 8:
                return j0.C;
            case 9:
                return j0.E;
            case 10:
                return j0.G;
            case 11:
                return j0.H;
            case 12:
                return j0.I;
            case 13:
                return j0.J;
            case 14:
                return j0.K;
            case 15:
                return j0.L;
            case 16:
                return j0.F;
            case 17:
                return j0.D;
            case 18:
                return j0.M;
            case 19:
                return j0.N;
            case 20:
                throw new RuntimeException("IdClass is 'UNKNOWN'.");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}