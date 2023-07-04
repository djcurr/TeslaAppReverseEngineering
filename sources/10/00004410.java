package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class hc {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f18718a;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18719a;

        static {
            int[] iArr = new int[Common$TextInputValidation.Rule.b.values().length];
            iArr[Common$TextInputValidation.Rule.b.LENGTH.ordinal()] = 1;
            iArr[Common$TextInputValidation.Rule.b.VALUE.ordinal()] = 2;
            iArr[Common$TextInputValidation.Rule.b.REGEX.ordinal()] = 3;
            iArr[Common$TextInputValidation.Rule.b.EQUALITY.ordinal()] = 4;
            iArr[Common$TextInputValidation.Rule.b.ROUTING.ordinal()] = 5;
            f18719a = iArr;
        }
    }

    static {
        Pattern compile = Pattern.compile("^\\d{9}$");
        kotlin.jvm.internal.s.f(compile, "compile(\"^\\\\d{9}$\")");
        f18718a = compile;
    }

    public static final boolean a(String str, Common$TextInputValidation.Rule.Value value) {
        try {
            double parseDouble = Double.parseDouble(str);
            double value2 = value.getMinimum().getValue();
            double value3 = value.getMaximum().getValue();
            if (value3 == 0.0d) {
                if (parseDouble > value2) {
                    return true;
                }
            } else if (value2 <= parseDouble && parseDouble <= value3) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean a(String str, Common$TextInputValidation.Rule.Regex regex) {
        try {
            return Pattern.compile(regex.getRegex()).matcher(str).find();
        } catch (Exception unused) {
            return false;
        }
    }
}