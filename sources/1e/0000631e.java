package com.withpersona.sdk.inquiry.governmentid.network;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wv.j0;

/* loaded from: classes6.dex */
public enum a {
    Generic,
    BarcodeNotDetected,
    Blurry,
    Expired,
    Glare,
    DoubleFrontDetected,
    PortraitMissing,
    MrzNotDetected,
    UnprocessableImage;
    
    public static final C0430a Companion = new C0430a(null);

    /* renamed from: com.withpersona.sdk.inquiry.governmentid.network.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0430a {
        private C0430a() {
        }

        public /* synthetic */ C0430a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1628918676:
                        if (str.equals("unprocessable_image")) {
                            return a.UnprocessableImage;
                        }
                        break;
                    case -1385971474:
                        if (str.equals("blurry")) {
                            return a.Blurry;
                        }
                        break;
                    case -1377473587:
                        if (str.equals("barcode_not_detected")) {
                            return a.BarcodeNotDetected;
                        }
                        break;
                    case -1309235419:
                        if (str.equals("expired")) {
                            return a.Expired;
                        }
                        break;
                    case 98436943:
                        if (str.equals("glare")) {
                            return a.Glare;
                        }
                        break;
                    case 130573048:
                        if (str.equals("mrz_not_detected")) {
                            return a.MrzNotDetected;
                        }
                        break;
                    case 1397364930:
                        if (str.equals("portrait_missing")) {
                            return a.PortraitMissing;
                        }
                        break;
                    case 1919942150:
                        if (str.equals("double_front_detected")) {
                            return a.DoubleFrontDetected;
                        }
                        break;
                }
            }
            return a.Generic;
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22560a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.Generic.ordinal()] = 1;
            iArr[a.BarcodeNotDetected.ordinal()] = 2;
            iArr[a.Blurry.ordinal()] = 3;
            iArr[a.Expired.ordinal()] = 4;
            iArr[a.Glare.ordinal()] = 5;
            iArr[a.DoubleFrontDetected.ordinal()] = 6;
            iArr[a.PortraitMissing.ordinal()] = 7;
            iArr[a.MrzNotDetected.ordinal()] = 8;
            iArr[a.UnprocessableImage.ordinal()] = 9;
            f22560a = iArr;
        }
    }

    public final int toMessage() {
        switch (b.f22560a[ordinal()]) {
            case 1:
                return j0.f56342q;
            case 2:
                return j0.f56338m;
            case 3:
                return j0.f56339n;
            case 4:
                return j0.f56341p;
            case 5:
                return j0.f56343r;
            case 6:
                return j0.f56340o;
            case 7:
                return j0.f56345t;
            case 8:
                return j0.f56344s;
            case 9:
                return j0.f56346u;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}